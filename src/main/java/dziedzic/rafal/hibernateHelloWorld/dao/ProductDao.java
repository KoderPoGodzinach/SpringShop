package dziedzic.rafal.hibernateHelloWorld.dao;

import dziedzic.rafal.hibernateHelloWorld.model.Product;

import java.util.List;

public interface ProductDao {
    void save(Product product);

    List getAll();


}
