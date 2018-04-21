package com.example.demoserver;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class HellonameBase {

  @Before
  public void setUp() {
    RestAssuredMockMvc.standaloneSetup(new DemoController());
  }

}