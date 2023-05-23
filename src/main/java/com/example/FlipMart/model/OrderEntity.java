package com.example.FlipMart.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "order_info")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "order_no")
    String orderNo;

    @Column(name = "total_value")
    Integer totalValue;

    @Column(name = "order_date")
    @CreationTimestamp
    Date orderDate;

    @Column(name = "card_user")
    String cardUsed;

    @ManyToOne
    @JoinColumn
    Customer customer;

    @OneToMany(mappedBy = "orderEntity", cascade = CascadeType.ALL)
    List<Item> items = new ArrayList<>();
}
