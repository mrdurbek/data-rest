package uz.datarestapi.datarest.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.datarestapi.datarest.entity.Measurment;

@Projection(types = {Measurment.class})
public interface MeasurmentProjection {
	Integer getId();
	String getName();
	boolean getActive();
}
