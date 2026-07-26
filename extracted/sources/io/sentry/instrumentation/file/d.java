package io.sentry.instrumentation.file;

import defpackage.dd1;
import defpackage.ur4;
import defpackage.wm2;
import io.sentry.h4;
import io.sentry.k1;
import io.sentry.util.h;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends FileInputStream {
    public final FileInputStream a;
    public final wm2 b;

    public d(File file) {
        this(b(file, null));
    }

    public static b b(File file, FileInputStream fileInputStream) {
        k1 k1VarO = h.a ? h4.b().o() : h4.b().d();
        k1 k1VarU = k1VarO != null ? k1VarO.u("file.read") : null;
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new b(file, k1VarU, fileInputStream, h4.b().m());
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.a(this.a);
        super.close();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() throws IOException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.b.d(new ur4(this, atomicInteger, 28));
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final long skip(long j) {
        return ((Long) this.b.d(new dd1(j, this))).longValue();
    }

    public d(b bVar, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.b = new wm2(bVar.b, bVar.a, bVar.c);
        this.a = (FileInputStream) bVar.d;
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return ((Integer) this.b.d(new ur4(this, bArr, 27))).intValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(b bVar) throws FileNotFoundException {
        FileInputStream fileInputStream = (FileInputStream) bVar.d;
        try {
            super(fileInputStream.getFD());
            this.b = new wm2(bVar.b, bVar.a, bVar.c);
            this.a = fileInputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return ((Integer) this.b.d(new c(this, bArr, i, i2, 0))).intValue();
    }
}
