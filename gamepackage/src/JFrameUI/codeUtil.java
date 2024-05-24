package JFrameUI;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Random;

public class codeUtil {
    public static String codeCreat() {
        //脑子抽了才用arraylist........
        //...stringBuilder.............
        ArrayList<Character> code = new ArrayList<>();
        Random r = new Random();
        char[] zm = new char[62];
        for (int i = 0; i < 26; i++) {
            zm[i] = (char) ('a' + i);
        }
        for (int i = 0; i < 26; i++) {
            zm[i + 26] = (char) ('A' + i);
        }
        for (int i = 0; i < 10; i++) {
            zm[i + 52] = (char) ('0' + i);
        }
        //随机抽六个当验证码
        //六个都是字母,随机一个是数字
        for (int i = 0; i < 6; i++) {
            code.add(zm[r.nextInt(52)]);
        }
        code.set(r.nextInt(6), zm[r.nextInt(52, 62)]);
        String passcode="";
        for (int i = 0; i < 6; i++) {
            passcode = passcode + code.get(i);
        }
        return passcode;
    }
}
