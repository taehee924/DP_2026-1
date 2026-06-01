public class Main {
    static final String RED     = "[31m";
    static final String GREEN   = "[32m";
    static final String YELLOW  = "[33m";
    static final String BLUE    = "[34m";
    static final String MAGENTA = "[35m";
    static final String CYAN    = "[36m";
    static final String RESET   = "[0m";

    private static final String[] COLOR_CYCLE = {RED, BLUE, GREEN, MAGENTA, CYAN, YELLOW, BLUE};

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        String input = args[0];
        BigString bs = new BigString(input);

        String[] colors = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            colors[i] = COLOR_CYCLE[i % COLOR_CYCLE.length];
        }

        bs.print(colors);
    }
}
