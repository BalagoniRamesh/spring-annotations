package net.javarameshsoft.springannotations_sterotype.controller;


import net.javarameshsoft.springannotations_sterotype.bean.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//When ever we annotate BookController class with @Controller this class(BookController) becomes a spring MVC controller & it is capable to handle the http request
//@Controller  //ctl+arrow
//@ResponseBody
@RestController //it is combination of @Controller & @ResponseBody
//When ever you develop REST FULL WEB services using spring MVC(BookController) then go & use @RestController
//@RestController won't work for spring MVC web applications then you want to develop REST FULL WEB services use @RestController
// when ever you want to develop spring MVC web applications that returns the view then you can go @Controller
@RequestMapping("/api") //Basically when ever you define the base url for all the REST API with in the controller class then go and annotate with class @RequestMapping with base url /api, base api for all with in the class and annotate that controller class with at request mapping annotation.and then can specify the base URI.
public class BookController {
    //handler methods
    @RequestMapping("/hello-world") //handle incoming http request
    //@ResponseBody
    public String helloWorld(){
        return "Hello World!";
    }
    //Create one API Return one BookController object.
    //let's create a REST API that return in a BOOK instance in a JSON format.
    //make this method has a REST API by Annotating method with @RequestMapping, specify url book
    //In order to return this java object has a JSON to the client we have to annotate with @Response Body annotation
    //@RequestMapping("/book") //this is RequestMapping with method with single URI
    //@RequestMapping(value = {"/book","/core-java", "/java"}) //this is RequestMapping with method with Multiple URI, it will take default as a get RequestMapping method
    @GetMapping(value = {"/book", "/java"})
    //@ResponseBody
    public Book getBook() {
        Book book = new Book(1, "Core Java & Advanced Java", "Learn Core Java and Latest features");// Here first type "" then value & attribute/key get automatically
        return book;
    }
    //@RequestMapping(value = "/book/create", method = RequestMethod.POST)
    @PostMapping(value = "/book/create",
    consumes = MediaType.APPLICATION_JSON_VALUE
    )
    //@ResponseStatus(value = HttpStatus.CREATED)  //Http Status for REST API
    public ResponseEntity<Book> creaBook(@RequestBody Book book){ //@RequestBody convert json from the request body and it convert that JSON into this Book Java object
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }
    //@RequestMapping(value = "/book/update/{id}", method = RequestMethod.PUT)
    //http:localhost:8080/book/update/1
    @PutMapping(value = "/book/update/{id}") //here id is a URI Template variable
    public ResponseEntity<Book> updateBook(@PathVariable int id,
                                           @RequestBody Book updateBook){
        System.out.println(id);
        System.out.println(updateBook.getTitle());
        System.out.println(updateBook.getDescription());
        updateBook.setId(id);
        return ResponseEntity.ok(updateBook);
    }
    //@RequestMapping(value = "/book/delete/{id}", method = RequestMethod.DELETE)
    @DeleteMapping(value = "/book/delete/{id}")  //this annotation is used to map the incoming HTTP delete request to this particular method
    public ResponseEntity<String> deleteBook(@PathVariable int id){
        System.out.println(id);
        return ResponseEntity.ok("Book deleted successfully!.");
    }
    @GetMapping("/books/{id}/{title}/{description}")
    public ResponseEntity<Book> pathVariableDemo(@PathVariable int id,
                                                 @PathVariable String title,
                                                 @PathVariable String description){
        System.out.println(id);
        System.out.println(title);
        System.out.println(description);
        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setDescription(description);
        return ResponseEntity.ok(book);
    }
    //http://localhost:8080/api/books/query?id=1&title=core java&description=core java description
    @GetMapping("/books/query")
    public ResponseEntity<Book> requestParamDemo(@RequestParam(name = "id") int id,
                                                 @RequestParam(name ="title") String title,
                                                 @RequestParam(name = "description") String description
                                                 ){
        System.out.println(id);
        System.out.println(title);
        Book book = new Book();
        book.setId(id);
        book.setTitle(title); //it will print response in REST API
        book.setDescription(description);
        book.getTitle();

        return ResponseEntity.ok(book);
    }
}
