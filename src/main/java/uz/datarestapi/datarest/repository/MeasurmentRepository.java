package uz.datarestapi.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.datarestapi.datarest.entity.Measurment;
import uz.datarestapi.datarest.projection.MeasurmentProjection;

@RepositoryRestResource(path = "measurment" , excerptProjection = MeasurmentProjection.class)
public interface MeasurmentRepository extends JpaRepository<Measurment, Integer> {

}
