package com.example.lab1;

import com.example.lab1.service.FactorialService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringBootConsoleAppApplication implements CommandLineRunner {

    private final FactorialService factorialService;

    public SpringBootConsoleAppApplication(FactorialService factorialService) {
        this.factorialService = factorialService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsoleAppApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число n для обчислення факторіалу (feature-lab2): ");
        int n = scanner.nextInt();

        long result = factorialService.factorial(n);
        System.out.println("Факторіал числа " + n + " дорівнює " + result);
    }
}
