package del.ac.id.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import del.ac.id.demo.model.User;
public interface UserRepository extends JpaRepository<User, String> {
User findByUsername(String username);
}
