package hw.ch06;

import hw.ch06.framework.Product;

public class MessageBox implements Product {
   private char decochar;

   public MessageBox(char decochar) {
      this.decochar = decochar;
   }

   public void use(String s) {
      int decolen = 1 + s.length() + 1;

      for(int i = 0; i < decolen; ++i) {
         System.out.print(this.decochar);
      }

      System.out.println();
      System.out.println(this.decochar + s + this.decochar);

      for(int i = 0; i < decolen; ++i) {
         System.out.print(this.decochar);
      }

      System.out.println();
   }

   public Product createCopy() {
      Product p = null;

      try {
         p = (Product)this.clone();
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }

      return p;
   }
}
