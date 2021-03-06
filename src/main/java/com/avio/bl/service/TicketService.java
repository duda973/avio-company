package com.avio.bl.service;

import com.avio.bl.dao.TicketDao;
import com.avio.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TicketService {

    @Autowired
    private TicketDao ticketDao;


    public void save(Ticket t) {
        ticketDao.insert(t);
    }

    public List<Ticket> findTicketsByReservationId(Integer reservationId) {
        return ticketDao.findTicketsByReservationId(reservationId);
    }

    public Ticket getById(Integer ticketId) {
        return ticketDao.getById(ticketId);
    }
}
