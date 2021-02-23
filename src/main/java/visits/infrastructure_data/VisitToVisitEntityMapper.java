package visits.infrastructure_data;

import org.springframework.stereotype.Component;
import visits.domain.Visit;

@Component
public class VisitToVisitEntityMapper {

    public Visit mapToVisit(VisitEntity visitEntity) {
        return Visit.Builder.thisVisit()
                .thisOwner(visitEntity.getOwnerId())
                .thisPet(visitEntity.getPetId())
                .thisDate(visitEntity.getDate())
                .thisVet(visitEntity.getVetId())
                .thisStatus(visitEntity.getStatus())
                .build();
    }

    public VisitEntity mapToVisitEntity(Visit visit) {
        return VisitEntity.Builder.thisVisitEntity()
                .thisOwner(visit.getOwnerId())
                .thisPet(visit.getPetId())
                .thisDate(visit.getDate())
                .thisVet(visit.getVetId())
                .thisStatus(visit.getStatus())
                .build();
    }
}