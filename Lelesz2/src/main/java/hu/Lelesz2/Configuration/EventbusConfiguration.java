package hu.Lelesz2.Configuration;

import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class EventbusConfiguration {
    @Bean
    public EventBus eventbus() {
        return new EventBus();
    }

}
