package org.apache.commons.io.input;

import defpackage.bl4;
import java.io.Reader;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class CharSequenceReader extends Reader implements Serializable {
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Reader
    public final void mark(int i) {
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public final int read() {
        throw null;
    }

    @Override // java.io.Reader
    public final void reset() {
    }

    @Override // java.io.Reader
    public final long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "Number of characters to skip is less than zero: "));
        }
        throw null;
    }

    public final String toString() {
        throw null;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        throw null;
    }
}
