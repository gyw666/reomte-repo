package JFrameUI;

import javax.swing.*;
import java.awt.event.*;

public class LoginJFrame extends JFrame implements ActionListener, KeyListener, MouseListener {
    ImageIcon pswImage=new ImageIcon("image\\login\\密码.png");
    JLabel ps=new JLabel();

    ImageIcon userImage=new ImageIcon("image\\login\\用户名.png");
    JLabel userImageJlabel=new JLabel(userImage);

    ImageIcon codeImage=new ImageIcon("image\\login\\验证码.png");
    JLabel codeImageJlabel=new JLabel(codeImage);

    JTextField username=new JTextField();
    JPasswordField password = new JPasswordField();
    JTextField code=new JTextField();

    String passcode=codeUtil.codeCreat();

    JButton loginButton=new JButton();
    JButton registerButton=new JButton();

    ImageIcon loginImage=new ImageIcon("image\\login\\登录按钮.png");


    ImageIcon registerImage=new ImageIcon("image\\login\\注册按钮.png");



    //登录界面

    public LoginJFrame() {
        //初始化界面
        initJFrame();

        //初始化图片
        initImage();




        //让界面显示出来
        this.setVisible(true);
    }

    private void initJFrame() {
        //设置界面宽高
        this.setSize(488,430);
        //设置界面标题
        this.setTitle("拼图 注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //取消默认的居中放置
        this.setLayout(null);
        //添加监听事件
        this.addKeyListener(this);
    }

    private void initImage(){
        //清除所有
        this.getContentPane().removeAll();

        //添加密码图片
        ps=new JLabel(pswImage);
        ps.setBounds(116,195,pswImage.getIconWidth(),pswImage.getIconHeight());
        this.getContentPane().add(ps);

        //添加用户名图片
        userImageJlabel=new JLabel(userImage);
        userImageJlabel.setBounds(116,135,userImage.getIconWidth(),userImage.getIconHeight());
        this.getContentPane().add(userImageJlabel);

        //添加验证码图片
        codeImageJlabel=new JLabel(codeImage);
        codeImageJlabel.setBounds(116,256,codeImage.getIconWidth(),codeImage.getIconHeight());
        this.getContentPane().add(codeImageJlabel);

        //添加用户名输入框

        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //添加密码输入框

        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //添加验证码输入框

        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        //生成验证码
        JLabel passcodeJlabel=new JLabel(passcode);
        passcodeJlabel.setBounds(300, 256, 80, 30);
        this.getContentPane().add(passcodeJlabel);

        //添加登录按钮
        loginButton=new JButton(loginImage);
        loginButton.setBounds(123, 310, 128, 47);
                //去掉默认边框
        loginButton.setBorderPainted(false);
                //去掉默认背景
        loginButton.setContentAreaFilled(false);
                //添加鼠标事件
        loginButton.addMouseListener(this);

        this.getContentPane().add(loginButton);

        //添加注册按钮
        registerButton=new JButton(registerImage);
        registerButton.setBounds(256, 310, 128, 47);
        registerButton.setBorderPainted(false);
        registerButton.setContentAreaFilled(false);
        registerButton.addMouseListener(this);
        this.getContentPane().add(registerButton);





        //添加背景图片
        ImageIcon bg=new ImageIcon("image\\login\\background.png");
        JLabel background=new JLabel(bg);
        background.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
        this.getContentPane().add(background);


        //刷新
        this.getContentPane().repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource()==loginButton){
            loginImage=new ImageIcon("image\\login\\登录按下.png");
            System.out.println("登录按下");
            initImage();
            String usernameInput=username.getText();
            String passwordInput=password.getText();
            System.out.println(passwordInput);
            String passcodeInput=code.getText();
            if (passcodeInput.equalsIgnoreCase(passcode)) {
                System.out.println("登录成功");
                new GameJFrame();
                this.setVisible(false);
            }

        } else if(e.getSource()==registerButton){
            registerImage=new ImageIcon("image\\login\\注册按下.png");
            System.out.println("注册按下");
            initImage();
            new RegisterJFrame();
            this.setVisible(false);
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
}
