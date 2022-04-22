package case_study.reposition.impl;

import case_study.model.Division;
import case_study.reposition.BaseRepository;
import case_study.reposition.DivisionRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DivisionRepositoryImpl implements DivisionRepository {
    BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Division> selectAllDivision() {
        List<Division> divisionList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement("select * from Division ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("division_id");
                String name = resultSet.getString("division_name");
                divisionList.add(new Division(id,name));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return divisionList;
    }
}
