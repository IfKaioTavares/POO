package exerciseList1.questao4;

public class App {
    public static void main(String[] args) {
        // Criando instâncias de Soldado, Cabo, Sargento, Tenente e Capitão
        Soldado soldado1 = new Soldado("Soldado 1", 1);
        Soldado soldado2 = new Soldado("Soldado 2", 2);
        Cabo cabo1 = new Cabo("Cabo 1", 3);
        Sargento sargento1 = new Sargento("Sargento 1", 4);
        Tenente tenente1 = new Tenente("Tenente 1", 5);
        Capitao capitao1 = new Capitao("Capitão 1", 6);

        // Configurando as relações hierárquicas
        cabo1.addSubordinado(soldado1);
        cabo1.addSubordinado(soldado2);
        sargento1.addSubordinado(cabo1);
        tenente1.addSubordinado(sargento1);
        capitao1.addSubordinado(tenente1);

        // Testando a troca de imediato
        Cabo novoCabo = new Cabo("Novo Cabo", 7);
        tenente1.setImediato(capitao1);

        // Verificando as listas de subordinados de cada nível hierárquico
        System.out.println("Subordinados do Capitão 1:");
        for (Tenente tenente : capitao1.getSubordinados()) {
            System.out.println(" - " + tenente.getNome());
        }

        System.out.println("Subordinados do Tenente 1:");
        for (Sargento sargento : tenente1.getSubordinados()) {
            System.out.println(" - " + sargento.getNome());
        }

        System.out.println("Subordinados do Sargento 1:");
        for (Cabo cabo : sargento1.getSubordinados()) {
            System.out.println(" - " + cabo.getNome());
        }

        System.out.println("Subordinados do Cabo 1:");
        for (Soldado soldado : cabo1.getSubordinados()) {
            System.out.println(" - " + soldado.getNome());
        }

        // Removendo um subordinado
        cabo1.removeSubordinado(soldado1);

        // Verificando a lista de subordinados após a remoção
        System.out.println("Subordinados do Cabo 1 após remoção:");
        for (Soldado soldado : cabo1.getSubordinados()) {
            System.out.println(" - " + soldado.getNome());
        }
    }
}
