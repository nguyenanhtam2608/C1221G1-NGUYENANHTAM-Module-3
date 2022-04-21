package case_study.service.impl;

import case_study.model.Customer;
import case_study.model.Service;
import case_study.reposition.ServiceRepository;
import case_study.reposition.impl.ServiceRepositoryIpml;
import case_study.service.ServiceService;

import java.sql.SQLException;
import java.util.List;

public class ServiceServiceIpml  implements ServiceService {
    ServiceRepository serviceRepository = new ServiceRepositoryIpml();

    @Override
    public List<Service> selectAllService() {
        return serviceRepository.selectAllService();
    }

    @Override
    public void insertCustomer(Service service) throws SQLException {
        serviceRepository.insertCustomer(service);
    }
}
