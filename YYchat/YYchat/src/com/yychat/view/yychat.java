/**
 * 
 */
/**
 * @author ASUS
 *
 */
package com.yychat.view;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class yychat extends JFrame{//������yychat ģ�壬�����ģ��
	
	JLabel jlbl1;//�����ǩ,����ͼƬ
	
	//�����в����
	JTabbedPane jtp1;//ѡ�
	JPanel jp2,jp3,jp4;
	//ѡ����
	JLabel jlbl2,jlbl3,jlbl4,jlbl5;
	JTextField jtf1;
	JPasswordField jpf1;
	JButton jb4;
	JCheckBox jcb1,jcb2;
	
	//�����ϲ����
	JButton jb1,jb2,jb3;
	JPanel jp1;//���,����
	
	
	public yychat (){//���췽��
		
		//�����������
		jlbl1=new JLabel(new ImageIcon("images/tou.gif"));//��ǩ���
		this.add(jlbl1,"North");
		
		//�����в����
		jtp1=new JTabbedPane();
		jp2=new JPanel();jp3=new JPanel();jp4=new JPanel();//3��ѡ�
		
		
		//�в������ѡ�һ��
		jp2=new JPanel(new GridLayout(3,3));//���ֵ�����
		jlbl2=new JLabel("YY����");
		jlbl3=new JLabel("YY����");
		jlbl4=new JLabel("��������");
		jlbl5=new JLabel("�������뱣��");
		jb4=new JButton (new ImageIcon("images/clear.gif"));
		jcb1=new JCheckBox("�����½");
		jcb2=new JCheckBox("��ס����");
		jtf1=new JTextField("������YY����");
		jpf1=new JPasswordField ("����������");
		//���һ����
		jp2.add(jlbl2);jp2.add(jtf1);jp2.add(jb4);
		jp2.add(jlbl3);jp2.add(jpf1);jp2.add(jlbl4);
		jp2.add(jcb1);jp2.add(jcb2);jp2.add(jlbl5);
		
		jtp1.add(jp2,"YY����");jtp1.add(jp3,"�ֻ�����");jtp1.add(jp4,"��������");
		this.add(jtp1);
		
		//�����ϲ����
		jb1=new JButton(new ImageIcon("images/denglu.gif"));
		jb2=new JButton(new ImageIcon("images/zhuce.gif"));
		jb3=new JButton(new ImageIcon("images/quxiao.gif"));
		
		//�������1
		jp1=new JPanel();
		jp1.add(jb1);jp1.add(jb2);jp1.add(jb3);
		this.add(jp1,"South");
		
		this.setSize(350,240); //���ô��ڴ�С
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		yychat yychat=new yychat();
	}
}