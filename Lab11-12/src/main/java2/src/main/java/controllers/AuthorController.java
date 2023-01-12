package controllers;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import persistence.AuthorsRepository;
import persistence.BooksRepository;
import persistence.models.Author;
import persistence.models.Book;
import persistence.models.Element;
import persistence.models.Section;

@RestController
public class AuthorController {

    private final AuthorsRepository authorsRepository;

    @Autowired
    public AuthorController(AuthorsRepository authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    @SneakyThrows
    @GetMapping("/author/{id}")
    public ResponseEntity<Author> getBook(@PathVariable Integer id) {
        Author author  = authorsRepository.getOne(id);
        return new ResponseEntity<>(author, HttpStatus.OK);
    }
    @SneakyThrows
    @PostMapping(value = "/author/post",consumes = "application/json", produces = "application/json" )
    public Author create(@RequestBody Author author) {
        return authorsRepository.save(author);
    }
}
