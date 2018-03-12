package com.myproject;

import com.myproject.model.FilterParameter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@WebServlet("/index")

public class  SelectLiquorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String filterUrl ;
        filterUrl= Util.generateURLPath(getParameters(req));
        req.setAttribute("content",Util.getContentForPath(filterUrl ));
        req.getRequestDispatcher("WEB-INF/index.jsp").forward(req, resp);


 }
  private  Map<String, String> getParameters(HttpServletRequest req){
    Map<String, String> map = new HashMap<String, String>();
      if(req.getParameter("destinationName") != "")  map.put(FilterParameter.filterParameters.destinationName.toString(),req.getParameter("destinationName"));
      if(req.getParameter("regionID") != "")  map.put(FilterParameter.filterParameters.regionID.toString(),req.getParameter("regionID"));
      if(req.getParameter("destinationCity") != "") map.put(FilterParameter.filterParameters.destinationCity.toString(),req.getParameter("destinationCity"));
      if(req.getParameter("lenghtOfStay") != "") map.put(FilterParameter.filterParameters.lenghtOfStay.toString(),req.getParameter("lenghtOfStay"));
      if(req.getParameter("minStartDate") != "") map.put(FilterParameter.filterParameters.minStartDate.toString(),req.getParameter("minStartDate"));

      if(req.getParameter("maxStartDate") != "") map.put(FilterParameter.filterParameters.maxStartDate.toString(),req.getParameter("maxStartDate"));
      if(req.getParameter("minStarRating") != "") map.put(FilterParameter.filterParameters.minStarRating.toString(),req.getParameter("minStarRating"));
      if(req.getParameter("maxStarRating") != "") map.put(FilterParameter.filterParameters.maxStarRating.toString(),req.getParameter("maxStarRating"));
      if(req.getParameter("minTotalRate") != "") map.put(FilterParameter.filterParameters.minTotalRate.toString(),req.getParameter("minTotalRate"));
      if(req.getParameter("maxTotalRate") != "") map.put(FilterParameter.filterParameters.maxTotalRate.toString(),req.getParameter("maxTotalRate"));
      if(req.getParameter("minGuestRate") != "") map.put(FilterParameter.filterParameters.minGuestRate.toString(),req.getParameter("minGuestRate"));
      if(req.getParameter("maxGuestRate") != "") map.put(FilterParameter.filterParameters.maxGuestRate.toString(),req.getParameter("maxGuestRate"));

   return map;

    }




}



