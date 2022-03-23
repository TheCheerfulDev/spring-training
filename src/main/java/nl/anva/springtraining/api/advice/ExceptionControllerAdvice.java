package nl.anva.springtraining.api.advice;

import lombok.extern.slf4j.Slf4j;
import nl.anva.springtraining.api.exception.EvenNumberException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
public class ExceptionControllerAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(EvenNumberException.class)
    public String handle(EvenNumberException exception) {
        log.error("EventNumberException caught in ControllerAdvice, with message: {}", exception.getMessage());
        return "EVEN";
    }

}
