//Bárbara izadora Alves da Cruz & Pedro Henrique Vilaaça Valverde - REDES 2A
package TrabalhoPratico;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<Perfil> usuarios = new ArrayList<>();
        int opc = 0;
        int sexo;
        String nome;
        System.out.println("BEM VINDO A AGENDA MULTIFUNCIONAL 3000");
        while (opc < 6) {
            System.out.println("-------------MENU-------------"
                    + "Escolha uma das opções: "
                    + "\n 1-Novo Usuario"
                    + "\n 2-Excluir usuario"
                    + "\n 3-Atualizar dados de usuario"
                    + "\n 4-Imprimir dados usuario em especifico"
                    + "\n 5-Listar nomes de usuarios cadastrados"
                    + "\n 6-Sair\n");
//                    + "\n 7-Limpar tela\n"); //opcional para programa, nao necessario para seu funcionamento
            System.out.print("Opcao: ");
            opc = in.nextInt();
            in.nextLine();
            switch (opc) {
                case 1:
                    Perfil p = new Perfil();
                    System.out.println("Qual o nome a ser cadastrado?");
                    p.setNome(in.nextLine());
                    System.out.println("Qual a senha a ser cadastrada?");
                    p.setSenha(in.nextLine());
                    System.out.println("Informe a idade ");
                    p.setIdade(in.nextDouble());
                    usuarios.add(p);
                    System.out.println("CADASTRO CONCLUIDO!");
                    System.in.read();

                    }
                    break;
                case 2:
                    System.out.println("Excluir usuario ?");
                    int y = -10;
                    
                        System.out.println("Qual usuario deseja excluir? (nome)");
                        nome = in.nextLine();
                        for (int i = 0; i < usuarios.size(); i++) {
                            Perfil x = usuarios.get(i);
                            if (p.getNome().equals(nome)) {
                                usuarios.remove(x);
                                System.out.println("Usuario excluido!!!");
                                i = usuarios.size() + 1;
                                System.in.read();
                                y = i + 100;
                            }  
                        }
                        if (x <= usuarios.size()) {
                            System.out.println("Pessoa nao encontrada!");
                            System.in.read();
                        }
                    break;

                case 3:
                        System.out.println("Qual usuario deseja modificar? (nome)");
                        nome = in.nextLine();
                        for (int i = 0; i < usuarios.size(); i++) {
                            Perfil x = usuarios.get(i);
                            if (p.getNome().equals(nome)) {
                                System.out.println("Esceva os novos dados: ");
                                System.out.println("Nome: ");
                                h.setNome(in.nextLine());
                                System.out.println("Senha: ");
                                h.setSenha(in.nextLine());
                                System.out.println("Idade: ");
                                h.setIdade(in.nextDouble());
                                mulher.set(i, h);//coloca os dados de Homem na posição i, sobrepondo a informação anterior
                                System.out.println("Usuario atualizado!!");
                                System.in.read();
                            } else {
                                System.out.println("Pessoa nao encontrada!");
                                System.in.read();
                            }
                        }
                    break;
                case 4:
                    System.out.println("Pesquisar usuario masculino ou feminino? (1)masculino ou (2)feminino");
                    sexo = in.nextInt();
                    in.nextLine();
                    if (sexo == 1) {
                        System.out.println("Qual usuario a ser pesquisado? (nome)");
                        nome = in.nextLine();
                        for (int i = 0; i < homem.size(); i++) {
                            Homem p = homem.get(i);
                            if (p.getNome().equals(nome)) {
                                System.out.println("Nome: " + p.getNome());
                                System.out.println("Idade: " + p.getIdade());
                                System.out.println("Altura: Ainda nao cadastrado");
                                System.out.println("Email: Ainda nao cadastrado");
                                System.in.read();
                            } else {
                                System.out.println("Usuario nao encontrado!!");
                                System.in.read();
                            }
                        }
                    } else {
                        System.out.println("Qual usuario a ser pesquisado? (nome)");
                        nome = in.nextLine();
                        for (int i = 0; i < mulher.size(); i++) {
                            Mulher p = mulher.get(i);
                            if (p.getNome().equals(nome)) {
                                System.out.println("Nome: " + p.getNome());
                                System.out.println("Idade: " + p.getIdade());
                                System.out.println("Altura: Ainda nao cadastrado");
                                System.out.println("Email: Ainda nao cadastrado");
                                System.in.read();
                            } else {
                                System.out.println("Usuario nao encontrado!!");
                                System.in.read();
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.print("Usuarios cadastrados:\n");
                    for (int i = 0; i < homem.size(); i++) {
                        System.out.print(homem.get(i).getNome() + "\n");
                    }
                    for (int i = 0; i < mulher.size(); i++) {
                        System.out.print(mulher.get(i).getNome() + "\n");
                    }
                    System.in.read();// similar ao system("pause") da linguagem C
                    break;
                case 6:
                    System.out.println("Obrigado por utilizar a Agenda 3000 \n   Volte sempre! ");
                    opc = 6;
                    break;
                /*                case 7:            // limpar tela (opcional para programa)
                    for (int i = 0; i < 100; i++) {
                        System.out.println("");
                    }
                 */
            }

        }
    }
}
