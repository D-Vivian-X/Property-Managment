package vivi.project.propertymanagement.repository;

import org.springframework.data.repository.CrudRepository;
import vivi.project.propertymanagement.entity.PropertyEntity;

public interface PropertyRepository extends CrudRepository<PropertyEntity, Long> {
}
