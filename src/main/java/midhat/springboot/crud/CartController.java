package midhat.springboot.crud;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("cart")
public class CartController {

    private CartRepo repo;

    private CartController()
    {
        repo= new CartRepo();
    }

    //For Adding/Updating the Item in the cart
    @PostMapping("addItem")
    public String addItem(@RequestBody Cart cart)
    {
        repo.SaveItem(cart);
        return cart.getTitle() + " has been added to your cart";
    }
    
    //For Deleting the Item in the cart
    @PostMapping("deleteItem")
    public String deleteItem(@RequestBody Cart cart)
    {
        repo.RemoveItem(cart);
        return cart.getTitle() + " has been deleted from your cart";
    }
    
    //For Viewing the Items in the cart
    @GetMapping("")
    public Collection<Cart> viewAll() {
        return repo.viewCart();
    }
    
}

