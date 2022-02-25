package com.aibles.oauth2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AuthController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthController.class);

    @GetMapping("/oidc/callback")
    public String handleOidcCallBack(@RequestParam("code") String code,
                                     @RequestParam("session_state") String sessionState,
                                     @RequestParam("state") String state) {
        LOGGER.info("====>Code: {}", code);
        LOGGER.info("====>Session state: {}", sessionState);

        //Call api get token of keycloak with code
        RestTemplate restTemplate = new RestTemplate();


        return "asdf";
    }
}
