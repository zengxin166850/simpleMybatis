package mybatis.simple.mapper;

import mybatis.simple.model.Country;

import java.util.List;

/**
 * @author zengxin
 * @version 1.0
 * @date 2019/9/4 14:22
 */
public interface CountryMapper {
    List<Country> selectAll();
}
