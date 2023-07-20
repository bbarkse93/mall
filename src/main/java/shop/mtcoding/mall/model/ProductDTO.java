package shop.mtcoding.mall.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
// 셀렉하고 수정해서 인서트?
    private Integer id;
    private String name;
    private Integer price;
    private Integer qty;
    private Integer total;

}
