package dziedzic.rafal.hibernateHelloWorld.services;

import dziedzic.rafal.hibernateHelloWorld.model.Basket;
import dziedzic.rafal.hibernateHelloWorld.model.Product;
import org.springframework.stereotype.Service;


@Service
public interface BasketServices {
    Basket addProduct(Product product);
}
