package sunwoo.bandage.domain;

import jakarta.persistence.*;
import sunwoo.bandage.domain.enums.Role;

@Entity
public class UserBand extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private User user;
    @ManyToOne
    @JoinColumn(name = "BAND_ID")
    private Band band;

}
