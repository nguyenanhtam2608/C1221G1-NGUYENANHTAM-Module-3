package case_study.reposition.impl;

import case_study.model.EducationDegree;
import case_study.reposition.BaseRepository;
import case_study.reposition.EducationDegreeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationDegreeRepositoryImpl implements EducationDegreeRepository {
    BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<EducationDegree> selectAllEducationDegree() {
        List<EducationDegree> educationDegreeList = new ArrayList<>();
        try {

            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement("select * from education_degree");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("education_degree_id");
                String name = resultSet.getString("education_degree_name");
                educationDegreeList.add(new EducationDegree(id,name));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return educationDegreeList;
    }
}
