package com.daru.boot3.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.daru.boot3.util.Pager;

@Mapper
public interface BoardMapper {
	
	//setfileAdd
	public int setFileAdd (BoardFilesVO boardFilesVO) throws Exception;
	
	public int setFileDelete (BoardFilesVO boardFilesVO) throws Exception;
	
	public BoardFilesVO getFileDetail (BoardFilesVO boardFilesVO) throws Exception;
	
	public List<BoardFilesVO> getFileList() throws Exception;
	
	
	
	public BoardVO getDetail (BoardVO boardVO) throws Exception;

	public List<BoardVO> getList(Pager pager) throws Exception;
	
	public int setAdd (BoardVO boardVO) throws Exception;
	
	public int setUpdate (BoardVO boardVO) throws Exception;
	
	public int setDelete (BoardVO boardVO) throws Exception;
}
