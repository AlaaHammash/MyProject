/*
 * Description: Main page controller
 * Created by: Benedict Aluan
 * Website: http://benpad.blogspot.com
 * Date: March 10, 2009
 *
 * */

package com.myproject.controllers;

import com.myproject.Util;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageController extends MultiActionController {

    public ModelAndView showIndex(HttpServletRequest request, HttpServletResponse response) {

        return new ModelAndView("index-page", "content", Util.getContentForPath(""));
    }

}
