package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class kx5 implements by7 {
    public final FileOutputStream a;
    public final dm8 b;

    public kx5(FileOutputStream fileOutputStream, dm8 dm8Var) {
        this.a = fileOutputStream;
        this.b = dm8Var;
    }

    @Override // defpackage.by7
    public final void X0(gh0 gh0Var, long j) throws IOException {
        wq2.m(gh0Var.b, 0L, j);
        while (j > 0) {
            this.b.f();
            vl7 vl7Var = gh0Var.a;
            js3.m(vl7Var);
            int iMin = (int) Math.min(j, vl7Var.c - vl7Var.b);
            this.a.write(vl7Var.a, vl7Var.b, iMin);
            int i = vl7Var.b + iMin;
            vl7Var.b = i;
            long j2 = iMin;
            j -= j2;
            gh0Var.b -= j2;
            if (i == vl7Var.c) {
                gh0Var.a = vl7Var.a();
                am7.a(vl7Var);
            }
        }
    }

    @Override // defpackage.by7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.by7, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.by7
    public final dm8 i() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + this.a + ')';
    }
}
