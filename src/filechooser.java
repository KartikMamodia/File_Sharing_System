import java.io.*; 
import javax.swing.*; 
import java.awt.event.*; 
import javax.swing.filechooser.*; 
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class filechooser extends JFrame implements ActionListener { 
    String path="";
   static String email="";
   String value="";
    // Jlabel to show the files user selects 
    static JLabel l; 
  
    // a default constructor 
    filechooser() 
    { 
    } 
  
    public static void main(String emaile) 
    { 
       // System.out.println("fileChooser "+email);
        // frame to contains GUI elements 
        JFrame f = new JFrame("Choose File"); 
  email=emaile;
        // set the size of the frame 
        f.setSize(400, 400); 
  
        // set the frame's visibility 
        f.setVisible(true); 
  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
        // button to open save dialog 
        JButton button1 = new JButton("Browse"); 
  
        // button to open open dialog 
        JButton button2 = new JButton("Save"); 
    
        JButton button3 = new JButton("Back");
        // make an object of the class filechooser 
        filechooser f1 = new filechooser(); 
  
        // add action listener to the button to capture user 
        // response on buttons 
        button1.addActionListener(f1); 
        button2.addActionListener(f1); 
        button3.addActionListener(f1); 
        // make a panel to add the buttons and labels 
        JPanel p = new JPanel(); 
  
        // add buttons to the frame 
        p.add(button1); 
        p.add(button2); 
        p.add(button3); 
  
        // set the label to its initial value 
        l = new JLabel("no file selected"); 
  
        // add panel to the frame 
        p.add(l); 
        f.add(p); 
  
        f.show(); 
    } 
    public void actionPerformed(ActionEvent evt) 
    { 
        // if the user presses the save button show the save dialog 
        String com = evt.getActionCommand(); 
  
        // if the user presses the open dialog show the open dialog 
        if (com.equals("Browse")) { 
            // create an object of JFileChooser class 
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 
  
            // invoke the showsOpenDialog function to show the save dialog 
            int r = j.showOpenDialog(null); 
  
            // if the user selects a file 
            if (r == JFileChooser.APPROVE_OPTION) 
  
            { 
                // set the label to the path of the selected file 
                path=j.getSelectedFile().getAbsolutePath();

               path=path.replace("\\","\\\\");
               
                l.setText(path); 
                String[] hash=path.split("\\\\");
                value=hash[hash.length-1];
               // System.out.println(value);
            } 
            // if the user cancelled the operation 
            else
                l.setText("the user cancelled the operation"); 
        } 

        if (com.equals("Save")) 
            { 
                int i=DataDB.save(email,path,value);
            if(i>0){
                JOptionPane.showMessageDialog(filechooser.this,"Contact added successfully!");
                FileShareSystem.main(new String[]{});
            
                
                
            }else{
                //JOptionPane.showMessageDialog(filechoosere.this,"Sorry, unable to save!");
            }
            }

        else
        {
            UserSuccess.main(email);
        }
    } 
} 