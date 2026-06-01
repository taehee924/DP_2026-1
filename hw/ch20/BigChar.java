import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    private char charname;
    private String fontdata;  // 내재 상태: 공유되는 폰트 데이터

    public BigChar(char charname) {
        this.charname = charname;
        try {
            String filename = "big" + charname + ".txt";
            StringBuilder sb = new StringBuilder();
            for (String line : Files.readAllLines(Path.of(filename))) {
                sb.append(line);
                sb.append("\n");
            }
            this.fontdata = sb.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?\n";
        }
    }

    public void print() {
        System.out.print(fontdata);
    }

    // 외재 상태(colorCode)를 받아 해당 색으로 출력
    public void print(String colorCode) {
        System.out.print(colorCode + fontdata + Main.RESET);
    }
}
