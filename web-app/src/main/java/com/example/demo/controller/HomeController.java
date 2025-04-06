package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class); // ✅ Use Logger

    @GetMapping("/")
    public String home(Model model) {
        try {
            // Get the local IP address of the server
            String ipAddress = InetAddress.getLocalHost().getHostAddress();
            model.addAttribute("ipAddress", ipAddress);
        } catch (UnknownHostException e) {
            logger.error("Failed to fetch IP address", e); // ✅ Log the error instead of printing stack trace
            model.addAttribute("ipAddress", "Unable to fetch IP");
        }

        return "index";
    }
}
