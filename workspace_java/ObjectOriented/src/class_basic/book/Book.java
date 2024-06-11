package class_basic.book;

import java.sql.Struct;

public class Book {

        String title;
        String writer;
        int price;

        public Book(){
            this.title = "";
            writer = "";
            price = 0;
        }

        public Book(String title, String writer, int price) {
            this.title = title;
            this.writer = writer;
            this.price = price;
        }
    }

