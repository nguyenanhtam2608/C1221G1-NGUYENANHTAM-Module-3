package case_study.reposition;

import case_study.model.RentType;

import java.util.List;

public interface RentTypeRepository {
    List<RentType> selectAllRentType();
}
