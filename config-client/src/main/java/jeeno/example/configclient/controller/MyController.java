package jeeno.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Du Jiahao
 * @Date: 2019/7/31 0031 22:41
 */
@RestController
public class MyController {

    @Value("${name}")
    private String name;

    @Value("${app}")
    private String app;

    @GetMapping("/name")
    public String getName(){
        return name+" "+app;
    }

}
