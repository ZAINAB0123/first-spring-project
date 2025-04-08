package HW_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DayOfWeekController {

    @GetMapping("/translateDay")
    public String translateDay(@RequestParam String day) {
        return Spring_firstHW.DayOfWeekEnum.getRussianNameByEnglish(day);
    }
}


