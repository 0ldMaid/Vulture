import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;




final class scraper2 extends JFrame implements ActionListener{//************************

Toolkit toolkit;
Timer xtimerx = new Timer();

Container cp_container = getContentPane();
//BackgroundPanel jp0 = new BackgroundPanel();
//BackgroundPanel jp1 = new BackgroundPanel();
//BackgroundPanel jp2 = new BackgroundPanel();
//BackgroundPanel jp3 = new BackgroundPanel();
//BackgroundPanel jpk = new BackgroundPanel();
JPanel jp0 = new JPanel();
JPanel jp1 = new JPanel();
JPanel jp2 = new JPanel();
JPanel jp3 = new JPanel();
JPanel jpk = new JPanel();

Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
int xzx = 1003;
int xzy = 700;
int cenx = (scrSize.width / 2) - (xzx / 2);
int ceny = (scrSize.height / 2) - (xzy / 2);

long size1 = 111111;
long size2 = 111111;
int newitems[] = new int[12];
int runs0 = 1000;
int runs1 = 40000;//10000
int runs2 = 50000;
int linknumber1 = 0;
int linknumber2 = 0;
int cutnumber = 12;//the number of scraping fields.
int cuttype = 1;//how many items to cut each pass.
int urlnumber = 0;
int pagenumberx = 0;
int sleepx = 0;
int nloopx = 10;
int savepagenumber = 0;
int outgoldnumber = 0;
int printnumber = 40;
int scrapsread = 0;
int passes = 0;
int picturenumber1 = 0;
int picturenumber2 = 0;
int picturenumber3 = 10000;
int startstart = 2;
int scraperstage = 1;//stage
int savehold1 = 0;
int savehold2 = 0;
int saveloop1 = 0;
int savell = 1;//problems with savelinklist 2 times thread. 0 no save, 1 save.
int ix0 = 0;//cutting numbers*
int ix1 = 0;//cutting numbers*
int ix2 = 0;//cutting numbers*
int ix3 = 0;//cutting numbers*
int ix4 = 0;//cutting numbers*
int ix5 = 0;//cutting numbers*
int ix6 = 0;//cutting numbers*
int ix7 = 0;//cutting numbers*
int bytesRead = 0;//read image!!!!
int pigxxx = 0;
int xxpig2 = 0;
int ktry = 0;
int htmlxxkeyn = 10;

boolean firstlast = true;
boolean findimage = false;
boolean ximage_1x = false;
boolean ximage_2x = false;
boolean to_lower_caseb = false;
boolean o_n = true;
boolean workx = true;
boolean outputcsv = true;
boolean programstart = true;
boolean goodx = false;

StringBuffer lineb1 = new StringBuffer("");
StringBuffer lineb2 = new StringBuffer("");
StringBuffer saveb = new StringBuffer("");//any can use.
StringBuffer loadb = new StringBuffer("");//any can use.

String carbonhtml[] = new String[50];
String compresser[] = new String[runs2];//compress**
String switchHTML[] = new String[2];
String switchPRECUT[][] = new String[2][2];
String switchSCAPE[][][] = new String[12][6][2];//[fields][fields][switch 0=lsf 1=csv]
String xprinter[] = new String[runs1];
String loadedGOLD[][] = new String[3][runs1];
String GOLDX[][] = new String[12][runs1];
String outGOLD[][] = new String[40][runs1];
String linklist[] = new String[runs1];
String cc_cc[] = new String[10];
String k_g_k[] = new String[50];
String carbonkeyserver = new String("http://www.superstrategic.com/extensions/autok.xcsx");
String carbonkey = new String("kn89709k87");
String carbonkeyx = new String("kn89709k87");
String xlinex = new String("");
String cx0 = new String("");//cutting strings*
String cx1 = new String("");//cutting strings*
String cx2 = new String("");//cutting strings*
String cx3 = new String("");//cutting strings*
String cx4 = new String("");//cutting strings*
String cx5 = new String("");//cutting strings*
String xsaveoverx = new String("");//cutx save string for image.
String xsepx0 = new String("<*0*>");
String xsepx3 = new String("0**0**0");// ever other 10
String xsepxc = new String("<*,*>");//
String HTMLGO = new String("");
String GETHTML1 = new String("");
String GETHTML2 = new String("");
String getfilex = new String("");
String filename = new String("");
String blank = new String("");
String auto1key = new String("0*0*00*0**00**0");
String serverkey1 = new String("357l64ln72");
String infox0 = new String("Key already in use.");
String infox1 = new String("URL Address Failure.");
String infox2 = new String("Checking key...");
String infox3 = new String("Connecting to Server...");
String infox4 = new String("Unknown KEY, Program Locked.");
String infox5 = new String("Thank You.");
String infox6 = new String("Program has been moved to another computer. System locked.");

TextArea t1 = new TextArea("", 8, 135, TextArea.SCROLLBARS_VERTICAL_ONLY);
TextField enterkey_text = new TextField("", 10);
TextField MHTF = new TextField("http://www.carbonscraper.com", 63);
TextField f_xf_x[][] = new TextField[12][6];
TextField URL[] = new TextField[4];
TextField searchtop[] = new TextField[2];

Label enterkey_label = new Label("Open Program", Label.CENTER);
Label spacelabel1 = new Label("", Label.CENTER);
Label testfx[] = new Label[12];
Label labelx = new Label("x", Label.LEFT);
Label buttonl[] = new Label[10];
Label lpage1 = new Label("page1.", Label.LEFT);
Label lpage2 = new Label("links.", Label.LEFT);
Label pageinfo = new Label("CarbonScraper 2.6.0 \"vulture\"", Label.LEFT);
Label pcl0 = new Label("Page Size: ", Label.CENTER);
Label pcl1 = new Label("< PreCut >", Label.CENTER);
Label pcl2 = new Label("Output: ", Label.CENTER);

JButton bx0 = new JButton();
JButton bx1 = new JButton();
JButton bx2 = new JButton();

JButton b1 = new JButton();
JButton b2 = new JButton();
JButton b3 = new JButton();
JButton b4 = new JButton();
JButton b5 = new JButton();

JButton cb0 = new JButton();
JButton cb1 = new JButton();
JButton cb2 = new JButton();
JButton cb3 = new JButton();
JButton cb4 = new JButton();
JButton cb5 = new JButton();
JButton cb6 = new JButton();
JButton cb7 = new JButton();

JButton bkey = new JButton("Enter");

Color xblue = new Color(0.1f, 0.1f, 0.16f);
Color bluex2 = new Color(0.2f, 0.27f, 0.39f);
Color bluex3 = new Color(0.6f, 0.67f, 0.9f);
Color darkgray08 = new Color(0.08f, 0.08f, 0.08f);//dark gray
Color darkgray01 = new Color(0.156f, 0.156f, 0.156f);//dark gray
Color darkgray70 = new Color(0.7f, 0.7f, 0.7f);
Color blackx = new Color(0.0f, 0.0f, 0.0f);
Color whitex = new Color(1.0f, 1.0f, 1.0f);
Color purple = new Color(1.0f, 0.0f, 0.8f);
Color redx = new Color(0.3f, 0.2f, 0.316f);
Color lightgreenx = new Color(0.1f, 0.3f, 0.1f);

File file_f1;
File file_f2;
File file_f3 = new File("SSF.ini");
File file_f4 = new File("\\cs_images");
File OXMX = new File("XMX.CSV");
File OLSF = new File("LSF.CSV");

Icon imx0;
Icon imx1;



//start*************************************************
	public scraper2(){//****************************

	super("Vulture 2.6.0");
	setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
	setBackground(blackx);
	setSize(xzx, xzy);
	setLocation(cenx, ceny - 20);
	setResizable(false);
        addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){savex(); startstart = 2;}});

        requestFocus();
	linklist[0] = new String("");

	for(int xloopx0 = 0; xloopx0 < cutnumber; xloopx0++){//********
	for(int xloopx1 = 0; xloopx1 < 6; xloopx1++){//********
        switchSCAPE[xloopx0][xloopx1][0] = "";
        switchSCAPE[xloopx0][xloopx1][1] = "";
	}//for
	}//for


//load images from JAR
	Image ximagex = new ImageIcon(this.getClass().getResource("images/hex.png")).getImage();
	setIconImage(ximagex);

//get button images from the Jar file.
	imx0 = new ImageIcon(this.getClass().getResource("images/buttonimage.png"));
	imx1 = new ImageIcon(this.getClass().getResource("images/vulture1.png"));

//set up files for scraping.
	if(OXMX.exists()){}else{makexmxfile();}
	if(OLSF.exists()){}else{makelsffile();}

//color and set up the scraping fields. 
	for(int xloopx0 = 0; xloopx0 < 12; xloopx0++){//****************************
	testfx[xloopx0] = new Label("Status: Test.", Label.LEFT);
	testfx[xloopx0].setPreferredSize(new Dimension(488, 20));
	testfx[xloopx0].setBackground(blackx);
	testfx[xloopx0].setForeground(whitex);

	f_xf_x[xloopx0][0] = new TextField("", 8);//codes
	f_xf_x[xloopx0][0].setForeground(whitex);
	f_xf_x[xloopx0][0].setBackground(blackx);
	f_xf_x[xloopx0][1] = new TextField("", 8);//add before
	f_xf_x[xloopx0][1].setForeground(whitex);
	f_xf_x[xloopx0][1].setBackground(blackx);
	f_xf_x[xloopx0][2] = new TextField("", 12);
	f_xf_x[xloopx0][2].setForeground(whitex);
	f_xf_x[xloopx0][2].setBackground(xblue);
	f_xf_x[xloopx0][3] = new TextField("0", 1);
	f_xf_x[xloopx0][3].setForeground(whitex);
	f_xf_x[xloopx0][3].setBackground(blackx);
	f_xf_x[xloopx0][4] = new TextField("", 12);
	f_xf_x[xloopx0][4].setForeground(whitex);
	f_xf_x[xloopx0][4].setBackground(xblue);
	f_xf_x[xloopx0][5] = new TextField("0", 1);//add after
	f_xf_x[xloopx0][5].setForeground(whitex);
	f_xf_x[xloopx0][5].setBackground(blackx);
	}//for************************************************************

