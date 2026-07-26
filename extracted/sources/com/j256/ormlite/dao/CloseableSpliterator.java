package com.j256.ormlite.dao;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes3.dex */
public interface CloseableSpliterator<T> extends Spliterator<T>, AutoCloseable {
    void closeQuietly();
}
