package br.com.unipac.domain;
import java.util.Scanner;

public class Cidadao {
    private static String nome;
    private static String email;
    private static String whatsapp;
    private Cidade cidade;//AGREGAÇÃO
//   PUBLIC METHODS
    public static void digitarDados(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome: ");
        nome = scan.nextLine();
        System.out.println("Email: ");
        email = scan.nextLine();
        System.out.println("Whatsapp: ");
        whatsapp = scan.nextLine();
        Cidade.setNomeCidade();
    }

    public static boolean imprimirDados(){
        System.out.println("\t\t\tNome: "+Cidadao.nome);
        System.out.println("\t\t\tEmail: "+Cidadao.email);
        System.out.println("\t\t\tWhatsapp: "+Cidadao.whatsapp);
        System.out.println("\t\t\tCidade: " +Cidade.getNomeCidade());

        return true;
    }
//    GETTERS AND SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}