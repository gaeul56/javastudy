package dto;

import java.sql.Date;

public class UserDto {
  
  private int user_no;
  private String user_id;
  private String user_name;
  private Date joined_at;
  
  //기본 생성자
  public UserDto() { 
  
  }
  //매개변수를 받는 생성자
  public UserDto(int user_no, String user_id, String user_name, Date joined_at) { 
    super();
    this.user_no = user_no;
    this.user_id = user_id;
    this.user_name = user_name;
    this.joined_at = joined_at;
  }
  
  //사용자 번호의 getter 메소드
  public int getUser_no() {
    return user_no;
  }
  //사용자 번호의 setter 메소드
  public void setUser_no(int user_no) {
    this.user_no = user_no;
  }
  //사용자 아이디의 getter 메소
  public String getUser_id() {
    return user_id;
  }
  public void setUser_id(String user_id) {
    this.user_id = user_id;
  }
  public String getUser_name() {
    return user_name;
  }
  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }
  public Date getJoined_at() {
    return joined_at;
  }
  public void setJoined_at(Date joined_at) {
    this.joined_at = joined_at;
  }
  @Override
  public String toString() {
    return "UserDto [user_no=" + user_no + ", user_id=" + user_id + ", user_name=" + user_name + ", joined_at="
        + joined_at + "]";
  }
  
}