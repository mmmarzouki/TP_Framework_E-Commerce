package insat.ecommerce.dal.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Client client;

    @ManyToMany
    private ArrayList<OrderBook> orderBooks;

    @Column
    private String date;

    public Order() {
    }

    public Order(int id, Client client, ArrayList<OrderBook> orderBooks, String date) {
        this.id = id;
        this.client = client;
        this.orderBooks = orderBooks;
        this.date = date;
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

    public ArrayList<OrderBook> getOrderBooks() {
        return this.orderBooks;
    }

    public void setOrderBooks(ArrayList<OrderBook> orderBooks) {
        this.orderBooks = orderBooks;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
}