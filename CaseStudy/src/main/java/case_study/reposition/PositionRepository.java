package case_study.reposition;

import case_study.model.Position;

import java.util.List;

public interface PositionRepository {
    List<Position> selectAllPosition();

}
