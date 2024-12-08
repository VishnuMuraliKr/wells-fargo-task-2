package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long clientId;

    @Column(nullable = false)
    private String clientName;

    @ManyToOne
    @JoinColumn(name = "advisorId", nullable = false)
    private Advisor advisor;

    protected Client() {
    }

    public Client(String clientName, Advisor advisor) {
        this.clientName = clientName;
        this.advisor = advisor;
    }

    public long getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
