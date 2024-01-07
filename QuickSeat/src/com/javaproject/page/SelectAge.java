package com.javaproject.page;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.javaproject.base.ShareVar;

public class SelectAge extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	/*
	 * Description : 연령대 선택화면
	 * 				 1.SelectAge에서 연령대 버튼을 터치했을시 MovieSelect 화면으로 이동
	 * 				 2.SelectAge에서 이전 화면 버튼을 터치했을시  SelectMenu 화면으로 이동
	 * Date : 2024.01.05 (금요일)
	 * Author : 박정민,박지환
	 * 
	 *  *  * Update 2024.01.06 by J.park:
	 * 			1. descripton 수정
	 * 			2. kiosk set bound sharevar 에서 가져와 지정
	 * 			3. diaog -> static 
	 * 			4. 배경 추가
	 * 			5. 나이선택,이전화면,연령확인,첫화면 버튼추가
	 */
	
	
	/**
	 * Launch the application.
	 */
	private static SelectMenu SelectAgedialog = new SelectMenu();
	private static SelectMenu selectMenudialog = new SelectMenu();
	private static SelectMovie SelectMoviedialog = new SelectMovie();


	public static void main(String[] args) {
		try {
			SelectAgedialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			SelectAgedialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SelectAge() {
		setTitle("연령 선택");
		setBounds(ShareVar.kiosk_loc_x, 
				  ShareVar.kiosk_loc_y, 
				  ShareVar.kiosk_width, 
				  ShareVar.kiosk_hight);
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
			contentPanel.setLayout(null);
		
			//첫화면 아이콘
			JLabel lbl_pageTitle_1 = new JLabel("첫화면");
			lbl_pageTitle_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					goToSelectMenu();
				}
			});
			lbl_pageTitle_1.setIcon(new ImageIcon(MovieInformation.class.getResource("/com/javaproject/image/첫화면Icon.png")));

			lbl_pageTitle_1.setFont(new Font("배달의민족 도현", Font.PLAIN, 15));
			lbl_pageTitle_1.setBounds(12, 30, 46, 68);
			contentPanel.add(lbl_pageTitle_1);			
			//페이지 타이틀 
			JLabel lbl_pageTitle = new JLabel("연령 선택");
			lbl_pageTitle.setFont(new Font(ShareVar.kiosk_title_font,
			 								Font.PLAIN, 
			 								ShareVar.kiosk_title_font_size));
			 								
			lbl_pageTitle.setBounds(295, 
									10, 
									250,
									100);
			
			contentPanel.add(lbl_pageTitle);
			//나이 버튼
			JLabel BtnUnder10 = new JLabel("");
			BtnUnder10.setIcon(new ImageIcon(MovieInformation.class.getResource("/com/javaproject/image/Btn10대 이하.png")));
			BtnUnder10.setFont(new Font("배달의민족 도현", Font.PLAIN, 40));
			BtnUnder10.setBounds(144, 162, 98, 52);
			contentPanel.add(BtnUnder10);
			
			JLabel Btn20 = new JLabel("");
			Btn20.setIcon(new ImageIcon(MovieInformation.class.getResource("/com/javaproject/image/Btn20대.png")));
			Btn20.setFont(new Font("배달의민족 도현", Font.PLAIN, 40));
			Btn20.setBounds(282, 162, 98, 52);
			contentPanel.add(Btn20);
			
			JLabel Btn30 = new JLabel("");
			Btn30.setIcon(new ImageIcon(MovieInformation.class.getResource("/com/javaproject/image/Btn30대.png")));
			Btn30.setFont(new Font("배달의민족 도현", Font.PLAIN, 40));
			Btn30.setBounds(420, 162, 98, 52);
			contentPanel.add(Btn30);
			
			JLabel Btn40 = new JLabel("");
			Btn40.setIcon(new ImageIcon(MovieInformation.class.getResource("/com/javaproject/image/Btn40대.png")));
			Btn40.setFont(new Font("배달의민족 도현", Font.PLAIN, 40));
			Btn40.setBounds(555, 162, 98, 52);
			contentPanel.add(Btn40);
			
			JLabel Btn50 = new JLabel("");
			Btn50.setIcon(new ImageIcon(MovieInformation.class.getResource("/com/javaproject/image/Btn50대.png")));
			Btn50.setFont(new Font("배달의민족 도현", Font.PLAIN, 40));
			Btn50.setBounds(144, 248, 98, 52);
			contentPanel.add(Btn50);
			
			JLabel Btn60 = new JLabel("");
			Btn60.setIcon(new ImageIcon(MovieInformation.class.getResource("/com/javaproject/image/Btn60대.png")));
			Btn60.setFont(new Font("배달의민족 도현", Font.PLAIN, 40));
			Btn60.setBounds(282, 248, 98, 52);
			contentPanel.add(Btn60);
			
			JLabel Btn70 = new JLabel("");
			Btn70.setIcon(new ImageIcon(MovieInformation.class.getResource("/com/javaproject/image/Btn70대.png")));
			Btn70.setFont(new Font("배달의민족 도현", Font.PLAIN, 40));
			Btn70.setBounds(420, 248, 98, 52);
			contentPanel.add(Btn70);
			
			JLabel BtnOver80 = new JLabel("");
			BtnOver80.setIcon(new ImageIcon(MovieInformation.class.getResource("/com/javaproject/image/Btn80대.png")));
			BtnOver80.setFont(new Font("배달의민족 도현", Font.PLAIN, 40));
			BtnOver80.setBounds(557, 241, 98, 52);
			contentPanel.add(BtnOver80);
			
			JLabel BtnBack = new JLabel("");
			BtnBack.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					goToOrderCancle();
				}
			});
			BtnBack.setIcon(new ImageIcon(MovieInformation.class.getResource("/com/javaproject/image/Btn 이전화면.png")));
			BtnBack.setFont(new Font("배달의민족 도현", Font.PLAIN, 40));
			BtnBack.setBounds(144, 405, 200, 100);
			contentPanel.add(BtnBack);
			
			JLabel BtnageConfirm = new JLabel("");
			BtnageConfirm.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					goToSelectMovie();

				}
			});
			BtnageConfirm.setIcon(new ImageIcon(MovieInformation.class.getResource("/com/javaproject/image/Btn 연령확인.png")));
			BtnageConfirm.setFont(new Font("배달의민족 도현", Font.PLAIN, 40));
			BtnageConfirm.setBounds(456, 405, 200, 100);
			contentPanel.add(BtnageConfirm);
			
			//배경화면
			JLabel lbl_background = new JLabel("",SwingConstants.CENTER);
			lbl_background.setIcon(new ImageIcon(MovieInformation.class.getResource("/com/javaproject/image/[QuickSeat]kiosk_background.png")));
			lbl_background.setBounds(0, 0, 800, 600);
			contentPanel.add(lbl_background);
			
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
	
	
	//첫화면으로 가기
	public void goToSelectMenu() {
		SelectAgedialog.setVisible(false);
		SelectAgedialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		selectMenudialog.setVisible(true);
	}
	//전화면으로 가기
	public void goToOrderCancle() {
		SelectAgedialog.setVisible(false);
		SelectAgedialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		selectMenudialog.setVisible(true);
	}
	//영화선택화면으로 가기
	public void goToSelectMovie() {
		SelectAgedialog.setVisible(false);
		SelectAgedialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		SelectMoviedialog.setVisible(true);
	}
	
}