System.out.println("vs " + nm.vulture_settings.length());
//nm.vulture_settings = "";

	f_xf_x[0][0].setText("<*sk*>");
	f_xf_x[0][1].setText("Names: ");
	f_xf_x[0][2].setText("find1");
	f_xf_x[0][4].setText("find2");

	labelx.setPreferredSize(new Dimension(27, 20));
	labelx.setBackground(blackx);
	labelx.setForeground(whitex);

	lpage1.setPreferredSize(new Dimension(300, 20));
	lpage1.setBackground(blackx);
	lpage1.setForeground(whitex);

	lpage2.setPreferredSize(new Dimension(300, 20));
	lpage2.setBackground(blackx);
	lpage2.setForeground(whitex);

	for(int xloopx0 = 0; xloopx0 < 10; xloopx0++){//********
	buttonl[xloopx0] = new Label("Status: Test.", Label.LEFT);
	buttonl[xloopx0].setPreferredSize(new Dimension(110, 20));
	buttonl[xloopx0].setBackground(blackx);
	buttonl[xloopx0].setForeground(whitex);
	}//for*****************************************


	MHTF.setBackground(lightgreenx);
	MHTF.setForeground(whitex);
	t1.setBackground(blackx);
	t1.setForeground(whitex);

	URL[0] = new TextField("http://www.carbonscraper.com/test", 30);
	URL[0].setBackground(lightgreenx);
	URL[0].setForeground(whitex);
	URL[1] = new TextField("1", 2);
	URL[1].setBackground(xblue);
	URL[1].setForeground(whitex);
	URL[2] = new TextField(".html", 12);
	URL[2].setBackground(lightgreenx);
	URL[2].setForeground(whitex);
	URL[3] = new TextField("10", 2);
	URL[3].setBackground(xblue);
	URL[3].setForeground(whitex);
	searchtop[0] = new TextField("<", 20);
	searchtop[0].setBackground(xblue);
	searchtop[0].setForeground(whitex);
	searchtop[1] = new TextField("</html>", 20);
	searchtop[1].setBackground(xblue);
	searchtop[1].setForeground(whitex);

	pcl0.setPreferredSize(new Dimension(225, 20));
	pcl0.setBackground(blackx);
	pcl0.setForeground(whitex);

	pcl1.setPreferredSize(new Dimension(150, 20));
	pcl1.setBackground(blackx);
	pcl1.setForeground(whitex);

	pcl2.setPreferredSize(new Dimension(250, 20));
	pcl2.setBackground(blackx);
	pcl2.setForeground(whitex);


//all the JButtons
	bx0 = new JButton("Go");
	bx0.setMargin(new Insets(0, 0, 0, 0));  
	bx0.addActionListener(this);
	bx0.setPreferredSize(new Dimension(70, 20));
	bx0.setIcon(imx0);
	bx0.setHorizontalTextPosition(JButton.CENTER);
	bx0.setForeground(bluex3);

	bx1 = new JButton("Add");
	bx1.setMargin(new Insets(0, 0, 0, 0));  
	bx1.addActionListener(this);
	bx1.setPreferredSize(new Dimension(70, 20));
	bx1.setIcon(imx0);
	bx1.setHorizontalTextPosition(JButton.CENTER);
	bx1.setForeground(whitex);

	bx2 = new JButton("Create Link List");
	bx2.setMargin(new Insets(0, 0, 0, 0));  
	bx2.addActionListener(this);
	bx2.setPreferredSize(new Dimension(145, 20));
	bx2.setIcon(imx0);
	bx2.setHorizontalTextPosition(JButton.CENTER);
	bx2.setForeground(whitex);


	cb0 = new JButton("CutType(1)");
	cb0.setMargin(new Insets(0, 0, 0, 0));  
	cb0.addActionListener(this);
	cb0.setPreferredSize(new Dimension(85, 20));
	cb0.setIcon(imx0);
	cb0.setHorizontalTextPosition(JButton.CENTER);
	cb0.setForeground(bluex3);

	cb1 = new JButton("Save");
	cb1.setMargin(new Insets(0, 0, 0, 0));  
	cb1.addActionListener(this);
	cb1.setPreferredSize(new Dimension(70, 20));
	cb1.setIcon(imx0);
	cb1.setHorizontalTextPosition(JButton.CENTER);
	cb1.setForeground(whitex);

	cb2 = new JButton("toLowerCase(off)");
	cb2.setMargin(new Insets(0, 0, 0, 0));  
	cb2.addActionListener(this);
	cb2.setPreferredSize(new Dimension(120, 20));
	cb2.setIcon(imx0);
	cb2.setHorizontalTextPosition(JButton.CENTER);
	cb2.setForeground(whitex);

	cb3 = new JButton("Example");
	cb3.setMargin(new Insets(0, 0, 0, 0));  
	cb3.addActionListener(this);
	cb3.setPreferredSize(new Dimension(90, 20));
	cb3.setIcon(imx0);
	cb3.setHorizontalTextPosition(JButton.CENTER);
	cb3.setForeground(whitex);

	cb4 = new JButton("Java Replace");
	cb4.setMargin(new Insets(0, 0, 0, 0));  
	cb4.addActionListener(this);
	cb4.setPreferredSize(new Dimension(100, 20));
	cb4.setIcon(imx0);
	cb4.setHorizontalTextPosition(JButton.CENTER);
	cb4.setForeground(bluex3);

	cb5 = new JButton("Sleep(0s)");
	cb5.setMargin(new Insets(0, 0, 0, 0));  
	cb5.addActionListener(this);
	cb5.setPreferredSize(new Dimension(90, 20));
	cb5.setIcon(imx0);
	cb5.setHorizontalTextPosition(JButton.CENTER);
	cb5.setForeground(whitex);

	cb6 = new JButton("Output(CSV)");
	cb6.setMargin(new Insets(0, 0, 0, 0));  
	cb6.addActionListener(this);
	cb6.setPreferredSize(new Dimension(90, 20));
	cb6.setIcon(imx0);
	cb6.setHorizontalTextPosition(JButton.CENTER);
	cb6.setForeground(bluex3);

	cb7 = new JButton("Load");
	cb7.setMargin(new Insets(0, 0, 0, 0));  
	cb7.addActionListener(this);
	cb7.setPreferredSize(new Dimension(70, 20));
	cb7.setIcon(imx0);
	cb7.setHorizontalTextPosition(JButton.CENTER);
	cb7.setForeground(whitex);


	b1 = new JButton("Test");
	b1.setMargin(new Insets(0, 0, 0, 0));  
	b1.addActionListener(this);
	b1.setPreferredSize(new Dimension(70, 20));
	b1.setIcon(imx0);
	b1.setHorizontalTextPosition(JButton.CENTER);
	b1.setForeground(whitex);

	b2 = new JButton("Cut");
	b2.setMargin(new Insets(0, 0, 0, 0));  
	b2.addActionListener(this);
	b2.setPreferredSize(new Dimension(70, 20));
	b2.setIcon(imx0);
	b2.setHorizontalTextPosition(JButton.CENTER);
	b2.setForeground(whitex);

	b3 = new JButton("Print");
	b3.setMargin(new Insets(0, 0, 0, 0));  
	b3.addActionListener(this);
	b3.setPreferredSize(new Dimension(70, 20));
	b3.setIcon(imx0);
	b3.setHorizontalTextPosition(JButton.CENTER);
	b3.setForeground(whitex);

	b4 = new JButton("Compress");
	b4.setMargin(new Insets(0, 0, 0, 0));  
	b4.addActionListener(this);
	b4.setPreferredSize(new Dimension(75, 20));
	b4.setIcon(imx0);
	b4.setHorizontalTextPosition(JButton.CENTER);
	b4.setForeground(whitex);

	b5 = new JButton("Scrape LSF");
	b5.setMargin(new Insets(0, 0, 0, 0));  
	b5.addActionListener(this);
	b5.setPreferredSize(new Dimension(75, 20));
	b5.setIcon(imx0);
	b5.setHorizontalTextPosition(JButton.CENTER);
	b5.setForeground(bluex3);


	pageinfo.setPreferredSize(new Dimension(995, 20));
	pageinfo.setBackground(blackx);
	pageinfo.setForeground(whitex);


//make jpanels 
        //JPanel jp0 = new JPanel();
	jp0.setPreferredSize(new Dimension(1000, 260));
	jp0.setBackground(blackx);
	jp0.setBorder(BorderFactory.createLineBorder(bluex2));
	jp0.add(MHTF);
	jp0.add(bx0);
	jp0.add(bx1);
	jp0.add(lpage1);
	jp0.add(URL[0]);
	jp0.add(URL[1]);
	jp0.add(URL[2]);
	jp0.add(labelx);
	jp0.add(URL[3]);
	jp0.add(bx2);
	jp0.add(lpage2);
	jp0.add(t1);
	jp0.add(pcl0);
	jp0.add(searchtop[0]);
	jp0.add(pcl1);
	jp0.add(searchtop[1]);
	jp0.add(pcl2);
	jp0.add(cb0);
	jp0.add(cb1);
	jp0.add(cb7);
	jp0.add(cb2);
	jp0.add(cb5);
	jp0.add(cb4);
	jp0.add(cb3);
	jp0.add(cb6);


        //JPanel jp1 = new JPanel();
	jp1.setPreferredSize(new Dimension(490, 325));
	jp1.setBackground(blackx);
	jp1.setBorder(BorderFactory.createLineBorder(bluex2));
	for(int xloopx0 = 0; xloopx0 < 6; xloopx0++){//********
	jp1.add(testfx[xloopx0]);
	jp1.add(f_xf_x[xloopx0][0]);
	jp1.add(f_xf_x[xloopx0][1]);
	jp1.add(f_xf_x[xloopx0][2]);
	jp1.add(f_xf_x[xloopx0][3]);
	jp1.add(f_xf_x[xloopx0][4]);
	jp1.add(f_xf_x[xloopx0][5]);
	}//for*****************************************



        //JPanel jp2 = new JPanel();
	jp2.setPreferredSize(new Dimension(490, 325));
	jp2.setBackground(blackx);
	jp2.setBorder(BorderFactory.createLineBorder(bluex2));
	for(int xloopx0 = 6; xloopx0 < 12; xloopx0++){//********
	jp2.add(testfx[xloopx0]);
	jp2.add(f_xf_x[xloopx0][0]);
	jp2.add(f_xf_x[xloopx0][1]);
	jp2.add(f_xf_x[xloopx0][2]);
	jp2.add(f_xf_x[xloopx0][3]);
	jp2.add(f_xf_x[xloopx0][4]);
	jp2.add(f_xf_x[xloopx0][5]);
	}//for*****************************************



	//JPanel jp3 = new JPanel();
	jp3.setPreferredSize(new Dimension(1000, 45));
	jp3.setBackground(blackx);
	jp3.setBorder(BorderFactory.createLineBorder(bluex2));
	jp3.add(b1);
	jp3.add(buttonl[1]);
	jp3.add(b2);
	jp3.add(buttonl[2]);
	jp3.add(b3);
	jp3.add(buttonl[3]);
	jp3.add(b4);
	jp3.add(buttonl[4]);
	jp3.add(b5);
	jp3.add(buttonl[5]);


