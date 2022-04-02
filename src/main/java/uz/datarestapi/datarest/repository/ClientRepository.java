package uz.datarestapi.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.datarestapi.datarest.entity.Client;
import uz.datarestapi.datarest.projection.ClientProjection;

@RepositoryRestResource(path = "client" , excerptProjection = ClientProjection.class)
public interface ClientRepository extends JpaRepository<Client , Integer> {

}
