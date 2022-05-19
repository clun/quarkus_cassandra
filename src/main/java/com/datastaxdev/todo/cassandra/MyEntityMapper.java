package com.datastaxdev.todo.cassandra;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.mapper.MapperBuilder;
import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

@Mapper
public interface MyEntityMapper {
    
    @DaoFactory
    MyEntityDao myEntityDao();
    
    /**
     * Utility to initialize.
     * 
     * @param session
     *      target session
     * @return
     *      target builder
     */
    static MapperBuilder<MyEntityMapper> builder(CqlSession session) {
        return new MyEntityMapperBuilder(session);
    }
    
}