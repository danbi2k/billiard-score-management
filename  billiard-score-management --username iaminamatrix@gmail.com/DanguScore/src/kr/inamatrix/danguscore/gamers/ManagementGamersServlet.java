/**
 * 
 */
package kr.inamatrix.danguscore.gamers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Title: ManagementGamersServlet.java<br>
 * Description: <br>
 * Copyright: Copyright(c) 2012 Inamatrix ALL Rights Reserved<br>
 * 
 * @author Jonghwa, Lee
 * @version 1.0
 * @created 2012. 1. 2.
 * @modified 2012. 1. 2.
 */
public class ManagementGamersServlet extends HttpServlet{

    /**
     * 
     */
    private static final long serialVersionUID = -5855269236116330514L;
    
    

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("========================= ManagementGamersServlet doGet() =======================");
        System.out.println(req);
        System.out.println(resp);
    }



    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);
        System.out.println("========================= ManagementGamersServlet doPost() =======================");
        System.out.println(req);
        System.out.println(resp);
    }
}
