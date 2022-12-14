package com.nineplus.bestwork.services;

import com.nineplus.bestwork.entity.SysActionEntity;
import com.nineplus.bestwork.repository.SysActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysActionService {

    @Autowired
    SysActionRepository sysActionRepository;

    public List<SysActionEntity> getSysActionBySysRole(List<String> nameList, String methodType) {
        return sysActionRepository.findSysPermissionBySysRoleName(nameList, methodType);
    }
}
