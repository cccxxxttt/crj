package com.java14.teacherchen.loginDaoImpl;

import java.sql.Connection;
import java.sql.ResultSet;

import com.java14.teacherchen.jdbcManager.JdbcManager;
import com.java14.teacherchen.loginDao.UserDao;
import com.java14.teacherchen.loginModel.User;

public class UserDaoImpl implements UserDao {
	private Connection conn;
	private String driverStr;
	private String databaseUrlStr;
	private String nameStr;
	private String pwdStr;
	
	public void init(){
		 conn = null;
		 driverStr = "com.hxtt.sql.access.AccessDriver";
		 databaseUrlStr = "jdbc:Access:///D:/S2SH/dba.mdb";
		 nameStr = "";
		 pwdStr = "";
	}
	public boolean login(User user) {
		
		if(user.getStr_name().equals("admin")&&user.getStr_password().equals("nihao")){
       	 return true;
       	 }
       	 else{
       		 return false;
       	 }
	}

	public void selectall() {
		// TODO Auto-generated method stub
		
	}

	public boolean register(User user) {
		//链接数据库，插入数据； insert
		//if(user.getStr_name()==null || user.getStr_password()==null || user.getI_age()==0){
		 //       return false;}
		//else{
			init();
			JdbcManager jdbcManager=new JdbcManager();
			jdbcManager.setDriverStr(driverStr);
			jdbcManager.setDatabaseUrlStr(databaseUrlStr);
			jdbcManager.setNameStr(nameStr);
			jdbcManager.setPwdStr(pwdStr);
			
			conn=jdbcManager.getConnection();
			String sql="INSERT INTO user(name,password,age) VALUES ('"+user.getStr_name()+"','"+user.getStr_password()+"',"+user.getI_age()+")";
			boolean a=jdbcManager.executeSQL(conn, sql);
			if(a){
			System.out.println(user.getStr_name());
			System.out.println(user.getStr_password());
			System.out.println("user saved!!!!!");
			return true;}
			else{return false;}
		//}
	}

}
