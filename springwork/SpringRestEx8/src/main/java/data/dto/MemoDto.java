package data.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MemoDto {
	private int num;
	private String nickname;
	private String photo;
	private String memo;
	private int likes;
	private Timestamp writeday;
}
