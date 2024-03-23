/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoactualizarrepositorio;

import java.util.Random;

/**
 *
 * @author ser20
 */
public class ProyectoActualizarRepositorio {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final int NAME_LENGTH = 5;

    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder builder = new StringBuilder(NAME_LENGTH);

        for (int i = 0; i < NAME_LENGTH; i++) {
            int index = random.nextInt(ALPHABET.length());
            char randomChar = ALPHABET.charAt(index);
            builder.append(randomChar);
        }

        String randomName = builder.toString();
        System.out.println("Nombre generado aleatoriamente: " + randomName);
    }
}
