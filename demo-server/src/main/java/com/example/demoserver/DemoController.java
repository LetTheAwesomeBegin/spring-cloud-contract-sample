package com.example.demoserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

  @GetMapping("/{helloname}")
  public YourName get(
      @PathVariable("helloname") final String name
  ) {
    return new YourName(name);
  }


  static class YourName {

    private String name;

    public YourName(final String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void setName(final String name) {
      this.name = name;
    }
  }
}
