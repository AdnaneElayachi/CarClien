package org.EMSI.Car.repository;

import org.EMSI.Car.entites.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
