package case_study.service.impl;

import case_study.model.Position;
import case_study.reposition.PositionRepository;
import case_study.reposition.impl.PositionRepositoryImpl;
import case_study.service.PositionService;

import java.util.List;

public class PositionServiceImpl implements PositionService {
    PositionRepository positionRepository = new PositionRepositoryImpl();
    @Override
    public List<Position> selectAllPosition() {
        return positionRepository.selectAllPosition();
    }
}
