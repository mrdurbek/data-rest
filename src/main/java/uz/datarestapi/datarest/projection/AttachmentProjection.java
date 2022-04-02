package uz.datarestapi.datarest.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.datarestapi.datarest.entity.Attachment;

@Projection(types = {Attachment.class})
public interface AttachmentProjection {
	Integer getId();
	String getName();
	String getSize();
	String getContent_type();
}
