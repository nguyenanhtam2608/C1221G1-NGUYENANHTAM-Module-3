package case_study.reposition.impl;

import case_study.model.Position;
import case_study.reposition.BaseRepository;
import case_study.reposition.PositionRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepositoryImpl implements PositionRepository {
    BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Position> selectAllPosition() {
        List<Position> positionList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement("select * from `position` ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("position_id");
                String name = resultSet.getString("position_name");
                positionList.add(new Position(id,name));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return positionList;
    }
}
