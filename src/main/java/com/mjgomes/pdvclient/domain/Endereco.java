package com.mjgomes.pdvclient.domain;

import java.io.Serializable;
import java.util.Objects;

public class Endereco implements Serializable {

    private Long id;
    private String country;
    private String state;
    private String uf;
    private String city;
    private String cep;
    private String publicPlace;
    private Integer number;
    private String complement;

    public Endereco() {
    }

    public Endereco(Long id, String country, String state, String uf, String city, String cep, String publicPlace, Integer number, String complement) {
        this.id = id;
        this.country = country;
        this.state = state;
        this.uf = uf;
        this.city = city;
        this.cep = cep;
        this.publicPlace = publicPlace;
        this.number = number;
        this.complement = complement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco)) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(id, endereco.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
