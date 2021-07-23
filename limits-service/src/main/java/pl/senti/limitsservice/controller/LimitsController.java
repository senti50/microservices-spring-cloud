package pl.senti.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.senti.limitsservice.model.Limits;

@RestController
public class LimitsController {

    @GetMapping("/limits")
    public Limits getLimits(){
        return new Limits(1,1000);
    }
}
