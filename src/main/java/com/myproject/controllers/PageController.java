/*
* Description: Main page controller
* Created by: Benedict Aluan
* Website: http://benpad.blogspot.com
* Date: March 10, 2009
* 
* */

package com.myproject.controllers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.myproject.Util;
import com.myproject.model.Program;
import jdk.nashorn.internal.objects.Global;
import jdk.nashorn.internal.parser.JSONParser;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

public class PageController extends MultiActionController {

    public ModelAndView showIndex(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("index-page", "content",Util.getContentForPath(""));
    }

}
