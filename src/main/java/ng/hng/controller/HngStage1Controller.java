package ng.hng.controller;

import ng.hng.domain.HngStage1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HngStage1Controller {

    @GetMapping("/")
    public HngStage1 startApp() {
        return new HngStage1();
    }

}
