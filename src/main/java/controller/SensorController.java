package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorController {

    @RequestMapping("/")
    public String index() {
        return String.valueOf(System.currentTimeMillis());
    }

}
