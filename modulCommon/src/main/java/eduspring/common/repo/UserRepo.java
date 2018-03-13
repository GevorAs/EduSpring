package eduspring.common.repo;

import eduspring.common.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    boolean existsByEmail(String email);

    User findOneByEmail(String email);
}
