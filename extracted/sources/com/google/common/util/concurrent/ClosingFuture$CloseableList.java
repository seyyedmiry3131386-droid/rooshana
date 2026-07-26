package com.google.common.util.concurrent;

import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class ClosingFuture$CloseableList extends IdentityHashMap<AutoCloseable, Executor> implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
