import java.io.*;
import javax.swing.*;
import java.awt.*;
//import javax.sound.sampled.*;
import java.awt.event.*;
import java.text.*;  
import java.lang.Object.*;  
import javax.imageio.ImageIO;
import javax.imageio.*;
import java.awt.image.*;






public class replace extends JFrame implements ActionListener{

File file_image_1 = new File("cs_images\\");
File file_basei_1 = new File("\\cs_images\\");

File file_open = new File("");
File file_open_0 = new File("ALCHEMIST_DBX.CSV");
File file_open_1 = new File("XMXR.CSV");
File file_open_2 = new File("XMX.CSV");
File file_open_3 = new File("XMXRUndo.CSV");
File file_open_4 = new File("cs_images");
File file_open_5 = new File("cs_images");

JFrame frame_1 = new JFrame();
JFileChooser file_chooser = new JFileChooser(file_open_1);

Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
int xzx = 460;
int xzy = 255;
int cenx = (scrSize.width / 2) - (xzx / 2);
int ceny = (scrSize.height / 2) - (xzy / 2);

int runs = 50000;
String main = new String("");

String cx0 = new String();
String cx1 = new String();
String cx2 = new String();
String cx3 = new String();
String cx4 = new String();
int ix0 = 0;
int ix1 = 0;
int ix2 = 0;
int ix3 = 0;
int ix4 = 0;
int fg = 0;
int fs = 0;
int kcountxx = 0;
int kcountxx2 = 0;
int thisx = 0;
int loopc1 = 0;

JButton b0 = new JButton();
JButton b1 = new JButton();
JButton b2 = new JButton();
JButton b3 = new JButton();
JButton b4 = new JButton();
JButton b5 = new JButton();
JButton bx0 = new JButton();
JButton bx1 = new JButton();
JButton bx2 = new JButton();
JButton bx3 = new JButton();

Label l0 = new Label();
Label l1 = new Label();
Label l2 = new Label();
Label l3 = new Label();
Label l4 = new Label();
Label btl0 = new Label();
Label btl1 = new Label();
Label btl2 = new Label();
Label btl3 = new Label();
Label btl4 = new Label();
Label btl5 = new Label();

TextField linex0 = new TextField("", 60);
TextField linex1 = new TextField("", 60);
TextField sectionxa = new TextField("", 18);
TextField sectionxb = new TextField("", 18);


String[] carbonfiber = new String[runs];
String gold[] = new String[runs];
String[] silver = new String[runs];
String d1 = new String();
String d2 = new String();
String switchsx1 = new String("XMX.CSV");
String switchsx2 = new String("XMXR.CSV");
String rep1 = new String();
String rep2 = new String();
String rex = new String(".jpg.gif");
String rexw = new String("");


File filex1;
File filex2;
String str0;

Color c1 = new Color(0.1f, 0.1f, 0.1f);
Color c2 = new Color(0.09f, 0.09f, 0.13f);

Icon imx0;





replace(){//********************************************************************************************************
	
	super("Java Replace 7");
	setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
	setBackground(Color.black);
	setSize(xzx, xzy);
	setLocation(cenx, ceny);
	setResizable(false);
	frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//load images from JAR
	Image ximagex = new ImageIcon(this.getClass().getResource("images/hex.png")).getImage();
	setIconImage(ximagex);

//get button images from the Jar file.
	imx0 = new ImageIcon(this.getClass().getResource("images/buttonimage.png"));


	b0 = new JButton("Replace");
	b0.setMargin(new Insets(0, 0, 0, 0));  
	b0.addActionListener(this);
	b0.setPreferredSize(new Dimension(70, 20));
	b0.setIcon(imx0);
	b0.setHorizontalTextPosition(JButton.CENTER);
	b0.setForeground(Color.WHITE);

	b1 = new JButton("Delete");
	b1.setMargin(new Insets(0, 0, 0, 0));  
	b1.addActionListener(this);
	b1.setPreferredSize(new Dimension(70, 20));
	b1.setIcon(imx0);
	b1.setHorizontalTextPosition(JButton.CENTER);
	b1.setForeground(Color.WHITE);

	b2 = new JButton("Contains");
	b2.setMargin(new Insets(0, 0, 0, 0));  
	b2.addActionListener(this);
	b2.setPreferredSize(new Dimension(70, 20));
	b2.setIcon(imx0);
	b2.setHorizontalTextPosition(JButton.CENTER);
	b2.setForeground(Color.WHITE);

	b3 = new JButton("ImageN");
	b3.setMargin(new Insets(0, 0, 0, 0));  
	b3.addActionListener(this);
	b3.setPreferredSize(new Dimension(70, 20));
	b3.setIcon(imx0);
	b3.setHorizontalTextPosition(JButton.CENTER);
	b3.setForeground(Color.WHITE);

	b4 = new JButton("ImageS");
	b4.setMargin(new Insets(0, 0, 0, 0));  
	b4.addActionListener(this);
	b4.setPreferredSize(new Dimension(70, 20));
	b4.setIcon(imx0);
	b4.setHorizontalTextPosition(JButton.CENTER);
	b4.setForeground(Color.WHITE);

	b5 = new JButton("Undo");
	b5.setMargin(new Insets(0, 0, 0, 0));  
	b5.addActionListener(this);
	b5.setPreferredSize(new Dimension(70, 20));
	b5.setIcon(imx0);
	b5.setHorizontalTextPosition(JButton.CENTER);
	b5.setForeground(Color.WHITE);





	bx0 = new JButton("CSV Cleanup");
	bx0.setMargin(new Insets(0, 0, 0, 0));  
	bx0.addActionListener(this);
	bx0.setPreferredSize(new Dimension(100, 20));
	bx0.setIcon(imx0);
	bx0.setHorizontalTextPosition(JButton.CENTER);
	bx0.setForeground(Color.WHITE);

	bx1 = new JButton("Delete Repeats");
	bx1.setMargin(new Insets(0, 0, 0, 0));  
	bx1.addActionListener(this);
	bx1.setPreferredSize(new Dimension(100, 20));
	bx1.setIcon(imx0);
	bx1.setHorizontalTextPosition(JButton.CENTER);
	bx1.setForeground(Color.WHITE);

	bx2 = new JButton("Imagex");
	bx2.setMargin(new Insets(0, 0, 0, 0));  
	bx2.addActionListener(this);
	bx2.setPreferredSize(new Dimension(100, 20));
	bx2.setIcon(imx0);
	bx2.setHorizontalTextPosition(JButton.CENTER);
	bx2.setForeground(Color.WHITE);

	bx3 = new JButton("SPLIT");
	bx3.setMargin(new Insets(0, 0, 0, 0));  
	bx3.addActionListener(this);
	bx3.setPreferredSize(new Dimension(100, 20));
	bx3.setIcon(imx0);
	bx3.setHorizontalTextPosition(JButton.CENTER);
	bx3.setForeground(Color.WHITE);



	linex0.setBackground(Color.BLACK);
	linex0.setForeground(Color.WHITE);
	linex1.setBackground(Color.BLACK);
	linex1.setForeground(Color.WHITE);

	sectionxa.setBackground(Color.BLACK);
	sectionxa.setForeground(Color.WHITE);
	sectionxb.setBackground(Color.BLACK);
	sectionxb.setForeground(Color.WHITE);


	l0 = new Label("", Label.LEFT);
	l0.setPreferredSize(new Dimension(220, 20));
	l0.setBackground(c2);
	l0.setForeground(Color.WHITE);

	l1 = new Label("Section A:", Label.LEFT);
	l1.setPreferredSize(new Dimension(75, 20));
	l1.setBackground(c2);
	l1.setForeground(Color.WHITE);

	l2 = new Label("Section B:", Label.LEFT);
	l2.setPreferredSize(new Dimension(75, 20));
	l2.setBackground(c2);
	l2.setForeground(Color.WHITE);

	l3 = new Label("", Label.LEFT);
	l3.setPreferredSize(new Dimension(220, 20));
	l3.setBackground(c2);
	l3.setForeground(Color.WHITE);

	l4 = new Label("", Label.LEFT);
	l4.setPreferredSize(new Dimension(220, 20));
	l4.setBackground(c2);
	l4.setForeground(Color.WHITE);

	btl0 = new Label("A with B.", Label.LEFT);
	btl0.setPreferredSize(new Dimension(100, 20));
	btl0.setBackground(c2);
	btl0.setForeground(Color.WHITE);

	btl1 = new Label("From A to B.", Label.LEFT);
	btl1.setPreferredSize(new Dimension(100, 20));
	btl1.setBackground(c2);
	btl1.setForeground(Color.WHITE);

	btl2 = new Label("A, Doesn't B.", Label.LEFT);
	btl2.setPreferredSize(new Dimension(100, 20));
	btl2.setBackground(c2);
	btl2.setForeground(Color.WHITE);

	btl3 = new Label("replace name.", Label.LEFT);
	btl3.setPreferredSize(new Dimension(100, 20));
	btl3.setBackground(c2);
	btl3.setForeground(Color.WHITE);

	btl4 = new Label("change size.", Label.LEFT);
	btl4.setPreferredSize(new Dimension(100, 20));
	btl4.setBackground(c2);
	btl4.setForeground(Color.WHITE);

	btl5 = new Label("Last CSV edit.", Label.LEFT);
	btl5.setPreferredSize(new Dimension(100, 20));
	btl5.setBackground(c2);
	btl5.setForeground(Color.WHITE);


        JPanel jp0 = new JPanel();
	jp0.setPreferredSize(new Dimension(247, 160));
	jp0.setBackground(c1);
	jp0.add(l0);
	jp0.add(l1);  jp0.add(sectionxa);
	jp0.add(l2);  jp0.add(sectionxb);
	jp0.add(l3);
	jp0.add(bx0); jp0.add(bx1); jp0.add(bx2); jp0.add(bx3);


        JPanel jp2 = new JPanel();
	jp2.setPreferredSize(new Dimension(190, 160));
	jp2.setBackground(c1);
	jp2.add(b0);	jp2.add(btl0);
	jp2.add(b1);	jp2.add(btl1);
	jp2.add(b2);	jp2.add(btl2);
	jp2.add(b3);	jp2.add(btl3);
	jp2.add(b4);	jp2.add(btl4);
	jp2.add(b5);	jp2.add(btl5);


	Container cp = getContentPane();
	cp.setLayout(new FlowLayout());
	cp.setBackground(Color.BLACK);
	cp.setForeground(Color.BLACK);
	cp.add(linex0);
	cp.add(linex1);
	cp.add(jp0);
	cp.add(jp2);



	setVisible(true);

	gold[0] = new String("");
	gold[1] = new String("");


	test_xmxr();
	
	file_open = file_open_1;
	loadx();

}//postid**************************************************************************************************************




