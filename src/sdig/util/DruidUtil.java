package sdig.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DruidUtil {
    private static DataSource ds ;

    static {
        Properties pro = new Properties();
        try {
            InputStream is = DruidUtil.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /*获取链接*/
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    /**
     * 获取链接池方法
     */
    public static DataSource getDataSource(){
        return ds;
    }
    /*释放资源*/
    public static void close(PreparedStatement stmt, Connection conn){
        close(stmt,conn);
    }

    public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) throws Exception {
        if (rs!=null){
            rs.close();
        }
        if (stmt!=null){
            stmt.close();
        }
        if(conn!=null){
            conn.close();
        }
    }
}