//****************************


	//switchHTML[0] = "http://www.carbonscraper.com/test/test1.html"; switchHTML[1] = switchHTML[0]; savex(); System.exit(0); 
	loadx();

	size1 = file_f3.getTotalSpace();
	if(file_f3.exists()){}
	//else{System.exit(0);}

//****************************

	System.out.println("carbonkeyx " + carbonkeyx);

       if(carbonkey.equals(carbonkeyx)){

	//Label spacelabel1 = new Label("", Label.CENTER);
	spacelabel1.setPreferredSize(new Dimension(990, 150));

	JLabel spacelabel2 = new JLabel("", imx1 , JLabel.CENTER);
	spacelabel2.setPreferredSize(new Dimension(490, 230));

	bkey.setMargin(new Insets(0, 0, 0, 0));  
	bkey.addActionListener(this);
	bkey.setPreferredSize(new Dimension(60, 20));
	bkey.setIcon(imx0);
	bkey.setHorizontalTextPosition(JButton.CENTER);
	bkey.setForeground(whitex);

	enterkey_label.setPreferredSize(new Dimension(200, 20));
	enterkey_label.setBackground(blackx);
	enterkey_label.setForeground(whitex);

	//JPanel jpk = new JPanel();
	jpk.setPreferredSize(new Dimension(500, 300));
	jpk.setBackground(blackx);
	jpk.setBorder(BorderFactory.createLineBorder(bluex2));
	jpk.add(spacelabel2);
	jpk.add(enterkey_label); 
	//jpk.add(enterkey_text); 
	jpk.add(bkey);

	//Container cp = getContentPane();
	cp_container.setLayout(new FlowLayout());
	cp_container.setBackground(darkgray01);
	cp_container.setForeground(whitex);
	cp_container.add(spacelabel1);
	cp_container.add(jpk);

	enterkey_text.requestFocus();

       }//if
       else{

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

	//Container cp = getContentPane();
	cp_container.setLayout(new FlowLayout());
	cp_container.setBackground(darkgray01);
	cp_container.setForeground(whitex);
	cp_container.add(jp0);
	cp_container.add(jp1);
	cp_container.add(jp2);
	cp_container.add(jp3);
	cp_container.add(pageinfo);

	carbonkeyx = new String("OPEN");
	savex();

       }//else


	loadll();
	showinfox1();
	setoutputx();

	setVisible(true);

	//if(workx == false && !carbonkey.equals(carbonkeyx)){t1.setText(infox6);}

	}//Vulture*************************************





//build program stop. Run program start**************************************************************
//build program stop. Run program start**************************************************************
//build program stop. Run program start**************************************************************





	public void makelsffile(){
	//System.out.println("Make LSF");
	try {
        BufferedWriter out = new BufferedWriter(new FileWriter("LSF.CSV"));
        out.write("");
        out.close();
        }catch (IOException e){t1.setText("Make LSF failed.");}

	}//makelsffile



	public void makexmxfile(){
	//System.out.println("Make XMX");
	try {
        BufferedWriter out = new BufferedWriter(new FileWriter("XMX.CSV"));
        out.write("");
        out.close();
        }catch (IOException e){t1.setText("Make XMX failed.");}

	}//makexmxfile










	public void resetgold(){

	for(int xloopx0 = 0; xloopx0 < cutnumber; xloopx0++){//*****************************	
	for(int xloopx1 = 0; xloopx1 < cuttype; xloopx1++){//**********

	GOLDX[xloopx0][xloopx1] = "null";

	}//for
	}//for
	}//resetgold



	public void resetnumber(){

	for(int xloopx0 = 0; xloopx0 < cutnumber; xloopx0++){//*****************************	
	newitems[xloopx0] = 0;
	}//for

	}//resetnumber








//ping*********************************************************************
//ping*********************************************************************


	public void ping(){//get web page

	GETHTML1 = blank;
	GETHTML2 = blank;

	lineb1.replace(0, lineb1.length(), "");
	lineb2.replace(0, lineb2.length(), "");

	try {
	t1.setText("Ping 1.");
	URL url = new URL(HTMLGO);
	BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

	      xlinex = blank;
	      while ((xlinex = in.readLine()) != null){lineb1.append(xlinex); lineb2.append(xlinex + "\n");}
	      in.close();

	}catch (IOException e){t1.setText("URL Address Falure.");}// tabxx();

	t1.setText("Ping 2.");

	GETHTML1 = lineb1.toString();
	GETHTML2 = lineb2.toString();

	if(to_lower_caseb){
	GETHTML1 = GETHTML1.toLowerCase();
	GETHTML2 = GETHTML2.toLowerCase();
	t1.setText(GETHTML2);
	}//iflower case

	pcl0.setText("Input: " + Integer.toString(GETHTML1.length() / 1024) + "kb");

	}//ping 



//ping*********************************************************************
//ping*********************************************************************





//fired from button bx0. Go to the given page, show content, stop.
	public void gox(){

	HTMLGO = (MHTF.getText());
	lpage1.setText(HTMLGO);
	ping();
	t1.setText(GETHTML2);

	}//ssx





//save the full page of the site.
	public void savepage(){
	System.out.println(HTMLGO + ".html");
	System.out.println(GETHTML2.length());

	ix1 = HTMLGO.lastIndexOf("/");
	if(ix1 == -1){}
	else{cx0 = HTMLGO.substring(ix1 + 1, HTMLGO.length());}

	try {
        BufferedWriter out = new BufferedWriter(new FileWriter(cx0 + ".html"));
        out.write("here");
        out.close();
        }catch (IOException e){t1.setText("Save full page failed.");}

	}//savefile






	public void replacename(){

	for(int xloopx0 = 0; xloopx0 < runs1; xloopx0++){//********

	ix7 = xsaveoverx.indexOf(" ");
	if(ix7 == -1){break;}
	else{
	
	xsaveoverx = xsaveoverx.substring(0, ix7) + "_" + xsaveoverx.substring(ix7 + 1, xsaveoverx.length());

	}//else
	}//for
	//System.out.println(xsaveoverx);
	}//replacename






//scrape picture or file from given URL.
	public void getfile(){

	//getfilex = new String("");
	//filename = new String(filename);
	//System.out.println(getfilex);
	//System.out.println(filename);



	for(int xloopx0 = 0; xloopx0 < runs0; xloopx0++){//********
	ix6 = filename.indexOf("/");
	if(ix6 > -1){//************************

	filename = filename.substring(0, ix6) + filename.substring(ix6 + 1, filename.length());

	}//if**********************************
	else{break;}
	}//FOR


	for(int xloopx0 = 0; xloopx0 < runs0; xloopx0++){//********
	ix6 = filename.indexOf("\"");
	if(ix6 > -1){//************************

	filename = filename.substring(0, ix6) + filename.substring(ix6 + 1, filename.length());

	}//if**********************************
	else{break;}
	}//FOR


	for(int xloopx0 = 0; xloopx0 < runs0; xloopx0++){//********
	ix6 = filename.indexOf(">");
	if(ix6 > -1){//************************

	filename = filename.substring(0, ix6) + filename.substring(ix6 + 1, filename.length());

	}//if**********************************
	else{break;}
	}//FOR


	for(int xloopx0 = 0; xloopx0 < runs0; xloopx0++){//********
	ix6 = filename.indexOf("<");
	if(ix6 > -1){//************************

	filename = filename.substring(0, ix6) + filename.substring(ix6 + 1, filename.length());

	}//if**********************************
	else{break;}
	}//FOR


	for(int xloopx0 = 0; xloopx0 < runs0; xloopx0++){//********
	ix6 = filename.indexOf("?");
	if(ix6 > -1){//************************

	filename = filename.substring(0, ix6) + filename.substring(ix6 + 1, filename.length());

	}//if**********************************
	else{break;}
	}//FOR




	cx5 = file_f3.getAbsolutePath();
	cx5 = cx5.substring(0, cx5.length() - 7) + "cs_images\\";
	//System.out.println(cx5);
	//System.exit(0);
	if(file_f4.exists()){}else{t1.setText("Make new Image folder."); file_f4 = new File(cx5); file_f4.mkdirs();}

	try{
	BufferedInputStream in = new BufferedInputStream(new URL(getfilex).openStream());
	BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(cx5 + filename));
	byte xdatax[] = new byte[10240];
	while((bytesRead = in.read(xdatax)) != -1){bout.write(xdatax, 0, bytesRead);}
	bout.close();
	in.close();
	}catch (IOException e){t1.setText("get file fail");}

	//System.exit(0);
	}//









//Test and CUTX*****************************************************************************
//Test and CUTX*****************************************************************************
//Test and CUTX*****************************************************************************
//Test and CUTX*****************************************************************************




	public void precut(){
	
	cx1 = GETHTML1;

	ix1 = cx1.indexOf(searchtop[0].getText());
	ix2 = cx1.indexOf(searchtop[1].getText());
	cx2 = searchtop[1].getText();
	if(ix1 > 0 && ix2 > 0){

	GETHTML1 = cx1.substring(ix1, ix2 + cx2.length());
	pcl1.setText("<Precut Pass>");
	t1.setText(GETHTML1);

	}//if
	else{}

	pcl2.setText("Output: " + Integer.toString(GETHTML1.length() / 1024) + "kb");

	if(ix1 == -1){pcl1.setText("precut fail(1)");}
	if(ix2 == -1){pcl1.setText("precut fail(2)");}
	if(ix1 == -1 && ix2 == -1){pcl1.setText("precut fail(1 & 2)");}

	}//precut








