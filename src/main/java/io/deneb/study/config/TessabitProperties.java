package io.deneb.study.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Getter @Setter
@RequiredArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "boutique.atelier.retailer")
public class TessabitProperties implements BoutiqueInfo {

  private final AtelierProperties atelierProperties;
  private String tessabit;

  @Override
  public String getBrand() {
    return atelierProperties.brand + tessabit;
  }

  @Override
  public String getDetail() {
    return atelierProperties.detail + tessabit;
  }
}
