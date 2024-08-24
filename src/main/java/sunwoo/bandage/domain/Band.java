package sunwoo.bandage.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Band extends BaseEntity{
    @Column(nullable = false)
    private String bandName;
    //band 생성 유저, 관리자
    @ManyToOne
    @JoinColumn(name="LEADER_ID", nullable = false)
    private User leader;
    @OneToMany(mappedBy = "band",cascade = CascadeType.REMOVE)
    private List<UserBand> members = new ArrayList<>();
    @OneToMany(mappedBy = "band")
    private List<Project> projects = new ArrayList<>();
}
