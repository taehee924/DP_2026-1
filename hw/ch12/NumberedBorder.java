public class NumberedBorder extends Border {
    /**
     * NumberedBorder 생성자
     * @param display 장식할 Display 객체
     */
    public NumberedBorder(Display display) {
        super(display);
    }

    /**
     * 행 번호 4글자(%2d| 형식)를 포함한 가로 폭을 반환한다.
     */
    @Override
    public int getColumns() {
        return display.getColumns() + 4;
    }

    /**
     * 내용물과 동일한 행 수를 반환한다.
     */
    @Override
    public int getRows() {
        return display.getRows();
    }

    /**
     * 각 행 앞에 "%2d| " 형식의 행 번호를 붙여 반환한다.
     */
    @Override
    public String getRowText(int row) {
        return String.format("%2d| ", row + 1) + display.getRowText(row);
    }
}