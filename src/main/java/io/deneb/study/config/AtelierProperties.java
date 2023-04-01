package io.deneb.study.config;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Setter
@Configuration
@ConfigurationProperties(prefix = "boutique.atelier")
public class AtelierProperties {
  public String brand;
  public String detail;
}
