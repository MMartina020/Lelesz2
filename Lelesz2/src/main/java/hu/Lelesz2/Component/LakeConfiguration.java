package hu.Lelesz2.Component;

import org.springframework.beans.factory.annotation.Autowired;

public class LakeConfiguration {
    private Fish fish;

    @Autowired
    public void setFish (Fish fish){
        this.fish = fish;
    }

}
