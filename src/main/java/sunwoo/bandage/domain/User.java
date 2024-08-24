package sunwoo.bandage.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import sunwoo.bandage.domain.enums.Role;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String nickname;
    private String contact;
    @Column(nullable = false)
    private Role role;
    @OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE)
    private List<UserBand> bands = new ArrayList<>();

}
