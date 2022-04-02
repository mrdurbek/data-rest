package uz.datarestapi.datarest.projection;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import uz.datarestapi.datarest.entity.Output;

@Projection(types = {Output.class})
public interface OutputProjection {
	Integer getId();
	Date getDate();
	Integer getWarehouse_id();
	Integer getCurrency_id();
	Integer getFacture_number();
	String getCode();
}
