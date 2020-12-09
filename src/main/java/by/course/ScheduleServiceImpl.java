package by.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScheduleServiceImpl implements ScheduleService {
    private ScheduleDAO scheduleDAO;
    @Autowired
    public ScheduleServiceImpl(ScheduleDAO scheduleDAO){
        this.scheduleDAO = scheduleDAO;
    }
    @Override
    public List<Schedule> getScheduleById(int id) {
        return scheduleDAO.getScheduleById(id);
    }
}
