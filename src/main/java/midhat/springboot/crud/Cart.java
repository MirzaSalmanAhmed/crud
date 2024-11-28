package midhat.springboot.crud;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//Step 1: Create Model
public class Cart {
    private int id;
    private String title;
    private float price;
    private int quantity;
    private float total;
    private float discountPercentage;

    
}
