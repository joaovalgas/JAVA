//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;

        System.out.println("Ano de Lancamento: " + ano);

        boolean incluidoNoPlano = true;
        System.out.println("Esta incluido no plano: " + incluidoNoPlano);

        double notaFilme = 8.1;
        System.out.println("Nota do Filme: " + notaFilme);

        double media = (9.8 + 6.3 + 8)/3;

        System.out.println(media);

        String sinopse;

        sinopse = """
                    Filme de aventura 
                    com galã 
                    dos anos 80
                  """;

        System.out.println(sinopse);

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}