import java.util.Scanner;

public class FuncionalidadesArmario {
    Armario armario = new Armario("Rosa","Leroy Merlin",1.9f,2.0f,4);

    public boolean DestrancarArmario(int senha){
        if (senha == 1234) {
            armario.aberto = true;
            armario.trancado = false;
            armario.fechado = false;
            return true;
        }
        return false;
    }

    public void isOpen(){
        if(!armario.trancado){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a senha de acesso do armário: ");
            int senha = sc.nextInt();
            DestrancarArmario(senha);
            if (senha == 1234){
                abrir();
                System.out.println("Armário aberto com sucesso!");
            }
            else{
                System.out.println("Senha incorreta!");
            }
        }
        else{
            System.out.println("O armário já está aberto!");
        }
    }

    public void abrir(){
        armario.aberto = true;
    }

    public void isClose(){
        if(armario.aberto){
            System.out.println("O armário já está fechado");
        }
        else {
            fechar();
            System.out.println("Armario fechado com sucesso");
        }
    }

    public void fechar(){
        armario.fechado = true;
        armario.aberto = false;
    }
    public void isBlock(){
        trancar();
    }
    public void trancar(){
        if (armario.fechado){
            System.out.println("Feche o armário antes de trancar");
        }
        else {
            armario.trancado = true;
            System.out.println("Armário trancado com sucesso.");
        }
    }

    public void selecionarOpcao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Digite a a ação que deseja executar em seu armário: \n
                Opção 1: Abrir Armário
                Opção 2: Fechar Armário
                Opção 3; Trancar Armário
                Opção 4: Destrancar Armário
                """);

        int Opcao = scanner.nextInt();

        if (Opcao == 1){
           isOpen();
        }
        else if (Opcao == 2){
           isClose();
        }
        else if (Opcao == 3) {
            isBlock();
        }
        else if (Opcao == 4) {
            isOpen();
        }
        else {
            System.out.println("Digite uma opção válida!");
        }
    }
}
