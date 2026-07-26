package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class pd3 extends md3 {
    public long e;
    public final /* synthetic */ rd3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd3(rd3 rd3Var, se3 se3Var, long j) {
        super(rd3Var, se3Var);
        js3.p(se3Var, "url");
        this.f = rd3Var;
        this.e = j;
        if (j == 0) {
            b(by2.b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.c) {
            return;
        }
        if (this.e != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = ih9.a;
            js3.p(timeUnit, "timeUnit");
            try {
                zG = ih9.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.f.b.e();
                b(rd3.f);
            }
        }
        this.c = true;
    }

    @Override // defpackage.md3, defpackage.t18
    public final long f0(gh0 gh0Var, long j) throws ProtocolException {
        js3.p(gh0Var, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "byteCount < 0: ").toString());
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.e;
        if (j2 == 0) {
            return -1L;
        }
        long jF0 = super.f0(gh0Var, Math.min(j2, j));
        if (jF0 == -1) {
            this.f.b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b(rd3.f);
            throw protocolException;
        }
        long j3 = this.e - jF0;
        this.e = j3;
        if (j3 == 0) {
            b(by2.b);
        }
        return jF0;
    }
}
