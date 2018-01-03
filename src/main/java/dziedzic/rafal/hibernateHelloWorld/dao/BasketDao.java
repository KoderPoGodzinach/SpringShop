package dziedzic.rafal.hibernateHelloWorld.dao;

import dziedzic.rafal.hibernateHelloWorld.model.Basket;
import org.springframework.stereotype.Repository;


@Repository
public interface BasketDao {
    Basket getBasket();

    Basket addBasket(Basket basket);

    int sizeOfBasket();


}
