package com.example.springdataboot.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "track")
public class Track {
    @Id
    @Column(name = "TrackId", nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false, length = 200)
    private String name;

    @Column(name = "Composer", length = 220)
    private String composer;

    @Column(name = "Milliseconds", nullable = false)
    private Integer milliseconds;

    @Column(name = "Bytes")
    private Integer bytes;

    @Column(name = "UnitPrice", nullable = false, precision = 10, scale = 2)
    private BigDecimal unitPrice;

}