	public void test_xmxr(){

		if(file_open_0.exists()){l0.setText("Good."); file_open = file_open_0;}//good to go.
		else if(file_open_1.exists()){l0.setText("Good."); file_open = file_open_1;}//good to go.
		else if(file_open_2.exists()){l0.setText("Good."); file_open = file_open_2;}//good to go.
		else if(file_open_3.exists()){l0.setText("Good."); file_open = file_open_3;}//good to go.
		else if(file_open_4.exists()){l0.setText("Good."); file_open = file_open_4;}//good to go.

		if(!file_open_1.exists()){

			System.out.println("switch");
			switchsx1 = "XMX.CSV";
			switchsx2 = "XMXR.CSV";
			undo_edit_start();

			switchsx1 = "XMX.CSV";
			switchsx2 = "XMXRUndo.CSV";
			undo_edit_start();

		}//else if
		else{l0.setText("NO XMXR.CSV files found!");}//no files to load.


		//images folder.


		if (file_image_1.exists()) {

			carbonfiber = file_image_1.list();

			thisx = carbonfiber.length;

			l3.setText("cs_images found: " + Integer.toString(thisx));

		} 
		else {l3.setText("cs_images folder was not found.");}

	}//test_xmxr









	public void loadx(){

		kcountxx = 0;
		thisx = 0;
		main = new String("");

		try {

			BufferedReader in = new BufferedReader(new FileReader(file_open));
			String str0;
			while ((str0 = in.readLine()) != null){gold[thisx] = str0; thisx++;}
			in.close();

		} catch (IOException e) {linex0.setText("Load XMXR.CSV Fail.");}

		l0.setText("XMXR Loaded. " + Integer.toString(thisx) + " Items.");

		if(gold[0].length() > 0){linex0.setText(gold[0]);}
		else{linex0.setText("Row has no text.");}

		if(gold[1].length() > 0){linex1.setText(gold[1]);}
		else{linex1.setText("Row has no text.");}

	}//loadx





//workers***************************************************************************************
//workers***************************************************************************************





