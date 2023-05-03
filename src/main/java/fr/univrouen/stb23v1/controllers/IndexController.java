package fr.univrouen.stb23v1.controllers;
import fr.univrouen.stb23v1.model.HTML;
import fr.univrouen.stb23v1.model.TestSTB;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
//    @GetMapping("/")
//    public String index() {
//        return "Hello stb23 !";
//    }

    @GetMapping(value = "/")
    @ResponseBody
    public String postSTB() {
        HTML index = new HTML("index.html");
        return index.loadFileHTML();
    }
}
