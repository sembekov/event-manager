package org.example.eventmanagementsystem.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "city")
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "city_id")
    private Long id;

    @Column(name = "city_name")
    private String cityName;
}
