package com.imti.mo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice//异常通知，全局性异常切面处理类
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)//针对运行时的异常进行处理
	@ResponseBody
	public Map<String,Object> exceptionHandler(){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("errorCode", "101");
		map.put("errorMsg", "系统繁忙");
		return map;
	}
}
