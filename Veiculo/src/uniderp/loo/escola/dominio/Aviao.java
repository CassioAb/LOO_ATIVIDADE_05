package uniderp.loo.escola.dominio;

public class Aviao extends BaseVeiculo {

    private int portas;
    private int qntdeMotores;
    private int qntdeOcupantes;
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getQntdeMotores() {
        return qntdeMotores;
    }
    public void setQntdeMotores(int qntdeMotores) {
        this.qntdeMotores = qntdeMotores;
    }
    public int getQntdeOcupantes() {
        return qntdeOcupantes;
    }
    public void setQntdeOcupantes(int qntdeOcupantes) {
        this.qntdeOcupantes = qntdeOcupantes;
    }
    public Aviao(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, double pesoLiquido, double pesoTotal, int assentos, int rodas, String fabricante,
            double potência, String tipoCombustível, String nomeProprietário, String estadoUF, String cidadeUF,
            String tipoVeiculo, int portas, int qntdeMotores, int qntdeOcupantes) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, pesoLiquido, pesoTotal, assentos,
                rodas, fabricante, potência, tipoCombustível, nomeProprietário, estadoUF, cidadeUF, tipoVeiculo);
        this.portas = portas;
        this.qntdeMotores = qntdeMotores;
        this.qntdeOcupantes = qntdeOcupantes;
    }

     public void Imprimir(){
        System.out.println("Informações Avião");
        System.out.println("Tipo do Veiculo: "+ this.tipoVeiculo);
        System.out.println("Ano de fabricção: "+ this.anoFabricacao);
        System.out.println("Ano modelo: "+ this.anoModelo);
        System.out.println("Chassi: "+ this.chassi);
        System.out.println("Cidade UF: "+ this.cidadeUF);
        System.out.println("Estado UF: "+ this.estadoUF);
        System.out.println("Codigo: "+ this.codigo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Fabricante: "+ this.fabricante);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Nome: "+ this.nome);
        System.out.println("Nome Propietário: "+ this.nomeProprietário);
        System.out.println("Peso Liquido: "+ this.pesoLiquido);
        System.out.println("Peso Total: "+ this.pesoTotal);
        System.out.println("Placa: "+ this.placa);
        System.out.println("Quantidade de portas: "+ this.portas);
        System.out.println("Potência"+ this.potência);
        System.out.println("Quantidade de motores: "+ this.qntdeMotores);
        System.out.println("Quantidade de ocupantes: "+ this.qntdeOcupantes);
        System.out.println("Quantidade de assentos: "+ this.assentos);
        System.out.println("Quantidade de rodas: "+ this.rodas);
        System.out.println("Tipo do combustível: "+ this.tipoCombustível);
        
        
    }     

    
}
