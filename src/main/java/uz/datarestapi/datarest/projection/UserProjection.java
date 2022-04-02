package uz.datarestapi.datarest.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.datarestapi.datarest.entity.User;

@Projection(types = {User.class})
public interface UserProjection {
	Integer getId();
	String getFirst_name();
	String getLast_name();
	String getPhone_number();
	String getCode();
	String getPassword();
	boolean getActive();
}
