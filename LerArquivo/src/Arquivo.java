import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Arquivo {

    Scanner ler = new Scanner(System.in);
    private ArrayList<String> conteudoCompleto = new ArrayList<>();
    private Modelos modelos = new Modelos();
    private InterfaceModelos tipoModelo;


    private String caminho;

    private void setCaminhoArquivo(){
        System.out.println("Digite o caminho completo do arquivo desejado: ");
        caminho = ler.nextLine();
    }

    private String getCaminhoArquivo(){
        return caminho;
    }

    private void manipularArquivo(){
        try {
            FileReader arquivo = new FileReader(getCaminhoArquivo());
            BufferedReader lerArquivo = new BufferedReader(arquivo);

            String linha = lerArquivo.readLine();

            //doing more than one thing (X)
            while (linha != null){
                System.out.printf("%s\n", linha);
                conteudoCompleto.add(linha);
                linha = lerArquivo.readLine();
            }
            arquivo.close();
        }catch (IOException e){
            System.out.println("Erro ao tentar abrir arquivo informado!");
        }
    }

    private InterfaceModelos tipoArquivo(){
        int tipoArq = Integer.parseInt(conteudoCompleto.get(0));
        tipoModelo = modelos.getModelo(tipoArq);
        return tipoModelo;
    }
    public void iniciar(){
       setCaminhoArquivo();
       manipularArquivo();
       //remover daqui
       // tipoModelo = modelos.getModelo(tipoArquivo());
    }

   //public ArrayList<String> getConteudoCompleto() {
   //     return conteudoCompleto;
    // }
}
