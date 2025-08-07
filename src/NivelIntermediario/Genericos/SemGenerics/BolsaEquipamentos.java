package NivelIntermediario.Genericos.SemGenerics;

import java.util.ArrayList;
import java.util.List;

public class BolsaEquipamentos {
    private List<Kunai> kunais;

    public BolsaEquipamentos() {
        this.kunais = new ArrayList<>();
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    public void adcionarEquipamentos(Kunai kunai){
        kunais.add(kunai);
    }

    @Override
    public String toString(){
        return "Bolsa de equipamentos: "+ kunais.toString();
    }
}
