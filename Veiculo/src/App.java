import uniderp.loo.escola.dominio.Aviao;
import uniderp.loo.escola.dominio.Caminhao;
import uniderp.loo.escola.dominio.Carro;
import uniderp.loo.escola.dominio.Motocicleta;
import uniderp.loo.escola.dominio.Onibus;

public class App {

    public static void main(String[] args) throws Exception {
        Aviao avi = new Aviao(0, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0); 
        avi.Imprimir();

        Caminhao cami = new Caminhao(0, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, null, 0, 0);
        cami.Imprimir();

        Carro car = new Carro(0, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, null, 0);
        car.Imprimir();
        
        Motocicleta mot = new Motocicleta(0, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, null);
        mot.Imprimir();

        Onibus oni = new Onibus(0, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, null, 0, 0);
        oni.Imprimir();
        

    }
}