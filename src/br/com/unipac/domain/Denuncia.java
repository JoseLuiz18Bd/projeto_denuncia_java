package br.com.unipac.domain;
import java.util.Random;
import java.util.Scanner;

public class Denuncia{
    private int id;
    private String tipoDenuncia;
    private String denuncia;
    private Cidadao cidadao;//AGREGAÇÃO

    //    PUBLIC METHODS
    public void fazerDenuncia(){
        Scanner scan = new Scanner(System.in);
        System.out.println("############# FORMULÁRIO DE DENÚNCIA ##################");
        System.out.println("Tipo de denuncia: ");
        this.tipoDenuncia = scan.nextLine();
        System.out.println("Descreva sua denuncia: ");
        this.denuncia = scan.nextLine();
    }
    public void registrarDenuncia(){
        System.out.println("Para registrar a denuncia insira os dados abaixo para acompanhamento de processo: ");
        Cidadao.digitarDados();
    }

    public void imprimirDenuncia() {
        System.out.println("############# IMPRESSÃO ##################");
        System.out.println("NÚMERO DA DENÚNCIA: "+this.getId());
        System.out.println("TIPO DE DENÚNCIA: \n"+getTipoDenuncia());
        System.out.println("DENÚNCIA: \n"+getDenuncia());
        System.out.println("DENUNCIANTE: ");
        System.out.println(Cidadao.imprimirDados());

    }

    //    GETTERS AND SETTERS
    public int getId() {
        Random aleatorio = new Random();
        this.id = aleatorio.nextInt(9999);
        return id;
    }
    public void setId(int id) {

        this.id = id;
    }
    public String getTipoDenuncia() {

        return tipoDenuncia;
    }
    public void setTipoDenuncia(String tipoDenuncia) {

        this.tipoDenuncia = tipoDenuncia;
    }
    public String getDenuncia() {

        return denuncia;
    }
    public void setDenuncia(String denuncia) {

        this.denuncia = denuncia;
    }
    public Cidadao getCidadao() {

        return cidadao;
    }
    private void setCidadao() {

        this.cidadao = cidadao;
    }
}
