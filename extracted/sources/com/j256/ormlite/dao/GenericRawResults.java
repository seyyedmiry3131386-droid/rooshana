package com.j256.ormlite.dao;

import java.sql.SQLException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface GenericRawResults<T> extends CloseableWrappedIterable<T> {
    @Override // com.j256.ormlite.dao.CloseableWrappedIterable, java.lang.AutoCloseable
    void close() throws Exception;

    String[] getColumnNames();

    T getFirstResult() throws SQLException;

    int getNumberColumns();

    List<T> getResults() throws SQLException;
}
