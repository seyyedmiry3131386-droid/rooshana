package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class pi1 implements d18 {
    public final oi1 a;
    public d18 b;

    public pi1(oi1 oi1Var) {
        this.a = oi1Var;
    }

    @Override // defpackage.d18
    public final boolean a() {
        return true;
    }

    @Override // defpackage.d18
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    @Override // defpackage.d18
    public final String c(SSLSocket sSLSocket) {
        d18 d18VarE = e(sSLSocket);
        if (d18VarE != null) {
            return d18VarE.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.d18
    public final void d(SSLSocket sSLSocket, String str, List list) {
        js3.p(list, "protocols");
        d18 d18VarE = e(sSLSocket);
        if (d18VarE != null) {
            d18VarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized d18 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
