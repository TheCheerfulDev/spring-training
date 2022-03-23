package nl.anva.springtraining.repository;

import nl.anva.springtraining.domain.BoardGame;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoardGameRepository extends MongoRepository<BoardGame, String> {
}
