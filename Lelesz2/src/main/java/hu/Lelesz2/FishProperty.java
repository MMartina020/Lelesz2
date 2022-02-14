package hu.Lelesz2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "Fish")
public class FishProperty {
    private @NotNull @Min(10) @Max(100)Integer size= 5;

    public void setSize(Integer size) {
        if(size < 10 || size > 100)
            {throw new IllegalArgumentException();
        }
        else {this.size = size;}
    }
}