package clonecoding.velog_clone.controller.searchcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchController {

    @GetMapping("/search")
    public String search() {

        return "search";
    }
}
