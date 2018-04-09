package cz.ivosahlik.springrestapifaketory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Intellij Idea
 * Created by ivosahlik on 09/04/2018
 */
@Controller
public class UserController {

    @GetMapping({"","/", "/index"})
    public String index() {
        return "index";
    }



}
