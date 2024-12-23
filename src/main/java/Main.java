import java.util.Scanner;

public class Main {

    int a = 10;

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        int lastNo = 1;

        while (true) {
            System.out.print("명령) ");
            String command = scanner.nextLine();

            if (command.equals("종료")) {
                System.out.println("명언 앱을 종료합니다.");
                break;

            } else if (command.equals("등록")) {
                System.out.print("명언 : ");
                scanner.nextLine(); // 입력값 가져옴. 입력값이 없으면 기다린다. 엔터를 쳐야 입력이 완료됨. 그래야 넘어감

                System.out.print("작가 : ");
                scanner.nextLine();

                System.out.println(lastNo + "번 명언이 등록되었습니다.");
                lastNo++;
            }
        }
    }
}
