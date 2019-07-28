package chapter7;

import java.util.ArrayList;
import java.util.HashMap;

public class Question7 {
	// user-oriented...
	// chat server
	/*
	 * user
	 * 		msg
	 * 		request
	 * 		status(connected/disconnected)
	 * 			login/logout
	 * 
	 * msg queue
	 * 
	 * server
	 * 		users list
	 * 		msg queue
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
	}
}
enum StatusEnum{
	connected, disconnected;
}
class User{
	private String userId = "";
	private String userPw = "";
	private StatusEnum userStatus = StatusEnum.disconnected;
		
	public User(String id, String pw) {
		this.setUserId(id);
		this.setUserPw(pw);
	}
	public boolean sendMsg(String msg) {
		if(this.userStatus == StatusEnum.disconnected) {
			return false;
		}
		HashMap<String, String> tmpMap = new HashMap<String, String>();
		tmpMap.put(getUserId(), msg);
		// Server.MsgQueue.add(tmpMap);
		// tell me how to do this..
		return true;
	}
	
	
	
	
	public boolean login(String pw) {
		if(getUserPw() != pw) {
			return false;
		}
		this.userStatus = StatusEnum.connected;
		return true;
	}
	public boolean logout() {
		if(this.userStatus != StatusEnum.connected) {
			return false;
		}
		this.userStatus = StatusEnum.disconnected;
		return true;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
}

class Server{
	MsgQueue msgQ = new MsgQueue();
	ArrayList<User> registeredUserList = new ArrayList<User>();;
	public Server() {
		 this.registeredUserList = new ArrayList<User>();
	}
	
	class MsgQueue{
		///
	}
}