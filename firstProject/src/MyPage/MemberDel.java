package MyPage;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import Fav_model.favDAO;
import Login_model.MemberDAO;
import Login_model.MemberDTO;
import Login_view.MainGUI;
import Login_view.UserGUI;

public class MemberDel {

   private JFrame frame;
   private MemberDTO loginMember;
   private JPasswordField pf_delete_pw;
   MemberDAO dao = new MemberDAO();

   /**
    * Launch the application.
    */
//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               MemberDel window = new MemberDel();
//               window.frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }

   /**
    * Create the application.
    */
   public MemberDel(MemberDTO dto) {
      initialize(dto);
      frame.setVisible(true);
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize(MemberDTO dto) {
      frame = new JFrame("ȸ�� Ż��");
      frame.getContentPane().setBackground(SystemColor.text);
      frame.setBounds(100, 100, 450, 230);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      frame.setLocation(500, 400);

      JLabel lblNewLabel = new JLabel("\uD68C \uC6D0 \uD0C8 \uD1F4");
      lblNewLabel.setFont(new Font("����", Font.BOLD, 14));
      lblNewLabel.setBackground(SystemColor.inactiveCaptionBorder);
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(12, 10, 410, 28);
      frame.getContentPane().add(lblNewLabel);

      JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514 : ");
      lblNewLabel_1.setFont(new Font("����", Font.BOLD, 14));
      lblNewLabel_1.setBounds(12, 49, 76, 28);
      frame.getContentPane().add(lblNewLabel_1);

      JLabel label = new JLabel("\uBE44\uBC00\uBC88\uD638 : ");
      label.setFont(new Font("����", Font.BOLD, 14));
      label.setBounds(12, 88, 83, 28);
      frame.getContentPane().add(label);

      JLabel lb_loginId = new JLabel();
      lb_loginId.setBounds(96, 50, 295, 28);
      lb_loginId.setText(MainGUI.tf_main_id.getText());
      frame.getContentPane().add(lb_loginId);

      pf_delete_pw = new JPasswordField();
      pf_delete_pw.setBounds(96, 92, 295, 23);
      frame.getContentPane().add(pf_delete_pw);

      JButton btn_del = new JButton("\uD0C8\uD1F4\uD558\uAE30");
      btn_del.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String pw = pf_delete_pw.getText();
            if (MainGUI.pf_main_pw.getText().equals(pw)) {
            	favDAO fdao = new favDAO();
            	fdao.favorDel(dto.getId());
               int cnt = dao.memberDelete(MainGUI.tf_main_id.getText(), MainGUI.pf_main_pw.getText());
               if (cnt == 0) {
                  JOptionPane.showMessageDialog(null, "ȸ��Ż�� ����", "ȸ��Ż��", JOptionPane.ERROR_MESSAGE);
                  pf_delete_pw.setText("");
               } else {
            	  frame.dispose();
                  
                  JOptionPane.showMessageDialog(null, "ȸ��Ż�� ����");
                  MainGUI mg = new MainGUI();
               }
            } else {
               JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ���� �ʽ��ϴ�.", "ȸ��Ż��", JOptionPane.ERROR_MESSAGE);
               pf_delete_pw.setText("");
            }
         }
      });
      btn_del.setBackground(SystemColor.inactiveCaptionBorder);
      btn_del.setBounds(89, 147, 97, 23);
      frame.getContentPane().add(btn_del);

      JButton btn_close = new JButton("\uB2EB\uAE30");
      btn_close.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            frame.dispose();

            
         }
      });
      btn_close.setBackground(SystemColor.inactiveCaptionBorder);
      btn_close.setBounds(235, 147, 97, 23);
      frame.getContentPane().add(btn_close);
//      
//      JTextArea textArea = new JTextArea();
//      textArea.setBounds(96, 53, 295, 24);
////      textArea.setText(loginMember.getId()); 
//      frame.getContentPane().add(textArea);
   }
}