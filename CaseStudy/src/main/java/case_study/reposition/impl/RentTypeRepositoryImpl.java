package case_study.reposition.impl;

import case_study.model.RentType;
import case_study.reposition.BaseRepository;
import case_study.reposition.RentTypeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RentTypeRepositoryImpl implements RentTypeRepository {
    BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<RentType> selectAllRentType() {
        List<RentType> rentTypeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement("select * from rent_type");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id =resultSet.getInt("rent_type_id");
                String name  =resultSet.getString("rent_type_name");
                double cost = resultSet.getDouble("rent_type_cost");
                rentTypeList.add(new RentType(id,name,cost));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rentTypeList;
    }
}
