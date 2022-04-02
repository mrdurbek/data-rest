package uz.datarestapi.datarest.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.datarestapi.datarest.entity.Attachment_content;

@Projection(types = {Attachment_content.class})
public interface Attachment_contentProjection {
	
	Integer getId();
	byte getContent_byte();
	Integer getAttachment_id();
}
