public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Armario armario = new Armario("Rosa", "Leroy Merlin", 1.9f, 2.0f, 4);
            FuncionalidadesArmario funcionalidadesArmario = new FuncionalidadesArmario();

            funcionalidadesArmario.selecionarOpcao();

        }
    }
}