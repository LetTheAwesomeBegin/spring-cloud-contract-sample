package com.example.democlient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class DemoController {

private DemoClientService demoClientService;

    public DemoController(DemoClientService demoClientService) {
        this.demoClientService = demoClientService;
    }

    @RequestMapping("/{name}")
    public Object get(
            @PathVariable("name") String name
    ) {
        return demoClientService.get(name);
    }

}
