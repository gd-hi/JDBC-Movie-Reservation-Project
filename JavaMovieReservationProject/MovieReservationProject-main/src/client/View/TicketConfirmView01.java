package client.View;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import client.DAO.CustomerDAO;
import client.DAO.TicketDAO;
import client.VO.CustomerVO;
import client.VO.TicketVO;

import java.awt.Font;

import java.awt.Color;

public class TicketConfirmView01 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	// DAO
	private CustomerDAO customerDao = CustomerDAO.getInstance();
	private TicketDAO ticketDao = TicketDAO.getInstance();

	// VO
	private TicketVO ticket;
	private ArrayList<TicketVO> tickets;

	private JPanel panel = new JPanel();
	private JLabel lblNewLabel = new JLabel("\uC608\uB9E4 \uB0B4\uC5ED");

	private JTable table;

	private int count;
	private JPanel panel_1 = new JPanel();
	private JButton btnNewButton = new JButton("\uB4A4\uB85C \uAC00\uAE30");
	private JLabel sizeLabel = new JLabel("-");
	// 생성자
	public TicketConfirmView01(TicketVO ticket) {
		this.ticket = ticket;
		buildGUI();
		setEvent();
		setInfo();
	}

	public void setEvent() {
		btnNewButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			dispose();
		}
	}

	public void setInfo() {
		tickets = ticketDao.selectList(ticket.getCustomerId());
		sizeLabel.setText(Integer.toString(tickets.size())+"건 검색됨");
		// table 내용 넣기.
		// 티켓 갯수.
		for (int i = 0; i < tickets.size(); i++) {
			TicketVO ticket = tickets.get(i);
			String movieName = ticket.getMovieName();
			String theatherName = ticket.getTheatherName();
			String roomNumber = ticket.getRoomNumber();
			String seatNumber = ticket.getSeatNumber();
			String day = ticket.getDay();
			String time = Integer.toString(ticket.getTime()) + " 회차";

			JLabel label1 = new JLabel(movieName);
			label1.setBounds(10, (60 + (i * 30)), 100, 15);
			panel_1.add(label1);

			JLabel label2 = new JLabel(theatherName);
			label2.setBounds(110, (60 + (i * 30)), 100, 15);
			panel_1.add(label2);

			JLabel label3 = new JLabel(roomNumber);
			label3.setBounds(210, (60 + (i * 30)), 100, 15);
			panel_1.add(label3);

			JLabel label4 = new JLabel(seatNumber);
			label4.setBounds(310, (60 + (i * 30)), 100, 15);
			panel_1.add(label4);

			JLabel label5 = new JLabel(day);
			label5.setBounds(410, (60 + (i * 30)), 100, 15);
			panel_1.add(label5);

			JLabel label6 = new JLabel(time);
			label6.setBounds(510, (60 + (i * 30)), 100, 15);
			panel_1.add(label6);

			JButton btn = new JButton("예매 내역 출력"); //action리스너를 여기에 달아야됨.
			btn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			btn.setBackground(Color.WHITE);
			btn.setBounds(610, (60 + (i * 30)), 130, 15);
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ReceiptView receipt = new ReceiptView(ticket);
				}
			});
			panel_1.add(btn);
		}
	}

	// GUI생성
	public void buildGUI() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage(this.getClass().getResource("images/favicon.PNG"));
		setIconImage(img);
		setTitle("예매 내역 확인");
		setSize(818, 612);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null); // 화면 가운데 출력시키기
		setResizable(false);
		setVisible(true);
		getContentPane().setLayout(null);

		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 812, 583);
		getContentPane().add(panel);
		panel.setLayout(null);

		lblNewLabel.setText("'" + ticket.getCustomerName() + "' 님의  예매 현황");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("휴먼엑스포", Font.PLAIN, 21));
		lblNewLabel.setBounds(22, 10, 596, 56);
		panel.add(lblNewLabel);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(12, 67, 776, 506);

		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("\uC601\uD654");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 59, 31);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("휴먼엑스포", Font.PLAIN, 15));

		JLabel lblNewLabel_2 = new JLabel("\uC601\uD654\uAD00");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("휴먼엑스포", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(110, 10, 59, 31);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\uAD00");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("휴먼엑스포", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(210, 10, 59, 31);
		panel_1.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("\uC88C\uC11D\uBC88\uD638");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("휴먼엑스포", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(310, 10, 83, 31);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("\uB0A0\uC9DC");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("휴먼엑스포", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(410, 10, 83, 31);
		panel_1.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("회차");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("휴먼엑스포", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(510, 10, 83, 31);
		panel_1.add(lblNewLabel_6);


		btnNewButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("휴먼엑스포", Font.PLAIN, 17));
		btnNewButton.setBounds(630, 20, 158, 40);
		panel.add(btnNewButton);

		sizeLabel.setFont(new Font("휴먼엑스포", Font.PLAIN, 20));
		sizeLabel.setBounds(355, 24, 190, 28);
		panel.add(sizeLabel);
	}
}