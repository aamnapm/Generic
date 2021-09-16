package ir.aamnapm.generic.mapper;

import java.util.List;

public interface GenericMapper<E, D, I, C, U> extends MethodMapper {

    D toDto(E e);

    E toEntity(D d);

    I toDtoInfo(E e);

    List<I> toDtoInfo(List<E> eList);

    E fromCreateDtoToEntity(C c);

    E fromUpdateDtoToEntity(U u);

    U fromInfoDtoToUpdateDTO(I i);

    I fromDtoToInfo(D d);
}