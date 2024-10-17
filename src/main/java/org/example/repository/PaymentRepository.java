package org.example.repository;

//import org.example.publictransport.model.Payment;
import org.example.publictransport.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
