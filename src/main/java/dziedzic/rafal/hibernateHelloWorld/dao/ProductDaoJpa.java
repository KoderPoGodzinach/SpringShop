package dziedzic.rafal.hibernateHelloWorld.dao;

import dziedzic.rafal.hibernateHelloWorld.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDaoJpa extends JpaRepository<Product,Long> {

}
