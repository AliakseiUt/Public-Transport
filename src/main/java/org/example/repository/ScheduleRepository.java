package org.example.repository;

//import org.example.publictransport.model.Schedule;
import org.example.publictransport.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
}
