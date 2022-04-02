package uz.datarestapi.datarest.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.datarestapi.datarest.entity.Client;

@Projection(types = {Client.class})
public interface ClientProjection {
	Integer getId();
	String getName();
	String getPhone_number();
}
