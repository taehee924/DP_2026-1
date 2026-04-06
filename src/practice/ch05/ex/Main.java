package practice.ch05.ex

public class Main extends Tread{
    public static void main(String[] args) {
        //스레드 객체 생성
        Main t1 =new Main("Thred-A");
        Main t2 =new Main("Thred-B");

        //스레드에 시작해라 지시
        t1.start(); //스레드가 해야 할 일을 작성한 rub() 메소드가 자동으로 실행
        t2.start();
    }
        //스레드가 해야할 일 작성
    @Override
    public void run() {
        Singleton static
        //부모인 Thread의 생설자흫 호출해서 스레드 이름 설정
    }
