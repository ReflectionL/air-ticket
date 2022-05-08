package data.interfence;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/* 设置Java键盘本质上利用swing图形界面控制相关的知识，来在JFrame中搭建一个键盘界面，实现利用键盘控制输入，
 * 电脑键盘的主面板主体包含有二十六个字母和诗歌数字以及其他相关字符，如果利用按钮时间一个一个实现，那将花费
 * 太多的时间和经历， 故而在这个例子中，很好地利用了数组，即将键盘中的 键按行 来分为五个数组，每个数组包含一
 * 行键盘的字符，利用数组来实现键盘的设置，
 */

public class tEST1 extends JPanel implements ActionListener{
    JTextField text  ;
    Robot robot;
    //line1到line5分别表示键盘的第一排到第五排，在Java中，每一个键有自己的keycode值，
    //例如：0~9的keycode是48~57，A~Z是65~90；
    int[] line1 = {192,49,50,51,52,53,54,55,56,57,48,45,61,8}; // 按键的第一排
    int[] line2 = {81,87,69,82,84,89,85,73,79,80,91,93,92};	// q到\ 没有tab
    int[] line3 = {KeyEvent.VK_CAPS_LOCK,65,83,68,70,71,72,74,75,76,59,222,10}; // 大写到'
    int[] line4 = {16,90,88,67,86,66,78,77,44,46,47,38}; // shift到 向上
    int[] line5 = {17,18,32,18,17,37,40,39};	// ctrl到 >  不包括 fn、window
    Map<Integer, String> uncharMap = new HashMap<Integer, String>(); // 特殊字符
    public tEST1() {
        // 获取当前大小写
        //boolean isUpper = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
        //System.out.println("当前是否大写："+isUpper);
        // 模拟输入
        try {
            robot = new Robot();
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //
        this.setLayout(null);
        int x = 20,y = 20 ,width = 60 , height = 40;

        //定义一个文本框类，用于显示键盘输入文本框中的字符
//        text = new JTextField();
//        text.setBounds(x, y, 800, height);
//        this.add(text);
//        text.grabFocus();
        // 替换特殊字符
        initUnChar();
        // 添加从 33 - 126 的ascii
        int[][] keyint = new int[5][];//定义一个五行的二维数组
        keyint[0] = line1;
        keyint[1] = line2;
        keyint[2] = line3;
        keyint[3] = line4;
        keyint[4] = line5;
        y = y + height + 0;//height=40;
        // load keys
        int startx = 80,cellspace = 7;
        loadKeys(line1,startx,cellspace,x, y, width, height);
        y = y + height + 20;

        // line2
        int[] tmpInt = new int[]{line2[0]}; // tab
        //第二行中，第一个键比较大，故而单独列出
        loadKeys(tmpInt,80,cellspace, x, y, width + width /2 , height);
        startx = x + width + width / 2 - cellspace * 2 + 80;
        tmpInt = new int[line2.length - 1];//新数组的长度为原数组长度减一
        System.arraycopy(line2, 1, tmpInt, 0, tmpInt.length);//给行中给每个键加入相应的字符
        loadKeys(tmpInt,startx ,cellspace, x, y, width, height);

        // line3
        y = y + height + 20;
        tmpInt = new int[]{line3[0]};
        loadKeys(tmpInt,80,cellspace, x, y, width * 2 , height);
        startx = x + width * 2 - cellspace * 2 + 80;
        tmpInt = new int[line3.length - 1];
        System.arraycopy(line3, 1, tmpInt, 0, tmpInt.length);
        loadKeys(tmpInt,startx,cellspace, x, y, width, height);

        // line4
        y = y + height + 20;
        tmpInt = new int[]{line4[0]};
        loadKeys(tmpInt,80,cellspace, x, y, width * 2 + width / 2 , height);
        startx = x + width * 2 + width / 2 - cellspace * 2 + 80;
        tmpInt = new int[line4.length - 1];
        System.arraycopy(line4, 1, tmpInt, 0, tmpInt.length);
        loadKeys(tmpInt,startx,cellspace, x, y, width, height);

    }
    public static void main(String[] args) {
        //定义一个容器，用来实例化tEST1类,放入虚拟键盘
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 800);
        tEST1 kb = new tEST1();
        frame.add(kb);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {     //定义键盘中每个键的监听器。
        MyJButton jb = (MyJButton)e.getSource();
        int key = jb.getValue();
        //System.out.println(key);
        robot.keyPress(key);
        robot.keyRelease(key);
    }
    // 初始化特殊字符，在键盘中加入特殊字符。
    public void initUnChar(){
        uncharMap.put(192, "`");
        uncharMap.put(8, "back");
        uncharMap.put(222, "'");
        uncharMap.put(KeyEvent.VK_CAPS_LOCK, "capslock");
        uncharMap.put(10, "ok");
        uncharMap.put(16, "SHIFT");
        uncharMap.put(17, "CTRL");
        uncharMap.put(17, "ALT");
        uncharMap.put(38, "↑");
        uncharMap.put(37, "←");
        uncharMap.put(39, "→");
        uncharMap.put(40, "↓");
    }
    class MyJButton extends JButton{             //定义一个JButton类
        int value;
        public MyJButton(String showStr) {
            super(showStr);
        }
        public void setValue(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
    /**loadKey方法体的主要作用是将每个字符定义为键，利用按钮来控制输入输出有七个参数，
     * 难度在于在每个按钮上显示相应的字母和设置一行键的相对坐标位置，设计的参数有键盘在容器中的相对位置，
     * 键盘每一行的起始坐标，键与键之间的间隔，
     * line[]用来表示数组，一个数组中含有多个按键，可以依次加载键盘
     * startx值表示键盘每一行的初始位置，cellspace表示每个键之间的间隔
     * x代表键盘在容器中横向坐标，y代表键盘在容器中的纵向坐标，也就是键盘相对于jframe的相对位置
     * width和height分别代表按钮的长宽，也就是按钮的大小，
     */
    public void loadKeys(int[] line,int startx,int cell,int x,int y ,int width,int height){
        // line 1
        for(int j = 0;j < line.length; j++){
            String showStr = uncharMap.get(line[j]); // 显示的字符，利用showstr来获取每个键的字符，
            if(showStr == null){
                showStr = String.valueOf((char) line[j]);
            }
            MyJButton jb = new MyJButton(showStr);
            jb.setBounds(startx + x + (cell + width) * j  , y, width, height);
            jb.setFocusable(false); //   最关键的一句话
            jb.setValue(line[j]); //
            jb.addActionListener(this);
            this.add(jb);
        }
    }
}
