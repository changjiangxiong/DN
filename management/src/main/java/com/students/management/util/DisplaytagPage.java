package com.students.management.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.displaytag.pagination.PaginatedList;
import org.displaytag.properties.SortOrderEnum;

public class DisplaytagPage<T> implements PaginatedList, java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7987932365077737476L;
	
	private List<T> list = Collections.emptyList();// 获取分页的结果集
	private int pageNumber = 1;// 获取当前页数
	private int objectsPerPage = 10;// 获取每页的个数
	private int fullListSize = 0;// 获取整个结果集的个数
	private int totalPages = 0;// 总页数
	private String sortCriterion;// 获取根据哪一列排序
	private SortOrderEnum sortDirection;// 升序还是降序
	private String searchId;// 返回一个查询的id
	private Map<String, Object> customField;//自定义数据
	
		
	public Map<String, Object> getCustomField() {
		return customField;
	}

	public void setCustomField(Map<String, Object> customField) {
		this.customField = customField;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		if(pageNumber > 0)
			this.pageNumber = pageNumber;
	}

	public int getObjectsPerPage() {
		return objectsPerPage;
	}

	public void setObjectsPerPage(int objectsPerPage) {
		if(objectsPerPage > 0)
			this.objectsPerPage = objectsPerPage;
	}

	public int getFullListSize() {
		return fullListSize;
	}

	public void setFullListSize(int fullListSize) {
		this.fullListSize = fullListSize;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public String getSortCriterion() {
		return sortCriterion;
	}

	public void setSortCriterion(String sortCriterion) {
		this.sortCriterion = sortCriterion;
	}

	public SortOrderEnum getSortDirection() {
		return sortDirection;
	}

	public String getSortDirectionStr() {
		if (sortDirection.equals(SortOrderEnum.ASCENDING)) {
			return "asc";
		}
		return "desc";
	}

	public void setSortDirection(SortOrderEnum sortDirection) {
		this.sortDirection = sortDirection;
	}

	public String getSearchId() {
		return searchId;
	}

	public void setSearchId(String searchId) {
		this.searchId = searchId;
	}

	/**
	 * 取本页数据在所有数据集合中的起始索引位置
	 * @return
	 */
	public int getStartIndex(){
		return this.pageNumber*this.objectsPerPage-this.objectsPerPage;
	}
	
	/**
	 * 取本页数据在所有数据集合中的结束索引位置
	 * @return
	 */
	public int getEndIndex(){
		return this.pageNumber*this.objectsPerPage;
	}
}
