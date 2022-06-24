package ch17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.List;

public class JDBC11BoardListEvent implements ActionListener {

	List guiList;
	JDBC11BoardListDAO dao;
	ArrayList<String> tmpList;

	JDBC11BoardListEvent(List list){
		this.guiList = list;
		try {
			dao = new JDBC11BoardListDAO();
		} catch (ClassNotFoundException e) {
			guiList.add("DB Driver loading error!");
			e.printStackTrace();
		}
	}//생성자

	@Override
	public void actionPerformed(ActionEvent e) {

		String cmd = e.getActionCommand();
		if(cmd.equals("SELECT")) {

			try {
				tmpList = dao.selectBoardList();
			} catch (SQLException e1) {
				guiList.add("Select error!");
				e1.printStackTrace();
			}

			guiList.removeAll();
			for (int i = 0; i < tmpList.size(); i++) {
				guiList.add(tmpList.get(i));
			}

			//guiList.add("hi");
		}//if


	}//actionPerformed

}//class 
