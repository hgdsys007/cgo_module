package com.cgo.db.service.impl;

import com.cgo.db.entity.SysConfig;
import com.cgo.db.mapper.SysConfigMapper;
import com.cgo.db.service.ISysConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 全局配置表 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Service
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfig> implements ISysConfigService {

}
