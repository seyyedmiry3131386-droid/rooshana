package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes3.dex */
public final class l42 extends gk2 {
    public final long b;
    public final boolean c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ ai0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l42(ai0 ai0Var, by7 by7Var, long j, boolean z) {
        super(by7Var);
        js3.p(by7Var, "delegate");
        this.h = ai0Var;
        this.b = j;
        this.c = z;
        this.f = z;
    }

    @Override // defpackage.gk2, defpackage.by7
    public final void X0(gh0 gh0Var, long j) throws IOException {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.b;
        if (j2 != -1 && this.e + j > j2) {
            StringBuilder sbS = rm7.s(j2, "expected ", " bytes but received ");
            sbS.append(this.e + j);
            throw new ProtocolException(sbS.toString());
        }
        try {
            if (this.f) {
                this.f = false;
                ai0 ai0Var = this.h;
                ((z32) ai0Var.c).r((xv6) ai0Var.b);
            }
            super.X0(gh0Var, j);
            this.e += j;
        } catch (IOException e) {
            IOException iOExceptionB = b(e);
            js3.m(iOExceptionB);
            throw iOExceptionB;
        }
    }

    public final IOException b(IOException iOException) {
        if (this.d) {
            return iOException;
        }
        this.d = true;
        return ai0.n(this.h, this.e, this.c, iOException, 4);
    }

    @Override // defpackage.gk2, defpackage.by7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        long j = this.b;
        if (j != -1 && this.e != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            b(null);
        } catch (IOException e) {
            IOException iOExceptionB = b(e);
            js3.m(iOExceptionB);
            throw iOExceptionB;
        }
    }

    @Override // defpackage.gk2, defpackage.by7, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            IOException iOExceptionB = b(e);
            js3.m(iOExceptionB);
            throw iOExceptionB;
        }
    }
}
