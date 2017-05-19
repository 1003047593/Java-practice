package cn.test.demo;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorTestDemo {
	private static Logger logger=LoggerFactory.getLogger(ErrorTestDemo.class);
	public static void main(String[] args) {
		logger.info(ErrorTest());
	}
	public static String ErrorTest(){
		try {
			int num=10/0;
			return "scuess >>"+num;
		} catch (Exception e) {
			
			// TODO: handle exception
			logger.error("ErrorTest ",e);
			
		}
		return "null";
	}
	public static void fileToText(String inpath,String outPath){
		try {
			File file=new File(inpath);
			FileInputStream fi=new FileInputStream(file);
			
			ByteArrayInputStream bais;
			FileOutputStream fo=new FileOutputStream("outPath");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
