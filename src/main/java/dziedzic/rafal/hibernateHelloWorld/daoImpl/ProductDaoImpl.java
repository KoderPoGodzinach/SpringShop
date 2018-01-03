package dziedzic.rafal.hibernateHelloWorld.daoImpl;

import dziedzic.rafal.hibernateHelloWorld.dao.ProductDao;
import dziedzic.rafal.hibernateHelloWorld.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void save(Product product) {
        entityManager.persist(product);
    }

    @Override
    public List<Product> getAll() {
        return entityManager.createQuery("Select p FROM Product p").getResultList();
    }
}
