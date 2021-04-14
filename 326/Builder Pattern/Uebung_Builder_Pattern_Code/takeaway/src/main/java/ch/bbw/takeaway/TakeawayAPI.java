package ch.bbw.takeaway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TakeawayAPI {

    @GetMapping("/")
    public List<Meal> getMeals(){
        return new ArrayList<>();
    }
}
