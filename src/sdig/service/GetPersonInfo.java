package sdig.service;

import sdig.model.DataInfo;
import sdig.util.DruidUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetPersonInfo {
    //1.总人数
    public ArrayList<DataInfo> getPersonCount() throws Exception {
        ArrayList<DataInfo> infolist = new ArrayList<>();
        String sql = "select name,total from SD_persontotal";
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection dbconnection=null;
        try {
            dbconnection = DruidUtil.getConnection();
            pst = dbconnection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                DataInfo info = new DataInfo();
                info.setName(rs.getString("name"));
                info.setTotal(rs.getInt("total"));
                infolist.add(info);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DruidUtil.close(rs,pst,dbconnection);
        }
        return infolist;
    }
    //2.直属企业人数
    public ArrayList<DataInfo> getZsqyCount() throws Exception {
        ArrayList<DataInfo> infolist = new ArrayList<>();
        String sql = "select name,total from SD_zsqytotal";
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection dbconnection=null;
        try {
            dbconnection = DruidUtil.getConnection();
            pst = dbconnection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                DataInfo info = new DataInfo();
                info.setName(rs.getString("name"));
                info.setTotal(rs.getInt("total"));
                infolist.add(info);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DruidUtil.close(rs,pst,dbconnection);
        }
        return infolist;
    }
    //3.退休人数
    public ArrayList<DataInfo> getTxCount() throws Exception {
        ArrayList<DataInfo> infolist = new ArrayList<>();
        String sql = "select name,total from SD_txtotal";
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection dbconnection=null;
        try {
            dbconnection = DruidUtil.getConnection();
            pst = dbconnection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                DataInfo info = new DataInfo();
                info.setName(rs.getString("name"));
                info.setTotal(rs.getInt("total"));
                infolist.add(info);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DruidUtil.close(rs,pst,dbconnection);
        }
        return infolist;
    }
    //4.离职人数
    public ArrayList<DataInfo> getLzCount() throws Exception {
        ArrayList<DataInfo> infolist = new ArrayList<>();
        String sql = "select name,total from SD_lztotal";
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection dbconnection=null;
        try {
            dbconnection = DruidUtil.getConnection();
            pst = dbconnection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                DataInfo info = new DataInfo();
                info.setName(rs.getString("name"));
                info.setTotal(rs.getInt("total"));
                infolist.add(info);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DruidUtil.close(rs,pst,dbconnection);
        }
        return infolist;
    }
    //5.性别
    public ArrayList<DataInfo> getXbCount() throws Exception {
        ArrayList<DataInfo> infolist = new ArrayList<>();
        String sql = "select name,total from SD_xbtotal";
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection dbconnection=null;
        try {
            dbconnection = DruidUtil.getConnection();
            pst = dbconnection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                DataInfo info = new DataInfo();
                info.setName(rs.getString("name"));
                info.setTotal(rs.getInt("total"));
                infolist.add(info);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DruidUtil.close(rs,pst,dbconnection);
        }
        return infolist;
    }
    //6.人员类别
    public ArrayList<DataInfo> getRylbCount() throws Exception {
        ArrayList<DataInfo> infolist = new ArrayList<>();
        String sql = "select name,total from SD_rylbtotal";
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection dbconnection=null;
        try {
            dbconnection = DruidUtil.getConnection();
            pst = dbconnection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                DataInfo info = new DataInfo();
                info.setName(rs.getString("name"));
                info.setTotal(rs.getInt("total"));
                infolist.add(info);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DruidUtil.close(rs,pst,dbconnection);
        }
        return infolist;
    }
    //7.职级
    public ArrayList<DataInfo> getZjCount() throws Exception {
        ArrayList<DataInfo> infolist = new ArrayList<>();
        String sql = "select name,total from SD_zjtotal";
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection dbconnection=null;
        try {
            dbconnection = DruidUtil.getConnection();
            pst = dbconnection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                DataInfo info = new DataInfo();
                info.setName(rs.getString("name"));
                info.setTotal(rs.getInt("total"));
                infolist.add(info);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DruidUtil.close(rs,pst,dbconnection);
        }
        return infolist;
    }
    //8.学历
    public ArrayList<DataInfo> getXlCount() throws Exception {
        ArrayList<DataInfo> infolist = new ArrayList<>();
        String sql = "select name,total from SD_xltotal";
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection dbconnection=null;
        try {
            dbconnection = DruidUtil.getConnection();
            pst = dbconnection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                DataInfo info = new DataInfo();
                info.setName(rs.getString("name"));
                info.setTotal(rs.getInt("total"));
                infolist.add(info);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DruidUtil.close(rs,pst,dbconnection);
        }
        return infolist;
    }
    //9.职称
    public ArrayList<DataInfo> getZcCount() throws Exception {
        ArrayList<DataInfo> infolist = new ArrayList<>();
        String sql = "select name,total from SD_zctotal";
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection dbconnection=null;
        try {
            dbconnection = DruidUtil.getConnection();
            pst = dbconnection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                DataInfo info = new DataInfo();
                info.setName(rs.getString("name"));
                info.setTotal(rs.getInt("total"));
                infolist.add(info);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DruidUtil.close(rs,pst,dbconnection);
        }
        return infolist;
    }
    //10.年龄
    public ArrayList<DataInfo> getNlCount() throws Exception {
        ArrayList<DataInfo> infolist = new ArrayList<>();
        String sql = "select name,total from SD_nltotal";
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection dbconnection=null;
        try {
            dbconnection = DruidUtil.getConnection();
            pst = dbconnection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                DataInfo info = new DataInfo();
                info.setName(rs.getString("name"));
                info.setTotal(rs.getInt("total"));
                infolist.add(info);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DruidUtil.close(rs,pst,dbconnection);
        }
        return infolist;
    }
}
