package com.buct.music.dao;

import com.buct.music.domin.Singer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Zhang JunFeng
 * @date 2021/1/1 22:41
 */
@Mapper
@Repository
public interface SingerMapper {
    // 增加歌手
    int insert(Singer singer);

    // 需改歌手
    int update(Singer singer);

    // 删除歌手
    int delete(Long id);

    // 根据主键查询整个对象
    Singer selectByPrimaryKey(Long id);

    // 查询所有歌手
    List<Singer> selectAllSinger();

    // 根据歌手名字模糊查询
    List<Singer> selectByName(String name);

    // 根据男女查询
    List<Singer> selectBySex(Boolean sex);
}