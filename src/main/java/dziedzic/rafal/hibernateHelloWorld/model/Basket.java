package dziedzic.rafal.hibernateHelloWorld.model;

import java.util.List;

public class Basket {

    private List<Product> listProduct;
    private Client client;
    private long cost;

    public Basket(List<Product> listProduct, Client client, long cost) {
        this.listProduct = listProduct;
        this.client = client;
        this.cost = cost;
    }

    public Basket() {
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Basket basket = (Basket) o;

        if (cost != basket.cost) return false;
        if (listProduct != null ? !listProduct.equals(basket.listProduct) : basket.listProduct != null) return false;
        return client != null ? client.equals(basket.client) : basket.client == null;
    }

    @Override
    public int hashCode() {
        int result = listProduct != null ? listProduct.hashCode() : 0;
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + (int) (cost ^ (cost >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "listProduct=" + listProduct +
                ", client=" + client +
                ", cost=" + cost +
                '}';
    }


    public long cost() {
        long sum = 0;

        for(Product product: listProduct) {
           sum += product.getPrice();
        }
        return sum;
    }


    public void addProduct(Product product) {
        listProduct.add(product);
    }


}
