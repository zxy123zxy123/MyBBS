package com.wtu.service;

import com.wtu.entity.Theme;
import com.wtu.util.Params;

import java.util.List;

public interface ThemeService {
    //查询
    List<Theme> allTheme();
    //分页查询
    List<Theme> allTheme(Params params);
    //删除
    void deleteById(int id);
    //添加
    void insertTheme(Theme theme);
}
