package hu.Lelesz2.Component;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Fisherman{
    private EventBus eventbus;

    @Autowired
    public  void setEventBus(EventBus eventBus){
        this.eventbus = eventBus;
    }
    @PostConstruct
    public void PostConstruct(){
        this.eventbus.register(this);
    }
}



