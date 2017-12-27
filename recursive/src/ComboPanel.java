import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Dimension;

public class ComboPanel extends JPanel
{
   private JComboBox jcbRed;
   private JComboBox jcbGreen;
   private JComboBox jcbBlue;
   private ActionListener listener;
   private int red;
   private int green;
   private int blue;
  
   /**
      Constructs the panel.
   */
   public ComboPanel()
   {
      red = 0;
      green = 0;
      blue = 0;
      setPreferredSize(new Dimension(400, 400));
      setBackground(new Color(red, green ,blue));

      jcbRed = new JComboBox();
      for (int i = 0; i < 256; i++)
      {
         jcbRed.addItem(new Integer(i));
      }
      listener = new RedListener();
      jcbRed.addActionListener(listener);

      jcbGreen = new JComboBox();
      for (int i = 0; i < 256; i++)
      {
         jcbGreen.addItem(new Integer(i));
      }
      listener = new GreenListener();
      jcbGreen.addActionListener(listener);

      jcbBlue = new JComboBox();
      for (int i = 0; i < 256; i++)
      {
         jcbBlue.addItem(new Integer(i));
      }
      listener = new BlueListener();
      jcbBlue.addActionListener(listener);

      add(jcbRed);
      add(jcbGreen);
      add(jcbBlue);
   }

   class RedListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         red = (Integer) jcbRed.getSelectedItem();
         setBackground(new Color(red, green, blue));
      }
   }
   class GreenListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         green = (Integer) jcbGreen.getSelectedItem();
         setBackground(new Color(red, green, blue));
      }
   }
   class BlueListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         blue = (Integer) jcbBlue.getSelectedItem();
         setBackground(new Color(red, green, blue));
      }
   }
}