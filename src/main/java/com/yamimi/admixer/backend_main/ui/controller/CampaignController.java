package com.yamimi.admixer.backend_main.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("campaigns") //
public class CampaignController {

    @GetMapping
    public String getCampaign(){
        return "get campaign is called";
    }
}
