import java.util.HashMap;
import java.util.Map;

public class Modelos {

    private Map<Integer, InterfaceModelos> map = new HashMap<>();

    public Modelos(){
        map.put(1, new Modelo_01());
        map.put(2, new Modelo_02());
    }

    public InterfaceModelos getModelo(int modelo) {
        return map.get(modelo);
    }
}
