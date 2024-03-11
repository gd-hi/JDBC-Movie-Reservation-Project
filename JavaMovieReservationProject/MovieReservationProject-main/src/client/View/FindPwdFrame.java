package client.View;

import javax.swing.*;

import client.DAO.CustomerDAO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class FindPwdFrame extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JTextField id;
    private JTextField name;
    private JTextField email;
    private JButton findPwButton;

    private CustomerDAO customerDAO = CustomerDAO.getInstance();

    private JDialog dialog1 = new JDialog(this, "비밀번호 찾기", true);

    private JDialog dialog2 = new JDialog(this, "비밀번호 찾기", true);

    public FindPwdFrame() throws SQLException {
        buildGUI();
        setEvent();
        setDialog();
    }

    public void setEvent() {
        findPwButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        customerDAO.connect();
        System.out.println("PW 찾기");
        try{
            if(name.getText().trim().equals(customerDAO.findByName(name.getText().trim()))
                    && email.getText().trim().equals(customerDAO.findByEmail(email.getText().trim()))
                    && id.getText().trim().equals(customerDAO.findById(name.getText(), email.getText()))){
                System.out.println("PW 찾기 성공");
                System.out.println("PW : " + customerDAO.findByPw(name.getText(), email.getText(), id.getText()));

                JDialog dialog3 = new JDialog(this, "비밀번호 찾기", true);
                String text = customerDAO.findByPw(name.getText(), email.getText(), id.getText());
                JLabel text3 = new JLabel("PW : " + text);
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
                System.out.println("PW 찾기 실패");
                dispose();
                dialog2.setVisible(true);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    private void setDialog(){
        JLabel text1 = new JLabel("입력하신 정보와 일치한 PW를 찾았습니다.");
        JLabel text2 = new JLabel("입력하신 정보와 일치한 PW를 찾을 수 없습니다.");
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

    public void buildGUI(){
        getContentPane().setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
        setTitle("비밀번호 찾기");
        setSize(303, 220);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // 화면 가운데 출력시키기
        setResizable(false); // 함부로 크기를 변경하지 않게.
        getContentPane().setLayout(null);
        setVisible(true);


        JLabel lblNewLabel_id = new JLabel("\uC544\uC774\uB514");
        lblNewLabel_id.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
        lblNewLabel_id.setBounds(27, 60, 57, 15);
        getContentPane().add(lblNewLabel_id);
        JLabel lblNewLabel_name = new JLabel("\uC774\uB984");
        lblNewLabel_name.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
        lblNewLabel_name.setBounds(27, 30, 57, 15);
        getContentPane().add(lblNewLabel_name);
        JLabel lblNewLabel_email = new JLabel("\uC774\uBA54\uC77C");
        lblNewLabel_email.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
        lblNewLabel_email.setBounds(27, 90, 57, 15);
        getContentPane().add(lblNewLabel_email);
        JLabel lblNewLabel_findId = new JLabel("\ube44\ubc00\ubc88\ud638\u0020\ucc3e\uae30");
        lblNewLabel_findId.setFont(new Font("휴먼엑스포", Font.PLAIN, 16));
        lblNewLabel_findId.setBounds(100, 5, 153, 25);
        getContentPane().add(lblNewLabel_findId);

        id = new JTextField();
        id.setColumns(10);
        id.setBounds(135, 60, 137, 21);
        getContentPane().add(id);

        email = new JTextField();
        email.setColumns(10);
        email.setBounds(135, 90, 137, 21);
        getContentPane().add(email);

        name = new JTextField();
        name.setBounds(135, 30, 137, 21);
        getContentPane().add(name);
        name.setColumns(10);

        findPwButton = new JButton("\ucc3e\uae30");
        findPwButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        findPwButton.setBackground(Color.WHITE);
        findPwButton.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
        findPwButton.setBounds(80, 120, 137, 43);
        getContentPane().add(findPwButton);
    }

}