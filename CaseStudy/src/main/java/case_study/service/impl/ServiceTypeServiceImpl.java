package case_study.service.impl;

import case_study.model.ServiceType;
import case_study.reposition.ServiceTypeRepository;
import case_study.reposition.impl.ServiceTypeRepositoryImpl;
import case_study.service.ServiceTypeService;

import java.util.List;

public class ServiceTypeServiceImpl implements ServiceTypeService {
    ServiceTypeRepository serviceTypeRepository = new ServiceTypeRepositoryImpl();
    @Override
    public List<ServiceType> selectAllServiceType() {
        return serviceTypeRepository.selectAllServiceType();
    }
}
