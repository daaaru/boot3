package com.daru.boot3.board;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.daru.boot3.util.Pager;

@SpringBootTest
class BoardMapperTest {
	@Autowired
	private BoardMapper boardMapper;
	
	//@Test
	void setFileAddTest() throws Exception{
		BoardFilesVO boardFilesVO = new BoardFilesVO();
//		boardFilesVO.setFilename("filename");
//		boardFilesVO.setOriname("oriname");
		boardFilesVO.setNum(3L);
		int result = boardMapper.setFileAdd(boardFilesVO);
		assertEquals(1, result);
	}


	//@Test
	void getDetailTest() throws Exception {
		BoardVO boardVO = new BoardVO();
		boardVO.setNum(3L);
		boardVO = boardMapper.getDetail(boardVO);
		System.out.println(boardVO.toString());
		assertNotNull(boardVO);
		
	}
	
	//@Test
	void setAddTest() throws Exception{
		
		for(int i =0;i<100;i++) {
			if(i%10 == 0) {
				Thread.sleep(1000);
			}
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("titleadd"+i);
		boardVO.setWriter("writeradd"+i);
		boardVO.setContents("contentsadd"+i);
		
		int result = boardMapper.setAdd(boardVO);
		}
		System.out.println("finish");
//		assertEquals(1, result);
		
	}
	
	@Test
	void getListTest() throws Exception{
		Pager pager = new Pager();
		pager.makeRow();
		List<BoardVO> ar = boardMapper.getList(pager);
		System.out.println(ar);
		assertEquals(10, ar.size());;
	}
	
	//@Test
	void setUpdateTest() throws Exception{
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("update title");
		boardVO.setContents("update contents");
		boardVO.setNum(3L);
		
		int result = boardMapper.setUpdate(boardVO);
		assertEquals(1, result);
	}
	
	//@Test
	void setDeleteTest() throws Exception{
		BoardVO boardVO = new BoardVO();
		boardVO.setNum(4L);
		
		int result = boardMapper.setDelete(boardVO);
		assertEquals(1, result);
	}

}
