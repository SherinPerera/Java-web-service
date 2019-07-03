package pizzaloop;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<PaymentDetails, Integer> {
}
