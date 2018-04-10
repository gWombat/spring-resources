package fr.gwombat.springresources.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by guillaume.
 *
 * @since 09/04/2018
 */
@Controller
@RequestMapping("/")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping
    public String hello(final Model model) {
        logger.debug("Calling home controller");
        model.addAttribute("message", "Hello world");

        return "index";
    }
}
