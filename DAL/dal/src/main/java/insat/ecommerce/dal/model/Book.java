package insat.ecommerce.dal.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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

    @ManyToMany(mappedBy="book")
    private ArrayList<Promotion> promotions;

    @ManyToMany
    private ArrayList<OrderBook> orderBooks;

    @ManyToMany
    private ArrayList<CartBook> cartBooks;

    public Book(int id, String name, int availableQuantity, String author, ArrayList<Promotion> promotions, ArrayList<OrderBook> orderBooks) {
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

    public ArrayList<Promotion> getPromotions() {
        return this.promotions;
    }

    public void setPromotions(ArrayList<Promotion> promotions) {
        this.promotions = promotions;
    }

    public ArrayList<OrderBook> getorderBooks() {
        return this.orderBooks;
    }

    public void setorderBooks(ArrayList<OrderBook> orderBooks) {
        this.orderBooks = orderBooks;
    }


    
}