//test cut the HTML to show testfx output for user. 
	public void testcutx(){
	
	firstlast = true;
	cx1 = GETHTML1;
	ix3 = 0;
	ix5 = 0;

	for(int xloopx0 = 0; xloopx0 < cutnumber; xloopx0++){//********
	cx1 = GETHTML1;
	newitems[xloopx0] = 0;
	for(int xloopx1 = 0; xloopx1 < cuttype; xloopx1++){//********
	if(f_xf_x[xloopx0][0].getText().equals("<*image*>")){}
	if(f_xf_x[xloopx0][0].getText().equals("<*image*1*>")){}
	if(f_xf_x[xloopx0][0].getText().equals("<*image*2*>")){}
	if(f_xf_x[xloopx0][0].getText().equals("<*last*>")){firstlast = false;}
	if(f_xf_x[xloopx0][0].getText().equals("<*url*>")){testfx[xloopx0].setText(f_xf_x[xloopx0][1].getText() + HTMLGO); break;}
	if(f_xf_x[xloopx0][0].getText().equals("<*sk0*>")){testfx[xloopx0].setText(f_xf_x[xloopx0][1].getText() + loadedGOLD[0][savehold1]); break;}
	if(f_xf_x[xloopx0][0].getText().equals("<*sk1*>")){testfx[xloopx0].setText(f_xf_x[xloopx0][1].getText() + loadedGOLD[1][savehold1]); break;}
	if(f_xf_x[xloopx0][0].getText().equals("<*sk2*>")){testfx[xloopx0].setText(f_xf_x[xloopx0][1].getText() + loadedGOLD[2][savehold1]); break;}
	if(f_xf_x[xloopx0][0].getText().equals("<*page*>")){testfx[xloopx0].setText("Scrape full page to file."); break;}
	if(f_xf_x[xloopx0][2].getText().length() == 0){break;}

	//System.out.println("start " + cx1.length());

	if(firstlast){ix1 = cx1.indexOf(f_xf_x[xloopx0][2].getText());}
	else{ix1 = cx1.lastIndexOf(f_xf_x[xloopx0][2].getText());}

	if(ix1 < 0){if(xloopx1 == 0){t1.setText("test cut fail1");} break;}
	else{

	cx2 = cx1.substring(ix1 + Integer.parseInt(f_xf_x[xloopx0][3].getText()), cx1.length());
	ix2 = cx2.indexOf(f_xf_x[xloopx0][4].getText());

	if(ix2 < 0){if(xloopx1 == 0){t1.setText("test cut fail2");} break;}
	else{

//scraping finished.
	cx3 = cx2.substring(0, ix2 + Integer.parseInt(f_xf_x[xloopx0][5].getText()));
//scraping finished.

	if(f_xf_x[xloopx0][0].getText().equals("<*save*>")){}
	if(f_xf_x[xloopx0][0].getText().equals("<*add*:*>")){cx3 = cx3 + "<*:*>";}
	if(f_xf_x[xloopx0][0].getText().equals("<*add*,*>")){cx3 = cx3 + "<*,*>";}
	if(f_xf_x[xloopx0][0].getText().equals("<*add*+*>")){cx3 = cx3 + "<*+*>";}

	testfx[xloopx0].setText(f_xf_x[xloopx0][1].getText() + cx3);
	//GOLDX[xloopx0][xloopx1] = cx3;
	cx1 = cx2.substring(ix2 + Integer.parseInt(f_xf_x[xloopx0][5].getText()), cx2.length());

	newitems[xloopx0]++;
	ix5 = ix5 + 1;

	buttonl[1].setText(ix5 + " item(s)");

	}//else
	}//else

	}//for
	}//for

	}//testcutx







//the main class of the program, used to scrape the items from the HTML page.
	public void cutx(){
	
	cx1 = GETHTML1;
	ix3 = 0;
	ix4 = 0;
	ix5 = 0;

	picturenumber2 = 0;


	for(int xloopx0 = 0; xloopx0 < cutnumber; xloopx0++){//cutnumber
	 cx1 = GETHTML1;
	 newitems[xloopx0] = 0;
	 //picturenumber2 = 0;
	for(int xloopx1 = 0; xloopx1 < cuttype; xloopx1++){//cuttype
	 firstlast = true;
	 findimage = false;
	 ximage_1x = false;
	 ximage_2x = false;
	if(f_xf_x[xloopx0][0].getText().equals("<*last*>")){firstlast = false;}
	if(f_xf_x[xloopx0][0].getText().equals("<*image*>")){findimage = true;}
	if(f_xf_x[xloopx0][0].getText().equals("<*image*1*>")){findimage = true; ximage_1x = true;}
	if(f_xf_x[xloopx0][0].getText().equals("<*image*2*>")){findimage = true; ximage_2x = true;}
	if(f_xf_x[xloopx0][0].getText().equals("<*url*>")){GOLDX[xloopx0][xloopx1] = f_xf_x[xloopx0][1].getText() + HTMLGO; newitems[xloopx0]++; testfx[xloopx0].setText(f_xf_x[xloopx0][1].getText() + HTMLGO); break;}
	if(f_xf_x[xloopx0][0].getText().equals("<*sk0*>")){GOLDX[xloopx0][xloopx1] = f_xf_x[xloopx0][1].getText() + loadedGOLD[0][savehold1]; newitems[xloopx0]++; testfx[xloopx0].setText(f_xf_x[xloopx0][1].getText() + loadedGOLD[0][savehold1]); break;}
	if(f_xf_x[xloopx0][0].getText().equals("<*sk1*>")){GOLDX[xloopx0][xloopx1] = f_xf_x[xloopx0][1].getText() + loadedGOLD[1][savehold1]; newitems[xloopx0]++; testfx[xloopx0].setText(f_xf_x[xloopx0][1].getText() + loadedGOLD[1][savehold1]); break;}
	if(f_xf_x[xloopx0][0].getText().equals("<*sk2*>")){GOLDX[xloopx0][xloopx1] = f_xf_x[xloopx0][1].getText() + loadedGOLD[2][savehold1]; newitems[xloopx0]++; testfx[xloopx0].setText(f_xf_x[xloopx0][1].getText() + loadedGOLD[2][savehold1]); break;}
	if(f_xf_x[xloopx0][0].getText().equals("<*page*>")){ix3 = xloopx0; ix4 = xloopx1; savepage();}
	if(f_xf_x[xloopx0][2].getText().length() == 0){break;}

	if(firstlast){ix1 = cx1.indexOf(f_xf_x[xloopx0][2].getText());}
	else{ix1 = cx1.lastIndexOf(f_xf_x[xloopx0][2].getText());}

	//System.out.println(xloopx0);

	if(ix1 == -1){if(xloopx1 == 0){GOLDX[xloopx0][xloopx1] = f_xf_x[xloopx0][1].getText(); newitems[xloopx0]++;} else{t1.setText("cut break1");} break;}
	else{

//System.out.println("test1. " + ix1 + " " + f_xf_x[xloopx0][3].getText() + " " + cx1.length());
	if(ix1 + Integer.parseInt(f_xf_x[xloopx0][3].getText()) < 0){break;}
	cx2 = cx1.substring(ix1 + Integer.parseInt(f_xf_x[xloopx0][3].getText()), cx1.length());
//System.out.println("test2. " + cx1.length());
	ix2 = cx2.indexOf(f_xf_x[xloopx0][4].getText());


	if(ix2 < 0){if(xloopx1 == 0){GOLDX[xloopx0][xloopx1] = f_xf_x[xloopx0][1].getText(); newitems[xloopx0]++;} else{t1.setText("cut break2");} break;}
	else{

//scraping is done.
	if(ix2 + Integer.parseInt(f_xf_x[xloopx0][5].getText()) < 0){System.out.println("falure 1188."); break;}
	cx3 = cx2.substring(0, ix2 + Integer.parseInt(f_xf_x[xloopx0][5].getText()));
//scraping is done.

//check info after scraping is done. Apply to needed areas.
	if(f_xf_x[xloopx0][0].getText().equals("<*save*>")){xsaveoverx = cx3; replacename();}
	if(f_xf_x[xloopx0][0].getText().equals("<*add*:*>")){cx3 = cx3 + "<*:*>";}
	if(f_xf_x[xloopx0][0].getText().equals("<*add*,*>")){cx3 = cx3 + "<*,*>";}
	if(f_xf_x[xloopx0][0].getText().equals("<*add*+*>")){cx3 = cx3 + "<*+*>";}

//save scrape for printing.
	GOLDX[xloopx0][xloopx1] = (f_xf_x[xloopx0][1].getText() + cx3);
	testfx[xloopx0].setText(f_xf_x[xloopx0][1].getText() + cx3);

//System.out.println(xloopx1);
//get potential image file******************************************
	if(findimage){

	ix3 = GOLDX[xloopx0][xloopx1].lastIndexOf("/");
	 if(ix3 == -1){t1.setText("image name falure in cutx.");}
	 else{
		if(ximage_1x){filename = + (10000 + picturenumber1) + ".jpg";}
		else if(ximage_2x){ix4 = HTMLGO.lastIndexOf("/"); filename = xsaveoverx + "_" + picturenumber2 + ".jpg";}
		else{filename = GOLDX[xloopx0][xloopx1].substring(ix3 + 1, GOLDX[xloopx0][xloopx1].length());}
	 getfilex = GOLDX[xloopx0][xloopx1].substring(0, GOLDX[xloopx0][xloopx1].length());
	 getfile(); GOLDX[xloopx0][xloopx1] = "Image file name: " + filename;
	 picturenumber1++;
	 picturenumber2++;
	 }//else
	}//if findimage
//get potential image file stop.


	cx1 = cx2.substring(ix2 + Integer.parseInt(f_xf_x[xloopx0][5].getText()), cx2.length());
	newitems[xloopx0]++;
	ix5 = ix5 + 1;

	buttonl[2].setText("Cut: " + ix5 + " item(s)");

	}//else
	}//else

	}//for: cuttype
	}//for: cutnumber

	}//cutx****




//Test and CUTX*****************************************************************************
//Test and CUTX*****************************************************************************
//Test and CUTX*****************************************************************************
//Test and CUTX*****************************************************************************






//printing**********************************************************************
//printing**********************************************************************
//printing**********************************************************************


	public void printx(){

	if(cb6.getText().equals("Output(CSV)")){printx_csv();}
	if(cb6.getText().equals("Output(LSF)")){printx_lsf();}

	}//printx


//print csv output.
	public void printx_csv(){ //for information CSV
	t1.setText("Printing CSV");

	//saveb = new StringBuffer("");
	cx1 = new String("");
	ix0 = 0;

	try {
	BufferedReader in = new BufferedReader(new FileReader("XMX" + savepagenumber + ".CSV"));
	String str0;
	while ((str0 = in.readLine()) != null) {xprinter[ix0] = str0; ix0++;}
	in.close();} 
	catch (IOException e) {t1.setText("No XMX file found.");}


	for(int xloopx0 = ix0; xloopx0 < ix0 + cutnumber; xloopx0++){//*****************************	
	xprinter[xloopx0] = "";
	}//for

	//System.out.println("cutnumber" + cutnumber);

	for(int xloopx0 = 0; xloopx0 < cutnumber; xloopx0++){//*****************************	
	if(pagenumberx == 0){t1.setText("pagenumber 0 break."); break;}
	for(int xloopx1 = 0; xloopx1 < newitems[xloopx0]; xloopx1++){//*****************************

	//System.out.println(newitems[xloopx0]);

	if(GOLDX[xloopx0][xloopx1].equals("null")){t1.setText("null item found in XMX printing list.");}
	else if(GOLDX[xloopx0][xloopx1].length() == 0){t1.setText("0 length item found in XMX printing list.");}
	else{	

	xprinter[ix0] = xprinter[ix0] + GOLDX[xloopx0][xloopx1] + xsepxc;
	//System.out.println("xp " + newitems[xloopx0] + " " + xprinter[ix0]);

	}//else

	}//for
	}//for

	ix0++;
        buttonl[3].setText("Size: " + (xprinter[0].length() / 1024) + "kb");

	try {
        BufferedWriter out = new BufferedWriter(new FileWriter("XMX" + savepagenumber + ".CSV"));

	for(int xloopx0 = 0; xloopx0 < ix0; xloopx0++){//****	
	out.write(xprinter[xloopx0]);
	out.newLine();
	}//for********************************************

        out.close();
        }catch (IOException e) {}
	}//print_csv







