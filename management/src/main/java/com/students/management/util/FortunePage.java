package com.students.management.util;

import java.io.Serializable;
import java.util.List;

public class FortunePage<T> implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 当前页码
	 */
    private int currentPage;

    /**
     * 每页的行数
     */
    private int rows;

    /**
     * 数据List
     */
    private List<T> dataList;

    /**
     * 数据总数
     */
    private int dataNum;
    
    public FortunePage(){
    }
    /**
     * 
     * @param currentPage 当前页码，必须是正整数
     * @param rows 每页行数
     */
    public FortunePage(int currentPage, int rows){
    	if( currentPage < 1 ){
    		throw new IllegalArgumentException("分页页码必须>=1,传入的页码为:"+currentPage);
    	}
    		
        this.currentPage = currentPage;
        this.rows = rows;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getEnd() {
        return getStart() + rows;
    }

    public int getStart() {
        return (currentPage -1) * rows;
    }

    public int getRows() {
        return rows;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public int getDataNum() {
        return dataNum;
    }

    public void setDataNum(int dataNum) {
        this.dataNum = dataNum;
    }

	public int getPages() {
		return dataNum / rows + (dataNum%rows==0?0:1);
	}

}