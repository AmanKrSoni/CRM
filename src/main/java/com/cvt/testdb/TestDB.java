package com.cvt.testdb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/testdb")
public class TestDB extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //setup connection varaible
        String username="springstudent";
        String password="springstudent";
        String url="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
        String driver="com.mysql.jdbc.Driver";

        //get connection
       /* try{
            PrintWriter out=response.getWriter();
            out.println("Connecting to Database ......" +url);
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(url,username,password);
            out.println("Connection Established Successfully .....");
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
            throw new ServletException(e);
        }*/

    }

}
