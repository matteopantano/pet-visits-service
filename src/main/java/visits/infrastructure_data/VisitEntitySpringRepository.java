package visits.infrastructure_data;

import org.springframework.data.repository.Repository;
import visits.domain.Visit;

import java.util.List;

public interface VisitEntitySpringRepository extends Repository<VisitEntity, Long> {

    VisitEntity findById(int id);

    List<VisitEntity> findAllByOwnerId(int ownerId);

    VisitEntity save(VisitEntity visitEntity);

}
