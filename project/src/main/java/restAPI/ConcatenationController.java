package restAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcatenationController {

    @GetMapping("/concatenate/{input1}/{input2}")
    public String concatenate(@PathVariable String input1, @PathVariable String input2) {
        return input1 + input2;
    }
}