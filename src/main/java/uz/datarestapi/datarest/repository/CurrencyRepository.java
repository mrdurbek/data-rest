package uz.datarestapi.datarest.repository;

import java.util.Currency;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.datarestapi.datarest.projection.ClientProjection;

@RepositoryRestResource(path = "currency" , excerptProjection = ClientProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {

}
