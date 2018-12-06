package insat.ecommerce.dal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="orderBooks")
public class OrderBook {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Book book;

    @Column
    private int number;

    public OrderBook() {
    }

    public OrderBook(int id, Order order, Book book, int number) {
        this.id = id;
        this.order = order;
        this.book = book;
        this.number = number;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getorder() {
        return this.order;
    }

    public void setorder(Order order) {
        this.order = order;
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