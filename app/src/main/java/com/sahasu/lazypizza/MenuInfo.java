package com.sahasu.lazypizza;

/**
 * Created by Agam on 4/7/2017.
 */

public class MenuInfo {
    public int image_id;
    public String order_name;
    public String cost;
    public String UID;

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public int getImage_id() {
        return image_id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public String getCost() {
        return cost;
    }

    public String getUID() {
        return UID;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }
}
