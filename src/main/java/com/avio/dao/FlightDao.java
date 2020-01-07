package com.avio.dao;

import com.avio.dao.rowmapper.FlightRowMapper;
import com.avio.dao.util.AbstractJDBCDao;
import com.avio.domain.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightDao extends AbstractJDBCDao {
    @Autowired
    @Lazy
    private FlightRowMapper flightRowMapper;

    public List<Flight> find() {
        return jdbcTemplate.query(queries.getSQL("select.flights"), flightRowMapper);
    }

    public Flight getById(Integer id){
        return (Flight) jdbcTemplate.queryForObject(queries.getSQL("select.flight.by.id"), flightRowMapper, id);
    }
}
