package vivi.project.propertymanagement.converter;

import org.springframework.stereotype.Component;
import vivi.project.propertymanagement.entity.PropertyEntity;
import vivi.project.propertymanagement.model.PropertyDTO;
import vivi.project.propertymanagement.model.PropertyDTO;

@Component
public class PropertyConverter {
    public PropertyEntity convertDTOtoEntity(PropertyDTO propertyDTO){
        PropertyEntity pe = new PropertyEntity();
        pe.setTitle(propertyDTO.getTitle());
        pe.setAddress(propertyDTO.getAddress());
        pe.setOwnerEmail(propertyDTO.getOwnerEmail());
        pe.setOwnerName(propertyDTO.getOwnerName());
        pe.setPrice(propertyDTO.getPrice());
        pe.setDescription(propertyDTO.getDescription());

        return pe;
    }
    public PropertyDTO convertEntitytoDTO(PropertyEntity propertyEntity){

        PropertyDTO propertyDTO = new PropertyDTO();
        propertyDTO.setId(propertyEntity.getId());
        propertyDTO.setTitle(propertyEntity.getTitle());
        propertyDTO.setAddress(propertyEntity.getAddress());
        propertyDTO.setOwnerEmail(propertyEntity.getOwnerEmail());
        propertyDTO.setOwnerName(propertyEntity.getOwnerName());
        propertyDTO.setPrice(propertyEntity.getPrice());
        propertyDTO.setDescription(propertyEntity.getDescription());

        return propertyDTO;
    }

}