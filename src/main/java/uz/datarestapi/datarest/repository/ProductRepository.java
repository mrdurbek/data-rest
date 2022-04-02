package uz.datarestapi.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.datarestapi.datarest.entity.Product;
import uz.datarestapi.datarest.projection.ProductProjection;

@RepositoryRestResource(path = "product" , excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
