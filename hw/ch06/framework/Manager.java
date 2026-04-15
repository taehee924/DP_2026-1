package hw.ch06.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
   private Map<String, Product> showcase = new HashMap();

   public Manager() {
   }

   public void register(String name, Product prototype) {
      this.showcase.put(name, prototype);
   }

   public Product create(String prototypeName) {
      Product p = (Product)this.showcase.get(prototypeName);
      return p.createCopy();
   }
}
