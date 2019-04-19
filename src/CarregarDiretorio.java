
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juliana Cristina
 */
public class CarregarDiretorio {
    
    private static File arquivos[];
    private static String diretorio; 
    private static File documentos;
    
    public static File[] getCarregarDiretorio(){
         
       diretorio = System.getProperty("user.dir") + "/src/arquivos/";
       documentos= new File(diretorio);
       arquivos= documentos.listFiles();
       
       return arquivos;
    }
    public static String getDiretorio(){
        return diretorio;
    }
        
}