	public void replacex(){//replace a with b

		for (int loop0 = 0; loop0 < thisx; loop0++){

		cx0 = gold[loop0];
		cx1 = sectionxa.getText();
		cx2 = sectionxb.getText();
		l0.setText((loop0 * 100 / thisx) + "% Compleat."); 

		for (int loop1 = 0; loop1 < runs; loop1++){

		ix0 = cx0.indexOf(cx1);
		if(ix0 == -1){break;}
		else{

		cx0 = cx0.substring(0, ix0) + cx2 + cx0.substring(ix0 + sectionxa.getText().length(), cx0.length());
		gold[loop0] = cx0;

		}//else

		}//for

		}//for

		l0.setText("100% Compleat."); 
		printx();
		loadx();

	}//replacex








	public void rxdelete(){//delete from

		d1 = new String(sectionxa.getText());
		d2 = new String(sectionxb.getText());


		for (int loop0 = 0; loop0 < thisx; loop0++){
		l0.setText((loop0 * 100 / thisx) + "% Compleat."); 
		cx0 = gold[loop0];
		for (int loop1 = 0; loop1 < runs; loop1++){

		ix0 = cx0.indexOf(d1);
		if(ix0 > -1){

		cx1 = cx0.substring(ix0, cx0.length());

		ix1 = cx1.indexOf(d2);
		if(ix1 > -1){

		cx0 = cx0.substring(0, ix0) + cx0.substring(ix0 + ix1 + d2.length(), cx0.length());
		gold[loop0] = cx0;

		}//if*************

		}//if*******************
		else{break;}

		}//for
		}//for

		l0.setText("100% Compleat."); 
		printx();
		loadx();

	}//rx1








