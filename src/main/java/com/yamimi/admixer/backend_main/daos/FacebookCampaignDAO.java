package com.yamimi.admixer.backend_main.daos;

import com.facebook.ads.sdk.Campaign;
import org.springframework.stereotype.Repository;

@Repository
public class FacebookCampaignDAO implements CampaignDAO<Campaign> {

    @Override
    public Campaign getCampaign(String id) {
        // pull campaign from table
        return null;
    }

    @Override
    public void persist(Campaign record) {
        // persist data here
    }
}
