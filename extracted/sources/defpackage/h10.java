package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.text.Regex;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes3.dex */
public final class h10 implements hr3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h10(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.g77 c(defpackage.cw6 r35) {
        /*
            Method dump skipped, instruction units count: 1522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h10.c(cw6):g77");
    }

    public static int e(g77 g77Var, int i) {
        String strA = g77Var.f.a("Retry-After");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return i;
        }
        if (!new Regex("\\d+").f(strA)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        js3.o(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v52 fw6, still in use, count: 2, list:
          (r0v52 fw6) from 0x0075: MOVE (r18v0 fw6) = (r0v52 fw6) (LINE:118)
          (r0v52 fw6) from 0x0062: MOVE (r18v3 fw6) = (r0v52 fw6) (LINE:99)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // defpackage.hr3
    public final defpackage.g77 a(defpackage.cw6 r36) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h10.a(cw6):g77");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.w47 b(defpackage.g77 r12, defpackage.ai0 r13) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h10.b(g77, ai0):w47");
    }

    public boolean d(IOException iOException, xv6 xv6Var, w47 w47Var) {
        b57 b57Var;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!((hs5) this.b).e) {
            return false;
        }
        if ((!z && (((b57Var = w47Var.d) != null && b57Var.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        ai0 ai0Var = xv6Var.r;
        if (ai0Var == null || !ai0Var.a) {
            return false;
        }
        p42 p42Var = xv6Var.h;
        js3.m(p42Var);
        fw6 fw6VarF = p42Var.f();
        ai0 ai0Var2 = xv6Var.r;
        return fw6VarF.a(ai0Var2 != null ? ai0Var2.p() : null);
    }

    public h10(th0 th0Var) {
        this.a = 1;
        js3.p(th0Var, "cookieJar");
        this.b = th0Var;
    }
}
