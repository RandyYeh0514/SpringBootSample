package example.controller;

import example.configuration.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    private Info info;

    @RequestMapping("/")
    public String test() {
        return "Hello " + info.getName();
    }
}
