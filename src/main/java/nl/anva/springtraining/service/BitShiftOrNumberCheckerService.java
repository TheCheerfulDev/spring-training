package nl.anva.springtraining.service;

import lombok.extern.slf4j.Slf4j;
import nl.anva.springtraining.api.exception.EvenNumberException;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Slf4j
@Primary
@Service
public class BitShiftOrNumberCheckerService implements NumberChecker {

    @Override
    public void checkNumber(int number) {
        log.info("Using " + getClass().getSimpleName());
        if ((number | 1) > number) {
            throw new EvenNumberException(number + " is Even.");
        }
    }
}
