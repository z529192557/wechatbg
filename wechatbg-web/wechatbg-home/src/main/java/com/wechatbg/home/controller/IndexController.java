package com.wechatbg.home.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 首页处理
 *
 * @Type IndexController
 * @Desc 首页
 * @author zhuangpeng
 * @date 2017-4-12
 * @Version V1.0
 */
@Controller
public class IndexController {

	@Resource
	private HttpServletRequest request;

	@Resource
	private HttpServletResponse response;

	@ResponseBody
    @RequestMapping("/")
	public ResponseVO<String> home() {
		System.out.println(request.getRequestURI());
		return ResponseVO.getSuccessResponse("Hello World!");
    }
}
