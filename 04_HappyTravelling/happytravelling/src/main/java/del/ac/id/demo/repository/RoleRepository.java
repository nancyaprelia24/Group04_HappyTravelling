package del.ac.id.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import del.ac.id.demo.model.Role;
public interface RoleRepository extends JpaRepository<Role, Integer> {
Role findByRoleid(int roleid);
List<Role> findAll();
}