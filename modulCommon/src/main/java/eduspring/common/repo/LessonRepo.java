package eduspring.common.repo;

import eduspring.common.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepo extends JpaRepository<User,Integer> {
}
