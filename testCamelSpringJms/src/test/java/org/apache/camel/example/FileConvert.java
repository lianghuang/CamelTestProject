/**
* Copyright 2015 China Mobile. All Right Reserved
* 
* This file is owned by China Mobile and you may not use, modify, copy, 
* redistribute this file without written permissions.
 * 
* These Terms of Use define legal use of this file, all updates, revisions, 
* substitutions for you. All rights not expressly granted to you are reserved 
* by Chinamobile. 
*/ 

package org.apache.camel.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * @author Huang, Liangliang
 *
 */
public class FileConvert {
    public static void readTxtFile(String filePath,String filePath2){
        try {
                String encoding="GBK";
                File file=new File(filePath);
                File file2=new File(filePath2);
                
                if(file.isFile() && file.exists()){ //判断文件是否存在
                    InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),encoding);//考虑到编码格式
                    BufferedReader bufferedReader = new BufferedReader(read);

                    
                    Writer writer = new OutputStreamWriter(new FileOutputStream(file2),encoding);
                    String lineTxt = null;
                    while((lineTxt = bufferedReader.readLine()) != null){
                        lineTxt= lineTxt.replaceAll("\\s*", "");
                        System.out.println(lineTxt);
                        writer.write(lineTxt+"\r\n");
                        
                        
                    }
                    read.close();
        }else{
            System.out.println("找不到指定的文件");
        }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
     
    }
    public static void main(String[] args){
        FileConvert.readTxtFile("C:/Users/Usher/Documents/CMCC工作文档/CMCC办公/Foxmail地址簿_20150226bak.csv",
                "C:/Users/Usher/Documents/CMCC工作文档/CMCC办公/Foxmail地址簿_20150226bak2.csv");
    }
}
