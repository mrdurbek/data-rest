package uz.datarestapi.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.datarestapi.datarest.entity.User;
import uz.datarestapi.datarest.projection.UserProjection;

@RepositoryRestResource(path = "user" , excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<User, Integer> {

}
