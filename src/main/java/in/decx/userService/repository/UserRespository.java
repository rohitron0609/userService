package in.decx.userService.repository;

import in.decx.userService.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRespository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
}
