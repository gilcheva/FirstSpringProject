package bg.startit.spring.firstspringproject.repository;

import bg.startit.spring.firstspringproject.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByUsername(String username);

}
