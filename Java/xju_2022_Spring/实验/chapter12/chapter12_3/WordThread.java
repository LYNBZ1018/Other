import javax.swing.JTextField;

public class WordThread extends Thread {
    char word;
    int startPosition = 19968; // Unicode表的19968位置至32320上的汉字
    int endPosition = 32320;
    JTextField showWord;
    int sleepLength = 6000;

    public void setJTextField(JTextField t) {
        showWord = t;
        showWord.setEditable(false);
    }

    public void setSleepLength(int n) {
        sleepLength = n;
    }

    public void run() {
        int k = startPosition;
        while (true) {
            word = (char) k;
            showWord.setText("" + word);
            try {
                sleep(sleepLength); // 【代码1】--------//调用sleep方法使得线程中断sleepLength豪秒
            } catch (InterruptedException e) {
            }
            k++;
            if (k >= endPosition)
                k = startPosition;
        }
    }
}
