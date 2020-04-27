package com.imti.mo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index(HttpServletRequest request,Map<String,Object> map) {
		request.setAttribute("name1", "111123456");
		map.put("name", "123456");
		map.put("sex", 1);
		List list=new ArrayList();
		list.add("halle");
		list.add("hi"); 
		map.put("userlist", list);
		return "index.ftl";
	}

}
