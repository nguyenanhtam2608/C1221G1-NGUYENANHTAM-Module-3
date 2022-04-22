package case_study.reposition.impl;

import case_study.model.ServiceType;
import case_study.reposition.BaseRepository;
import case_study.reposition.ServiceTypeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceTypeRepositoryImpl implements ServiceTypeRepository {
    BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<ServiceType> selectAllServiceType() {
        List<ServiceType> serviceTypeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement("select * from service_type ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("service_type_id");
                String name = resultSet.getString("service_type_name");
                serviceTypeList.add(new ServiceType(id,name));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return serviceTypeList;
    }
}
