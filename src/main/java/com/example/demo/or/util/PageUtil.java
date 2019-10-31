package com.example.demo.or.util;

public class PageUtil {
	private String page;//���չ���������ҳ
	private int count;//�ܼ�¼��
	private int pageSize;//��ҳ��λ
	
	private int curPage;//�����ĵ�ǰҳ
	private int prevPage;//��һҳ
	private int lastPage;//βҳ
	private int nextPage;//��һҳ
	private int startIndex;//����ֵ
	private int endIndex;//����ֵ
	
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}
	public int getLastPage() {
		return lastPage;
	}
	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public PageUtil(String page, int count, int pageSize) {
		super();
		this.page = page;
		this.count = count;
		this.pageSize = pageSize;
		
		//��������ֵ����һҳ����һҳ��βҳ
		this.curPage = page == null ? 1 :Integer.parseInt(page);
		this.startIndex = (this.curPage - 1)*pageSize+1;//��������ֵ
		this.endIndex = curPage * pageSize;//��������ֵ
		this.prevPage = this.curPage==1? 1:(this.curPage-1);//������һҳ
		this.lastPage = count%pageSize == 0 ? (count/pageSize) : (count/pageSize+1);//����βҳ
		this.nextPage = this.curPage == this.lastPage ? this.lastPage : (this.curPage +1);
	}
	
	
	@Override
	public String toString() {
		return "PageUtil [page=" + page + ", count=" + count + ", pageSize="
				+ pageSize + ", curPage=" + curPage + ", prevPage=" + prevPage
				+ ", lastPage=" + lastPage + ", nextPage=" + nextPage
				+ ", startIndex=" + startIndex + "]";
	}
}