//print LSF output.
	public void printx_lsf(){ //for information LSF
	t1.setText("Printing LSF");

	//saveb = new StringBuffer("");
	cx1 = new String("");
	ix0 = 0;

	for(int xloopx0 = 0; xloopx0 < runs1; xloopx0++){//*****************************	
	xprinter[xloopx0] = "";
	}//for

	try {
	BufferedReader in = new BufferedReader(new FileReader("LSF" + savepagenumber + ".CSV"));
	xlinex = blank;
	while ((xlinex = in.readLine()) != null) {xprinter[ix0] = xlinex; ix0++;}
	in.close();} 
	catch (IOException e) {t1.setText("No LSF file found.");}


	for(int xloopx0 = ix0; xloopx0 < ix0 + cutnumber; xloopx0++){//*******
	xprinter[xloopx0] = "";
	}//for*******************************************************


	for(int xloopx0 = 0; xloopx0 < cutnumber; xloopx0++){//*****************************	
	if(pagenumberx == 0){t1.setText("pagenumber 0 break."); break;}
	for(int xloopx1 = 0; xloopx1 < newitems[xloopx0]; xloopx1++){//*****************************


	if(GOLDX[xloopx0][xloopx1].equals("null")){t1.setText("null item found in LSF printing list.");}
	else if(GOLDX[xloopx0][xloopx1].length() == 0){t1.setText("0 length item found in LSF printing list.");}
	else{	


	xprinter[ix0] = GOLDX[xloopx0][xloopx1];
	xprinter[ix0] = xprinter[ix0] + xsepx0 + f_xf_x[1][1].getText();
		if(f_xf_x[1][0].getText().equals("<*sk1*>")){xprinter[ix0] = xprinter[ix0] + loadedGOLD[1][savehold1];}
	xprinter[ix0] = xprinter[ix0] + xsepx0 + f_xf_x[2][0].getText();
		if(f_xf_x[2][0].getText().equals("<*sk1*>")){xprinter[ix0] = xprinter[ix0] + loadedGOLD[2][savehold1];}
	xprinter[ix0] = xprinter[ix0] + xsepx0;
	ix0++;

	}//else

	}//for
	}//for

        buttonl[3].setText("Size: " + (xprinter[0].length() / 1024) + "kb");

	try {
        BufferedWriter out = new BufferedWriter(new FileWriter("LSF" + savepagenumber + ".CSV"));

	for(int xloopx0 = 0; xloopx0 < ix0; xloopx0++){//****	
	out.write(xprinter[xloopx0]);
	out.newLine();
	}//for********************************************

        out.close();
        }catch (IOException e){}
	}//print_txt






//printing**********************************************************************
//printing**********************************************************************
//printing**********************************************************************




//save load**********************************************************************
//save load**********************************************************************
//save load**********************************************************************






//save settings SSF.ini
	public void savex(){ //for programe

	StringBuffer sb = new StringBuffer("");

	try {


//save the key and the hard drive size.
	sb.append("xxx" + "***" + "111111");
        sb.append(xsepx0);

//save the go html field 
	if(!outputcsv){switchHTML[0] = MHTF.getText(); switchHTML[1] = linklist[0];}	
	else{switchHTML[0] = MHTF.getText(); switchHTML[1] = linklist[0];}
	sb.append(switchHTML[0] + xsepx0);
	sb.append(switchHTML[1] + xsepx0);

//save the make LL field.
	for(int xloopx0 = 0; xloopx0 < 4; xloopx0++){//********
        sb.append(URL[xloopx0].getText());
        sb.append(xsepx0);
	}//for

//save the precut field. 
	if(outputcsv){switchPRECUT[0][1] = searchtop[0].getText(); switchPRECUT[1][1] = searchtop[1].getText();}
	else{switchPRECUT[0][0] = searchtop[0].getText(); switchPRECUT[1][0] = searchtop[1].getText();}
		
	sb.append(switchPRECUT[0][0] + xsepx0);
	sb.append(switchPRECUT[1][0] + xsepx0);
	sb.append(switchPRECUT[0][1] + xsepx0);
	sb.append(switchPRECUT[1][1] + xsepx0);

//save the scraping fields.
	for(int xloopx0 = 0; xloopx0 < cutnumber; xloopx0++){//********
	for(int xloopx1 = 0; xloopx1 < 6; xloopx1++){//********
	if(outputcsv){switchSCAPE[xloopx0][xloopx1][1] = f_xf_x[xloopx0][xloopx1].getText();}
	else{switchSCAPE[xloopx0][xloopx1][0] = f_xf_x[xloopx0][xloopx1].getText();}
        sb.append(switchSCAPE[xloopx0][xloopx1][0] + xsepx0);
	}//for
	}//for

	for(int xloopx0 = 0; xloopx0 < cutnumber; xloopx0++){//********
	for(int xloopx1 = 0; xloopx1 < 6; xloopx1++){//********
	if(outputcsv){switchSCAPE[xloopx0][xloopx1][1] = f_xf_x[xloopx0][xloopx1].getText();}
	else{switchSCAPE[xloopx0][xloopx1][0] = f_xf_x[xloopx0][xloopx1].getText();}
        sb.append(switchSCAPE[xloopx0][xloopx1][1] + xsepx0);
	}//for
	}//for

//number of cuts per page.
	sb.append(Integer.toString(cuttype));
        sb.append(xsepx0);

//time out
	sb.append(Integer.toString(sleepx));
        sb.append(xsepx0);

	sb.append(Integer.toString(scraperstage));
        sb.append(xsepx0);

//to lower case yes or no.
	if(to_lower_caseb){
	sb.append(Integer.toString(1));
        sb.append(xsepx0);
	}else{
	sb.append(Integer.toString(0));
        sb.append(xsepx0);
	}//else

//output lsf csv
	if(outputcsv){
	sb.append(Integer.toString(1));
        sb.append(xsepx0);
	}else{
	sb.append(Integer.toString(0));
        sb.append(xsepx0);
	}//else

	nm.vulture_settings = sb.toString();

	System.out.println(nm.vulture_settings);

        }catch (Exception e) {t1.setText("Save settings file faild. File: SSF.ini");}
	}//printx


















//load settings SSF.ini
	public void loadx(){ 

	//try {
	//BufferedReader in = new BufferedReader(new FileReader("SSF.ini"));
	//xlinex = blank;
	//while ((xlinex = in.readLine()) != null) {cx1 = xlinex;}
	//in.close();} 
	//catch (IOException e){t1.setText("No SSF file found.");}


	cx1 = nm.vulture_settings;
	System.out.println("CX1.length " + cx1.length());


	try {
//the program key.
	ix1 = cx1.indexOf(xsepx0);
	if(ix1 == -1){System.out.println("<><><>"); savex();}
	cx2 = cx1.substring(0, ix1);
	cx2 = cx2.substring(0, 10) + cx2.substring(10, cx2.length());
	ix2 = cx2.indexOf("***");
	System.out.println("xx x " + cx2);
	if(ix2 == -1){System.out.println("falure, program load falure. 00116");}
	else{carbonkeyx = cx2.substring(0, ix2); size2 = Long.parseLong(cx2.substring(ix2 + 3, cx2.length()));}
	cx1 = cx1.substring(ix1 + xsepx0.length(), cx1.length());

//the top html field.
	ix1 = cx1.indexOf(xsepx0);
	if(ix1 == -1){}
	cx2 = cx1.substring(0, ix1);
	switchHTML[0] = cx2;
	cx1 = cx1.substring(ix1 + xsepx0.length(), cx1.length());

	ix1 = cx1.indexOf(xsepx0);
	if(ix1 == -1){}
	cx2 = cx1.substring(0, ix1);
	switchHTML[1] = cx2;
	cx1 = cx1.substring(ix1 + xsepx0.length(), cx1.length());

//make LL URL fields at the top. Before JButton (make link list)
	for(int xloopx0 = 0; xloopx0 < 4; xloopx0++){//*****************************	
	ix1 = cx1.indexOf(xsepx0);
	if(ix1 == -1){break;}
	cx2 = cx1.substring(0, ix1);
	URL[xloopx0].setText(cx2);
	cx1 = cx1.substring(ix1 + xsepx0.length(), cx1.length());
	}//for

//the precut fields.
	for(int xloopx0 = 0; xloopx0 < 2; xloopx0++){//*****************************	
	ix1 = cx1.indexOf(xsepx0);
	if(ix1 == -1){break;}
	cx2 = cx1.substring(0, ix1);
	switchPRECUT[xloopx0][0] = cx2;
	cx1 = cx1.substring(ix1 + xsepx0.length(), cx1.length());
	}//for

	for(int xloopx0 = 0; xloopx0 < 2; xloopx0++){//*****************************	
	ix1 = cx1.indexOf(xsepx0);
	if(ix1 == -1){break;}
	cx2 = cx1.substring(0, ix1);
	switchPRECUT[xloopx0][1] = cx2;
	cx1 = cx1.substring(ix1 + xsepx0.length(), cx1.length());
	}//for

//***all the data in the scraping fields.**
	for(int xloopx0 = 0; xloopx0 < cutnumber; xloopx0++){//*****************************	
	for(int xloopx1 = 0; xloopx1 < 6; xloopx1++){//*****************************	
	ix1 = cx1.indexOf(xsepx0);
	if(ix1 == -1){break;}
	cx2 = cx1.substring(0, ix1);
	switchSCAPE[xloopx0][xloopx1][0] = cx2;
	cx1 = cx1.substring(ix1 + xsepx0.length(), cx1.length());
	}//for
	}//for

	for(int xloopx0 = 0; xloopx0 < cutnumber; xloopx0++){//*****************************	
	for(int xloopx1 = 0; xloopx1 < 6; xloopx1++){//*****************************	
	ix1 = cx1.indexOf(xsepx0);
	if(ix1 == -1){break;}
	cx2 = cx1.substring(0, ix1);
	switchSCAPE[xloopx0][xloopx1][1] = cx2;
	cx1 = cx1.substring(ix1 + xsepx0.length(), cx1.length());
	}//for
	}//for

//cuttype
	ix1 = cx1.indexOf(xsepx0);
	if(ix1 == -1){}
	cx2 = cx1.substring(0, ix1);
	cuttype = Integer.parseInt(cx2);
	cb0.setText("CutType(" + cuttype + ")");
	cx1 = cx1.substring(ix1 + xsepx0.length(), cx1.length());
	if(cuttype == runs1){cb0.setText("CutType(all)");}

//sleep
	ix1 = cx1.indexOf(xsepx0);
	if(ix1 == -1){}
	cx2 = cx1.substring(0, ix1);
	sleepx = Integer.parseInt(cx2);
	cb5.setText("Sleep(" + sleepx + "s)");
	cx1 = cx1.substring(ix1 + xsepx0.length(), cx1.length());

//show INFO
	ix1 = cx1.indexOf(xsepx0);
	if(ix1 == -1){}
	cx2 = cx1.substring(0, ix1);
	//scraperstage = Integer.parseInt(cx2);
	//cb3.setText("Stage(" + scraperstage + ")");
	cx1 = cx1.substring(ix1 + xsepx0.length(), cx1.length());

//to lower case
	ix1 = cx1.indexOf(xsepx0);
	if(ix1 == -1){}
	cx2 = cx1.substring(0, ix1);
	ix2 = Integer.parseInt(cx2);
	if(ix2 == 1){to_lower_caseb = true; cb2.setText("toLowerCase(on)");}
	else{to_lower_caseb = false; cb2.setText("toLowerCase(off)");}
	cx1 = cx1.substring(ix1 + xsepx0.length(), cx1.length());

//select output
	ix1 = cx1.indexOf(xsepx0);
	if(ix1 == -1){}
	cx2 = cx1.substring(0, ix1);
	ix2 = Integer.parseInt(cx2);
	if(ix2 == 1){outputcsv = true; cb6.setText("Output(CSV)");}
	else{outputcsv = false; cb6.setText("Output(LSF)");}
	cx1 = cx1.substring(ix1 + xsepx0.length(), cx1.length());
	setoutputx();

	}catch (IndexOutOfBoundsException e){t1.setText("Load settings file faild. File: SSF.ini");}
	}//loadx












