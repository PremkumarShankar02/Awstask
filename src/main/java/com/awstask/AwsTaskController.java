package com.awstask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsTaskController {
	
	@GetMapping(path="/getmsg")
	public String getMsg() {
		return "Winter Is Coming";
	}

}

