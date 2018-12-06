package insat.ecommerce.dal.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity(name="cart")
public class Cart {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @OneToOne(mappedBy="cart")
    private Client client;

    @ManyToMany(mappedBy="cart")
    private ArrayList<CartBook> Cartbooks;
    
}