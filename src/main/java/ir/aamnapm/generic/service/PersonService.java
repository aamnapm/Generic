package ir.aamnapm.generic.service;

import ir.aamnapm.generic.dto.PersonDTO;
import ir.aamnapm.generic.iservice.IPersonService;
import ir.aamnapm.generic.mapper.PersonMapper;
import ir.aamnapm.generic.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PersonService implements IPersonService {

    private final PersonMapper personMapper;
    private final PersonRepository personRepository;

    @Override
    public PersonDTO.Info get(Long aLong) {
        return personMapper.toDtoInfo(personRepository.getById(aLong));
    }

    @Override
    public List<PersonDTO.Info> listByIds(List<Long> longs) {
        return personMapper.toDtoInfo(personRepository.findAllById(longs));
    }

    @Override
    public List<PersonDTO.Info> list() {
        return personMapper.toDtoInfo(personRepository.findAll());
    }

    @Override
    public PersonDTO.Info create(PersonDTO.Create request) {
        return null;
    }

    @Override
    public PersonDTO.Info update(Long aLong, PersonDTO.Update request) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
