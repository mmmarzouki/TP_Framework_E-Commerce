package insat.ecommerce.dal.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="promotions")
public class Promotion {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column
    private String beginDate;

    @Column
    private String endingDate;

    @Column
    private float amount;

    @ManyToMany
    private ArrayList<Book> books;

    public Promotion() {
    }


    public Promotion(int id, String beginDate, String endingDate, float amount, ArrayList<Book> books) {
        this.id = id;
        this.beginDate = beginDate;
        this.endingDate = endingDate;
        this.amount = amount;
        this.books = books;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBeginDate() {
        return this.beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndingDate() {
        return this.endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }


    
}