//resave the linklist "LSF" after links have been used. 
	public void savelinklist(){ 
	t1.setText("save link list");

	try {
        BufferedWriter out = new BufferedWriter(new FileWriter("LSF.CSV"));

	for(int xloopx1 = savehold1 + 1; xloopx1 < linknumber1; xloopx1++){//********
	for(int xloopx2 = 0; xloopx2 < 3; xloopx2++){//********

        out.write(loadedGOLD[xloopx2][xloopx1]);
	out.write(xsepx0);

	}//for
	out.newLine();
	}//for

        out.close();
        }catch (IOException e) {}

	}//savelinklist()









	public void loadll(){ 
	cx1 = blank;

	file_f1 = new File("LSF" + scrapsread + ".CSV");
	if(file_f1.exists()){}
	else{t1.setText("No link list.");}//System.exit(0);
	xlinex = blank;

	linknumber1 = 0;
	try {
	BufferedReader in = new BufferedReader(new FileReader("LSF.CSV"));
	while ((xlinex = in.readLine()) != null){

	if(linknumber1 < runs1){
	loadedGOLD[0][linknumber1] = xlinex; linknumber1++; buttonl[5].setText("Loading: " + linknumber1);
	}//if
	linknumber2++;

	}//while
	in.close();} 
	catch (IOException e) {t1.setText("No LSF file found.");}



	for(int xloopx0 = 0; xloopx0 < linknumber1; xloopx0++){//*******************************
	loadedGOLD[1][xloopx0] = "null";
	loadedGOLD[2][xloopx0] = "null";

	ix1 = loadedGOLD[0][xloopx0].indexOf(xsepx0);
	if(ix1 > -1){
	loadedGOLD[1][xloopx0] = loadedGOLD[0][xloopx0].substring(ix1 + xsepx0.length(), loadedGOLD[0][xloopx0].length());
	loadedGOLD[0][xloopx0] = loadedGOLD[0][xloopx0].substring(0, ix1);
	linklist[xloopx0] = loadedGOLD[0][xloopx0];
	}//if
	else{}

	ix1 = loadedGOLD[1][xloopx0].indexOf(xsepx0);
	if(ix1 > -1){
	loadedGOLD[2][xloopx0] = loadedGOLD[1][xloopx0].substring(ix1 + xsepx0.length(), loadedGOLD[1][xloopx0].length());
	loadedGOLD[1][xloopx0] = loadedGOLD[1][xloopx0].substring(0, ix1);
	}//if
	else{}

	ix1 = loadedGOLD[2][xloopx0].indexOf(xsepx0);
	if(ix1 > -1){
	loadedGOLD[2][xloopx0] = loadedGOLD[2][xloopx0].substring(0, ix1);
	}//if
	else{}

	}//for*****************************************************************


	buttonl[5].setText("Links: " + linknumber1);

	//show loading falure text. Moved to "out put x"

	findspn();
	}//loadll



	public void findspn(){//save page number
	savepagenumber = 0;
	cx1 = blank;

	try {
	BufferedReader in;
	if(outputcsv){in = new BufferedReader(new FileReader("XMX" + savepagenumber + ".CSV"));}
	else{in = new BufferedReader(new FileReader("LSF.CSV"));}
	xlinex = blank;
	while ((xlinex = in.readLine()) != null){cx1 = xlinex;}
	in.close();
	}catch(IOException e){t1.setText("No XMX file found. <>>>");}

	for(int xloopx1 = 0; xloopx1 < runs1; xloopx1++){//****************
	if(outputcsv){file_f1 = new File("XMX" + savepagenumber + ".CSV");}
	else{file_f1 = new File("LSF" + savepagenumber + ".CSV");}
	if(file_f1.exists() && cx1.length() > 0){savepagenumber++;}
	else{break;}
	}//for******************************************************

	}//findspn




//save load**********************************************************************
//save load**********************************************************************
//save load**********************************************************************





//multi thread scraping*******************************************************************************************************************
//multi thread scraping*******************************************************************************************************************
//multi thread scraping*******************************************************************************************************************



//remindTask thread runs1 scraping so program can be shut down during operation. 
	class RemindTask extends TimerTask{
	public void run(){

	Runtime rxrunti = Runtime.getRuntime();

	t1.setText("start.");
  	pagenumberx = 0;
	savell = 1;

	//System.out.println(rxrunti.freeMemory());
	loadll();
	rxrunti.gc();
	//System.out.println(rxrunti.freeMemory());

	for(int xloopx0 = 0; xloopx0 < linknumber1; xloopx0++){//********
	t1.setText("Start...");
	if(startstart == 1){//****

	savehold1 = xloopx0;
	if(passes == 50){savepagenumber++; passes = 0; savelinklist();}

	setTitle("Vulture: " + (linknumber1 - xloopx0));
	HTMLGO = linklist[xloopx0];
	lpage1.setText(HTMLGO);
	resetgold();
	buttonl[5].setText("Links: " + (linknumber1 - xloopx0));
	saveloop1 = xloopx0;
	t1.setText("Ping...");
	ping();
	t1.setText("Cut...");
	precut();
	cutx();
	pagenumberx++;
	t1.setText("Save...");
	printx();
	resetnumber();
	passes++;
	t1.setText("Sleep...");
	tabxx();

	}//if****************
	else{t1.setText("Exit."); break;}

	t1.setText("Done...");
	}//for***************************************************

  	t1.setText("finished.");
	savelinklist();
	b5.setText("Scrape LSF");
	buttonl[5].setText("Load next LSF");
	setTitle("Vulture: Load next LSF");
	o_n = true;
	startstart = 2;

        }//run
        }//remindtask








//Change the panels from program start panel to scraping program panel
	class JpanelTask extends TimerTask{
	public void run(){

	try{
	Thread.sleep(100);
	}catch (InterruptedException e){}

	cp_container.remove(jpk);
	cp_container.remove(spacelabel1);
	cp_container.add(jp0);
	cp_container.add(jp1);
	cp_container.add(jp2);
	cp_container.add(jp3);
	cp_container.add(pageinfo);

	setVisible(false);
	setVisible(true);
	programstart = false;

        }//run
        }//remindtask






//multi thread scraping*******************************************************************************************************************
//multi thread scraping*******************************************************************************************************************
//multi thread scraping*******************************************************************************************************************


//keys******************************************
//keys******************************************






//used one time when the program starts for the first time. 
	public void inpsutkgcd(){


	carbonkey = enterkey_text.getText();
	size2 = size1;

	workx = true; 
	carbonkeyx = carbonkey;
	savex(); 
	enterkey_text.setEditable(false); 
	enterkey_label.setText(infox5); 
	ix0 = sleepx; 
	sleepx = 2; 
	tabxx(); 
	sleepx = ix0; 
	jpanelxx();


	}//input key gen







//keys******************************************
//keys******************************************



//button controls*****************************************************************************************
//button controls*****************************************************************************************
//button controls*****************************************************************************************
//button controls*****************************************************************************************






//handel button clicks from scrape LSF 
	public void txx(){
	if(startstart == 1){

	startstart = 2;
	b5.setText("Wait...");

	}//if
	else{

	if(o_n){
	savell = 0;
	startstart = 1;
    	toolkit = Toolkit.getDefaultToolkit();
    	xtimerx = new Timer();
    	xtimerx.schedule(new RemindTask(), 0);
	b5.setText("Pause");
	o_n = false;
	}//on

	}//else
	}//xtimerx





//Change Jpanels
	public void jpanelxx(){

    	xtimerx = new Timer();
    	xtimerx.schedule(new JpanelTask(), 0);

	}//xtimerx












//Button bx1
//add 1 new item to the LSF list.
	public void add_to_lsf(){

	cx1 = blank;
	ix0 = 0;


	try {
	BufferedReader in = new BufferedReader(new FileReader("LSF.CSV"));
	xlinex = blank;
	while ((xlinex = in.readLine()) != null){loadedGOLD[0][ix0] = xlinex; ix0++;}
	in.close();
        }catch (IOException e){}

	loadedGOLD[0][ix0] = MHTF.getText() + xsepx0 + "*" + xsepx0 + "*";
	ix0++;

	try {
        BufferedWriter out = new BufferedWriter(new FileWriter("LSF.CSV"));
 
	for(int xloopx0 = 0; xloopx0 < ix0; xloopx0++){//******
	out.write(loadedGOLD[0][xloopx0]);
	out.newLine();
    	}//******************************************

        out.close();
        }catch (IOException e){}

	t1.setText("Add this URL to the Link List. LSF");
	lpage1.setText("LSF + 1");

	loadll();

	}//add to lsf







