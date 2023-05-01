package br.com.unipac.domain;
import java.util.Scanner;

public class Cidade {
    private int id;
    private static String nomeCidade;

    //    GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNomeCidade() {
        return nomeCidade;
    }

    public static void setNomeCidade() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cidade: ");
        Cidade.nomeCidade = scan.nextLine();
    }
}




