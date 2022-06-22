package bg.softuni.shoppinglist.repository;

import bg.softuni.shoppinglist.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUsernameAndPassword(String username, String password);
}
