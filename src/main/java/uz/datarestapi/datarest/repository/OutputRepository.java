package uz.datarestapi.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.datarestapi.datarest.entity.Output;
import uz.datarestapi.datarest.projection.OutputProjection;

@RepositoryRestResource(path="output" , excerptProjection = OutputProjection.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {

}
