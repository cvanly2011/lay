package com.newleaders.ac.source;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by Lay on 2016/3/28.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        String dataSourceName = DatabaseContextHolder.getCustomerType();
        return dataSourceName;
    }
}
