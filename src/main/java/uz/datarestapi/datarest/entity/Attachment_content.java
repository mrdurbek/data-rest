package uz.datarestapi.datarest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attachment_content {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private byte content_byte;
	private Integer attachment_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public byte getContent_byte() {
		return content_byte;
	}
	public void setContent_byte(byte content_byte) {
		this.content_byte = content_byte;
	}
	public Integer getAttachment_id() {
		return attachment_id;
	}
	public void setAttachment_id(Integer attachment_id) {
		this.attachment_id = attachment_id;
	}
	
	

}
