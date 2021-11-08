package com.wtu.service;

import com.github.pagehelper.PageHelper;
import com.wtu.entity.Theme;
import com.wtu.mapper.ThemeMapper;
import com.wtu.util.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeServiceImpl implements ThemeService{

    @Autowired
    private ThemeMapper themeMapper;

    @Override
    public List<Theme> allTheme() {
        return themeMapper.allTheme();
    }

    @Override
    public List<Theme> allTheme(Params params) {
        if(params.getPageNum()==0){
            params.setPageNum(1);
        }
        PageHelper.startPage(params.getPageNum(),params.getPageSize());

        return themeMapper.allTheme(params);
    }

    @Override
    public void deleteById(int id) {
        themeMapper.deleteById(id);
    }

    @Override
    public void insertTheme(Theme theme) {
        themeMapper.insertTheme(theme);
    }
}
