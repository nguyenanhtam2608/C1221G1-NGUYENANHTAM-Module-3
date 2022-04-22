package case_study.reposition;

import case_study.model.ServiceType;

import java.util.List;

public interface ServiceTypeRepository {
    List<ServiceType> selectAllServiceType();

}
