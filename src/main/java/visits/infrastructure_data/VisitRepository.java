package visits.infrastructure_data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import visits.domain.Visit;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class VisitRepository implements VisitRepository {

    @Autowired
    private VisitToVisitEntityMapper mapper;

    @Autowired
    private VisitEntityRepository entityRepository;

    @Override
    public Visit findById(int id) {
        VisitEntity visitEntity = entityRepository.findById(id);
        return mapper.mapToVisit(visitEntity);
    }

    @Override
    public List<Visit> findAll(int id) {
        return entityRepository
                .findAllByOwnerId(id)
                .stream()
                .map(visitEntity -> mapper.mapToVisit(visitEntity))
                .collect(Collectors.toList());
    }

    @Override
    public Visit save(Visit visit) {
        VisitEntity visitEntity = mapper.mapToVisitEntity(visit);
        VisitEntity savedVisitEntity = entityRepository.save(visitEntity);
        return mapper.mapToVisit(savedVisitEntity);
    }

}