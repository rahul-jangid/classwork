package com.sapient.services;

import java.util.List;

import com.sapient.vo.Answer;
import com.sapient.vo.Question;

public interface IExamSer {
	
	List<Question> generateQuestions();
	int evaluate(List<Answer>alist);

}
