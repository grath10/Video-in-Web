package com.june.video.mapper;

import com.june.video.domain.Device;
import com.june.video.domain.DeviceCriteria;
import java.util.List;
import tk.mybatis.mapper.common.Mapper;

public interface DeviceMapper extends Mapper<Device> {
    List<Device> selectByExample(DeviceCriteria example);
}