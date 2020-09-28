package ru.kalashnikof.pivottable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Map<String, Object>> getAggregation(String row, String col) {

        String sqlrequest = "select "+row+" as 'row', "+col+" as 'col', sum(v) as 'val' from source_data group by "+row+", "+col+";";


        return jdbcTemplate.queryForList(sqlrequest);

    }
}