	public void rxcontains(){//if contains ? delete

		d1 = new String(sectionxa.getText());
		d2 = new String(sectionxb.getText());
		kcountxx = 0;

		for (int loop0 = 0; loop0 < thisx; loop0++){//*************************************
		l0.setText((loop0 * 100 / thisx) + "% Compleat."); 
		cx0 = gold[loop0];


		ix0 = cx0.indexOf("<*,*>");
		if(ix0 > -1){
		cx1 = cx0.substring(0, ix0);

		ix1 = cx1.indexOf(d1);
		if(ix1 > -1 && sectionxa.getText().length() > 0){

		gold[loop0] = "****";
		kcountxx++;
		}//if 
		}//if
		else{

		ix1 = cx0.indexOf(d1);
		if(ix1 > -1 && sectionxa.getText().length() > 0){

		gold[loop0] = "****";
		kcountxx++;
		}//if 

		}//else


	//does NOT containe.

		ix0 = cx0.indexOf("<*,*>");
		if(ix0 > -1){
		cx1 = cx0.substring(0, ix0);

		ix1 = cx1.indexOf(d2);
		if(ix1 == -1 && sectionxb.getText().length() > 0){

		gold[loop0] = "****";
		kcountxx++;
		}//if 
		}//if
		else{

		ix1 = cx0.indexOf(d2);
		if(ix1 == -1 && sectionxb.getText().length() > 0){

		gold[loop0] = "****";
		kcountxx++;
		}//if 

		}//else



		}//for*****************************************************************************

		l0.setText("100% Compleat."); 
		l3.setText("Deleted " + kcountxx + " items.");
		printx();
		loadx();

	}//rx1










