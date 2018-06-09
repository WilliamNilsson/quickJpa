package com.william;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kollega {

    @Id
    private int k_id;
    private String k_name;
    private String k_description;

    public int getK_id() {
        return k_id;
    }

    public void setK_id(int k_id) {
        this.k_id = k_id;
    }

    public String getK_name() {
        return k_name;
    }

    public void setK_name(String k_name) {
        this.k_name = k_name;
    }

    public String getK_description() {
        return k_description;
    }

    public void setK_description(String k_description) {
        this.k_description = k_description;
    }

    @Override
    public String toString() {
        return "Kollega{" +
                "k_id=" + k_id +
                ", k_name='" + k_name + '\'' +
                ", k_description='" + k_description + '\'' +
                '}';
    }
}
