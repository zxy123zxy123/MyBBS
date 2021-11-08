package com.wtu.controller;


import com.github.pagehelper.PageInfo;
import com.wtu.entity.Comment;
import com.wtu.entity.Theme;
import com.wtu.service.ThemeService;
import com.wtu.util.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ThemeController {
    @Autowired
    private ThemeService themeService;

    @RequestMapping("/allTheme")
    public String allTheme(Model model){
        List<Theme> themeList = themeService.allTheme();
        model.addAttribute("themeList",themeList);
        return "themeList";
    }

    @RequestMapping("/allTheme2")
    public String allTheme(Model model, Params params){
        List<Theme> themeList = themeService.allTheme(params);
        PageInfo<Theme> pageInfo = new PageInfo<>(themeList);
//        model.addAttribute("themeList",themeList);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("params",params);
        return "themeList";
    }

    //删除
    @RequestMapping("/deleteTheme")
    public String deleteThemeById(int id){
        themeService.deleteById(id);
        return "redirect:allTheme2";
    }
    //添加
    @RequestMapping("/insertTheme")
    public String insertTheme(Theme theme){
        themeService.insertTheme(theme);
        return "redirect:allTheme2";
    }
}