	public void afterxx(){//delete after Section A Before Section B

		for (int loop0 = 0; loop0 < thisx; loop0++){

		l0.setText((loop0 * 100 / thisx) + "% Compleat."); 

		cx0 = gold[loop0];

		cx1 = sectionxa.getText();
		cx2 = sectionxb.getText();

		if(cx1.length() > 0){
		ix0 = cx0.indexOf(cx1);
		if(ix0 > -1){
		cx0 = cx0.substring(0, ix0);
		gold[loop0] = cx0;
		}//if
		}//if


		if(cx2.length() > 0){
		ix0 = cx0.indexOf(cx2);
		if(ix0 > -1){
		cx0 = cx0.substring(ix0, cx0.length());
		gold[loop0] = cx0;
		}//if
		}//if

		}//for

		l0.setText("100% Compleat."); 
		printx();
		loadx();

	}//numberxx









	public void repeatx(){

		ix4 = 0;

		for (int loop1 = 0; loop1 < thisx; loop1++){

			l0.setText((loop1 * 100 / thisx) + "% Compleat."); 

			//System.out.println("loop1 " + loop1);

			loopc1 = loop1 + 1;

			ix0 = gold[loop1].indexOf("<*SS*>");
			if(ix0 > -1){rep1 = gold[loop1].substring(0, ix0);}
			else{rep1 = gold[loop1];}


			//System.out.println("rep1 " + rep1);
			repeatxx();

		}//for

		l0.setText("100% Compleat."); 
		l3.setText(ix4 + " repeats.");
		printx();
		loadx();

	}//repeatx



	public void repeatxx(){

		for (int loop1 = loopc1; loop1 < thisx; loop1++){
	 
			//System.out.println("loooop2 " + loop1);

			ix0 = gold[loop1].indexOf("<*SS*>");

			if(ix0 > -1){rep2 = gold[loop1].substring(0, ix0);}
			else{rep2 = gold[loop1];}

			if(rep1.equals(rep2)){gold[loop1] = "<*RR*>" + gold[loop1]; ix4++;}
			else{}

		}//for

	}//print1









	public void replacename(){

		cx0 = cx3;
		cx1 = sectionxa.getText();
		cx2 = sectionxb.getText();

		for (int loop1 = 0; loop1 < runs; loop1++){

			ix0 = cx0.indexOf(cx1);

			if(ix0 == -1){break;}
			else{

				cx0 = cx0.substring(0, ix0) + cx2 + cx0.substring(ix0 + sectionxa.getText().length(), cx0.length());
				cx3 = cx0;

			}//else

		}//for

		System.out.println(cx3);

	}//replacename








