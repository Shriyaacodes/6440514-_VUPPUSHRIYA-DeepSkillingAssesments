package com.library.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class MainApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            // Get the bookService bean
            BookService bookService = context.getBean("bookService", BookService.class);

            // Call method to display book
            bookService.displayBook();
        } // context will be auto-closed here
    }
}
