package com.firstservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.text.DecimalFormat;
import java.util.Scanner;

@RestController
public class FirtController {
    
    @GetMapping("/")
    public String calcularImpacto(@RequestParam("kmDiarios") double kmDiarios) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a média de quilômetros rodados diariamente: ");
            double numero1 = scanner.nextDouble();

            double resultado = numero1 * 0.82 * 0.75 * 3.7;
            double resultadom = numero1 * 0.82 * 0.75 * 3.7 * 30;
            double resultadoa = numero1 * 0.82 * 0.75 * 3.7 * 365;

            DecimalFormat df = new DecimalFormat("#.##");
            
            String resultadoFormatado = df.format(resultado);
            String resultadomFormatado = df.format(resultadom);
            String resultadoaFormatado = df.format(resultadoa);

            System.out.println("O impacto diário é: " + resultadoFormatado + " kg CO²");
            System.out.println("O impacto mensal é: " + resultadomFormatado + " kg CO²");
            System.out.println("O impacto anual é: " + resultadoaFormatado + " kg CO²");
    }
}