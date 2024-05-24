package JFrameUI;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //记录空白方块在二维数组中的位置
    Random r = new Random();
    int x = 0;
    int y = 0;
    int step = 0;


    String[] choice=new String[]{"animal","girl","sport"};
    String finalPath=choice[r.nextInt(choice.length-1)];

    // String path = "image\\girl\\girl1\\";
    String path = "image\\"+finalPath+"\\"+finalPath+r.nextInt(1,14)+"\\";
    //创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem girlItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");



    JMenuItem accountItem = new JMenuItem("作者微信");

    //游戏主界面
    int[][] data = new int[4][4];
    int[][] correctData = new int[4][4];

    private int[][] ctData() {
        /**
         * 生成正确答案的二维数组
         */
        int[][] data = new int[4][4];
        int n = 1;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = n;
                n++;
            }
        }
        data[3][3] = 0;
        return data;
    }

    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据(打乱)
        data = initData();
        correctData = ctData();

        //初始化图片
        initImage();

        //让界面显示出来,一般放在最后
        this.setVisible(true);
    }

    private int[][] initData() {
        /**
         * 生成数据随机的二维数组
         */
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length - 1);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        int[][] arr = new int[4][4];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = tempArr[index];
                index++;
                //找到元素为0的坐标
                if (arr[i][j] == 0) {
                    x = i;
                    y = j;
                }
            }
        }


        return arr;
    }

    private void initImage() {

        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();

        //判断是否通关
        if (victory()) {
            ImageIcon win = new ImageIcon("image\\win.png");
            JLabel winjlabel = new JLabel(win);
            winjlabel.setBounds(203, 283, win.getIconWidth(), win.getIconHeight());
            this.getContentPane().add(winjlabel);
        }

        //添加计步组件
        JLabel stepCount = new JLabel("步数:" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        //先加载的图片在上方,所以背景图片要最后加载
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = data[i][j];
                //创建一个JLabel的对象(管理容器)
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));


                this.getContentPane().add(jLabel);
            }
        }

        //添加背景图片
        ImageIcon bg = new ImageIcon("image\\background.png");
        JLabel background = new JLabel(bg);
        background.setBounds(40, 40, bg.getIconWidth(), bg.getIconHeight());
        this.getContentPane().add(background);

        //刷新界面
        this.getContentPane().repaint();

    }

    private void initJMenuBar() {
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面两个选项的对象(功能,关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu changeJMenu = new JMenu("更换图片");

        //为更换图片添加item
        changeJMenu.add(girlItem);
        changeJMenu.add(animalItem);
        changeJMenu.add(sportItem);


        //将每个选项下的条目添加到选项中
        functionJMenu.add(changeJMenu);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);



        aboutJMenu.add(accountItem);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        girlItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);


        //将菜单中的两个选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面宽高
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("死人拼图");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //取消默认的居中放置,只有取消了,才会按照x,y轴的方法添加组件
        this.setLayout(null);
        //添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 'A') {
            //把界面中所有图片删除
            this.getContentPane().removeAll();
            //加载完整图片
            ImageIcon icon = new ImageIcon(path + "all.jpg");
            JLabel all = new JLabel(icon);
            all.setBounds(83, 134, icon.getIconWidth(), icon.getIconHeight());
            this.getContentPane().add(all);
            //加载背景图片
            ImageIcon bg = new ImageIcon("image\\background.png");
            JLabel background = new JLabel(bg);
            background.setBounds(40, 40, bg.getIconWidth(), bg.getIconHeight());
            this.getContentPane().add(background);
            //刷新
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //先判断是否胜利,若果胜利就不能执行移动代码了
        if (victory()) {
            return;
        }
        //对上下左右进行判断
        //左:37
        //上:38
        //右:39
        //下:40
        int code = e.getKeyCode();
        if (code == 37) {
            if (y == 0) {
                System.out.println("已经到最左边了");
            } else {
                System.out.println("向左移动");
                data[x][y] = data[x][y - 1];
                data[x][y - 1] = 0;
                y--;
                step++;
                initImage();
            }

        } else if (code == 38) {
            if (x == 0) {
                System.out.println("已经到最上边了");
            } else {
                System.out.println("向上移动");
                data[x][y] = data[x - 1][y];
                data[x - 1][y] = 0;
                x--;
                step++;
                initImage();
            }


        } else if (code == 39) {
            if (y == 3) {
                System.out.println("已经到最右边了");
            } else {
                System.out.println("向右移动");
                data[x][y] = data[x][y + 1];
                data[x][y + 1] = 0;
                y++;
                step++;
                initImage();
            }

        } else if (code == 40) {
            if (x == 3) {
                System.out.println("已经到最下边了");
            } else {
                System.out.println("向下移动");
                data[x][y] = data[x + 1][y];
                data[x + 1][y] = 0;
                x++;
                step++;
                initImage();
            }
        } else if (code == 'A') {
            initImage();
        } else if (code == 'W') {
//            showArr(data);
//            System.out.println("------------------------------------");
//            showArr(correctData);

            //清空原本已经出现的所有图片
            this.getContentPane().removeAll();
            ImageIcon win = new ImageIcon("image\\win.png");
            JLabel winjlabel = new JLabel(win);
            winjlabel.setBounds(203, 283, win.getIconWidth(), win.getIconHeight());
            this.getContentPane().add(winjlabel);

            //先加载的图片在上方,所以背景图片要最后加载
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int num = correctData[i][j];
                    //创建一个JLabel的对象(管理容器)
                    JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
                    //指定图片位置
                    jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                    //给图片加边框
                    jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));


                    this.getContentPane().add(jLabel);
                }
            }

            ImageIcon bg = new ImageIcon("image\\background.png");
            JLabel background = new JLabel(bg);
            background.setBounds(40, 40, bg.getIconWidth(), bg.getIconHeight());
            this.getContentPane().add(background);
            JLabel stepCount = new JLabel("步数:" + step);
            stepCount.setBounds(50, 30, 100, 20);
            this.getContentPane().add(stepCount);

            //刷新界面
            this.getContentPane().repaint();
            System.out.println("恭喜您成功通关");
            data = correctData;
            return;

        }
    }

    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != correctData[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem) {
            System.out.println("重新游戏");
            data = initData();
            step = 0;
            initImage();
        } else if (obj == reLoginItem) {
            System.out.println("重新登录");
            this.setVisible(false);
            new LoginJFrame();

        } else if (obj == closeItem) {
            System.out.println("关闭游戏");
            System.exit(0);

        } else if (obj == accountItem) {
            System.out.println("作者微信");
            ImageIcon wx = new ImageIcon("image\\wx.png");
            JDialog wxDialog = new JDialog();
            JLabel wxLabel = new JLabel(wx);
            wxLabel.setBounds(0, 0, wx.getIconWidth(), wx.getIconHeight());
            wxDialog.getContentPane().add(wxLabel);
            wxDialog.setSize(wx.getIconWidth() + 250, wx.getIconHeight() + 100);
            wxDialog.setAlwaysOnTop(true);
            wxDialog.setLocationRelativeTo(null);//居中
            wxDialog.setModal(true);//弹框不关闭无法操作其他界面
            wxDialog.setVisible(true);

        } else if (obj==girlItem) {
            path = "image\\"+"girl"+"\\"+"girl"+r.nextInt(1,14)+"\\";
            step=0;
            initImage();
        } else if (obj==animalItem) {
            path = "image\\"+"animal"+"\\"+"animal"+r.nextInt(1,14)+"\\";
            step=0;
            initImage();
        } else if (obj==sportItem) {
            path = "image\\"+"sport"+"\\"+"sport"+r.nextInt(1,14)+"\\";
            step=0;
            initImage();
        }
    }
}
