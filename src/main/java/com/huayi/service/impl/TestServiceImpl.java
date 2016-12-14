package com.huayi.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huayi.dao.TestDao;
import com.huayi.service.TestService;


@Service("testService")
public class TestServiceImpl implements TestService{
	
	@Resource
	private TestDao testDao;
	
	@Override
	public List<Map> test() {
		return testDao.test();
	}

}
