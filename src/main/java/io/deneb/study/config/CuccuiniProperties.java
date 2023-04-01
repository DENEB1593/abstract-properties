package io.deneb.study.config;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@RequiredArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "boutique.atelier.retailer")
public class CuccuiniProperties implements BoutiqueInfo {
  private String cuccuini;

  private final AtelierProperties atelierProperties;

  @Override
  public String getBrand() {
    return atelierProperties.brand + cuccuini;
  }

  @Override
  public String getDetail() {
    return atelierProperties.detail + cuccuini;
  }
}
