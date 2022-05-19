package com.datastax.workshop;

import javax.inject.Inject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.datastax.oss.quarkus.runtime.api.session.QuarkusCqlSession;
import com.datastaxdev.todo.cassandra.MyEntity;
import com.datastaxdev.todo.cassandra.MyEntityDao;
import com.datastaxdev.todo.cassandra.MyEntityMapper;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class E02_QuarkusObjectMapping {

    /** Logger for the class. */
    static Logger LOGGER = LoggerFactory.getLogger(E02_QuarkusObjectMapping.class);
    
    private MyEntityDao dao;
    
    @Inject
    QuarkusCqlSession quarkusCqlSession;
            
    @BeforeEach
    public void initDao() {
        dao = MyEntityMapper.builder(quarkusCqlSession)
                .withDefaultKeyspace(quarkusCqlSession.getKeyspace().get())
                .build()
                .myEntityDao();
    }
    
    @Test
    public void testObjectMapping() {
        // Insertion
        dao.save(new MyEntity("1", "A", "B", "C"));
        dao.save(new MyEntity("1", "D", "E", "F"));
        
        
    }
    
}
