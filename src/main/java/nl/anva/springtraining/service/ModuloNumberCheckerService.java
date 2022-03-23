package nl.anva.springtraining.service;

import lombok.extern.slf4j.Slf4j;
import nl.anva.springtraining.api.exception.EvenNumberException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ModuloNumberCheckerService implements NumberChecker {

    @Override
    public void checkNumber(int number) {
        log.info("Using " + getClass().getSimpleName());
        if (number % 2 == 0) {
            throw new EvenNumberException(number + " is Even.");
        }
    }
}
