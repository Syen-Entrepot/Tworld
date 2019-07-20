package com.sz.Mapper;

import com.sz.pojo.world;

public interface worldMapper {
   world insert(world World);
   world queryById(Long id);
}
