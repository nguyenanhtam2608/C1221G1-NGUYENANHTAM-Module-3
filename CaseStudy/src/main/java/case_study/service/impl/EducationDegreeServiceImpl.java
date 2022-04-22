package case_study.service.impl;

import case_study.model.EducationDegree;
import case_study.reposition.EducationDegreeRepository;
import case_study.reposition.impl.EducationDegreeRepositoryImpl;
import case_study.service.EducationDegreeService;

import java.util.List;

public class EducationDegreeServiceImpl implements EducationDegreeService {
    EducationDegreeRepository educationDegreeRepository = new EducationDegreeRepositoryImpl();
    @Override
    public List<EducationDegree> selectAllEducationDegree() {
        return educationDegreeRepository.selectAllEducationDegree();
    }
}
