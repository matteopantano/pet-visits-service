package visits.application;

import visits.domain.Visit;
import visits.domain.VisitRepository;

import java.util.List;

public class FindAllByOwnerId {

    private VisitRepository visitRepository;

    public FindAllByOwnerId(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    public List<Visit> findAllByOwnerId (int ownerId) {
        return this.visitRepository.findAllByOwnerId(ownerId);
    }
}
