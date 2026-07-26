package io.sentry.instrumentation.file;

import defpackage.p52;
import defpackage.ur4;
import defpackage.wm2;
import io.sentry.h4;
import io.sentry.k1;
import io.sentry.util.h;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends FileOutputStream {
    public final FileOutputStream a;
    public final wm2 b;

    public e(b bVar, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.b = new wm2(bVar.b, bVar.a, bVar.c);
        this.a = (FileOutputStream) bVar.d;
    }

    public static b b(File file, FileOutputStream fileOutputStream, boolean z) {
        k1 k1VarO = h.a ? h4.b().o() : h4.b().d();
        return new b(file, k1VarO != null ? k1VarO.u("file.write") : null, fileOutputStream, h4.b().m());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.a(this.a);
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.b.d(new p52(i, 9, this));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.b.d(new ur4(this, bArr, 29));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.b.d(new c(this, bArr, i, i2, 1));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(b bVar) throws FileNotFoundException {
        FileOutputStream fileOutputStream = (FileOutputStream) bVar.d;
        try {
            super(fileOutputStream.getFD());
            this.b = new wm2(bVar.b, bVar.a, bVar.c);
            this.a = fileOutputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }
}
