package midhat.springboot.crud;

import java.util.Collection;

//Step 2: Create Interface
public interface Icart<T> {
    
    public void SaveItem(T t);
    public void RemoveItem(T t);
    public Collection<T> viewCart();
    
}
