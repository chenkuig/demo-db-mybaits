package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.dao.DetentionRecordDao;
import com.example.dmo.DetentionRecord;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;

@RunWith(SpringRunner.class)
/*@MybatisTest
  @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)*/
@SpringBootTest
@Import(DemoApplication.class)
public class DemoApplicationTests {
	@Autowired
    private DetentionRecordDao detentionRecordDao;
	
	@Test
	@Rollback
	public void selectCount(){
		Page<DetentionRecord> page = PageHelper.startPage(1, 10).doSelectPage(()->detentionRecordDao.searchPage());
		/*List<DetentionRecord> list = detentionRecordDao.searchPage();*/
		PageInfo<DetentionRecord> pageInfo = new PageInfo<DetentionRecord>(page.getResult());
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println(pageInfo.getTotal());
		System.out.println(pageInfo.getList().size());
		System.out.println(pageInfo.isHasNextPage());
	}
	@Test
	@Rollback
	public void selectCount2(){
		Page<DetentionRecord> page = detentionRecordDao.searchPage(new PageRowBounds(0,10));
		System.out.println(page.getTotal());
		System.out.println(page.size());
	}
}

