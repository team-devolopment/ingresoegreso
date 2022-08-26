package co.gov.mintic.cartera.ingresoegreso.entity;

import java.util.Arrays;
import java.util.Date;

public class Transaction {
    private long id;
    private String email;
    private Profile profile;
    private EnumRoleName role;
    private Enterprice enterprice;
    private Transaction[] transactions;
    private Date createdAt;
    private Date updateAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public EnumRoleName getRole() {
        return role;
    }

    public void setRole(EnumRoleName role) {
        this.role = role;
    }

    public Enterprice getEnterprice() {
        return enterprice;
    }

    public void setEnterprice(Enterprice enterprice) {
        this.enterprice = enterprice;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
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
        return "Transaction{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", profile=" + profile +
                ", role=" + role +
                ", enterprice=" + enterprice +
                ", transactions=" + Arrays.toString(transactions) +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
