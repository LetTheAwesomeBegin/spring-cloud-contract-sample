package com.example.democlient;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;


@Service
public class DemoClientService {

  private final RestTemplate restTemplate;

  public DemoClientService(final RestTemplateBuilder restTemplateBuilder) {
    restTemplate = restTemplateBuilder.build();
  }

  public DemoClientName get(
      @PathVariable("name") final String name
  ) {
    return restTemplate.getForObject("http://localhost:8080/demo/" + name, DemoClientName.class);
  }

  static class DemoClientName {

    String name;

    public String getName() {
      return name;
    }

    public void setName(final String name) {
      this.name = name;
    }
  }
}
