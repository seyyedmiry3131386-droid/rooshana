package com.j256.ormlite.dao;

/* JADX INFO: loaded from: classes3.dex */
public interface CloseableWrappedIterable<T> extends CloseableIterable<T>, AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close() throws Exception;
}
