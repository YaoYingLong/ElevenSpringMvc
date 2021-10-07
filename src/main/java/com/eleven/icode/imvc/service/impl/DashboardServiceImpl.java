package com.eleven.icode.imvc.service.impl;

import com.eleven.icode.imvc.entity.User;
import com.eleven.icode.imvc.service.DashboardService;
import org.springframework.stereotype.Service;

/**
 * @author by YingLong on 2021/10/5
 */
@Service
public class DashboardServiceImpl implements DashboardService {
    @Override
    public User getUserInfo() {
        System.out.println("DashboardService getUserInfo");
        return null;
    }
}
