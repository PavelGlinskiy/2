package by.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ScheduleDAOImpl implements ScheduleDAO {
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    public ScheduleDAOImpl(NamedParameterJdbcTemplate  jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Schedule> getScheduleById(int id) {
        String sql = "select schedule.time_period , schedule.lesson_name , schedule.lesson_day\n" +
                "from schedule\n" +
                "inner join groups on schedule.group_id = groups.id\n" +
                "where groups.id =:id\n" +
                "order by schedule.lesson_day asc, schedule.time_order asc ";
        Map<String,Object> params = new HashMap<>();
        params.put("id", id);
        return jdbcTemplate.query(sql,params, new ScheduleRowMapper());
    }
}
