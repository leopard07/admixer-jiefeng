package com.yamimi.admixer.backend_main.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdMixerCampaign {

    public final Long ID;
    public final String name;
    public final Status status;

    public enum Status {
        ACTIVE,
        COMPLETED,
        PAUSED
    }

    public AdMixerCampaign(@JsonProperty("id") Long id, @JsonProperty("name") String name, @JsonProperty("status") Status status) {
        ID = id;
        this.name = name;
        this.status = status;
    }
}
