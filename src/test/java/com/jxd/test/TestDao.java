package com.jxd.test;

import com.jxd.emp.mapper.IBookMapper;
import com.jxd.emp.mapper.IEmpMapper;
import com.jxd.emp.model.Book;
import com.jxd.emp.model.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName TestDao
 * @Description TODO
 * @Author liukai
 * @Date 2020/10/23
 * @Version 1.0
 */
@RunWith(SpringRunner.class) //用谁作为启动器去加载所有的底层配置
@SpringBootTest
public class TestDao {
  /*  @Autowired
    private IEmpMapper empMapper;*/
    @Autowired
    private IBookMapper bookMapper;

  /*  @Test
    public void test(){
        List<Emp> list = empMapper.getAll();
        System.out.println(list.size());
    }
    */
    @Test
    public void testBook(){
        List<Book> list = bookMapper.selectList();
        System.out.println(list.size());
    }

}

