package com.alibaba.dubbo.dubbo.Imp;

import java.util.List;

/**
 * Created by wy on 2017/4/13.
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
