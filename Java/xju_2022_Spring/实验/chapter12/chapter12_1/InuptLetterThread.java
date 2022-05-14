import java.awt.*;
import java.util.Scanner;

public class InuptLetterThread extends Thread {
   Scanner reader;
   Letter letter;
   int score = 0;

   InuptLetterThread() {
      reader = new Scanner(System.in);
   }

   public void setLetter(Letter letter) {
      this.letter = letter;
   }

   public void run() {
      while (true) {
         // System.out.printf("输入显示的字母(回车)\n"));
         String str = reader.nextLine();
         char c = str.charAt(0);
         if (c == letter.getChar()) {
            score++;
            System.out.printf("\t\t输入对了,目前分数%d\n", score);
         } else {
            System.out.printf("\t\t输入错了,目前分数%d\n", score);
         }
         if (c == '#')
            System.exit(0);
      }
   }
}
