package hu.Lelesz2.Configuration;

import hu.Lelesz2.Component.Fish;
import hu.Lelesz2.FishProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(
    {FishProperty.class})

public class FishConfiguration {

    public final FishProperty fishProperty;

    public FishConfiguration(FishProperty fishProperty) {
        this.fishProperty = fishProperty;
        System.out.println(fishProperty.getSize());
    }

    @Bean
    Fish fish() {
        return new Fish(2);
    }
}
