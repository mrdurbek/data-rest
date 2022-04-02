package uz.datarestapi.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.datarestapi.datarest.entity.Attachment_content;
import uz.datarestapi.datarest.projection.Attachment_contentProjection;

@RepositoryRestResource(path = "attachment_content" , excerptProjection = Attachment_contentProjection.class)
public interface Attachment_contentRepository extends JpaRepository<Attachment_content, Integer> {

}
