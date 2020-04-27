package com.imti.mo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	@Scheduled(fixedRate = 1000)//单位毫秒
	public void reportCurrentTime() {
		System.out.println("现在时间:" + dateFormat.format(new Date()));
	}
}

