package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        NinjaNoRecord cadastro = new NinjaNoRecord("Naruto","naruto@email.com",999666999);
        System.out.println("Cadastro sem usar record: "+ cadastro);

        NinjaRecord cadastroUsandoRecord = new NinjaRecord("Kakashi","kakashi@email.com",666999666);
        System.out.println("Cadastro usando Record: "+ cadastroUsandoRecord);

        //todo usand metodo criado no Record
        System.out.println("Email em caixa alta: " +cadastroUsandoRecord.emailCaixaAlta() );
    }
}
