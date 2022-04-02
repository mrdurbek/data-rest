package uz.datarestapi.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.datarestapi.datarest.entity.Warehouse;
import uz.datarestapi.datarest.projection.WarehouseProjection;

@RepositoryRestResource(path = "warehouse" , excerptProjection = WarehouseProjection.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

}
