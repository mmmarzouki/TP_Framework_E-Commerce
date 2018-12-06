package insat.ecommerce.dal.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="cart")
public class Cart {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @OneToOne
    private Client client;

    @OneToMany(mappedBy="cart")
    private List<CartBook> cartBooks;

    public Cart() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<CartBook> getCartBooks() {
        return this.cartBooks;
    }

    public void setCartBooks(List<CartBook> cartBooks) {
        this.cartBooks = cartBooks;
    }

    public Cart(int id, Client client, List<CartBook> cartBooks) {
        this.id = id;
        this.client = client;
        this.cartBooks = cartBooks;
    }
    
}