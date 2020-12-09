package by.course;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ScheduleRowMapper implements RowMapper<Schedule> {

    @Override
    public Schedule mapRow(ResultSet resultSet, int i) throws SQLException {
        Schedule schedule = new Schedule();
        schedule.setLessonDay(resultSet.getString("lesson_day"));
        schedule.setLessonName(resultSet.getString("lesson_name"));
        schedule.setTimePeriod(resultSet.getString("time_period"));
        return schedule;
    }
}
