package by.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class GroupDAOImpl implements GroupDAO {
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    public GroupDAOImpl(NamedParameterJdbcTemplate  jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Group> getGroupsScheduleExist() {
       String sql = "Select * from groups";
        return jdbcTemplate.query(sql, new GroupRowMapper());
    }

    @Override
    public Group getGroupById(int id) {
        String sql = "Select * from groups Where id =:id";
        Map<String,Object> params = new HashMap<>();
        params.put("id", id);
        System.out.println(params);
        return jdbcTemplate.queryForObject(sql, params ,new GroupRowMapper());
    }

}
