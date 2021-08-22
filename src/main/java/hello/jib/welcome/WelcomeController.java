package hello.jib.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class WelcomeController {

    @GetMapping
    @ResponseBody
    public String welcome() {
        return "Welcome!";
    }

    @GetMapping("/divide/{p1}/{p2}")
    @ResponseBody
    public int divide(@PathVariable("p1") int p1, @PathVariable("p2") int p2) {
        return p1 / p2;
    }
}
