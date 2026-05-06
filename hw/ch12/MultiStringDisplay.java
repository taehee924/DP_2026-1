import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    private List<String> strings = new ArrayList<>();
    private int maxColumns = 0;

    public void addString(String string) {
        strings.add(string);
        if (string.length() > maxColumns) {
            maxColumns = string.length();
        }
    }

    @Override
    public int getColumns() {
        return maxColumns;
    }

    @Override
    public int getRows() {
        return strings.size();
    }

    @Override
    public String getRowText(int row) {
        if (row < 0 || row >= strings.size()) {
            return "";
        }
        String string = strings.get(row);
        return string + " ".repeat(maxColumns - string.length());
    }
}