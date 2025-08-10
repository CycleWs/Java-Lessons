package NivelIntermediario.Records;

import java.util.Objects;

public class NinjaNoRecord {

    //todo CLASSE CONSTRUTOR DE OBJETO PADRÃO

   private final String nome;
   private final String email;
   private final int Telefone;

    public NinjaNoRecord(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        Telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return Telefone;
    }

    @Override
    public String toString() {
        return "NoRecord: {" +
                " nome = '" + nome + '\'' +
                ", email = '" + email + '\'' +
                ", Telefone = " + Telefone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NinjaNoRecord ninjaNoRecord = (NinjaNoRecord) o;
        return Telefone == ninjaNoRecord.Telefone && Objects.equals(nome, ninjaNoRecord.nome) && Objects.equals(email, ninjaNoRecord.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, Telefone);
    }
}