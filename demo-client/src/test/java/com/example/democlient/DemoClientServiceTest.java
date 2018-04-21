package com.example.democlient;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import com.example.democlient.DemoClientService.DemoClientName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties.StubsMode;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@AutoConfigureStubRunner(
    ids = {"com.example:demo-server:+:stubs:8080"},
    stubsMode = StubsMode.LOCAL
)
@DirtiesContext
public class DemoClientServiceTest {

  @Autowired
  private DemoClientService sut;

  @Test
  public void get() {
    // Given
    final String givenName = "patrick";

    // when:
    final DemoClientName o = sut.get(givenName);

    assertThat("Unexpected name value", o.name, is(givenName));
  }
}