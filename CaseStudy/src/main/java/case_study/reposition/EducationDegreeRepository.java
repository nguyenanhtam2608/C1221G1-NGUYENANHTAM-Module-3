package case_study.reposition;

import case_study.model.EducationDegree;

import java.util.List;

public interface EducationDegreeRepository {
    List<EducationDegree> selectAllEducationDegree();
}
