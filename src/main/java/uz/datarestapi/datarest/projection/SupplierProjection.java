package uz.datarestapi.datarest.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.datarestapi.datarest.entity.Supplier;

@Projection(types = {Supplier.class})
public interface SupplierProjection {
	Integer getId();
	String getName();
	boolean getActive();
	String getPhone_number();
}
