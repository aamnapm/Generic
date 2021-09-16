package ir.aamnapm.generic.iservice;

import java.io.Serializable;
import java.util.List;

public interface IGenericService<T, ID extends Serializable, R, C, U> {

    R get(ID id);

    List<R> listByIds(List<ID> ids);

    List<R> list();

    R create(C request);

    R update(ID id, U request);

    void delete(ID id);
}


