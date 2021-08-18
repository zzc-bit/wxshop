package com.platform.service;

import com.platform.dao.ApiHelpPeopleMapper;
import com.platform.entity.HelpPeopleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ApiHelpPeopleService {
    @Autowired
    private ApiHelpPeopleMapper helpPeopleDao;

    public List<HelpPeopleVo> queryList(){
        return helpPeopleDao.queryList();
    }
}
