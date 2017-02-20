
package Java;

import java.util.ArrayList;

/**
 * @author Gabriel Fernandes
 */
public class route {
    
    private int position;
    private String fileName;
    
    //talvez nao precise pois os arquivos devem ficar dentro do mesmo diretorio
    private String filePath;
    
    public static route route = new route();
       
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getFilePath() {
        return fileName;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}