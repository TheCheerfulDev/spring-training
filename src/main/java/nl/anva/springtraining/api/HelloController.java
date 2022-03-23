package nl.anva.springtraining.api;

import nl.anva.springtraining.domain.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

//    @GetMapping
//    public String get() {
//        return "Hello, World!";
//    }

    @GetMapping
    public String getWithRequestParam(@RequestParam(name = "name", defaultValue = "ANVA") String name) {
        return String.format("Hello, %s!", name);
    }

    @GetMapping("/{name}")
    public String getWithPathVariable(@PathVariable("name") String name) {
        return String.format("Hello, %s!", name);
    }

    @PostMapping
    public ResponseEntity<Book> post(@RequestBody Book book) {
        return ResponseEntity.ok(book);
    }

}
