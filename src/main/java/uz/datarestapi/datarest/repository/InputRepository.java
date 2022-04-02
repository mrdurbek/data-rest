package uz.datarestapi.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.datarestapi.datarest.entity.Input;
import uz.datarestapi.datarest.projection.InputProjection;

@RepositoryRestResource(path = "input" , excerptProjection = InputProjection.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
	
}
