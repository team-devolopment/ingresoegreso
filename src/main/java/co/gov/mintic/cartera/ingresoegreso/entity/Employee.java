package co.gov.mintic.cartera.ingresoegreso.entity;

import java.util.Arrays;
import java.util.Date;

public class Employee {
    private long id;
    private String concept;
    private float amount;
    private User user;
    private Enterprice enterprice;
    private Date createdAt;
    private Date updateAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Enterprice getEnterprice() {
        return enterprice;
    }

    public void setEnterprice(Enterprice enterprice) {
        this.enterprice = enterprice;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", concept='" + concept + '\'' +
                ", amount=" + amount +
                ", user=" + user +
                ", enterprice=" + enterprice +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
