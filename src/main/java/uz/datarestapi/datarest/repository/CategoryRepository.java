package uz.datarestapi.datarest.repository;

import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.datarestapi.datarest.projection.CategoryProjection;

@RepositoryRestResource(path = "category" , collectionResourceRel = "categoryList" , excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
