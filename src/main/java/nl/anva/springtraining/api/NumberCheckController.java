package nl.anva.springtraining.api;

import nl.anva.springtraining.service.NumberChecker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/numbercheck")
public class NumberCheckController {

    private final NumberChecker numberChecker;

    public NumberCheckController(NumberChecker numberChecker) {
        this.numberChecker = numberChecker;
    }

    @GetMapping("/{number}")
    public String check(@PathVariable("number") int number) {
        this.numberChecker.checkNumber(number);

        return "ODD";
    }

}
