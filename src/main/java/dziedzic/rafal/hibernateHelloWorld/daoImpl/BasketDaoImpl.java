package dziedzic.rafal.hibernateHelloWorld.daoImpl;

import dziedzic.rafal.hibernateHelloWorld.dao.BasketDao;
import dziedzic.rafal.hibernateHelloWorld.model.Basket;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BasketDaoImpl implements BasketDao {

    List<Basket> listbasket = new ArrayList();


    @Override
    public Basket getBasket() {

        return listbasket.get(0);
    }

    @Override
    public Basket addBasket(Basket basket) {

        listbasket.add(basket);

        return basket;
    }

    @Override
    public int sizeOfBasket() {

        return listbasket.size();
    }
}
