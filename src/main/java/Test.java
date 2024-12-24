import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("World");
        strings.add("Java");

        // index로 지우는 방법
        strings.remove(0);

        for (String s : strings) {
            System.out.println(s);
        }

        // 값으로 지우는 법
        strings.remove("Java");

        for (String s : strings) {
            System.out.println(s);
        }

        WiseSaying w1 = new WiseSaying(1, "꿈을 지녀라. 그러면 어려운 현실을 이길 수 있다.", "월트 디즈니");
        WiseSaying w2 = new WiseSaying(2, "현재를 사랑하라", "작자 미상");
        ArrayList<WiseSaying> wiseSayings = new ArrayList<>();
        wiseSayings.add(w1);
        wiseSayings.add(w2);
//        wiseSayings.remove(0);
        wiseSayings.remove(w1);

        for (WiseSaying ws : wiseSayings) {
            System.out.println(ws.getContent());
            System.out.println(ws.getAuthor());
        }
    }
}