package com.j256.ormlite.dao;

/* JADX INFO: loaded from: classes3.dex */
public interface CloseableIterable<T> extends Iterable<T> {
    CloseableIterator<T> closeableIterator();
}
