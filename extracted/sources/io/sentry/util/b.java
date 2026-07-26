package io.sentry.util;

import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Writer {
    public long a = 0;

    public static int b(char c) {
        if (c <= 127) {
            return 1;
        }
        return (c > 2047 && !Character.isSurrogate(c)) ? 3 : 2;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            this.a += (long) b(cArr[i3]);
        }
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.a += (long) b((char) i);
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            this.a += (long) b(str.charAt(i3));
        }
    }
}
