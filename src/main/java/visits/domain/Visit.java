package visits.domain;

import visits.application.VisitStatus;
import visits.infrastructure_data.VisitEntity;


import java.time.ZonedDateTime;

public class Visit {

    private Integer id;
    private int ownerId;
    private int petId;
    private ZonedDateTime date;
    private int vetId;
    private VisitStatus status;

    public Visit() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public int getVetId() {
        return vetId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public VisitStatus getStatus() {
        return status;
    }

    public void setStatus(VisitStatus status) {
        this.status = status;
    }


    public static final class Builder {
        private int id;
        private int ownerId;
        private int petId;
        private ZonedDateTime date;
        private int vetId;
        private VisitStatus status;

        private Builder() {
        }

        public static Visit.Builder thisVisit() {
            return new Visit.Builder();
        }

        public Visit.Builder thisOwner(int ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Visit.Builder thisPet(int petId) {
            this.petId = petId;
            return this;
        }

        public Visit.Builder thisDate(ZonedDateTime date) {
            this.date = date;
            return this;
        }

        public Visit.Builder thisVet(int vetId) {
            this.vetId = vetId;
            return this;
        }

        public Visit.Builder thisStatus(VisitStatus status) {
            this.status = status;
            return this;
        }

        public Visit build() {
            Visit visit = new Visit();
            visit.setOwnerId(ownerId);
            visit.setPetId(petId);
            visit.setDate(date);
            visit.setVetId(vetId);
            visit.setStatus(status);
            return visit;
        }
    }
}
