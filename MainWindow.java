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
		//����
		
		this.setLayout(new FlowLayout());
		titlea=new JLabel("������Դ����ϵͳ");
		name=new JLabel("����");
		job=new JLabel("ְλ");
		information=new JButton("��ϸ��Ϣ");
		nameText=new JTextField(1);
		jobText=new JTextField(1);
		imageArea=new JTextArea(10,10);
		informationArea=new JTextArea(20,20);
		linescroll=new JScrollPane(new JTextArea(25,40));
		Font font =new Font("����",Font.PLAIN,24);		//���������С
		titlea.setFont(font);
		box1=Box.createHorizontalBox();
		box1.add(titlea);													
		box1.add(Box.createVerticalStrut(50));
		
		box2=Box.createVerticalBox();		//��൥�б�
		box2.add(linescroll);
		
		box3=Box.createVerticalBox();//������ְλ�ĵĺ���
		box3.add(name);
		box3.add(nameText);
		box3.add(job);
		box3.add(jobText);
		
		box4=Box.createVerticalBox();//ͼ��Ŀ��õ��ı������ģ�
		box4.add(imageArea);
		
		box5=Box.createVerticalBox();	//��ť����ϸ��Ϣ��
		box5.add(information);
		
		box6=Box.createHorizontalBox();	//���Ͻǵĺ��ӣ�������ͼ��ĺ��ӣ�
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
		
		BaseBox=Box.createHorizontalBox();//����Ĵ����
		BaseBox.add(box2);
		BaseBox.add(Box.createHorizontalStrut(15));
		BaseBox.add(box8);
		
		this.add(box1);//����	
		this.add(BaseBox);//ʣ������
		
		
		this.setTitle(title);
		this.setBounds(x, y, width, height);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
}
