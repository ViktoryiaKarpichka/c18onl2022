package com.tms.repository;

import com.tms.repository.utils.ConnectionPool;

public interface BaseRepository {

    ConnectionPool CONNECTION_POOL = ConnectionPool.getInstance();

}
