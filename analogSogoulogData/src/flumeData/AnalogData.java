package flumeData;

import java.io.*;

public class AnalogData {

    public static void main(String[] args) {
        String inputFile = args[0];
        String outputFile = args[1];

        readData(inputFile, outputFile);

    }

    public static void readData(String inputFile, String outputFile) {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String tmp = null;
        try {
            //对输入文件创建字节输入流对象
            fis = new FileInputStream(inputFile);
            //将字节输入流转换为支持UTF-8的字符输入流
            isr = new InputStreamReader(fis, "UTF-8");
            //利用缓冲流实现文本文件的复制
            br = new BufferedReader(isr);

            int count = 1;

            while((tmp = br.readLine()) != null){
                System.out.println("第"+count+"行："+tmp);
                writeData(outputFile, tmp);
                count++;
                Thread.sleep(100);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if(isr != null){
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void writeData(String outputFile, String line) {
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            fos = new FileOutputStream(outputFile, true);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            bw.write("\n");
            bw.write(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
