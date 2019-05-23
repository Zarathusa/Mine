package com.xpf.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xpf.dao.MineInfoMapper;
import com.xpf.entity.MineInfo;

public class MineInfoMapperTest {

	private ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	private MineInfoMapper mineInfoMapper = (MineInfoMapper)applicationContext.getBean("mineInfoMapper");
	
	@Test
	public void test1(){
		List<MineInfo> list = mineInfoMapper.selectAll();
		for (MineInfo mineInfo : list) {
			System.out.println(mineInfo);
		}
	}
}
