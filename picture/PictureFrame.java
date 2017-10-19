
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;

public class PictureFrame extends JFrame {

  public PictureFrame() {
    this.setSize( new Dimension(512, 512) );
    this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    Container pane = this.getContentPane();
    pane.add( new PicturePanel() );
    this.setVisible( true );
  } // PictureFrame()

  public static void main( String [] args ) {

    PictureFrame pf = new PictureFrame();

  } // main( String [] )

} // PictureFrame
