package visits.application;

import visits.domain.Visit;
import visits.domain.VisitRepository;

public class Save {

    private VisitRepository visitRepository;

    public Save(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }
}
