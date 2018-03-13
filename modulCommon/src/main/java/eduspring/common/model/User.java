package eduspring.common.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column(unique = true)
    private String email;
    @Column
    private String password;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private UserType userType;
    @ManyToMany(mappedBy = "users")
    private List<Lesson>  lessons;
}
