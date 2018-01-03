package dziedzic.rafal.hibernateHelloWorld.servicesImpl;

import dziedzic.rafal.hibernateHelloWorld.dao.BasketDao;
import dziedzic.rafal.hibernateHelloWorld.model.Basket;
import dziedzic.rafal.hibernateHelloWorld.model.Product;
import dziedzic.rafal.hibernateHelloWorld.services.BasketServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BasketServicesImpl implements BasketServices {
    @Autowired
    BasketDao basketDao;

    @Override
    public Basket addProduct(Product product) {


        if(basketDao.sizeOfBasket()==0){
            Basket basket = new Basket();
            basket.addProduct(product);
            basketDao.addBasket(basket);
        }else {
            basketDao.getBasket().addProduct(product);
        }

        return basketDao.getBasket();
    }
}
