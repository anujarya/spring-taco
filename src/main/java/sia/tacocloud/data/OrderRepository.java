package sia.tacocloud.data;

import sia.tacocloud.models.Order;

public interface OrderRepository {
    Order save(Order order);
}
