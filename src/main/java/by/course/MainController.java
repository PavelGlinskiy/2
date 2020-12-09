package by.course;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;

        import java.util.ArrayList;
        import java.util.List;

@Controller
public class MainController {
    private GroupService groupService;
    @Autowired
    public MainController(GroupService groupService){
        this.groupService = groupService;
    }
    @RequestMapping(value = {"/groups"}, method = RequestMethod.GET)
    public String getGroupsIsScheduleExist(Model model){
        model.addAttribute("groups", groupService.getGroupsScheduleExist());
        return "groups";
    }

}