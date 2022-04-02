package uz.datarestapi.datarest.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.datarestapi.datarest.entity.Warehouse;

@Projection(types = {Warehouse.class})
public interface WarehouseProjection {
	Integer getId();
	String getName();
	boolean getActive();
}
