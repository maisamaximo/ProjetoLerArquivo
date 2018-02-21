import java.time.LocalDate;
import java.util.ArrayList;

public class Modelo_01 implements InterfaceModelos {

    private ConversorDeTipo conversorDeTipo = new ConversorDeTipo();
    //ArrayList<Object> tudo = new ArrayList<>();
    private ArrayList<Integer> id_modelo1 = new ArrayList<>();
    private ArrayList<Float> valor_modelo1 = new ArrayList<>();
    private ArrayList<LocalDate> data_modelo1 = new ArrayList<>();
    private ArrayList<String> codigo_modelo1 = new ArrayList<>();
    private ArrayList<Integer> quantidade_modelo1 = new ArrayList<>();

    private String[] itemColuna;

    @Override
    public void separarDados(ArrayList<String> conteudoCompleto) {
        for(String linha : conteudoCompleto){
            itemColuna = linha.split("\t");
            if(itemColuna.length > 2) {
                id_modelo1.add(conversorDeTipo.converterStringParaInteger(itemColuna[0]));
                valor_modelo1.add(conversorDeTipo.converterStringParaFloat(itemColuna[1]));
                data_modelo1.add(conversorDeTipo.converterStringParaDate(itemColuna[2]));
                codigo_modelo1.add(itemColuna[3]);
                quantidade_modelo1.add(conversorDeTipo.converterStringParaInteger(itemColuna[4]));
            }
        }
        for(Integer x : quantidade_modelo1)
        System.out.println(x.toString());

    }

}
