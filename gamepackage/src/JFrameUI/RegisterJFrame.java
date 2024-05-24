package JFrameUI;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RegisterJFrame extends JFrame implements MouseListener, KeyListener {

    JPasswordField passwordJPasswordField=new JPasswordField();
    JPasswordField secondPasswordJPasswordField=new JPasswordField();
    JTextField codeJTextField=new JTextField();
    String passcode=codeUtil.codeCreat();
    JButton registerJButton=new JButton();
    JButton restartJButton=new JButton();

    //注册界面
    public RegisterJFrame() {
        //初始化界面
        initRegisterJfFame();

        //初始化图片
        initImage();

        //让界面显示出来
        this.setVisible(true);

    }

    private void initImage() {
        //初始化
        this.getContentPane().removeAll();

        //添加注册用户名
        ImageIcon userImage = new ImageIcon("image\\register\\注册用户名.png");
        JLabel userImageJlabel=new JLabel(userImage);
        userImageJlabel.setBounds(116,135-10,userImage.getIconWidth(),userImage.getIconHeight());
        this.getContentPane().add(userImageJlabel);

        //添加密码图片
        ImageIcon passwordImage=new ImageIcon("image\\register\\注册密码.png");
        JLabel passwordImageJlabel=new JLabel(passwordImage);
        passwordImageJlabel.setBounds(116,195-10,passwordImage.getIconWidth(),passwordImage.getIconHeight());
        this.getContentPane().add(passwordImageJlabel);

        //添加确定密码图片
        ImageIcon secondPasswordImage=new ImageIcon("image\\register\\再次输入密码.png");
        JLabel secondPasswordImageJlabel=new JLabel(secondPasswordImage);
        secondPasswordImageJlabel.setBounds(116,256-10,secondPasswordImage.getIconWidth(),secondPasswordImage.getIconHeight());
        this.getContentPane().add(secondPasswordImageJlabel);

        //添加验证码图片
        ImageIcon codeImage=new ImageIcon("image\\login\\验证码.png");
        JLabel codeImageJlabel=new JLabel(codeImage);
        codeImageJlabel.setBounds(116,305-10,codeImage.getIconWidth(),codeImage.getIconHeight());
        this.getContentPane().add(codeImageJlabel);

        //添加输入用户名输入框
        JTextField usernameJTextField=new JTextField();
        usernameJTextField.setBounds(200+20,134-10,150,30);
        this.getContentPane().add(usernameJTextField);

        //添加密码输入框
        passwordJPasswordField=new JPasswordField();
        passwordJPasswordField.setBounds(200+20,195-10,150,30);
        this.getContentPane().add(passwordJPasswordField);

        //确认密码输入框
        secondPasswordJPasswordField=new JPasswordField();
        secondPasswordJPasswordField.setBounds(200+20,256-10,150,30);
        this.getContentPane().add(secondPasswordJPasswordField);

        //验证码输入框
        codeJTextField=new JTextField();
        codeJTextField.setBounds(200+20,305-10,150,30);
        this.getContentPane().add(codeJTextField);

        //生成验证码
        JLabel passcodeJlabel=new JLabel(passcode);
        passcodeJlabel.setBounds(380, 305-10, 80, 30);
        this.getContentPane().add(passcodeJlabel);

        //添加注册按钮
        ImageIcon registerImage=new ImageIcon("image\\login\\注册按钮.png");
        registerJButton=new JButton(registerImage);
        registerJButton.setBounds(100, 330, registerImage.getIconWidth(), registerImage.getIconHeight());
        registerJButton.setBorderPainted(false);
        registerJButton.setContentAreaFilled(false);
        registerJButton.addMouseListener(this);
        registerJButton.addMouseListener(this);
        this.getContentPane().add(registerJButton);

        //添加重置按钮
        ImageIcon restartImage=new ImageIcon("image\\register\\重置按钮.png");
        restartJButton=new JButton(restartImage);
        restartJButton.setBounds(300,330,restartImage.getIconWidth(),restartImage.getIconHeight());
        restartJButton.setBorderPainted(false);
        restartJButton.setContentAreaFilled(false);
        restartJButton.addMouseListener(this);
        restartJButton.addMouseListener(this);
        this.getContentPane().add(restartJButton);


        //添加背景图片
        ImageIcon bg=new ImageIcon("image\\register\\background.png");
        JLabel background=new JLabel(bg);
        background.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
        this.getContentPane().add(background);

        //刷新
        this.getContentPane().repaint();
    }

    private void initRegisterJfFame() {
        this.setSize(488,430);
        //设置界面标题
        this.setTitle("注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //让界面显示出来
        this.setVisible(true);
        this.addKeyListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource()==registerJButton){
            if (passwordJPasswordField.getText().equals(secondPasswordJPasswordField.getText())&&codeJTextField.getText().equalsIgnoreCase(passcode)){
                this.setVisible(false);
                new LoginJFrame();
                System.out.println("注册成功");
            } else {
                System.out.println("注册失败");;
            }


        } else if(e.getSource()==restartJButton){
            initImage();
            System.out.println("已重置");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()=='R'){
            this.setVisible(false);
            new LoginJFrame();
        }
    }
}
