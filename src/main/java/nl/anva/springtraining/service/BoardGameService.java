package nl.anva.springtraining.service;

import nl.anva.springtraining.domain.BoardGame;
import nl.anva.springtraining.repository.BoardGameRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardGameService {

    private final BoardGameRepository boardGameRepository;

    public BoardGameService(BoardGameRepository boardGameRepository) {
        this.boardGameRepository = boardGameRepository;
    }

    public BoardGame insert(BoardGame boardGame) {
        return this.boardGameRepository.insert(boardGame);
    }

    public List<BoardGame> findAll() {
        return this.boardGameRepository.findAll();
    }

    public Optional<BoardGame> findById(String id) {
        return this.boardGameRepository.findById(id);
    }
}
