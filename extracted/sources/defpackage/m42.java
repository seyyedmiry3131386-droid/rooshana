package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes3.dex */
public final class m42 extends hk2 {
    public final long b;
    public final boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ ai0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m42(ai0 ai0Var, t18 t18Var, long j, boolean z) {
        super(t18Var);
        js3.p(t18Var, "delegate");
        this.h = ai0Var;
        this.b = j;
        this.c = z;
        this.e = true;
        if (j == 0) {
            b(null);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f) {
            return iOException;
        }
        this.f = true;
        ai0 ai0Var = this.h;
        if (iOException == null && this.e) {
            this.e = false;
            ((z32) ai0Var.c).w((xv6) ai0Var.b);
        }
        return ai0.n(ai0Var, this.d, this.c, iOException, 8);
    }

    @Override // defpackage.hk2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            super.close();
            b(null);
        } catch (IOException e) {
            IOException iOExceptionB = b(e);
            js3.m(iOExceptionB);
            throw iOExceptionB;
        }
    }

    @Override // defpackage.hk2, defpackage.t18
    public final long f0(gh0 gh0Var, long j) throws IOException {
        js3.p(gh0Var, "sink");
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        try {
            long jF0 = this.a.f0(gh0Var, j);
            boolean z = this.e;
            ai0 ai0Var = this.h;
            if (z) {
                this.e = false;
                ((z32) ai0Var.c).w((xv6) ai0Var.b);
            }
            if (jF0 == -1) {
                b(null);
                return -1L;
            }
            long j2 = this.d + jF0;
            long j3 = this.b;
            if (j3 == -1 || j2 <= j3) {
                this.d = j2;
                if (((o42) ai0Var.e).b()) {
                    b(null);
                }
                return jF0;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            IOException iOExceptionB = b(e);
            js3.m(iOExceptionB);
            throw iOExceptionB;
        }
    }
}
