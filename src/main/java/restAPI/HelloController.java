package restAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/welcome")
    public String welcome(@RequestParam(name = "name", required = false, defaultValue = "Guest") String name) {
        return "<h1>Welcome " + name + "!</h1>";
    }
}
