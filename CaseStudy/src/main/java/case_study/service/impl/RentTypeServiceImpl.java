package case_study.service.impl;

import case_study.model.RentType;
import case_study.reposition.RentTypeRepository;
import case_study.reposition.impl.RentTypeRepositoryImpl;
import case_study.service.RentTypeService;

import java.util.List;

public class RentTypeServiceImpl implements RentTypeService {
    RentTypeRepository rentTypeRepository = new RentTypeRepositoryImpl();
    @Override
    public List<RentType> selectAllRentType() {
        return rentTypeRepository.selectAllRentType();
    }
}
