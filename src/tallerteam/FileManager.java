package tallerteam;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;


public class FileManager {
    /**
     * Permite leer archivos desde una ruta
     * @param filePath La ruta del archivo
     * @return El contenido del archivo
     */
    public static String readFile(String filePath) {
        File file = new File(filePath);
        if(!file.isFile() || file.isDirectory()) {
            return null;
        }
        
        try {
            String cont = new String(Files.readAllBytes(file.toPath()));
            return cont;
        } catch(Throwable e) {
            return null;
        }
    }
    
    /**
     * Lee las líneas de un archivo
     * @param filePath La ruta del archivo
     * @return Un arreglo con las lineas del archivo
     */
    public static String[] readLines(String filePath) {
        String cont = readFile(filePath);
        
        return cont == null ? null : cont.split("\\r?\\n");
    }
    
    /**
     * Permite escribir contenido a un archivo, sobreescribiendo el contenido
     * actual.
     * @param filePath La ruta del archivo
     * @param content El contenido a escribir al archivo
     * @return Un valor booleano que determina si la operación se realizó
     * correctamente.
     */
    public static boolean writeToFile(String filePath, String content) {
        File file = new File(filePath);
        
        try {
            // if file doesnt exists, then create it
            if (!file.exists()) {
                    file.createNewFile();
            }
 
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            
            return true;
        } catch(Throwable e) {
            return false;
        }
    }
    
    /**
     * Permite escribir líneas de contenido un archivo, sobreescribiendo el 
     * contenido actual.
     * @param filePath La ruta del archivo
     * @param content Un arreglo con las líneas a escribir en el archivo.
     * @return Un valor booleano que determina si la operación se realizó
     * correctamente.
     */
    public static boolean writeToFile(String filePath, String[] content) {
        String joinedCont = "";
        
        for(int i = 0; i < content.length; i++) {
            joinedCont += content[i];
            if(i < content.length - 1) {
                joinedCont += "\n";
            }
        }
        
        return writeToFile(filePath, joinedCont);
    }
}
