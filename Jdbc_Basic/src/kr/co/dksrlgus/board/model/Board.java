package kr.co.dksrlgus.board.model;

import java.sql.Date;

public class Board {
	
	private Long boardID;
	private String writer;
	private String title;
	private String content;
	private Date createdAt;
	
	public Board() {}

	public Board(Long boardID, String writer, String title, String content, Date createdAt) {
		super();
		this.boardID = boardID;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.createdAt = createdAt;
	}

	public Long getBoardID() {
		return boardID;
	}

	public void setBoardID(Long boardID) {
		this.boardID = boardID;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
	

}