	public void imagechange1(){


		if(file_image_1.exists()){
		carbonfiber = file_image_1.list();

		thisx = carbonfiber.length;

		l3.setText("cs_image found: " + Integer.toString(thisx));
		}//
		else{l3.setText("cs_image folder was not found.");}


	        File in = new File("");
		File out = new File("");


		for(int xloopx0 = 0; xloopx0 < thisx; xloopx0++){//********************************************

		if(carbonfiber[xloopx0].equals("Thumbs.db")){}
		else if(carbonfiber[xloopx0].equals("imager.jar")){}
		else if(carbonfiber[xloopx0].equals("imager2.java")){}
		else if(carbonfiber[xloopx0].equals("imager2.class")){}
		else{//**>


		l0.setText((xloopx0 * 100 / thisx) + "% Compleat."); 
		l3.setText(carbonfiber[xloopx0]); 

		try{

	        in = new File("cs_images\\" + carbonfiber[xloopx0]); 

		BufferedInputStream imageStream = new BufferedInputStream(new FileInputStream("cs_images\\" + carbonfiber[xloopx0]));
	 
		Image image = (Image) ImageIO.read(imageStream);


		//System.out.println(image);

		     int thumbWidth = image.getHeight(null);
		     int thumbHeight = image.getWidth(null);
	 
		BufferedImage thumbImage = new BufferedImage(thumbWidth, thumbHeight, BufferedImage.TYPE_INT_RGB);

	        Graphics2D g2dx = thumbImage.createGraphics(); 

	        g2dx.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	        g2dx.drawImage(image, 0, 0, thumbWidth, thumbHeight, null);
		//g2dx.drawLine(0,0,300,300);


	        // Write the scaled image to the outputstream

		cx3 = carbonfiber[xloopx0];
		replacename();
		cx4 = carbonfiber[xloopx0];
		carbonfiber[xloopx0] = cx3; 

	        out = new File("cs_images\\" + carbonfiber[xloopx0]); 

	        ImageIO.write(thumbImage, "jpeg", out);

		imageStream.close();

		if(out.exists() && !out.equals(in)){in.delete();}

		}catch (IOException e){System.out.println("get file fail");}

		}//for******************************************************************************************

		}//else**>

		l0.setText("100% Compleat."); 

	}//imagechange











	public void imagechange2(){//change size


		if(file_image_1.exists()){

			carbonfiber = file_image_1.list();

			thisx = carbonfiber.length;

			l3.setText("cs_image found: " + Integer.toString(thisx));

		}//
		else{l3.setText("cs_image folder was not found.");}



		l0.setText(Integer.toString(thisx));
		//l3.setText(carbonfiber[0]);


		for(int xloopx0 = 0; xloopx0 < thisx; xloopx0++){//********************************************

			if(carbonfiber[xloopx0].equals("Thumbs.db")){}
			else if(carbonfiber[xloopx0].equals("imager.jar")){}
			else if(carbonfiber[xloopx0].equals("imager2.java")){}
			else if(carbonfiber[xloopx0].equals("imager2.class")){}
			else{//********************************>

				l0.setText((xloopx0 * 100 / thisx) + "% Compleat."); 
				//l1.setText(carbonfiber[xloopx0]); 

				try{

					BufferedInputStream imageStream = new BufferedInputStream(new FileInputStream("cs_images\\" + carbonfiber[xloopx0]));
				 
					Image image = (Image) ImageIO.read(imageStream);



					if(ix1 < image.getHeight(null) && ix0 < image.getWidth(null)){//***************************************

						System.out.println("FIX " + carbonfiber[xloopx0]);

						ix0 = Integer.parseInt(sectionxa.getText());
						ix1 = Integer.parseInt(sectionxb.getText());
					 
						BufferedImage thumbImage = new BufferedImage(ix0, ix1, BufferedImage.TYPE_INT_RGB);

				        Graphics2D g2dx = thumbImage.createGraphics(); 

				        g2dx.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
				        g2dx.drawImage(image, 0, 0, ix0, ix1, null);
						//g2dx.drawLine(0,0,300,300);


				        // Write the scaled image to the outputstream
				     	File out = new File("cs_images\\" + carbonfiber[xloopx0]);          

				        ImageIO.write(thumbImage, "jpeg", out);


					}//*****************************************************************************************************
					else{System.out.println("IMAGE TOO SMALL " + image.getHeight(null) + " " +  image.getWidth(null) + " " + carbonfiber[xloopx0]);}

					imageStream.close();

				}catch (IOException e){System.out.println("get file fail");}

			}//else******************************************************************************************


			l0.setText("100% Compleat."); 

		}//for ********************************>

	}//imagechange











