package fi.haagahelia.matias.tontti.bulked.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FoodController {

    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }
}
