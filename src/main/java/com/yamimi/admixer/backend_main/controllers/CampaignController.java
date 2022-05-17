package com.yamimi.admixer.backend_main.controllers;

import com.yamimi.admixer.backend_main.models.AdMixerCampaign;
import com.yamimi.admixer.backend_main.services.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@RestController
@RequestMapping("campaigns") //
public class CampaignController {

    private final CampaignService campaignService;

    @Autowired
    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @GetMapping(value = "/{id}", produces = {"application/json"})
    public AdMixerCampaign getCampaign(@PathVariable String id){
        return campaignService.getCampaign(id);
    }
}
