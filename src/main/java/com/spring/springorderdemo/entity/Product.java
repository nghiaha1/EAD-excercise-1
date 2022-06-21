package com.spring.springorderdemo.entity;

import com.spring.springorderdemo.entity.base.BaseEntity;
import com.spring.springorderdemo.entity.enums.ProductSimpleStatus;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    @Id
    private String id;
    private String name;
    private String detail;
    private String thumbnails;
    private BigDecimal price;
    @Enumerated(EnumType.ORDINAL)
    private ProductSimpleStatus status;
}
