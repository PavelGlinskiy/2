package by.course;

import java.util.List;

public interface GroupDAO {
    public List<Group> getGroupsScheduleExist();
    public Group getGroupById(int id);


}
