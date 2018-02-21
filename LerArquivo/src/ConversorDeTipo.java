import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConversorDeTipo {

    public int converterStringParaInteger(String dadoArquivo){
        return Integer.parseInt(dadoArquivo);
    }

    public Float converterStringParaFloat(String dadoArquivo){
        return Float.parseFloat(dadoArquivo);
    }

    public LocalDate converterStringParaDate(String dadoArquivo){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dadoArquivo, formato);
    }

}