	public void imagex(){//delete CSV records that don't have images

		String[][] carbon1 = new String[20][runs];

		csv_loader1 xcsvx1 = new csv_loader1(file_open_3);
		carbon1 = xcsvx1.getData0();
		kcountxx = xcsvx1.getData1();
		kcountxx2 = xcsvx1.getData2();


		cx1 = sectionxa.getText();
		cx2 = sectionxb.getText();

		ix0 = 0;
		ix1 = 0;


		if(cx1.length() < 1){cx1 = Integer.toString(kcountxx -1);}	



		for (int loop1 = 0; loop1 < kcountxx2; loop1++){//**********************

			l0.setText((loop1 * 100 / kcountxx2) + "% Compleat."); 

			cx0 = carbon1[Integer.parseInt(cx1)][loop1];

			ix4 = cx0.indexOf("Image file name: ");
			if(ix4 > -1){cx0 = cx0.substring(17, cx0.length());}
			else{}

			ix0 = 0;

			//System.out.println(cx0);

			for (int loop2 = 0; loop2 < carbonfiber.length; loop2++){

				if(carbonfiber[loop2].equals(cx0)){ix0++; break;}

			}//for*****************************************************


			if(ix0 == 0){ix1++; l3.setText(ix1 + " Sections with no images."); carbon1[0][loop1] = "<no image>" + carbon1[0][loop1];}
			else{}//else


		}//for******************************************

		l0.setText("100% Compleat.");
		System.out.println(cx3);





		try {

	        BufferedWriter out = new BufferedWriter(new FileWriter(file_open));

			for (int loop0 = 0; loop0 < kcountxx2; loop0++){
			for (int loop1 = 0; loop1 < kcountxx; loop1++){

			out.write(carbon1[loop1][loop0] + ",");

			}//for
			out.newLine();
			}//for

	    	out.close();

	   	}catch(IOException e){System.out.println("print fail.");}




	}//imagex*********************************************************************************************************
















//workers end***************************************************************************************
//workers end***************************************************************************************


//printers ***************************************************************************************
//printers ***************************************************************************************




	public void printx(){


		try {

	        BufferedWriter out = new BufferedWriter(new FileWriter("XMXR.CSV"));

			for (int loop1 = 0; loop1 < thisx; loop1++){

				if(gold[loop1].equals("****")){}
				else{out.write(gold[loop1]); out.newLine();}

			}//for

	    	out.close();

	    } catch (IOException e) {System.out.println("print fail.");}

	}//printx








	public void undo_edit(){

		System.out.println(switchsx1);
		System.out.println(switchsx2);


		kcountxx = 0;
		thisx = 0;
		main = new String("");

		try {

			BufferedReader in = new BufferedReader(new FileReader(switchsx1));
			String str0;
			while ((str0 = in.readLine()) != null) {gold[thisx] = str0; thisx++;}
			in.close();

		} catch (IOException e) {e.printStackTrace();}

		//System.out.println(kcountxx);
		//System.out.println("");
		l0.setText(Integer.toString(thisx) + " Items.");
		linex0.setText(gold[0]);




		if (file_open_3.exists()){

			try {

			    BufferedWriter out = new BufferedWriter(new FileWriter(switchsx2));

				for (int loop1 = 0; loop1 < thisx; loop1++){

					if(gold[loop1].equals("****")){}
					else{out.write(gold[loop1]); out.newLine();}

				}//for

		        out.close();

		    } catch (IOException e) {l3.setText("s00002");}

			//File f1 = new File("XMXR.CSV");
			//f1.delete();

			loadx();

		}//if*********************
		else {l0.setText("Can't find backup file!");}

	}//switchx








//for start only
	public void undo_edit_start(){


		kcountxx = 0;
		thisx = 0;
		main = new String("");

		try {

			BufferedReader in = new BufferedReader(new FileReader(switchsx1));
			String str0;
			while ((str0 = in.readLine()) != null) {gold[thisx] = str0; thisx++;}
			in.close();

		} catch (IOException e) {e.printStackTrace();}

		//System.out.println(kcountxx);
		//System.out.println("");
		l0.setText(Integer.toString(thisx) + " Items.");
		linex0.setText(gold[0]);


		try {

		    BufferedWriter out = new BufferedWriter(new FileWriter(switchsx2));

			for (int loop1 = 0; loop1 < thisx; loop1++){

				if(gold[loop1].equals("****")){}
				else{out.write(gold[loop1]); out.newLine();}

			}//for

	        out.close();

	    }catch(IOException e){l3.setText("s00002");}

		//File f1 = new File("XMXR.CSV");
		//f1.delete();

		loadx();


	}//switchx






//printers end***************************************************************************************
//printers end***************************************************************************************







//button helpers***************************************
//button helpers***************************************


