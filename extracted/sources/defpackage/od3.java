package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class od3 extends md3 {
    public long e;
    public boolean f;
    public final /* synthetic */ rd3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od3(rd3 rd3Var, se3 se3Var) {
        super(rd3Var, se3Var);
        js3.p(se3Var, "url");
        this.g = rd3Var;
        this.e = -1L;
        this.f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.c) {
            return;
        }
        if (this.f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = ih9.a;
            js3.p(timeUnit, "timeUnit");
            try {
                zG = ih9.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.g.b.e();
                b(rd3.f);
            }
        }
        this.c = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        if (r17.f == false) goto L55;
     */
    @Override // defpackage.md3, defpackage.t18
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f0(defpackage.gh0 r18, long r19) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od3.f0(gh0, long):long");
    }
}