//creats a LSF file from info in "create link list"
	public void makell(){

	t1.setText("Creates a LSF file from given data.");
	ix0 = 0;

	try {
	BufferedReader in = new BufferedReader(new FileReader("LSF.CSV"));
	xlinex = blank;
	while ((xlinex = in.readLine()) != null){compresser[ix0] = xlinex; lpage2.setText("Loading: " + ix0); ix0++;}
	in.close();
	}catch(IOException e){t1.setText("Load old LSF file failed.");}

	ix1 = Integer.parseInt(URL[3].getText());
	ix2 = Integer.parseInt(URL[1].getText());

	try {
        BufferedWriter out = new BufferedWriter(new FileWriter("LSF.CSV"));

	for(int xloopx1 = 0; xloopx1 < ix0; xloopx1++){//*****************************
	out.write(compresser[xloopx1]);
	out.newLine();
	}//for

	for(int xloopx1 = 0; xloopx1 < ix1; xloopx1++){//*****************************
	out.write(URL[0].getText() + (xloopx1 * ix2) + URL[2].getText() + xsepx0 + "*" + xsepx0 + "*" + xsepx0);
	out.newLine();
	lpage2.setText("LSF + " + (xloopx1 + 1));
	}//for

        out.close();
        }catch (IOException e) {}

	loadll();

	showinfox3();

	}//make ll











//combine all the CSV or LSF files into 1.
	public void combinex(){

	t1.setText("Combine all the .CSV files into one.");
	ix0 = 0;

	if(outputcsv){
	try {
	BufferedReader in = new BufferedReader(new FileReader("XMX.CSV"));
	xlinex = blank;
	while ((xlinex = in.readLine()) != null){compresser[ix0] = xlinex; ix0++;}
	in.close();
	}catch (IOException e){t1.setText("Load old XMX file failed.");}
	}//if*******


	for(int xloopx0 = 0; xloopx0 < 1000; xloopx0++){//********

	try {
	BufferedReader in;
	if(outputcsv){in = new BufferedReader(new FileReader("XMX" + xloopx0 + ".CSV"));}
	else{in = new BufferedReader(new FileReader("LSF" + xloopx0 + ".CSV"));}
	xlinex = blank;
	while ((xlinex = in.readLine()) != null){compresser[ix0] = xlinex; buttonl[4].setText("Loading: " + ix0); ix0++;}
	in.close();

	if(outputcsv){file_f2 = new File("XMX" + xloopx0 + ".CSV");}
	else{file_f2 = new File("LSF" + xloopx0 + ".CSV");}

	file_f2.delete();
	}catch (IOException e){t1.setText("NO more files to compress."); break;}

	}//for

	//System.out.println(ix0);


	try {
	BufferedWriter out;
   	if(outputcsv){out = new BufferedWriter(new FileWriter("XMX.CSV"));}
	else{out = new BufferedWriter(new FileWriter("LSF.CSV"));}

	for(int xloopx0 = 0; xloopx0 < ix0; xloopx0++){//********
        buttonl[4].setText("Printing: " + (xloopx0 + 1));
        out.write(compresser[xloopx0]);
        out.newLine();
	}//for

        out.close();
        }catch (IOException e){}
	}//combinex











//how many times should the given cryteria be searched for on each page. 
	public void cuttypex(){

	if(cuttype == 1){cuttype = 2; cb0.setText("CutType(" + cuttype + ")");}
	else if(cuttype == 2){cuttype = 3; cb0.setText("CutType(" + cuttype + ")");}
	else if(cuttype == 3){cuttype = 4; cb0.setText("CutType(" + cuttype + ")");}
	else if(cuttype == 4){cuttype = 5; cb0.setText("CutType(" + cuttype + ")");}
	else if(cuttype == 5){cuttype = 10; cb0.setText("CutType(" + cuttype + ")");}
	else if(cuttype == 10){cuttype = runs1; cb0.setText("CutType(all)");}
	else if(cuttype == runs1){cuttype = 1; cb0.setText("CutType(" + cuttype + ")");}
	else{cuttype = 1; cb0.setText("CutType(" + cuttype + ")");}

	t1.setText("How many of the given items should be screaped each pass?");

	}//cuttypex







//change incomming pages text to lower case. 
	public void tolowercasex(){
	if(to_lower_caseb){

	cb2.setText("toLowerCase(off)");
	to_lower_caseb = false;
	
	}//if
	else{//***

	cb2.setText("toLowerCase(on)");
	to_lower_caseb = true;

	}//else
	t1.setText("toLowerCase(on) converts all incoming scraping pages to lower case. If (off) incomming page data will contain both lower case and upper case characters.");
	}//tolowercase








//change sleep number up.
	public void changesleep(){

	if(sleepx == 0){sleepx = 1; cb5.setText("Sleep(1s)");}
	else if(sleepx == 1){sleepx = 2; cb5.setText("Sleep(2s)");}
	else if(sleepx == 2){sleepx = 3; cb5.setText("Sleep(3s)");}
	else if(sleepx == 3){sleepx = 4; cb5.setText("Sleep(4s)");}
	else if(sleepx == 4){sleepx = 5; cb5.setText("Sleep(5s)");}
	else if(sleepx == 5){sleepx = 0; cb5.setText("Sleep(0s)");}
	else{sleepx = 0; cb5.setText("Sleep(0s)");}

	t1.setText("Set a sleep time between each scrape.");

	}//changesleep







//open the replace program. 
	public void view_csv_file(){

	showinfox2();
	replace rxp = new replace();

	}//view



//open the cfa program. 
	//public void view_csv_file(){

	//showinfox3();
	//cfa rxc = new cfa();

	//}//view





//info text***************************************************************************
//info text***************************************************************************



	public void showexamplex(){

	testfx[0].setText("   <*image*>          Note: title               find1: <div>              0            find2: </div>             0");

	}//show example






	public void showinfox0(){

	cx0 = blank;

	cx0 = cx0 + "Link scraping. This section of the program is designed to gather links to individual web pages. Which then can be scraped in unison to harvest all content from a large website.\n";
	cx0 = cx0 + "Once you have gathered all the links on a website. You can scrape them all by switching to the Output(CSV) section and pressing Scrape LSF.\n";
	cx0 = cx0 + "The Link List \"LSF.CSV\" is a CSV file of all the pages you want to scrape. For example a website's product list.\n";
	cx0 = cx0 + "Before you can scrape all the content you want, you must build the Link List by either scraping the links, by building a list using the Create Link List fields, or by adding them one by one in the URL text field and pressing \"Add.\"\n";
	cx0 = cx0 + "\n\n";
	cx0 = cx0 + "Below is the 1 scraping field you can use to scrape links from a web site. The green fields are for optional notes that could be carried over to the CSV later. For example: if you entered US or UK into the fields you could then insert that text later into the CSV by using this <*sk2*> or <*sk3*>.\n";
	cx0 = cx0 + "All links that are scraped are saved in LSF files.";
	cx0 = cx0 + "\n\n";

	t1.setText(cx0);

	}//showinfox1







	public void showinfox1(){

	cx0 = blank;

	cx0 = cx0 + "Scrape Content. This section of the program is for scraping content off web pages. If you use the URL field at the top you can scrape 1 page. If you've built a Link List you can scrape all web pages in that list by pressing \"Scrape LSF\"\n";
	cx0 = cx0 + "To scrape links switch to Output(LSF).\n\n";
	cx0 = cx0 + "Choose a web page you want to scrape.\n";
	cx0 = cx0 + "Put the URL in the very top text field and press GO.\n";
	cx0 = cx0 + "the web page will be shown as text in this large text box. Choose a section you want to scrape by looking through the text or use another program.\n";
	cx0 = cx0 + "After you know what you want to scrape, use the 12 scraping sections located in the middle of the program to harvest the data. ";
	cx0 = cx0 + "Each of the 12 scraping sections have 6 text fields which need to be defined. Here are their requirements.\n\n";
	cx0 = cx0 + "Program codes go in the first field. Below are the program codes that can be used. This is not required for simple scraping.\n";
	cx0 = cx0 + "<*sk*> = Example. No value. \n";
	cx0 = cx0 + "<*url*> = Get the URL of this page. \n";
	cx0 = cx0 + "<*page*> = Save the full page to an output file. \n";
	cx0 = cx0 + "<*image*> = Gets this URLs image and saves it's current name. \n";
	cx0 = cx0 + "<*image*1*> = Gets this URLs image and saves it's name as an increasing integer. 1,2,3,4... \n";
	cx0 = cx0 + "<*save*> = Saves this scraping field's content as the name for <*image*2*>\n";
	cx0 = cx0 + "<*image*2*> = Uses the info in <*save*> for the name of this image.\n";
	cx0 = cx0 + "<*last*> = LastIndexOf \n";
	cx0 = cx0 + "<*sk0*> - <*sk2*> = Enter info from LinkList";
	cx0 = cx0 + "\n\n";
	cx0 = cx0 + "The second field: \"name:\" is a NOTE field for optional information that will be inserted before the scraped content.\n";
	cx0 = cx0 + "Example: \"name:\" <your scraped content>. You cannot use this field for images, or the image URL will be changed and the program won't find the image.";
	cx0 = cx0 + "\n\n";
	cx0 = cx0 + "The 3rd text field: \"find1\" is the first search field, which is used to find the text on the website you want to scrape.\n";
	cx0 = cx0 + "Example: \"<div>\" will find the first <div> on the page.";
	cx0 = cx0 + "\n\n";
	cx0 = cx0 + "The 4th text field which is small: \"0\" is a number field, which tells the program how far over to the left or right to go before saving data.\n";
	cx0 = cx0 + "Example: A \"5\" will move the start position from here: *<div>hi</div> to here: <div>*hi</div>";
	cx0 = cx0 + "\n\n";
	cx0 = cx0 + "The 5th text field: \"find2\" is the second search field which tells the program when to stop scraping.\n";
	cx0 = cx0 + "Example: \"</div>\" in this field will stop the scrape as soon as it finds that text.";
	cx0 = cx0 + "\n\n";
	cx0 = cx0 + "The 6th text field: \"0\" is the same as the 4th it moves the scraped string left or right to remove unneeded content.\n";
	cx0 = cx0 + "Example: A \"-1\" in this field will move the string from here: <div>hi</div>* to here <div>hi<div*>";
	cx0 = cx0 + "\n\n";
	cx0 = cx0 + "If we wanted to take this line of text: \"Hi there\" from this HTML section: <div>Hi there</div> the set up would look like this: \"[  ] [  ] [<div>    ][5] [</div>   ][0]";
	cx0 = cx0 + "\n\n";
	cx0 = cx0 + "Press Test, then Cut, Print, Compress. And your scraped content will be printed to XMX.CSV. You can then use the Java Replace tool to clean up the content.";
	cx0 = cx0 + "\n\n";

	t1.setText(cx0);

	}//showinfox1








	public void showinfox2(){

	cx0 = blank;

	cx0 = cx0 + "This Advanced Replace tool has features which will help you clean up your scraped content.\n\n";
	cx0 = cx0 + "When you first use the tool it will make a new file called XMXR.CSV to work with. If you discover you have a problem delete your XMXR.CSV file and start over.\n\n";
	cx0 = cx0 + "Press CSV Cleanup to replace the program <*,*> separators with , and , with .\n\n";
	cx0 = cx0 + "After the CSV Cleanup, your file should be in a clean viewable form. Then you can use the Java Replace tools on the right to refine it.\n\n";
	cx0 = cx0 + "Load. This allows you to load any file. XMXR will be loaded automatically.\n\n";
	cx0 = cx0 + "Replace. This will replace any line of text with the line of text in Section B.\n\n";
	cx0 = cx0 + "Delete. This tool will delete any content that is between Section A and B. Example: if section A has < and B has > all HTML content will be deleted.\n\n";
	cx0 = cx0 + "Contains. This button allows you to delete any row that contains Section A's content. Or doesn't contains Sections B's content.\n\n";
	cx0 = cx0 + "Number. The text string between A,B will be deleted. If A = 0 and B = 1 the first letter of the row will be deleted.\n\n";
	cx0 = cx0 + "Switch. After you make an edit by using one of the tools, a new file will be created called XMXout.CSV. If you like the result, push Switch to change it to XMXR.CSV. If you made a mistake do not push Switch and just try again.";
	cx0 = cx0 + "\n\n";

	t1.setText(cx0);

	}//showinfox2






	public void showinfox3(){

	cx0 = blank;

	cx0 = cx0 + "This link building tool creates a Link List of increasing page numbers.\n";
	cx0 = cx0 + "The first field is for the URL: http://www.this.com/page-\n";
	cx0 = cx0 + "The second field is for the page frequency: 1,2,3, 5,10,15.\n";
	cx0 = cx0 + "The 3rd field is for the end part of the URL: .html\n";
	cx0 = cx0 + "And the last field is for the number of links to be generated.";
	cx0 = cx0 + "\n\n";

	t1.setText(cx0);

	}//showinfox2



