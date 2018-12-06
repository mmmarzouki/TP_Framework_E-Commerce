package insat.ecommerce.dal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="orderBooks")
public class OrderBook {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @ManyToMany(mappedBy="orderBooks")
    private Cart cart;

    @ManyToMany(mappedBy="orderBooks")
    private Book book;

    public OrderBook() {
    }

    public OrderBook(int id, Cart cart, Book book, int number) {
        this.id = id;
        this.cart = cart;
        this.book = book;
        this.number = number;
    }
    private int number;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return this.cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}