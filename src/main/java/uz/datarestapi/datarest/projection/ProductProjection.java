package uz.datarestapi.datarest.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.datarestapi.datarest.entity.Product;

@Projection(types = {Product.class})
public interface ProductProjection {
	Integer getId();
	String getName();
	Integer getCategory_id();
	Integer getPhoto_id();
	String getCode();
	Integer getMeasurement_id();
	boolean getActive();
}
