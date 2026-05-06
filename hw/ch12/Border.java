public abstract class Border extends Display {
    /**
     * 내부에 보유한 Display 객체
     */
    protected Display display;

    /**
     * 생성자에서 Display 객체를 받아 저장한다.
     */
    public Border(Display display) {
        this.display = display;
    }
}