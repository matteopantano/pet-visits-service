package visits.application;

import visits.domain.Visit;
import visits.domain.VisitRepository;

public class FindByVisitId {

    private VisitRepository visitRepository;

    public FindByVisitId(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    public Visit findByVisitId (int id) {
        return this.visitRepository.findById(id);
    }
}
