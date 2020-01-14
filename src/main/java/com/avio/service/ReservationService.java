package com.avio.service;

import com.avio.dao.ReservationDao;
import com.avio.domain.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationDao reservationDao;

    public List<Reservation> find() {
        return reservationDao.find();
    }

    public List<Reservation> findByClientUsername(String username){
        return reservationDao.findByClientUsername(username);
    }
}