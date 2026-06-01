public class BigString {
    private BigChar[] bigchars;

    public BigString(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigchars = new BigChar[string.length()];
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (BigChar bc : bigchars) {
            bc.print();
        }
    }

    // 외재 상태(colors 배열)를 받아 문자마다 다른 색으로 출력
    public void print(String[] colors) {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print(colors[i]);
        }
    }
}