//info text end***************************************************************************
//info text end***************************************************************************








//Button cb6
//change output from CSV to LSF.
	public void outputx(){

	if(cb6.getText().equals("Output(LSF)")){outputcsv = true; cb6.setText("Output(CSV)");}
	else{outputcsv = false; cb6.setText("Output(LSF)");}

	setoutputx();
	}//outputx**************

	public void setoutputx(){//***********************************************************

	if(outputcsv){
	showinfox1();

	cuttype = 1; cb0.setText("CutType(" + cuttype + ")");

	for(int xloopx0 = 0; xloopx0 < 12; xloopx0++){//****************************
	f_xf_x[xloopx0][0].setEditable(true);
	f_xf_x[xloopx0][0].setBackground(blackx);
	f_xf_x[xloopx0][1].setEditable(true);
	f_xf_x[xloopx0][1].setBackground(lightgreenx);
	f_xf_x[xloopx0][2].setEditable(true);
	f_xf_x[xloopx0][2].setBackground(xblue);
	f_xf_x[xloopx0][3].setEditable(true);
	f_xf_x[xloopx0][3].setBackground(blackx);
	f_xf_x[xloopx0][4].setEditable(true);
	f_xf_x[xloopx0][4].setBackground(xblue);
	f_xf_x[xloopx0][5].setEditable(true);
	f_xf_x[xloopx0][5].setBackground(blackx);
	}//for**************************************************************

	if(linklist[0].length() > 0){MHTF.setText(linklist[0]);}
	else{MHTF.setText(switchHTML[0]);}

	searchtop[0].setText(switchPRECUT[0][1]);
	searchtop[1].setText(switchPRECUT[1][1]);

	for(int xloopx0 = 0; xloopx0 < cutnumber; xloopx0++){//*****************************	
	for(int xloopx1 = 0; xloopx1 < 6; xloopx1++){//*****************************	
	f_xf_x[xloopx0][xloopx1].setText(switchSCAPE[xloopx0][xloopx1][1]);
	}//for
	}//for

	for(int xloopx0 = 0; xloopx0 < 12; xloopx0++){//*************
	testfx[xloopx0].setText("Status: Test.");
	}//for**********************************************

	}//if********
	else{//******

	cuttype = runs1; cb0.setText("CutType(all)");

	showinfox0();
	//cuttype = runs1;
	//cb0.setText("CutType(all)");

	for(int xloopx0 = 1; xloopx0 < 12; xloopx0++){//****************************
	 f_xf_x[xloopx0][0].setEditable(false);
	 f_xf_x[xloopx0][0].setBackground(darkgray08);
	 f_xf_x[xloopx0][1].setEditable(false);
	 f_xf_x[xloopx0][1].setBackground(darkgray08);
	 f_xf_x[xloopx0][2].setEditable(false);
	 f_xf_x[xloopx0][2].setBackground(darkgray08);
	 f_xf_x[xloopx0][3].setEditable(false);
	 f_xf_x[xloopx0][3].setBackground(darkgray08);
	 f_xf_x[xloopx0][4].setEditable(false);
	 f_xf_x[xloopx0][4].setBackground(darkgray08);
	 f_xf_x[xloopx0][5].setEditable(false);
	 f_xf_x[xloopx0][5].setBackground(darkgray08);
	}//for**************************************************************

	MHTF.setText(switchHTML[0]);
	searchtop[0].setText(switchPRECUT[0][0]);
	searchtop[1].setText(switchPRECUT[1][0]);

	for(int xloopx0 = 0; xloopx0 < cutnumber; xloopx0++){//*****************************	
	for(int xloopx1 = 0; xloopx1 < 6; xloopx1++){//*****************************	
	 f_xf_x[xloopx0][xloopx1].setText(switchSCAPE[xloopx0][xloopx1][0]);
	}//for
	}//for

	for(int xloopx0 = 1; xloopx0 < 12; xloopx0++){//****************************
	 //f_xf_x[xloopx0][0].setText("");
	 f_xf_x[xloopx0][1].setText("");
	 f_xf_x[xloopx0][2].setText("");
	 f_xf_x[xloopx0][3].setText("");
	 f_xf_x[xloopx0][4].setText("");
	 f_xf_x[xloopx0][5].setText("");
	}//for**************************************************************

	testfx[1].setText("Use this green field to enter an optional NOTE for the next stage. <*sk1*>");
	 f_xf_x[1][0].setEditable(true);
	 f_xf_x[1][1].setEditable(true);
	 f_xf_x[1][1].setBackground(lightgreenx);
	 f_xf_x[1][1].setText(switchSCAPE[1][1][0]);

	testfx[2].setText("Use this green field to enter an optional NOTE for the next stage. <*sk2*>");
	 f_xf_x[2][0].setEditable(true);
	 f_xf_x[2][1].setEditable(true);
	 f_xf_x[2][1].setBackground(lightgreenx);
	 f_xf_x[2][1].setText(switchSCAPE[2][1][0]);

	for(int xloopx0 = 3; xloopx0 < 12; xloopx0++){//********
	testfx[xloopx0].setText("");
	}//for*****************************************

	}//else

	if(linknumber2 > runs1){
	buttonl[5].setText("!Links > 10,000");
	t1.setText("!Link number exceeds 10,000! " + linknumber2 + " If you continue with this scrape the linklist will be cut down to 10,000 items. Please open the LSF.CSV file and edit it down to under 10,000 items per scrape.");
	}//if

	}//setoutputx





//button controls*****************************************************************************************
//button controls*****************************************************************************************
//button controls*****************************************************************************************
//button controls*****************************************************************************************





//handel all the button clicks. 
public void actionPerformed(ActionEvent event){

        //requestFocus();
	if (event.getSource() == bx0 && workx == true){gox();}//scrapex();
	if (event.getSource() == bx1 && workx == true){add_to_lsf();}
	if (event.getSource() == bx2 && workx == true){makell();}

	if (event.getSource() == b1 && workx == true){precut(); testcutx();}
	if (event.getSource() == b2 && workx == true){cutx();}
	if (event.getSource() == b3 && workx == true){pagenumberx++; printx();}
	if (event.getSource() == b4 && workx == true){combinex();}
	if (event.getSource() == b5 && workx == true){txx();}

	if (event.getSource() == cb0 && workx == true){cuttypex(); savex();}
	if (event.getSource() == cb1 && workx == true){savex(); t1.setText("Save current Vulture settings.");}
	if (event.getSource() == cb2 && workx == true){tolowercasex(); savex();}//tolowercase
	if (event.getSource() == cb3 && workx == true){showexamplex();}
	if (event.getSource() == cb4 && workx == true){view_csv_file();}
	if (event.getSource() == cb5 && workx == true){changesleep(); savex();}
	if (event.getSource() == cb6 && workx == true){outputx();}
	if (event.getSource() == cb7 && workx == true){loadll(); t1.setText("Load the LSF link list.");}

	if (event.getSource() == bkey){inpsutkgcd();}

}//actionPerformed	



//program sleep 
	public void tabxx(){

	buttonl[6].setText("Status: sleeping.");
	try{
	Thread.sleep(sleepx * 1000);
	}catch (InterruptedException e){}
	}//tabxx




    public static void main(String[] args) {

    scraper2 goscrapex = new scraper2();

    }//main






class BackgroundPanel extends JPanel{
  Image image;
  public BackgroundPanel(){
    try{

      image = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("images/fantasy.jpg"), "fantasy.jpg"));

    }catch (Exception e) { System.out.println("Failed001"); }
  }//backgroundpanel

  protected void paintComponent(Graphics g){
    super.paintComponent(g); 
    if (image != null)
      g.drawImage(image, 0,0,this.getWidth(),this.getHeight(),this);
  }//paint
}//jpanel




}//last*******