package org.example.javaweb.model;

import jakarta.persistence.*;

@Entity
@Table(name="VapeProducts")

public class VapeProducts {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;

    @Column(name="Flavor")
    private String flavor;

    @Column(name="Volume")
    private String volume;

    @Column(name = "Nicotine")
    private String nicotine;

    @Column(name="Image")
    private String image;

    @Column(name="Price")
    private int price;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }


    public String getNicotine() {
        return nicotine;
    }
    public void setNicotine(String nicotine) {
        this.nicotine = nicotine;
    }

    public String getFlavor() {return flavor;}
    public void setFlavor(String flavor) {this.flavor = flavor;}

    public String getVolume() {return volume;}
    public void setVolume(String volume) {this.volume = volume;}


}
