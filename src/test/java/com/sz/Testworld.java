package com.sz;

import com.sz.Mapper.worldMapper;
import com.sz.pojo.world;
import com.sz.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Testworld {
    @Test
    public void insert(){
        SqlSession sqlSession=MybatisUtil.getSession();
        worldMapper mapper=sqlSession.getMapper(worldMapper.class);
        world w=new world();
        w.setId(2l);
        w.setCountry("俄罗斯");
        w.setCity("莫斯科");
        mapper.insert(w);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void check(){
        SqlSession sqlSession= MybatisUtil.getSession();
        worldMapper mapper=sqlSession.getMapper(worldMapper.class);

        world w = mapper.queryById(3L);

        System.out.println(w);

        sqlSession.close();
    }


}
