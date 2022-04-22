package case_study.service.impl;

import case_study.model.Division;
import case_study.reposition.DivisionRepository;
import case_study.reposition.impl.DivisionRepositoryImpl;
import case_study.service.DivisionService;

import java.util.List;

public class DivisionServiceImpl implements DivisionService {
    DivisionRepository divisionRepository = new DivisionRepositoryImpl();
    @Override
    public List<Division> selectAllDivision() {
        return divisionRepository.selectAllDivision();
    }
}
