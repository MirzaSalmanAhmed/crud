package midhat.springboot.crud;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CartRepo implements Icart<Cart>{

    private Map<Integer,Cart> cart;

    public CartRepo()
    {
        cart = new HashMap<>();
    }

    @Override
    public void SaveItem(Cart t) {
        cart.put(t.getId(),t);
    }

    @Override
    public void RemoveItem(Cart t) {
        cart.remove(t.getId());
    }

    @Override
    public Collection<Cart> viewCart() {
        return cart.values();
    }
    
}


