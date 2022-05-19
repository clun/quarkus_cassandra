package com.datastaxdev.todo.cassandra;

import java.util.Optional;

import com.datastax.oss.driver.api.core.PagingIterable;
import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.DefaultNullSavingStrategy;
import com.datastax.oss.driver.api.mapper.annotations.Delete;
import com.datastax.oss.driver.api.mapper.annotations.Insert;
import com.datastax.oss.driver.api.mapper.annotations.Select;
import com.datastax.oss.driver.api.mapper.entity.saving.NullSavingStrategy;

@Dao
@DefaultNullSavingStrategy(NullSavingStrategy.SET_TO_NULL)
public interface MyEntityDao {
    
    @Delete(entityClass = MyEntity.class)
    void deleteByCol1(String col1);
    
    @Select
    PagingIterable<MyEntity> findByPkCol1(String col1);

    @Select
    Optional<MyEntity> findById(String col1, String col2, String col3, String col4);
    
    @Insert
    void save(MyEntity product);    
}
