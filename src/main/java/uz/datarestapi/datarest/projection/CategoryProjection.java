package uz.datarestapi.datarest.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.datarestapi.datarest.entity.Category;

@Projection(types = {Category.class})
public interface CategoryProjection {
	
	Integer getId();
	String getName();
	Integer getParent_category_id();
	boolean getActive();
	
}
