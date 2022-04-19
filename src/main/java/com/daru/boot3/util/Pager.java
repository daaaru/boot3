package com.daru.boot3.util;

import lombok.Data;

@Data
public class Pager {
	
	//DB에서 몇개씩 조회(파라미터값 가능)
	private Integer perPage;
	//DB에 조회할 시작번호
	private Integer startRow;
	
	
	//페이지 번호(파라미터)
	private Integer pn;
	
	//검색종류(파라미터 값)
	private String kind;
	
	//검색어(파라미터 값)
	private String search;
	
	//jsp 사용변수
	private Long startNum;
	private Long lastNum;
	
	private boolean pre;
	private boolean next;
	
	
	public void makeRow() {
		//pn : 1, perpage:10, startRow:0
		//pn : 2, perpage:10, startRow:10
		//pn : 3, perpage:10, startRow:20
		this.startRow = (this.getPn()-1)*this.getPerPage();

	}
	
	public void makeNum(Long totalCount) {
		System.out.println(totalCount);
		Long totalPage = totalCount/this.getPerPage();
		if(totalCount%this.getPerPage()!=0) {
			totalPage++;
		}
		Long perBlock=5L;
		
		Long totalBlock=totalPage/perBlock;
		if(totalPage%perBlock!=0) {
			totalBlock++;
		}
		Long curBlock = this.getPn()/perBlock;
		if(this.getPn()%perBlock!=0) {
			curBlock++;
		}
		this.startNum=(curBlock-1)*perBlock+1;
		this.lastNum=curBlock*perBlock;
		
		if(curBlock>1) {
			this.pre=true;
		}
		if(totalBlock>curBlock) {
			this.next=true;
		}
		
		if(curBlock==totalBlock) {
			this.lastNum=totalPage;
		}
		if(totalCount==0) {
			this.lastNum=0L;
		}
		
	}
	
	public Integer getPn() {
		if(this.pn==null || this.pn<1) {
			this.pn = 1;
		}
		return this.pn;
	}
	
	public Integer getPerPage() {
		if(this.perPage==null||this.perPage<1) {
			this.perPage=10;
		}
		return this.perPage;
		
	}
	
	//GETTER = get+멤버변수명, 멤버변수명의 첫글자는 대문자
	public String getSearch() {
		if(this.search==null) {
			this.search="";
		}
		
		return this.search;
	}
	


}
