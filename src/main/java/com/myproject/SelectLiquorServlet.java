package com.myproject;

import com.google.gson.Gson;
import com.myproject.model.FilterParameter;
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
        String filterUrl ;
        filterUrl = Util.generateURLPath(getParametersMap(req));
        req.setAttribute("content",Util.getContentForPath(filterUrl ));
        req.getRequestDispatcher("WEB-INF/index.jsp").forward(req, resp);

    }



    private Map<String, String>  getParametersMap(HttpServletRequest req){
        Map<String, String> map = new HashMap<String, String>();
        String filterType = req.getParameter("Type");
        if(req.getParameter("destinationName") != "")
        map.put(FilterParameter.filterParameters.destinationName.toString(),   req.getParameter("destinationName"));
        if(req.getParameter("destinationCity") != "")
        map.put(FilterParameter.filterParameters.destinationName.toString(),   req.getParameter("destinationCity"));
        if(req.getParameter("regionIds") != "")
            map.put(FilterParameter.filterParameters.regionID.toString(),   req.getParameter("regionIds"));
        if(req.getParameter("destinationCity") != "")
            map.put(FilterParameter.filterParameters.destinationName.toString(),   req.getParameter("minStartDate"));
        if(req.getParameter("minStartDate") != "")
            map.put(FilterParameter.filterParameters.minStartDate.toString(),   req.getParameter("minStartDate"));
        if(req.getParameter("lenghtOfStay") != "")
            map.put(FilterParameter.filterParameters.lenghtOfStay.toString(),   req.getParameter("lenghtOfStay"));
        if(req.getParameter("minStarRating") != "")
            map.put(FilterParameter.filterParameters.minStarRating.toString(),   req.getParameter("minStarRating"));
        if(req.getParameter("maxStarRating") != "")
            map.put(FilterParameter.filterParameters.maxStarRating.toString(),   req.getParameter("maxStarRating"));
        if(req.getParameter("maxTotalRate") != "")
            map.put(FilterParameter.filterParameters.maxTotalRate.toString(),   req.getParameter("maxTotalRate"));
        if(req.getParameter("minTotalRate") != "")
            map.put(FilterParameter.filterParameters.minTotalRate.toString(),   req.getParameter("minTotalRate"));
        if(req.getParameter("minGuestRate") != "")
            map.put(FilterParameter.filterParameters.minGuestRate.toString(),   req.getParameter("minGuestRate"));
        if(req.getParameter("maxGuestRate") != "")
            map.put(FilterParameter.filterParameters.maxGuestRate.toString(),   req.getParameter("maxGuestRate"));
        return map;
    }


}

