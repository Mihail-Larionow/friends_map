package com.michel.friends_map;

import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.mapkit.user_location.UserLocationLayer;

public class User {

    private UserLocationLayer userLocationLayer;

    public User(MapView mapView){
        userLocationLayer = MapKitFactory.getInstance().createUserLocationLayer(mapView.getMapWindow());
        this.setVisible();
    }

    public void setVisible(){
        userLocationLayer.setVisible(true);
    }

    public void setUnVisible(){
        userLocationLayer.setVisible(false);
    }

    public void setIcon(){
        //TODO realise this method
    }
}
