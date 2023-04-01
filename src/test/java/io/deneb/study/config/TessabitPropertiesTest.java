package io.deneb.study.config;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TessabitPropertiesTest {

  @Autowired
  TessabitProperties tessabitProperties;

  @Autowired
  CuccuiniProperties cuccuiniProperties;

  @Test
  void testProperties() {
    Assertions.assertThat(tessabitProperties.getBrand()).isEqualTo("denebtessabit-value");
    Assertions.assertThat(cuccuiniProperties.getBrand()).isEqualTo("denebcuccuini-value");
  }



}