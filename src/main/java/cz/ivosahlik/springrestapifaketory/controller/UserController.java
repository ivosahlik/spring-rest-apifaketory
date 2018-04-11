package cz.ivosahlik.springrestapifaketory.controller;

import cz.ivosahlik.springrestapifaketory.api.User;
import cz.ivosahlik.springrestapifaketory.service.impl.ApiServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ServerWebExchange;



import java.util.List;

/**
 * Intellij Idea
 * Created by ivosahlik on 09/04/2018
 */
@Slf4j
@Controller
public class UserController {

    private ApiServiceImpl apiService;

    private static final String LIMIT_PARAM = "limit";

    @Autowired
    public UserController(ApiServiceImpl apiService) {
        this.apiService = apiService;
    }

    @GetMapping({"","/", "/index"})
    public String index() {
        List<User> list = apiService.getUsers(3);
        log.debug("get users size() {} " + list.size());
        return "index";
    }


    @PostMapping("/users")
    public String formPost(@RequestParam("limit") Integer limit, Model model){

        log.debug("Received Limit value: " + limit);
        if(limit == null || limit == 0 || limit < 2){
            log.debug("Setting limit to default of 10");
            limit = 10;
        } else {
            limit = limit - 1;
        }

//        model.addAttribute("users", apiService.getUsers(limit));
        model.addAttribute("users", apiService.getUsersUri(limit));

        return "userlist";
    }



}
