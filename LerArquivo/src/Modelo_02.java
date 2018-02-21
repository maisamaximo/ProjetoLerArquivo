import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Modelo_02 implements InterfaceModelos {

    private ConversorDeTipo conversorDeTipo = new ConversorDeTipo();
    private ArrayList<String> telefone_modelo2 = new ArrayList<>();
    private ArrayList<String> rua_modelo2 = new ArrayList<>();
    private ArrayList<LocalDate> nascimento_modelo2 = new ArrayList<>();

    private String[] itemColuna;

    @Override
    public void separarDados(ArrayList<String> conteudoCompleto) {
        for (String linha : conteudoCompleto) {
            itemColuna = linha.split("\t");
            if(itemColuna.length>2){
                telefone_modelo2.add(itemColuna[0]);
                rua_modelo2.add(itemColuna[1]);
                nascimento_modelo2.add(conversorDeTipo.converterStringParaDate(itemColuna[2]));
            }
        }
        for(LocalDate x : nascimento_modelo2)
            System.out.println(x);
    }
}