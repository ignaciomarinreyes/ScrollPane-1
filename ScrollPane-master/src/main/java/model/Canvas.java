package model;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import org.opencv.imgcodecs.Imgcodecs;

public class Canvas extends JPanel {
    
    private ImageStats stats = null;
    private String path = null;
    private BufferedImage image = null;

    public Canvas() {
        stats = new ImageStats();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }
    
    public boolean loadImage() {
        try {
            image = ImageIO.read(new File(path));
            this.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
        } catch (IOException ex) {
            Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    public void setViewPoint(Point point, Dimension dimension){
        stats.calculaEstadisticas(Imgcodecs.imread(path), point, dimension);        
    }

    public ImageStats getStats() {
        return stats;
    }    
}
