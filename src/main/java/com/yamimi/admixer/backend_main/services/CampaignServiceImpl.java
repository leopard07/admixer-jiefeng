package com.yamimi.admixer.backend_main.services;

import com.yamimi.admixer.backend_main.daos.FacebookCampaignDAO;
import com.yamimi.admixer.backend_main.daos.mappers.FacebookCampaignMapper;
import com.yamimi.admixer.backend_main.models.AdMixerCampaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampaignServiceImpl implements CampaignService{

    private final FacebookCampaignDAO facebookCampaignDAO;
    private final FacebookCampaignMapper facebookCampaignMapper;

    @Autowired
    public CampaignServiceImpl(FacebookCampaignDAO facebookCampaignDAO, FacebookCampaignMapper facebookCampaignMapper) {
        this.facebookCampaignDAO = facebookCampaignDAO;
        this.facebookCampaignMapper = facebookCampaignMapper;
    }

    public AdMixerCampaign getCampaign(String id) {
        return facebookCampaignMapper.map(facebookCampaignDAO.getCampaign(id));
    }
}
