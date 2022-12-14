package kr.co.ictedu.calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarService {

	@Autowired
	private CalendarDAO dao;

	public int dayPlanInsert(CalendarDTO[] calendarArr) {
		int successCount = 0;
		successCount = dao.dayPlanInsert( calendarArr );
		return successCount;
	}//dayPlanInsert

	public CalendarDTO dateInfo(String userWantMonth) {
		CalendarDTO dto = null;
		dto = dao.dateInfo(userWantMonth);

		int intForEnd = Integer.parseInt( dto.getFor_end() );
		int modIntForEnd = intForEnd % 7;
		if(modIntForEnd > 0) {
			intForEnd = intForEnd + (7 - modIntForEnd);
			dto.setFor_end(intForEnd + "");
		}
		return dto;
	}//dateInfo

}//class
