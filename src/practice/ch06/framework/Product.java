package practice.ch06.framework;

public ibterface Product extends Cloneable { //인터페이스 끼리는 상속 가능
    public abstract void use(String s);
    public abstract Product createCopy(); //복제 메사드
    }

