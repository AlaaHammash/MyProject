package com.myproject;

import com.google.gson.Gson;
import com.myproject.model.Program;
import jdk.nashorn.internal.parser.JSONParser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@WebServlet("/index")

public class  SelectLiquorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String filterType = req.getParameter("Type");
        String filterValue = req.getParameter("Value");
        String filterUrl ;
        if(filterValue != "") {
            Map<String, String> map = new HashMap<String, String>();
            map.put(filterType, filterValue);
            filterUrl = Util.generateURLPath(map);
        }else{
            filterUrl="";
        }
        req.setAttribute("content",Util.getContentForPath(filterUrl ));
        req.getRequestDispatcher("WEB-INF/index.jsp").forward(req, resp);

    }


}

