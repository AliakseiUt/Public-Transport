package org.example.service;

import org.example.publictransport.Payment;
//import org.example.publictransport.repository.PaymentRepository;
import org.example.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Integer id) {
        return paymentRepository.findById(id).orElse(null);
    }

    public void deletePayment(Integer id) {
        paymentRepository.deleteById(id);
    }

    public void processPayment(Payment payment) {
    }
}
