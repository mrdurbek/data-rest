package uz.datarestapi.datarest.projection;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import uz.datarestapi.datarest.entity.Input;

@Projection(types = {Input.class})
public interface InputProjection {
	Integer getId();
	Date getDate();
	Integer getWarehouse_id();
	Integer getSupplier_id();
	Integer getFacture_number();
	String getCode();
}
