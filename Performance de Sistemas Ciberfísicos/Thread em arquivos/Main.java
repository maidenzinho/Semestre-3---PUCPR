//Felipe Fernandes Bortolino

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> listTxtFilesFromFolder(String folder) {
        ArrayList<String> arquivos = new ArrayList<>();
        File pasta = new File(folder);
        File[] files = pasta.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                    arquivos.add(file.getAbsolutePath());
                }
            }
        }
        return arquivos;
    }

    public static void countLettersInFiles(ArrayList<String> arquivos, int[] letras) {
        for (String arquivo : arquivos) {
            try (FileInputStream fis = new FileInputStream(arquivo)) {
                int byteLido;
                while ((byteLido = fis.read()) != -1) {
                    char c = Character.toLowerCase((char) byteLido);
                    if (c >= 'a' && c <= 'z') {
                        letras[c - 'a']++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        ArrayList<String> arquivos = listTxtFilesFromFolder("/home/felipe/Documentos/Thread em arquivos/amostra/amostra");
        int[] letras = new int[26];

        countLettersInFiles(arquivos, letras);

        for (int i = 0; i < letras.length; i++) {
            System.out.println((char) ('a' + i) + ": " + letras[i]);
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio) + " ms");
    }
}