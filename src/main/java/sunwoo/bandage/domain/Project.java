package sunwoo.bandage.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Project extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "BAND_ID", nullable = false)
    private Band band;
    @Column(nullable = false)
    private String projectName;
    private String projectPw;


}
