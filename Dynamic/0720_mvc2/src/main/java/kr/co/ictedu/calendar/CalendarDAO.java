package kr.co.ictedu.calendar;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CalendarDAO {

	@Autowired
	private SqlSession sqlSession;

	public int dayPlanInsert(CalendarDTO[] calendarArr) {
		int successCount = 0;
		successCount = sqlSession.insert("CalendarMapper.dayPlanInsert", calendarArr);
		return successCount;
	}//dayPlanInsert

	public CalendarDTO dateInfo(String userWantMonth) {
		CalendarDTO dto = null;
		dto = sqlSession.selectOne("CalendarMapper.dateInfo", userWantMonth);
		return dto;
	}//dateInfo

}//class
