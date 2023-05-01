import br.com.unipac.domain.Denuncia;

public class Main {
    public static void main(String[] args) {
        Denuncia denuncia01 = new Denuncia();
        denuncia01.fazerDenuncia();
        denuncia01.registrarDenuncia();
        denuncia01.imprimirDenuncia();
    }
}