package zabudskiy.springlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zabudskiy.springlearn.domain.User;


public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}
