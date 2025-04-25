package Question1_ClassAndObject;
import java.util.*;

public class Book{
    String title;
    String author;
    int ISBN;

//    constructor
    Book(String title , String author , int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void printDetails(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + ISBN);
    }

    public String getTitle(){
        return title;
    }
}


