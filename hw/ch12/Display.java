public abstract class Display {
    /**
     * 가로 폭(열의 개수)을 반환한다.
     */
    public abstract int getColumns();

    /**
     * 세로 높이(행의 개수)를 반환한다.
     */
    public abstract int getRows();

    /**
     * 지정된 행의 텍스트를 반환한다.
     */
    public abstract String getRowText(int row);

    /**
     * 전체 내용을 출력한다.
     */
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}