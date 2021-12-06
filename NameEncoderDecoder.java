public class NameEncoderDecoder {

    public static void main(String[] args) {
        System.out.println(encode("Max"));
        System.out.println(decode("Max"));
    }

    public static String encode(String name)  {
        String name1 = name.replace("e", "1").replace("u", "2").replace("i", "3").replace("o", "4").replace("a", "5");
        return "NOTFORYOU" + name1 + "YESNOTFORYOU";
    }
    public static String decode(String name) {
        String name1 = name.replace("1", "e").replace("2", "u").replace("3", "i").replace("4", "o").replace("5", "a").replace("NOTFORYOU", " ").replace("YES", " ");
        return name1.strip();
    }
}
