import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products = new ArrayList<Product>();

    public void addNewProduct(String name, double cost, int amount) {
        Product pro = new Product(name, cost, amount);

        for (int i = 0; i < products.length(); i++) {
            if (pro.getItem().compareTo(products[i].getItem()) > 0) {
                products.add(i, pro);
                return;
            }
        }
    }

    public ArrayList<Product> mustOrder() {
        ArrayList<Product> order = new ArrayList<Product>();

        for (Product x : products) {
            if (x.getQuantity() <= 20) {
                order.add(x);
            }
        }
        return order;
    }


    
}