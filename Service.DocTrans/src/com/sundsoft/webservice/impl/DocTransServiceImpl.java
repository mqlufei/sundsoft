package com.sundsoft.webservice.impl;

import java.io.File;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

import com.sundsoft.utils.FileUtil;
import com.sundsoft.utils.JpegTool;
import com.sundsoft.webservice.IDocTransServices;

public class DocTransServiceImpl implements IDocTransServices {

	private static final Logger log = LogManager.getLogger(DocTransServiceImpl.class);
	
	@Value("${base.file.path}")
	private String FileDictionary ;
	
	@Value("${small.img.size}")
	private String smallImgSize ;
	
	@Override
	public boolean WriteFile(String sPath, String sFileName, byte[] imgFile) throws Exception {
		Integer smallImgHW = 0;
		try {
			smallImgHW = Integer.parseInt(smallImgSize);
		}
		catch (Exception e) {
			log.error("小图大小转化错误，请检查配置文件", e);
			smallImgHW = 80;
		}
		String fullfileName = FileDictionary+File.separator+sPath+File.separator+sFileName;
		String fullSmallImgName = fullfileName.replace(".jpg", "sl.jpg");
		boolean flag = FileUtil.createFile(fullfileName);
		if(flag){
			flag = FileUtil.writeFile(fullfileName, imgFile);
			if(flag){
				JpegTool jtool = new JpegTool();
				jtool.SetSmallHeight(smallImgHW);
				jtool.SetSmallWidth(smallImgHW);
				try {
					jtool.doFinal(fullfileName, fullSmallImgName);
					return true;
				}
				catch (Exception e) {
					log.error("生产压缩小图失败:", e);
				}
			}
		}
		return false;
	}

	@Override
	public byte[] ReadFile(String path) throws Exception {
		String fullfileName = FileDictionary+File.separator+path;
		return FileUtil.readFile(fullfileName);
	}

}
