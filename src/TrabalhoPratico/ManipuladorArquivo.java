/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoPratico;

/**
 *
 * @author Aluno
 */
import java.io.*;
import java.util.ArrayList;

public class ManipuladorArquivo {

    private final String file;

    public ManipuladorArquivo(String file) {
        this.file = file; 
    }

    public String leitor() throws FileNotFoundException, IOException {
        FileReader f = new FileReader(file);
        BufferedReader readerf = new BufferedReader(f);
        String linha = readerf.readLine();
        
        return linha;
    }

    public String procurar(String palavra) throws FileNotFoundException, IOException {
        FileReader f = new FileReader(file);
        BufferedReader readerf = new BufferedReader(f);
        String linha = readerf.readLine();
        String linhas = "";
        String vetor[];
        int nlinha = 1;
        while (linha != null) {
            vetor = linha.split(" ");
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i].equals(palavra)) {
                    linhas += (String.valueOf(nlinha) + "; ");
                }
            }
            nlinha++;
            linha = readerf.readLine();
        }
        return linhas;
    }

    public void escritor(String linha) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter fwriter = new BufferedWriter(fw);
        fwriter.write(linha + "\n");
        fwriter.close();
    }
    /*public void escritor1(String linha) throws IOException {
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter fwriter = new BufferedWriter(fw);
        fwriter.write(linha + '\n');
        fwriter.close();
    }*/

    public ArrayList<String> armazenar() throws FileNotFoundException, IOException {
        ArrayList<String> arquivo = new ArrayList();
        FileReader f = new FileReader(file);
        BufferedReader readerf = new BufferedReader(f);
        String linha = readerf.readLine();
        while (linha != null) {
            arquivo.add(linha);
            linha = readerf.readLine();
        }

        return arquivo;
    }

    public static void copiar(String text, ManipuladorArquivo m) throws FileNotFoundException, IOException {
        FileReader f = new FileReader(text);        
        BufferedReader readerf = new BufferedReader(f);
        String linha = readerf.readLine();
        while (linha != null) {
            m.escritor(linha);
            linha = readerf.readLine();
        }
    }
}
