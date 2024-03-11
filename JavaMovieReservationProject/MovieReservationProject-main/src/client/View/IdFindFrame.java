package client.View;

import javax.swing.*;

import client.DAO.CustomerDAO;
import client.VO.CustomerVO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class IdFindFrame extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JTextField email;
    private JTextField name;
    private JButton findIdButton;

    private CustomerDAO customerDao = CustomerDAO.getInstance();
    private CustomerVO customer;

    private JDialog dialog1 = new JDialog(this, "아이디 찾기", true);

    private JDialog dialog2 = new JDialog(this, "아이디 찾기", true);

    public IdFindFrame() throws SQLException {
        buildGUI();
        setEvent();
        setDialog();
    }

    public void setEvent() {
        findIdButton.addActionListener(this);
    }

    public void clear() {
        name.setText("");
        email.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e){
        customerDao.connect();
        System.out.println("ID 찾기");

        try {
            if(name.getText().trim().equals(customerDao.findByName(name.getText().trim()))
                    && email.getText().trim().equals(customerDao.findByEmail(email.getText().trim()))){
                System.out.println("ID 찾기 성공");
                System.out.println("ID : " + customerDao.findById(name.getText(), email.getText()));

                JDialog dialog3 = new JDialog(this, "아이디 찾기", true);
                String text = customerDao.findById(name.getText(), email.getText());
                JLabel text3 = new JLabel("ID : " + text);
                text3.setHorizontalAlignment(SwingConstants.CENTER);

                dialog3.getContentPane().setLayout(new BorderLayout(3, 3));
                text3.setFont(new Font("Serif", Font.BOLD, 14));
                dialog3.getContentPane().add(text3, BorderLayout.CENTER);
                dialog3.setResizable(false);
                dialog3.setSize(400, 200);

                dispose();
                dialog1.setVisible(true);
                dialog3.setVisible(true);
            }
            else {
                System.out.println("ID 찾기 실패");
                dispose();
                dialog2.setVisible(true);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // 다이알로그 구성
    private void setDialog() throws SQLException {
        JLabel text1 = new JLabel("입력하신 정보와 일치한 ID를 찾았습니다.");
        JLabel text2 = new JLabel("입력하신 정보와 일치한 ID를 찾을 수 없습니다.");
        text1.setHorizontalAlignment(SwingConstants.CENTER);
        text2.setHorizontalAlignment(SwingConstants.CENTER);

        Point pt = getLocation();
        Dimension my = getSize();
        Dimension dsize = dialog1.getSize();
        int x = (int) pt.getX() + my.width / 2 - dsize.width / 2;
        int y = (int) pt.getY() + my.height / 2 - dsize.height / 2;

        dialog1.setLocation(x, y);
        dialog2.setLocation(x, y);

        dialog1.getContentPane().setLayout(new BorderLayout(3, 3));
        text1.setFont(new Font("Serif", Font.BOLD, 14));
        dialog1.getContentPane().add(text1, BorderLayout.CENTER);
        dialog1.setResizable(false);
        dialog1.setSize(400, 200);

        text2.setFont(new Font("Serif", Font.BOLD, 14));
        dialog2.getContentPane().add(text2, BorderLayout.CENTER);
        dialog2.setResizable(false);
        dialog2.setSize(400, 200);

    }

    public void buildGUI() {
        getContentPane().setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
        setTitle("아이디 찾기");
        setSize(303, 180);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // 화면 가운데 출력시키기
        setResizable(false); // 함부로 크기를 변경하지 않게.
        getContentPane().setLayout(null);
        setVisible(true);

        JLabel lblNewLabel_name = new JLabel("\uC774\uB984");
        lblNewLabel_name.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
        lblNewLabel_name.setBounds(27, 30, 57, 15);
        getContentPane().add(lblNewLabel_name);
        JLabel lblNewLabel_email = new JLabel("\uC774\uBA54\uC77C");
        lblNewLabel_email.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
        lblNewLabel_email.setBounds(27, 60, 57, 15);
        getContentPane().add(lblNewLabel_email);
        JLabel lblNewLabel_findId = new JLabel("\uc544\uc774\ub514\u0020\ucc3e\uae30");
        lblNewLabel_findId.setFont(new Font("휴먼엑스포", Font.PLAIN, 16));
        lblNewLabel_findId.setBounds(100, 5, 153, 25);
        getContentPane().add(lblNewLabel_findId);

        email = new JTextField();
        email.setColumns(10);
        email.setBounds(135, 60, 137, 21);
        getContentPane().add(email);

        name = new JTextField();
        name.setBounds(135, 30, 137, 21);
        getContentPane().add(name);
        name.setColumns(10);

        findIdButton = new JButton("\ucc3e\uae30");
        findIdButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        findIdButton.setBackground(Color.WHITE);
        findIdButton.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
        findIdButton.setBounds(80, 90, 137, 43);
        getContentPane().add(findIdButton);
    }

}