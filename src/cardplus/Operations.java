/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardplus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operations {
    Database db=new Database();
    public ResultSet getStudentInfo() {
        ResultSet rs = null;
        try {
            Connection con;
            con = db.con;
            PreparedStatement p= con.prepareStatement("select * from stud_info");
            rs=p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet getStudentEdu() {
        ResultSet rs = null;
        try {
            Connection con;
            con = db.con;
            PreparedStatement p= con.prepareStatement("select * from stud_edu");
            rs=p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet getStudentMess() {
        ResultSet rs = null;
        try {
            Connection con;
            con = db.con;
            PreparedStatement p= con.prepareStatement("select * from stud_mess");
            rs=p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet getStudentHostel() {
        ResultSet rs = null;
        try {
            Connection con;
            con = db.con;
            PreparedStatement p= con.prepareStatement("select * from stud_host");
            rs=p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet getAdminList() {
        ResultSet rs = null;
        try {
            Connection con;
            con = db.con;
            PreparedStatement p= con.prepareStatement("select * from admin");
            rs=p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet getColleges() {
        ResultSet rs = null;
        try {
            Connection con;
            con = db.con;
            PreparedStatement p= con.prepareStatement("select * from colleges");
            rs=p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("cardplus.Operations.getColleges()");
        return rs;
    }
    
    public ResultSet getDepartment() {
        ResultSet rs = null;
        try {
            Connection con;
            con = db.con;
            PreparedStatement p= con.prepareStatement("select * from department");
            rs=p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet getMess() {
        ResultSet rs = null;
        try {
            Connection con;
            con = db.con;
            PreparedStatement p= con.prepareStatement("select * from mess");
            rs=p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet getHostel() {
        ResultSet rs = null;
        try {
            Connection con;
            con = db.con;
            PreparedStatement p= con.prepareStatement("select * from hostel");
            rs=p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
