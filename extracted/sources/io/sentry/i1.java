package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public interface i1 {
    void a(Object obj, Writer writer);

    String b(ConcurrentHashMap concurrentHashMap);

    Object c(Reader reader, Class cls);

    io.sentry.internal.debugmeta.c d(BufferedInputStream bufferedInputStream);

    void e(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream);
}
