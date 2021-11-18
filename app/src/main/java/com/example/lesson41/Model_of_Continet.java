package com.example.lesson41;

public class Model_of_Continet  {
    private int flagOfContinent;
    private String nameOfContinent;
    private int id;

    public Model_of_Continet(int flagOfContinent, String nameOfContinent) {
        this.flagOfContinent = flagOfContinent;
        this.nameOfContinent = nameOfContinent;
    }

    public Model_of_Continet(int flagOfContinent, String nameOfContinent, int id) {
        this.flagOfContinent = flagOfContinent;
        this.nameOfContinent = nameOfContinent;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlagOfContinent() {
        return flagOfContinent;
    }

    public void setFlagOfContinent(int flagOfContinent) {
        this.flagOfContinent = flagOfContinent;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public void setNameOfContinent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }


}
