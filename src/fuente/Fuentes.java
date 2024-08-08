

   package fuente;
   import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Kenny Londoño
 */
public class Fuentes {
 

public class FontExample {

    public static void main(String[] args) {
        try {
            // Cargar la fuente desde el archivo
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("src/fonts/NombreDeLaFuente.ttf"));
            
            // Crear una fuente en un tamaño específico
            Font derivedFont = customFont.deriveFont(24f);

            // Configurar el JFrame
            JFrame frame = new JFrame("Ejemplo de Fuente");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            
            // Crear un JLabel y aplicar la fuente
            JLabel label = new JLabel("¡Hola, Mundo!");
            label.setFont(derivedFont);
            
            // Añadir el JLabel a un JPanel
            JPanel panel = new JPanel();
            panel.add(label);
            
            // Añadir el JPanel al JFrame
            frame.add(panel);
            
            // Mostrar el JFrame
            frame.setVisible(true);
            
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}

}
