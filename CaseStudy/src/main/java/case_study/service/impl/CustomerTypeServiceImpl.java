package case_study.service.impl;

import case_study.model.CustomerType;
import case_study.reposition.CustomerTypeRepository;
import case_study.reposition.impl.CustomerTypeRepositoryImpl;
import case_study.service.CustomerTypeService;

import java.util.List;

public class CustomerTypeServiceImpl implements CustomerTypeService {
    CustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl() ;

    @Override
    public List<CustomerType> selectAllCustomerType() {
        return customerTypeRepository.selectAllCustomerType();
    }
}
