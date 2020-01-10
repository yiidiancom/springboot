package com.yiidian.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 控制器
 * 一点教程网 - www.yiidian.com
 */
@RestController
public class UploadController {
	/*
	 * 接收文件
	 */
	@RequestMapping("/uploadAttach")
	public String upload(@RequestParam("attach")MultipartFile file) throws Exception{
		//处理文件
		System.out.println("文件原名称："+file.getOriginalFilename());
		System.out.println("文件类型："+file.getContentType());
		
		//保存到硬盘
		file.transferTo(new File("c:/"+file.getOriginalFilename()));

		return "上传成功";
	} 
}
