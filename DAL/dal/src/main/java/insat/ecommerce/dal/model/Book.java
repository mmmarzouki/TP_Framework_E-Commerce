package insat.ecommerce.dal.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private int availableQuantity;

    @Column
    private String author;

    @ManyToMany(mappedBy="books")
    private List<Promotion> promotions;

    @OneToMany(mappedBy="book")
    private List<OrderBook> orderBooks;

    @OneToMany(mappedBy="book")
    private List<CartBook> cartBooks;

    public Book(int id, String name, int availableQuantity, String author, List<Promotion> promotions, List<OrderBook> orderBooks) {
        this.id = id;
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.author = author;
        this.promotions = promotions;
        this.orderBooks = orderBooks;
    }


    public Book() {
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableQuantity() {
        return this.availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Promotion> getPromotions() {
        return this.promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    public List<OrderBook> getorderBooks() {
        return this.orderBooks;
    }

    public void setorderBooks(List<OrderBook> orderBooks) {
        this.orderBooks = orderBooks;
    }


    
}