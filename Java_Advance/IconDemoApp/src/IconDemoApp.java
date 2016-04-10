import java.awt.BorderLayout;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.List;
import javax.swing.*;



public class IconDemoApp extends JFrame implements ActionListener,ItemListener {
    
    private JLabel photographLabel = new JLabel();
    private JToolBar buttonBar = new JToolBar();
    private JTextArea commentTextArea = new JTextArea(10,10);
    
    private	JScrollPane scrollPane = new JScrollPane(commentTextArea);
   
    public String description="";
    
    private String imagedir = "/home/manjuprasad/javaworkspace/IconDemoApp/images/";
    
    
    /**
     * List of all the descriptions of the image files. These correspond one to
     * one with the image file names
     */
    public String[] imageCaptions = { "Great Pyramid of Giza", "Great Wall of China",
    "Petra", "The Colosseum", "Chichen Itza","Machu Picchu","Taj Mahal","Christ the Redeemer"};
    
    public String[] imagedescription = { "gpg","gwc","p","co","cr","m","t","ch"};
    /**
     * List of all the image files to load.
     */
    private String[] imageFileNames = { "gpg.jpg", "gwc.jpg","p.jpg","co.jpg",
    "cr.jpg", "m.jpg", "t.jpg","ch.jpg" };
    
    /**
     * Main entry point to the demo. Loads the Swing elements on the "Event
     * Dispatch Thread".
     *
     * @param args
     */
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	
                IconDemoApp app = new IconDemoApp();
                app.setVisible(true);
            }
        });
    }
    
    /**
     * Default constructor for the demo.
     */
    public IconDemoApp() {
    	 try{
          	  DataRead("intro");
            }catch(IOException ex){
          	  //System.out.println(e);
            }
    	 commentTextArea.setText(description);
    	 commentTextArea.setCaretPosition(0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Icon Demo: Please Select an Image");
        
        // A label for displaying the pictures
        photographLabel.setVerticalTextPosition(JLabel.BOTTOM);
        photographLabel.setHorizontalTextPosition(JLabel.CENTER);
        photographLabel.setHorizontalAlignment(JLabel.CENTER);
        photographLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        // We add two glue components. Later in process() we will add thumb nail buttons
        // to the tool bar in between these glue components. This will center the
        // buttons in the tool bar.
        
        buttonBar.add(Box.createGlue());
        buttonBar.add(Box.createGlue());
        
        add(buttonBar, BorderLayout.NORTH);
        add(photographLabel, BorderLayout.CENTER);
        add(scrollPane,BorderLayout.PAGE_END);
      
        
        commentTextArea.setFont(new Font("Serif", Font.BOLD, 14));
          commentTextArea.setLineWrap(true);
          commentTextArea.setWrapStyleWord(true);
         
        setSize(400, 300);
        
        // this centers the frame on the screen
        setLocationRelativeTo(null);
        
        // start the image loading SwingWorker in a background thread
        loadimages.execute();
       
    }
    
 public void DataRead(String fname)throws IOException {
	description="";
	 File inputFile = new File(fname); 
	 if(! inputFile.exists()) {
		 System.out.println("File does not exist");
		 System.exit(1);
	 }
	 FileReader in = new FileReader(inputFile);
	 int c;
	 
	  while((c = in.read())!= -1){
	    description  =  description + (char) c; 
	  }
	  in.close();
	  scrollPane.getVerticalScrollBar().setValue(0);
	 }
 
 public int k;
    /**
     * SwingWorker class that loads the images a background thread and calls publish
     * when a new one is ready to be displayed.
     *
     * We use Void as the first SwingWroker param as we do not need to return
     * anything from doInBackground().
     */
    private SwingWorker<Void, ThumbnailAction> loadimages = new SwingWorker<Void, ThumbnailAction>() {
        
        /**
         * Creates full size and thumb nail versions of the target image files.
         * @return 
         */
        @Override
        protected Void doInBackground() throws Exception {
            for (int i = 0; i <= imageCaptions.length; i++) {
                ImageIcon icon;
                
                icon = new ImageIcon(imagedir + imageFileNames[i], imageCaptions[i]);
                ThumbnailAction thumbAction = null;
                if(icon != null){
                    ImageIcon thumbnailIcon = new ImageIcon(getScaledImage(icon.getImage(), 32, 32));
                    
                    thumbAction = new ThumbnailAction(icon, thumbnailIcon, imageCaptions[i]);
                    
                }
                publish(thumbAction);
            }
            // unfortunately we must return something, and only null is valid to
            // return when the return type is void.
            return null;
        }
        
        /**
         * Process all loaded images.
         */
        protected void process(List<ThumbnailAction> chunks) {
            for (ThumbnailAction thumbAction : chunks) {
                JButton thumbButton = new JButton(thumbAction);
                // add the new button BEFORE the last glue
                // this centers the buttons in the tool bar
                buttonBar.add(thumbButton, buttonBar.getComponentCount() - 1);
            }
        }
    };
    
    
    /**
     * Resizes an image using a Graphics2D object backed by a BufferedImage.
     * @param srcImg - source image to scale
     * @param w - desired width
     * @param h - desired height
     * @return - the new resized image
     */
    private Image getScaledImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();
        return resizedImg;
    }
    
    /**
     * Action class that shows the image specified in it's constructor.
     */
    private class ThumbnailAction extends AbstractAction {
        
    	/**
         *The icon if the full image we want to display.
         */
    	
        private Icon displayPhoto;
        
        /**
         * @param Icon - The full size photo to show in the button.
         * @param Icon - The thumbnail to show in the button.
         * @param String - The descriptioon of the icon.
         */
        
        public ThumbnailAction(Icon photo, Icon thumb, String desc){
            displayPhoto = photo;
            
            // The short description becomes the tooltip of a button.
            putValue(SHORT_DESCRIPTION, desc);
            
            // The LARGE_ICON_KEY is the key for setting the
            // icon when an Action is applied to a button.
            putValue(LARGE_ICON_KEY, thumb);
        }
        
        /**
         * Shows the full image in the main area and sets the application title.
         */
        public void actionPerformed(ActionEvent e) {
            photographLabel.setIcon(displayPhoto);
            setTitle("Icon Demo: " + getValue(SHORT_DESCRIPTION).toString());
            for (int i = 0; i < imageCaptions.length; i++){
            	if(getValue(SHORT_DESCRIPTION).equals(imageCaptions[i])){
            		try{
                   	  DataRead(imagedescription[i]);
                     }catch(IOException ex){
                   	  System.out.println(ex);
                     }
            	}
            }
            commentTextArea.setText(description);
            commentTextArea.setCaretPosition(0);
            
        }
    }

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}