package construct;

public class Book {
    String title; //제목
    String author; //저자
    int page; //페이지 수

    //TODO 코드를 완성하세요.

    public Book(){

    }

    public Book(String title, String author){
        this(title,author,0);
    }

    public Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void displayInfo(){

        if(title == null && author == null){
            System.out.println("도서 정보가 존재하지 않음");
            return;
        }

        if(page == 0){
            System.out.println("도서명 : " + title +
                    " 저자 : " + author + " 페이지수 : 페이지 정보 존재하지 않음");
            return;
        }

        System.out.println("도서명 : " + title +
                " 저자 : " + author + " 페이지수 : " + page);
    }
}
