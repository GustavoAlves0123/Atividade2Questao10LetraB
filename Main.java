class Usuario {
    public void exibirMenu() {
        System.out.println("Menu genérico de usuário.");
    }
}

class Vendedor extends Usuario {
    @Override
    public void exibirMenu() {
        super.exibirMenu();
        System.out.println("1. Vender\n2. Imprimir comprovante");
    }
}

class Gerente extends Vendedor {
    @Override
    public void exibirMenu() {
        super.exibirMenu();
        System.out.println("3. Cadastrar vendedor\n4. Cadastrar produto");
    }
}

class Diretor extends Gerente {
    @Override
    public void exibirMenu() {
        super.exibirMenu();
        System.out.println("5. Gerenciar financeiro\n6. Emitir relatório");
    }
}
public class Main {
    public static void main(String[] args) {
        Usuario vendedor = new Vendedor();
        Usuario gerente = new Gerente();
        Usuario diretor = new Diretor();
        System.out.println("Menu do Vendedor:");
        vendedor.exibirMenu();
        System.out.println("\nMenu do Gerente:");
        gerente.exibirMenu();
        System.out.println("\nMenu do Diretor:");
        diretor.exibirMenu();
    }
}
