package uz.datarestapi.datarest.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.datarestapi.datarest.entity.Currency;

@Projection(types = {Currency.class})
public interface CurrencyProjection {
	Integer getId();
	String getName();
	boolean getActive();
}
