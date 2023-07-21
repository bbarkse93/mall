package shop.mtcoding.mall.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "product_tb")
@Entity // 테이블의 모델
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;
    private Integer qty;
}
