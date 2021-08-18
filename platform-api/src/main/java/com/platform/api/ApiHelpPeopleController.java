package com.platform.api;

import com.platform.annotation.IgnoreAuth;
import com.platform.entity.HelpPeopleVo;
import com.platform.service.ApiHelpPeopleService;
import com.platform.util.ApiBaseAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/helppeople")
public class ApiHelpPeopleController extends ApiBaseAction {
    @Autowired
    private ApiHelpPeopleService helpPeopleService;
    /**
     * 查看提出问题人员列表
     */
    @RequestMapping(value = "/peopleList")
    @IgnoreAuth
    public Object peopleList(){
        List<HelpPeopleVo> list=helpPeopleService.queryList();
        return toResponseSuccess(list);
    }
}
