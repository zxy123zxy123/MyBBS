package com.wtu.mapper;

import com.wtu.entity.Theme;
import com.wtu.util.Params;

import java.util.List;

public interface ThemeMapper {
    //查询所有
    List<Theme> allTheme();
    //条件查询
    List<Theme> allTheme(Params params);
    //删除
    void deleteById(int id);
    //添加
    void insertTheme(Theme theme);
}
