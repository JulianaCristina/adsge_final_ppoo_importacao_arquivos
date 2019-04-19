
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juliana Cristina
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.text.ParseException
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        File arquivos[] = CarregarDiretorio.getCarregarDiretorio();
        String diretorio = CarregarDiretorio.getDiretorio();
        
        Arrays.sort(arquivos);
        
        for (File arquivo : arquivos) {
            LeituraArquivo leitura = new LeituraArquivo();
            List<String> lista = leitura.lerArquivo(diretorio + arquivo.getName());
            String nomeArquivo=  leitura.getNomeArquivo2();
            ProcessadoraArquivo processadora;
            processadora = new ProcessadoraArquivo( ProcessadoraInjetora.getProcessadorLinha(nomeArquivo) ); 
            System.out.println(processadora.processaArquivo(lista));
        }
    }
    
}
