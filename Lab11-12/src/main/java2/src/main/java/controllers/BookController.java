package controllers;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import persistence.BooksRepository;
import persistence.models.Book;
import persistence.models.Element;
import persistence.models.Section;

@RestController

public class BookController {
    private final BooksRepository booksRepository;

    @Autowired
    public BookController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @SneakyThrows
    @GetMapping("/book/{id}")
    public ResponseEntity<Element> getBook(@PathVariable Integer id) {
        Book book = booksRepository.getOne(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
    @SneakyThrows
    @PostMapping(value = "/book/post",consumes = "application/json", produces = "application/json" )
    public Section create(@RequestBody Section book) {
        Book bookN = new Book();
        bookN.setSection_id(book.getSection_id());
        bookN.setBt(book.getTitle());
        return bookN;
    }
}