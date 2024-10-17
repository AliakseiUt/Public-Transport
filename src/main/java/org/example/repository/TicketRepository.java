package org.example.repository;

//import org.example.publictransport.model.Ticket;
import org.example.publictransport.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
