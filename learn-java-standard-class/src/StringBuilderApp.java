public class StringBuilderApp {
    /**
     * String builder (not safe thread) (Better permorma than string buffer if don't need to manipulate paralel)
     * Not recommended for paralel manipulate string.
     */
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Jhon");
        builder.append(" ");
        builder.append("Ken");
        builder.append(" ");
        builder.append("Wick");

        String name = builder.toString();
        System.out.println(name);

    }
}
