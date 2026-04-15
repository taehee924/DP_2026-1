package hw.ch06.framework;

public interface Product extends Cloneable {
   void use(String var1);

   Product createCopy();
}
