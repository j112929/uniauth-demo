package com.shenma.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class TestTask implements SimpleJob{

    public void execute(ShardingContext context) {
    	System.out.println("定时任务测试");
    }

}