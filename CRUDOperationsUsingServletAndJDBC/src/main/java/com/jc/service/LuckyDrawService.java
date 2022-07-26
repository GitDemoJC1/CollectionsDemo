package com.jc.service;

import java.util.List;

import com.jc.model.LuckyDrawModel;
import com.jc.repository.LuckyDrawRepoistory;

public class LuckyDrawService {

	private LuckyDrawRepoistory luckyDrawRepoistory;

	public LuckyDrawService() {
		luckyDrawRepoistory = new LuckyDrawRepoistory();
	}

	public int lukyDrawRegistartion(LuckyDrawModel lmodel) {
		return (lmodel != null) ? luckyDrawRepoistory.save(lmodel) : 0;
	}
	public LuckyDrawModel searchRecordById(Integer id) {
		LuckyDrawModel serachById = luckyDrawRepoistory.serachById(id);
		return serachById;
	}

	public List<LuckyDrawModel> fetchAllRecords() {
		return luckyDrawRepoistory.getAllRecords();	
	}
	
	public int deleteRecordById(Integer id) {
		return (id==0)? 0: luckyDrawRepoistory.deleteRecord(id);	
	}
	public int updateRecord(LuckyDrawModel model) {
		return luckyDrawRepoistory.updateRecord(model);
	}
}
