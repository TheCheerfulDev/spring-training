package nl.anva.springtraining.api;

import nl.anva.springtraining.domain.BoardGame;
import nl.anva.springtraining.service.BoardGameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/boardgames")
public class BoardGameController {

    private final BoardGameService boardGameService;

    public BoardGameController(BoardGameService boardGameService) {
        this.boardGameService = boardGameService;
    }

    @PostMapping
    public BoardGame post(@Valid @RequestBody BoardGame boardGame) {
        return this.boardGameService.insert(boardGame);
    }

    @GetMapping
    public List<BoardGame> getAll() {
        return this.boardGameService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BoardGame> getById(@PathVariable("id") String id) {
        return ResponseEntity.of(this.boardGameService.findById(id));
    }
}
