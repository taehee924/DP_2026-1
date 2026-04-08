package practice.ch06;

import ch06.Sample.MessageBox;

 public class Main{
    public static void main(String[] args) {
        MessageBox m1 = new MessageBox('@');
        m1.use("Hello, world.");


        //MAnager
        //준비
        //등록
        manager.register(name:"star box",mbox1);
        manager.register(name:"plus line",upen1);
        manager.register(name:"slash box",mbox2);
        //등록된 이름으로 복제품을 얻어서 사용
        product p1 =manager.create(prototypeName=:"star box");
        p1.use(s:tring:"Hello, world.");
        product p2 =manager.create(prototypeName:"plus line");
        p2.use(s:tring:"Hello, world.");
        product p3 =manager.create(prototypeName:"slash box");
        p3.use(s:tring:"Hello, world.");


    }
}