	public void cleancsv(){

		//loadx();
		sectionxa.setText(",");
		sectionxb.setText("<...>");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("<*<...>*>");
		sectionxb.setText(",");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("\"");
		sectionxb.setText("&quot;");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("â„¢");
		sectionxb.setText("&#188;");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("Â°");
		sectionxb.setText("&#176;");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("â€”");
		sectionxb.setText("&nbsp;");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("â€?");
		sectionxb.setText("''");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("Ã†");
		sectionxb.setText("®");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("Ã«");
		sectionxb.setText("ë");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("Ã©");
		sectionxb.setText("é");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("Æ’");
		sectionxb.setText("&#402;");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("Ã“");
		sectionxb.setText("Ó");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("Ã˜");
		sectionxb.setText("Ø");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("Ã—");
		sectionxb.setText("x");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("Â®");
		sectionxb.setText("&reg;");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("Â¾");
		sectionxb.setText("&#190;");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("Â±");
		sectionxb.setText("&#177;");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("ÂµV");
		sectionxb.setText("µV");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("â€“");
		sectionxb.setText("-");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("â€™");
		sectionxb.setText("&#39;");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("ï¿½");
		sectionxb.setText("™");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("â€œ");
		sectionxb.setText("&quot;");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("â€¦");
		sectionxb.setText("&#8230;");
		replacex();
		printx();

		//loadx();
		sectionxa.setText("â?„");
		sectionxb.setText("&#47;");
		replacex();
		printx();



		l0.setText("Cleanup Compleat.");

		sectionxa.setText("");
		sectionxb.setText("");

	}//cleancsv







	public void openx(){
	
	   	file_chooser.showOpenDialog(frame_1);
	   	if(file_chooser.APPROVE_OPTION == 0){file_open_1 = file_chooser.getSelectedFile(); frame_1.dispose();}
		else{frame_1.dispose();}

		loadx();

	}//openx





	public void save_undo_file(){

		switchsx1 = "XMXR.CSV";
		switchsx2 = "XMXRUndo.CSV";
		undo_edit_start();

	}//save undo file








	public void save_split(){

		loadx();
		ix1 = 0;
		ix2 = Integer.parseInt(sectionxa.getText());


		for (int loop1 = 0; loop1 < thisx; loop1++){
		
			try {
		        
		        BufferedWriter out = new BufferedWriter(new FileWriter("sec_" + loop1 + ".CSV"));

				for (int loop2 = 0; loop2 < ix2; loop2++){

					out.write(gold[ix1]); out.newLine(); 
					ix1++; 
					if(ix1 >= thisx){break;}

				}//for

		        out.close();

		    } catch (IOException e) {System.out.println("print fail.");}

			if(ix1 >= thisx){break;}

		}//for


	}//save undo file









public void actionPerformed(ActionEvent event){


	if(event.getSource() == b0){save_undo_file(); replacex();}//
	if(event.getSource() == b1){save_undo_file(); rxdelete();}//
	if(event.getSource() == b2){save_undo_file(); rxcontains();}//
	if(event.getSource() == b3){imagechange1();}//
	if(event.getSource() == b4){imagechange2();}//
	if(event.getSource() == b5){switchsx1 = "XMXRUndo.CSV"; switchsx2 = "XMXR.CSV";	undo_edit();}//

	if(event.getSource() == bx0){save_undo_file(); cleancsv();}//run standard csv cleanup.
	if(event.getSource() == bx1){save_undo_file(); repeatx();}//
	if(event.getSource() == bx2){save_undo_file(); imagex();}//
	if(event.getSource() == bx3){save_split();}//

}//action**




    public static void main(String[] args){

		replace xr = new replace();

    }//main





}//last