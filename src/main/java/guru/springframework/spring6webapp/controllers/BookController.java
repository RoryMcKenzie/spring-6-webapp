package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController
{
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    private final BookService bookService;

    @RequestMapping("/books")
    public String getBooks (Model model){
        model.addAttribute("books", bookService.findAll());

        //will later return view name, not implemented yet
        return "books";
    }
}
