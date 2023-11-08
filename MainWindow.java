package MainWindow;
import javax.swing.*;

import java.awt.*;
public class MainWindow extends JFrame {
	JTextField nameText,jobText;
	JLabel titlea,name,job;
	Box BaseBox,box1,box2,box3,box4,box5,box6,box7,box8;
	JButton information;
	JTextArea imageArea,informationArea;
	JScrollPane linescroll;
	MainWindow()
	{}
	MainWindow(String title,int x,int y,int width,int height)
	{
		//创建
		
		this.setLayout(new FlowLayout());
		titlea=new JLabel("人事资源管理系统");
		name=new JLabel("姓名");
		job=new JLabel("职位");
		information=new JButton("详细信息");
		nameText=new JTextField(1);
		jobText=new JTextField(1);
		imageArea=new JTextArea(10,10);
		informationArea=new JTextArea(20,20);
		linescroll=new JScrollPane(new JTextArea(25,40));
		Font font =new Font("仿宋",Font.PLAIN,24);		//标题字体大小
		titlea.setFont(font);
		box1=Box.createHorizontalBox();
		box1.add(titlea);													
		box1.add(Box.createVerticalStrut(50));
		
		box2=Box.createVerticalBox();		//左侧单列表
		box2.add(linescroll);
		
		box3=Box.createVerticalBox();//姓名和职位的的盒子
		box3.add(name);
		box3.add(nameText);
		box3.add(job);
		box3.add(jobText);
		
		box4=Box.createVerticalBox();//图像的框（用的文本框代替的）
		box4.add(imageArea);
		
		box5=Box.createVerticalBox();	//按钮（详细信息）
		box5.add(information);
		
		box6=Box.createHorizontalBox();	//右上角的盒子（姓名和图像的盒子）
		box6.add(box4);
		box6.add(Box.createHorizontalStrut(10));
		box6.add(box3);
		
		box7=Box.createVerticalBox();		
		box7.add(box6);
		box7.add(Box.createVerticalStrut(10));
		box7.add(box5);
		
		box8=Box.createVerticalBox();
		box8.add(box7);
		box8.add(Box.createHorizontalStrut(20));
		box8.add(Box.createVerticalStrut(10));
		box8.add(informationArea);
		
		BaseBox=Box.createHorizontalBox();//总体的大盒子
		BaseBox.add(box2);
		BaseBox.add(Box.createHorizontalStrut(15));
		BaseBox.add(box8);
		
		this.add(box1);//标题	
		this.add(BaseBox);//剩余整体
		
		
		this.setTitle(title);
		this.setBounds(x, y, width, height);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
}
