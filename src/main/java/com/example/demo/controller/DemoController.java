package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(value = "demo", method = RequestMethod.GET)
	public String demo() {
		String aaString = "{ \"accessToken\": \"be327fafc4be4a54a1d33557f13626e7\", \"appVersion\": \"1.0.0\", \"osType\": \"android\", \"serviceData\": \"{\\\"info\\\":\\\"W3siY29udGFjdG9yX25hbWUiOiIxMzM2MDA2NDU4MiIsInJlY2VpdmVfbW9iaWxlIjoiMTMzNjAwNjQ1ODIiLCJzZW5kX21vYmlsZSI6IjY2NjY2NjU1NTUiLCJzZW5kX3RpbWUiOiIyMDIwLTA2LTA0Iiwic21zX2NvbnRlbnQiOiLml6nnnaHml6notbfouqvkvZPlpb0iLCJ1c2VyX2lkIjozNX0seyJjb250YWN0b3JfbmFtZSI6IjEzNDg5MTc1Mjk2IiwicmVjZWl2ZV9tb2JpbGUiOiI2NjY2NjY1NTU1Iiwic2VuZF9tb2JpbGUiOiIxMzQ4OTE3NTI5NiIsInNlbmRfdGltZSI6IjIwMjAtMDYtMDQiLCJzbXNfY29udGVudCI6Iue6oue6oueBq+eBq+aZg+aZg+aCoOaCoCIsInVzZXJfaWQiOjM1fSx7ImNvbnRhY3Rvcl9uYW1lIjoiMTc2ODg1MzY4MTkiLCJyZWNlaXZlX21vYmlsZSI6IjE3Njg4NTM2ODE5Iiwic2VuZF9tb2JpbGUiOiI2NjY2NjY1NTU1Iiwic2VuZF90aW1lIjoiMjAyMC0wNi0wNCIsInNtc19jb250ZW50Ijoi5Zyo5bmy5ZibIiwidXNlcl9pZCI6MzV9LHsiY29udGFjdG9yX25hbWUiOiIxNzY4ODUzNjgxOCIsInJlY2VpdmVfbW9iaWxlIjoiNjY2NjY2NTU1NSIsInNlbmRfbW9iaWxlIjoiMTc2ODg1MzY4MTgiLCJzZW5kX3RpbWUiOiIyMDIwLTA2LTA0Iiwic21zX2NvbnRlbnQiOiLlk4jlk4jlk4giLCJ1c2VyX2lkIjozNX0seyJjb250YWN0b3JfbmFtZSI6IjE3NzIyNDMzODQ0IiwicmVjZWl2ZV9tb2JpbGUiOiIxNzcyMjQzMzg0NCIsInNlbmRfbW9iaWxlIjoiNjY2NjY2NTU1NSIsInNlbmRfdGltZSI6IjIwMjAtMDYtMDQiLCJzbXNfY29udGVudCI6IuWTiOWTiOWTiCIsInVzZXJfaWQiOjM1fV0u003d\\\"}\", \"sign\": \"B6FBF12A3D10862392916091A723A8FC\", \"timeStamp\": \"1591253355289\" }";
		return aaString;
	}
	
	@RequestMapping(value = "req1", method = RequestMethod.GET)
	public String req1() {
		String aaString = "{ \"accessToken\": \"be327fafc4be4a54a1d33557f13626e7\", \"appVersion\": \"1.0.0\", \"osType\": \"android\", \"serviceData\": \"{\\\"info\\\":\\\"W3siY29udGFjdG9yX25hbWUiOiIxMzM2MDA2NDU4MiIsInJlY2VpdmVfbW9iaWxlIjoiMTMzNjAwNjQ1ODIiLCJzZW5kX21vYmlsZSI6IjY2NjY2NjU1NTUiLCJzZW5kX3RpbWUiOiIyMDIwLTA2LTA0Iiwic21zX2NvbnRlbnQiOiLml6nnnaHml6notbfouqvkvZPlpb0iLCJ1c2VyX2lkIjozNX0seyJjb250YWN0b3JfbmFtZSI6IjEzNDg5MTc1Mjk2IiwicmVjZWl2ZV9tb2JpbGUiOiI2NjY2NjY1NTU1Iiwic2VuZF9tb2JpbGUiOiIxMzQ4OTE3NTI5NiIsInNlbmRfdGltZSI6IjIwMjAtMDYtMDQiLCJzbXNfY29udGVudCI6Iue6oue6oueBq+eBq+aZg+aZg+aCoOaCoCIsInVzZXJfaWQiOjM1fSx7ImNvbnRhY3Rvcl9uYW1lIjoiMTc2ODg1MzY4MTkiLCJyZWNlaXZlX21vYmlsZSI6IjE3Njg4NTM2ODE5Iiwic2VuZF9tb2JpbGUiOiI2NjY2NjY1NTU1Iiwic2VuZF90aW1lIjoiMjAyMC0wNi0wNCIsInNtc19jb250ZW50Ijoi5Zyo5bmy5ZibIiwidXNlcl9pZCI6MzV9LHsiY29udGFjdG9yX25hbWUiOiIxNzY4ODUzNjgxOCIsInJlY2VpdmVfbW9iaWxlIjoiNjY2NjY2NTU1NSIsInNlbmRfbW9iaWxlIjoiMTc2ODg1MzY4MTgiLCJzZW5kX3RpbWUiOiIyMDIwLTA2LTA0Iiwic21zX2NvbnRlbnQiOiLlk4jlk4jlk4giLCJ1c2VyX2lkIjozNX0seyJjb250YWN0b3JfbmFtZSI6IjE3NzIyNDMzODQ0IiwicmVjZWl2ZV9tb2JpbGUiOiIxNzcyMjQzMzg0NCIsInNlbmRfbW9iaWxlIjoiNjY2NjY2NTU1NSIsInNlbmRfdGltZSI6IjIwMjAtMDYtMDQiLCJzbXNfY29udGVudCI6IuWTiOWTiOWTiCIsInVzZXJfaWQiOjM1fV0u003d\\\"}\", \"sign\": \"B6FBF12A3D10862392916091A723A8FC\", \"timeStamp\": \"1591253355289\" }";
		return aaString;
	}
	
	@RequestMapping(value = "req2", method = RequestMethod.GET)
	public String req2() {
		String aaString = "{\"BigIntSupported\":995815895020119788889,\"date\":\"20180322\",\"message\":\"Success !\",\"status\":200,\"city\":\"北京\",\"count\":632,\"data\":{\"shidu\":\"34%\",\"pm25\":73,\"pm10\":91,\"quality\":\"良\",\"wendu\":\"5\",\"ganmao\":\"极少数敏感人群应减少户外活动\",\"yesterday\":{\"date\":\"21日星期三\",\"sunrise\":\"06:19\",\"high\":\"高温 11.0℃\",\"low\":\"低温 1.0℃\",\"sunset\":\"18:26\",\"aqi\":85,\"fx\":\"南风\",\"fl\":\"<3级\",\"type\":\"多云\",\"notice\":\"阴晴之间，谨防紫外线侵扰\"},\"forecast\":[{\"date\":\"22日星期四\",\"sunrise\":\"06:17\",\"high\":\"高温 17.0℃\",\"low\":\"低温 1.0℃\",\"sunset\":\"18:27\",\"aqi\":98,\"fx\":\"西南风\",\"fl\":\"<3级\",\"type\":\"晴\",\"notice\":\"愿你拥有比阳光明媚的心情\"},{\"date\":\"23日星期五\",\"sunrise\":\"06:16\",\"high\":\"高温 18.0℃\",\"low\":\"低温 5.0℃\",\"sunset\":\"18:28\",\"aqi\":118,\"fx\":\"无持续风向\",\"fl\":\"<3级\",\"type\":\"多云\",\"notice\":\"阴晴之间，谨防紫外线侵扰\"},{\"date\":\"24日星期六\",\"sunrise\":\"06:14\",\"high\":\"高温 21.0℃\",\"low\":\"低温 7.0℃\",\"sunset\":\"18:29\",\"aqi\":52,\"fx\":\"西南风\",\"fl\":\"<3级\",\"type\":\"晴\",\"notice\":\"愿你拥有比阳光明媚的心情\"},{\"date\":\"25日星期日\",\"sunrise\":\"06:13\",\"high\":\"高温 22.0℃\",\"low\":\"低温 7.0℃\",\"sunset\":\"18:30\",\"aqi\":71,\"fx\":\"西南风\",\"fl\":\"<3级\",\"type\":\"晴\",\"notice\":\"愿你拥有比阳光明媚的心情\"},{\"date\":\"26日星期一\",\"sunrise\":\"06:11\",\"high\":\"高温 21.0℃\",\"low\":\"低温 8.0℃\",\"sunset\":\"18:31\",\"aqi\":97,\"fx\":\"西南风\",\"fl\":\"<3级\",\"type\":\"多云\",\"notice\":\"阴晴之间，谨防紫外线侵扰\"}]}}";
		return aaString;
	}

}
