package ir.aamnapm.generic.mapper;

import ir.aamnapm.generic.dto.PersonDTO;
import ir.aamnapm.generic.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper extends GenericMapper<Person, PersonDTO, PersonDTO.Info, PersonDTO.Create, PersonDTO.Update> {
}