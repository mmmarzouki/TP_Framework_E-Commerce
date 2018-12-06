package insat.ecommerce.dal.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @ManyToMany
    private List<Client> clients;

    @OneToMany(mappedBy="order")
    private List<OrderBook> orderBooks;

    @Column
    private String date;

    public Order() {
    }

    public Order(int id, List<Client> clients, List<OrderBook> orderBooks, String date) {
        this.id = id;
        this.clients = clients;
        this.orderBooks = orderBooks;
        this.date = date;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Client> getClients() {
        return this.clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<OrderBook> getOrderBooks() {
        return this.orderBooks;
    }

    public void setOrderBooks(List<OrderBook> orderBooks) {
        this.orderBooks = orderBooks;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
}