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
    private String author;

    @ManyToMany(mappedBy="books")
    private ArrayList<Promotion> promotions;


    private ArrayList<OrderBook> orderbooks;

    public Book(int id, String name, String author, ArrayList<Promotion> promotions, ArrayList<OrderBook> orderbooks) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.promotions = promotions;
        this.orderbooks = orderbooks;
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

    public ArrayList<OrderBook> getOrderbooks() {
        return this.orderbooks;
    }

    public void setOrderbooks(ArrayList<OrderBook> orderbooks) {
        this.orderbooks = orderbooks;
    }


    
}