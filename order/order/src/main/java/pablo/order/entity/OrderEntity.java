package pablo.order.entitty;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;

@Document(collection = "tb_orders")
public class OrderEntity {

    @MongoId
    private Long orderId;

    private Long CustomerId;

    private BigDecimal total;

    private List<OrderItem> itens;
}
