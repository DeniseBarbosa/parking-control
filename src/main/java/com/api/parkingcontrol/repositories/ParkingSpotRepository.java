package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository //essa anotação não se faz necessaria já que o JpaRepository já trás todas as propriedades
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
}
