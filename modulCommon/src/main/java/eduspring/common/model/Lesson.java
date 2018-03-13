package eduspring.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "lesson")
public class Lesson {


    @Id
    @Column
    @GeneratedValue
    private int id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private double price;
    @Column
    private String lecturer;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "lesson_user",
            joinColumns = @JoinColumn(name = "lesson_id",
            referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_id",
            referencedColumnName = "id"))
    private List<User> users;
}
