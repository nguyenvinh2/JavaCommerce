package com.ecommerce.flybuy.Model;

import java.util.Set;
import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public string Name;
    public string Image;
}
