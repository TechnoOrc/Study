package kr.co.ictedu.calendar;


import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import kr.co.ictedu.util.dto.MemberDTO;

@Controller
@RequestMapping( value = "/calendar" )
public class CalendarController {

	private static final Logger logger = LoggerFactory.getLogger(CalendarController.class);

	@Autowired
	private CalendarService service;

	@RequestMapping(value = "/day_plan_insert", method = RequestMethod.POST)
	public void dayPlanInsert(String jsonArr, HttpSession session, PrintWriter out) {

		String tmpMno = ( (MemberDTO) session.getAttribute("login_info") ).getMno();

		CalendarDTO [] calendarArr = new Gson().fromJson(jsonArr, CalendarDTO[].class);

		for (CalendarDTO calendarDTO : calendarArr) {
			calendarDTO.setMno( tmpMno );
			//System.out.println( calendarDTO.toString() );
		}

		int successCount = 0;
		successCount = service.dayPlanInsert( calendarArr );

		out.print(successCount);
		out.close();

	}//dayPlanInsert

	@RequestMapping(value = "/day_plan_form", method = RequestMethod.GET)
	public String dayPlanForm(CalendarDTO dto, Model model) {

		model.addAttribute("date_info", dto);

		return "calendar/day_plan_form";//jsp file name

	}//dayPlanForm

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String calendarMain(CalendarDTO dto, Model model) {

		String userWantMonth = "";
		if( dto != null
				&& dto.getPlan_year() != null && !dto.getPlan_year().equals( "" )
				&& dto.getPlan_month() != null && !dto.getPlan_month().equals( "" ) ) {
			userWantMonth = dto.getPlan_year() + "-" + dto.getPlan_month() + "-01";
		} else {
			Date today = new Date();
			DateFormat monthFormat = new SimpleDateFormat("YYYY-MM-01");
			userWantMonth = monthFormat.format(today);
		}

		dto = service.dateInfo(userWantMonth);
		model.addAttribute("date_info", dto);

		return "calendar/main";//jsp file name

	}//calendarMain

}//class

/*
DROP TABLE calendar_day_plan;

CREATE TABLE calendar_day_plan (
  plan_no int NOT NULL AUTO_INCREMENT,
  plan_year varchar(4) NOT NULL,
  plan_month varchar(2) NOT NULL,
  plan_date varchar(2) NOT NULL,
  mno int NOT NULL,
  plan_start_time varchar(60) DEFAULT NULL,
  plan_end_time varchar(60) DEFAULT NULL,
  plan_desc varchar(300) DEFAULT NULL,
  plan_expect_price varchar(60) DEFAULT NULL,
  plan_contact_price varchar(60) DEFAULT NULL,
  PRIMARY KEY (plan_no)
);
*/
