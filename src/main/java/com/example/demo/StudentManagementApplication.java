package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

/**
 * Point d'entrée : démarre Tomcat embarqué et initialise tous les composants Spring.
 */
@SpringBootApplication
public class StudentManagementApplication {

    public static void main(String[] args) {
        // Toute l'application en UTC (JVM, JSON et MySQL) : sinon, avec java.util.Date,
        // une date comme 1985-09-01 peut revenir décalée d'un jour (fuseau Maroc UTC+1).
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SpringApplication.run(StudentManagementApplication.class, args);
    }
}
