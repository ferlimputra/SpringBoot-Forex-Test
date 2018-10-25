package com.in28minutes.springboot.microservice.example.forex.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

    @Id
    private Long id;
    @Column(name = "currency_from")
    private String from;
    @Column(name = "currency_to")
    private String to;
    private BigDecimal conversionMultiplier;
    private int port;

    public ExchangeValue() {
        super();
    }

    /**
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * @param from
     *                 the from to set
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * @param to
     *               the to to set
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * @return the conversionMultiplier
     */
    public BigDecimal getConversionMultiplier() {
        return conversionMultiplier;
    }

    /**
     * @param conversionMultiplier
     *                                 the conversionMultiplier to set
     */
    public void setConversionMultiplier(BigDecimal conversionMultiplier) {
        this.conversionMultiplier = conversionMultiplier;
    }

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port
     *                 the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *               the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiplier) {
        super();
        this.setId(id);
        this.setFrom(from);
        this.setTo(to);
        this.setConversionMultiplier(conversionMultiplier);
    }

}