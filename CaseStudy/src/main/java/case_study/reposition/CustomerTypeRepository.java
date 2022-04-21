package case_study.reposition;

import case_study.model.CustomerType;

import java.util.List;

public interface CustomerTypeRepository {
    List<CustomerType> selectAllCustomerType();
}
