package del.ac.id.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import del.ac.id.demo.model.Login;
public interface LoginRepository extends JpaRepository<Login, String> {
Login findByUsername(String username);
}
