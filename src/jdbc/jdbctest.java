package jdbc;


import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class jdbctest {
	@Test
	public void test() throws Exception{
		//׼�����ӳ�
		ComboPooledDataSource cm = new ComboPooledDataSource("helloc3p0");
		//����jdbcģ�岢�������ӳ�
		 
		cm.setJdbcUrl("jdbc:mysql://localhost:3306/test");
		cm.setUser("root");
		cm.setPassword("xcy199776");
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(cm);
		String sql = "insert into user value(4,'Ф��2',100)";
		jt.update(sql);
	}
}
