/**
 * 
 */
package kr.inamatrix.danguscore.gamers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.repackaged.org.json.JSONArray;
import com.google.appengine.repackaged.org.json.JSONException;

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
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("========================= ManagementGamersServlet doPost() =======================");
//        resp.getWriter().print(processRequest(req));
//        resp.getWriter().write("success");
//        resp.getWriter().write("fail");
//        resp.getWriter().write("unknown");
        
    }

    /**
     * @param req
     * @return
     */
    private String processRequest(HttpServletRequest req) {
        String action = req.getParameter("action");
        String result = "unknown_action";
        if("".equals(action)) {
            
        } else if ("".equals(action)) {
            
        }
        String value = req.getParameter("values");
        
        try {
            JSONArray array = new JSONArray(value);
            System.out.println(array.toString());
            
        } catch ( JSONException e ) {
            e.printStackTrace();
        }
        return result;
    }
}
