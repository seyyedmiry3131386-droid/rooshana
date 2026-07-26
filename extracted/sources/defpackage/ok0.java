package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ok0 implements t18 {
    public boolean a;
    public final /* synthetic */ ph0 b;
    public final /* synthetic */ ai0 c;
    public final /* synthetic */ sv6 d;

    public ok0(ph0 ph0Var, ai0 ai0Var, sv6 sv6Var) {
        this.b = ph0Var;
        this.c = ai0Var;
        this.d = sv6Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zG;
        if (!this.a) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = ih9.a;
            js3.p(timeUnit, "timeUnit");
            try {
                zG = ih9.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.a = true;
                this.c.c();
            }
        }
        this.b.close();
    }

    @Override // defpackage.t18
    public final long f0(gh0 gh0Var, long j) throws IOException {
        js3.p(gh0Var, "sink");
        try {
            long jF0 = this.b.f0(gh0Var, j);
            sv6 sv6Var = this.d;
            if (jF0 != -1) {
                gh0Var.k(sv6Var.b, gh0Var.b - jF0, jF0);
                sv6Var.b();
                return jF0;
            }
            if (!this.a) {
                this.a = true;
                sv6Var.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.a) {
                throw e;
            }
            this.a = true;
            this.c.c();
            throw e;
        }
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return this.b.i();
    }
}
