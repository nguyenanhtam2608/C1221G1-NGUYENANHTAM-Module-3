package case_study.reposition.impl;

import case_study.model.Customer;
import case_study.model.Service;
import case_study.reposition.BaseRepository;
import case_study.reposition.ServiceRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryIpml implements ServiceRepository {
    private static final String INSERT_SERVICE = "insert into service ( service_name,service_area,service_cost,service_max_people,rent_type_id,service_type_id,standard_room,description_other_convenience,pool_area,number_of_floors) values(?,?,?,?,?,?,?,?,?,?)";

    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Service> selectAllService() {
        List<Service> serviceList = new ArrayList<>();//b1

        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select *from service");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("service_id");
                String name = resultSet.getString("service_name");
                int area = resultSet.getInt("service_area");
                double cost = resultSet.getDouble("service_cost");
                int maxPeople = resultSet.getInt("service_max_people");
                int idRentType = resultSet.getInt("rent_type_id");
                int idServiceType = resultSet.getInt("service_type_id");
                String standardRoom = resultSet.getString("standard_room");
                String descriptionOtherConvenience = resultSet.getString("description_other_convenience");
                double poolArea = resultSet.getDouble("pool_area");
                int numberOfFloors = resultSet.getInt("number_of_floors");
                serviceList.add(new Service(id, name, area, cost, maxPeople, idRentType, idServiceType, standardRoom, descriptionOtherConvenience, poolArea, numberOfFloors));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return serviceList;
    }

    @Override
    public void insertCustomer(Service service) throws SQLException {
        PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(INSERT_SERVICE);
        preparedStatement.setString(1, service.getServiceName());
        preparedStatement.setInt(2, service.getServiceArea());
        preparedStatement.setDouble(3, service.getCost());
        preparedStatement.setInt(4, service.getServiceMaxPeople());
        preparedStatement.setInt(5, service.getRentTypeId());
        preparedStatement.setInt(6, service.getServiceTypeId());
        preparedStatement.setString(7, service.getStandardRoom());
        preparedStatement.setString(8, service.getDescriptionOtherConvenience());
        preparedStatement.setDouble(9, service.getPoolArea());
        preparedStatement.setDouble(10, service.getNumberOfFloors());
        preparedStatement.executeUpdate();


    }
}
