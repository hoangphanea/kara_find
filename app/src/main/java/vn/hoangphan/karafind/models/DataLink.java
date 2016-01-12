package vn.hoangphan.karafind.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Hoang Phan on 1/12/2016.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataLink {
    private int vol;
    private String link;

    @JsonProperty("updated_at")
    private int updatedAt;

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(int updatedAt) {
        this.updatedAt = updatedAt;
    }
}