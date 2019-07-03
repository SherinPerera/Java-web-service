package pizzaloop;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderDetails, Integer> {
}
