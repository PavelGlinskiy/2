package by.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ScheduleController {
    private ScheduleService scheduleService;
    @Autowired
    public ScheduleController(ScheduleService scheduleService){
        this.scheduleService = scheduleService;
    }

    @GetMapping("/groups/{id}")
    public String getSchedule(@PathVariable String id, Model model){
        model.addAttribute("schedule", scheduleService.getScheduleById(Integer.parseInt(id)));
        System.out.println(model.getAttribute("schedule"));
        return "schedule";
    }

}
