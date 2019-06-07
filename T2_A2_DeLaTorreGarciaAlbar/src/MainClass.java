import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;

class VentanIncial extends JFrame {
	JButton area,puntos;
	JInternalFrame internalPuntos,internalArea;
	public VentanIncial(){
		getContentPane().setLayout(new FlowLayout());
		setSize(300, 300);
		setTitle("Packages");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new VentanIncial();
			}
		});
	}

}
