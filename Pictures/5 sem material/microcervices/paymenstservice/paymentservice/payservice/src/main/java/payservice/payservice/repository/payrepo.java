package payservice.payservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import payservice.payservice.Model.Payment;

public interface payrepo extends JpaRepository<Payment, Long> {

}
