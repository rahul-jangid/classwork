package com.sapient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import static com.sapient.util.ExamUtil.*;

import com.sapient.util.ExamUtil;
import com.sapient.vo.Question;

public class ExamDaoImpl implements IDao {

	private static IDao dao = new ExamDaoImpl();
	private ExamDaoImpl(){								// must be private so that user can not create instance
		
	}
	public static IDao getDaoInstance(){
		return dao;
	}
	
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Map<Integer, Question> viewQuestions() {
		Map<Integer, Question> map = new HashMap<>();
		Question ques = null;
		String url = URL;															// we can use static members without class name using static import
		try (Connection conn = DriverManager.getConnection(url, UNAME, PWD)) {
			String sql = "select * from questions";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()){
				ques = new Question(rs.getInt("qid"), rs.getString("qdesc"), rs.getString("optionA"), rs.getString("optionB"), rs.getString("optionc"), rs.getString("ANSWER"));
				map.put(rs.getInt("qid"), ques);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
