package by.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    private GroupDAO groupDAO;
    @Autowired
    public GroupServiceImpl(GroupDAO groupDAO){
        this.groupDAO = groupDAO;
    }
    @Override
    public List<Group> getGroupsScheduleExist() {
       return groupDAO.getGroupsScheduleExist();
    }

    @Override
    public Group getGroupById(int id) {
        return groupDAO.getGroupById(id);
    }

}
