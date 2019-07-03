package pizzaloop;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDetails, Integer> {
}
