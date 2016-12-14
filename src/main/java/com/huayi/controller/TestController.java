package com.huayi.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.huayi.service.TestService;

/**
 * 测试controller
 * @author sagagyq
 *
 */
@Controller
@RequestMapping("/test11")
public class TestController {
	
	
	@Resource
	TestService testService;
	
	@RequestMapping(value = "/test1")
    @ResponseBody
	public String test(){
		/*Map<String, Object> map =Maps.newHashMap();
		map.put("1", "test1");
		map.put("2", "test2");
		map.put("3", "test3");*/
		List<Map> list = testService.test();
		return JSON.toJSONString(list);
	}
	
}
