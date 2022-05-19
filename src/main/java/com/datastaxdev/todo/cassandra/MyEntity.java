package com.datastaxdev.todo.cassandra;

import java.time.LocalDate;

import com.datastax.oss.driver.api.mapper.annotations.ClusteringColumn;
import com.datastax.oss.driver.api.mapper.annotations.CqlName;
import com.datastax.oss.driver.api.mapper.annotations.Entity;
import com.datastax.oss.driver.api.mapper.annotations.PartitionKey;

@Entity
@CqlName("my_table")
public class MyEntity {
    
    @PartitionKey
    @CqlName("col_1")
    private String col1;
    
    @ClusteringColumn(0)
    @CqlName("col_2")
    private String col2;
    
    @ClusteringColumn(1)
    @CqlName("col_3")
    private String col3;
    
    @ClusteringColumn(2)
    @CqlName("col_4")
    private String col4;
    
    @CqlName("col_5")
    private String col5;
    
    @CqlName("col_6")
    private String col6;
    
    @CqlName("col_7")
    private LocalDate col7;
    
    /**
     * Default Constructor for instrospection
     */
    public MyEntity() {}
    
    /**
     * Get PK.
     *
     * @param col1
     *      partition key
     * @param col2
     *      cc 0
     * @param col3
     *      cc 1
     * @param col4
     *      cc 2
     */
    public MyEntity(String col1, String col2, String col3, String col4) {
        super();
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
        this.col4 = col4;
    }
    
    public MyEntity(String col1, String col2, String col3, String col4, String col5, String col6, LocalDate  col7) {
        this(col1, col2, col3, col4);
        this.col5 = col5;
        this.col6 = col6;
        this.col7 = col7;
    }

    /**
     * Getter accessor for attribute 'col1'.
     *
     * @return
     *       current value of 'col1'
     */
    public String getCol1() {
        return col1;
    }

    /**
     * Setter accessor for attribute 'col1'.
     * @param col1
     * 		new value for 'col1 '
     */
    public void setCol1(String col1) {
        this.col1 = col1;
    }

    /**
     * Getter accessor for attribute 'col2'.
     *
     * @return
     *       current value of 'col2'
     */
    public String getCol2() {
        return col2;
    }

    /**
     * Setter accessor for attribute 'col2'.
     * @param col2
     * 		new value for 'col2 '
     */
    public void setCol2(String col2) {
        this.col2 = col2;
    }

    /**
     * Getter accessor for attribute 'col3'.
     *
     * @return
     *       current value of 'col3'
     */
    public String getCol3() {
        return col3;
    }

    /**
     * Setter accessor for attribute 'col3'.
     * @param col3
     * 		new value for 'col3 '
     */
    public void setCol3(String col3) {
        this.col3 = col3;
    }

    /**
     * Getter accessor for attribute 'col4'.
     *
     * @return
     *       current value of 'col4'
     */
    public String getCol4() {
        return col4;
    }

    /**
     * Setter accessor for attribute 'col4'.
     * @param col4
     * 		new value for 'col4 '
     */
    public void setCol4(String col4) {
        this.col4 = col4;
    }

    /**
     * Getter accessor for attribute 'col5'.
     *
     * @return
     *       current value of 'col5'
     */
    public String getCol5() {
        return col5;
    }

    /**
     * Setter accessor for attribute 'col5'.
     * @param col5
     * 		new value for 'col5 '
     */
    public void setCol5(String col5) {
        this.col5 = col5;
    }

    /**
     * Getter accessor for attribute 'col6'.
     *
     * @return
     *       current value of 'col6'
     */
    public String getCol6() {
        return col6;
    }

    /**
     * Setter accessor for attribute 'col6'.
     * @param col6
     * 		new value for 'col6 '
     */
    public void setCol6(String col6) {
        this.col6 = col6;
    }

    /**
     * Getter accessor for attribute 'col7'.
     *
     * @return
     *       current value of 'col7'
     */
    public LocalDate getCol7() {
        return col7;
    }

    /**
     * Setter accessor for attribute 'col7'.
     * @param col7
     * 		new value for 'col7 '
     */
    public void setCol7(LocalDate col7) {
        this.col7 = col7;
    }
    
}
