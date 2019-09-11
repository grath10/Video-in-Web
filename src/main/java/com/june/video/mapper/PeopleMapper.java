package com.june.video.mapper;

import com.june.video.domain.People;
import com.june.video.domain.PeopleCriteria;
import java.util.List;
import tk.mybatis.mapper.common.Mapper;

public interface PeopleMapper extends Mapper<People> {
    List<People> selectByExample(PeopleCriteria example);
}