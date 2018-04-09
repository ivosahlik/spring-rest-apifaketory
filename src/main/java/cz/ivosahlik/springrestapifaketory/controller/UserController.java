package cz.ivosahlik.springrestapifaketory.controller;

import cz.ivosahlik.springrestapifaketory.api.User;
import cz.ivosahlik.springrestapifaketory.service.impl.ApiServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Intellij Idea
 * Created by ivosahlik on 09/04/2018
 */
@Slf4j
@Controller
public class UserController {

    private ApiServiceImpl apiService;

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



}
