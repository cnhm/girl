package com.hm.girl.service;

import com.hm.girl.domain.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author: hjh
 * @Date: 14:50 2018/5/13/013
 */
@RunWith(SpringRunner.class) //测试环境跑
@SpringBootTest                 //代表将会启动整个springboot工程
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findOne() throws Exception {
        Girl girl = girlService.findOne(11);
        //断言
        Assert.assertEquals(new Integer(14),girl.getAge());

    }

}