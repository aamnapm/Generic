package ir.aamnapm.generic.iservice;

import ir.aamnapm.generic.dto.PersonDTO;
import ir.aamnapm.generic.model.Person;

public interface IPersonService extends IGenericService<Person, Long, PersonDTO.Info, PersonDTO.Create, PersonDTO.Update> {
}
