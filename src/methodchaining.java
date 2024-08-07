public class methodchaining {
    public static void main(String[] args) {
        String name = "    bro";
        name = name.concat(" code      ").toUpperCase().trim();
        System.out.println(name);
    }
}
