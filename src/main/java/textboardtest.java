import java.util.ArrayList;
import java.util.Scanner;

public class textboardtest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        ArrayList<String> titles = new ArrayList<>();
//        ArrayList<String> contents =
        ArrayList<Article> articles = new ArrayList<>();
        int lastArticleId = -1;
        while (true) {
            System.out.print("명령어 : ");
            String commend = scan.nextLine();
            int target = 0;
            if (commend.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (commend.equals("add")) {
                System.out.println("게시물 제목을 입력해주세요:");
                String title = scan.nextLine();
                System.out.println("게시물 내용을 입력해주세요:");
                String content = scan.nextLine();

                Article article = new Article(lastArticleId, title, content);
                articles.add(article);
                System.out.println("게시물이 등록되었습니다.");
            } else if (commend.equals("list")) {
                System.out.println("===============");
                for (int i = 0; i < articles.size(); i++) {
                    Article article = articles.get(i);
                    System.out.printf("번호 : %d\n", i + 1);
                    System.out.printf("제목 : %s\n", article.getTitle());
                    System.out.println("==================");
                }
            } else if (commend.equals("update")) {
                System.out.println("수정할 게시물 번호 :");
                target = scan.nextInt();

                scan.nextLine();
                System.out.print("제목 : ");
                String newTitle = scan.nextLine();
                System.out.print("내용 : ");
                String newcontent = scan.nextLine();

                Article newArticle = new Article(lastArticleId, newTitle, newcontent);
                articles.set(target - 1, newArticle);
                System.out.println("수정이 완료되었습니다.");


            } else if (commend.equals("delete")) {
                System.out.println("삭제할 게시물 번호 : ");
                int targetId = scan.nextInt();



            } else if (commend.equals("detail")) {
                System.out.println("상세보기 할 게시물 번호를 입력해주세요 :");
                int targetId = scan.nextInt();


                if(targetId == articles.size()) {
                    System.out.println("==================");
                    System.out.printf("제목 : %s\n", targetId);
                    System.out.printf("내용 : %s\n", targetId);
                    System.out.println("===================");
                }

            }


        }

    }


}
