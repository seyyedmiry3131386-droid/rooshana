package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.b;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class uc6 implements ce {
    public final dp2 a;
    public da4 b;
    public IOException c;

    public uc6(dp2 dp2Var) {
        this.a = dp2Var;
    }

    @Override // defpackage.ce
    public final /* synthetic */ void A(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void B(be beVar, b bVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void C(be beVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void D(int i, long j, be beVar) {
    }

    @Override // defpackage.ce
    public final void E(be beVar, PlaybackException playbackException) {
        Pair pair;
        db1 db1Var;
        js3.p(playbackException, "error");
        if (!br9.C(2002, 2001, 1003).contains(Integer.valueOf(playbackException.a))) {
            Throwable cause = playbackException.getCause();
            if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = (HttpDataSource$InvalidResponseCodeException) cause;
                pair = new Pair(httpDataSource$InvalidResponseCodeException.c.a.toString(), Integer.valueOf(httpDataSource$InvalidResponseCodeException.e));
            } else if (cause instanceof ParserException) {
                da4 da4Var = this.b;
                String strValueOf = String.valueOf(da4Var != null ? da4Var.b : null);
                IOException iOException = this.c;
                HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException2 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? (HttpDataSource$InvalidResponseCodeException) iOException : null;
                Integer numValueOf = httpDataSource$InvalidResponseCodeException2 != null ? Integer.valueOf(httpDataSource$InvalidResponseCodeException2.e) : null;
                pair = new Pair(strValueOf, Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0));
            } else {
                da4 da4Var2 = this.b;
                pair = new Pair(String.valueOf((da4Var2 == null || (db1Var = da4Var2.a) == null) ? null : db1Var.a), 0);
            }
            Object obj = pair.a;
            js3.o(obj, "component1(...)");
            this.a.invoke(new tc6(playbackException.b(), ((Number) pair.b).intValue(), (String) obj, cause instanceof ParserException ? t61.j(playbackException.getMessage(), " : ", ((ParserException) cause).getMessage()) : playbackException.getMessage()));
        }
        this.c = null;
        this.b = null;
    }

    @Override // defpackage.ce
    public final /* synthetic */ void F(be beVar, float f) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void G(be beVar, int i, long j, long j2) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void H(be beVar, ec1 ec1Var) {
    }

    @Override // defpackage.ce
    public final void I(be beVar, da4 da4Var, op4 op4Var, IOException iOException) {
        js3.p(iOException, "error");
        this.b = da4Var;
        this.c = iOException;
    }

    @Override // defpackage.ce
    public final /* synthetic */ void J(int i, be beVar, fb6 fb6Var, fb6 fb6Var2) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void K(be beVar, op4 op4Var) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void L(be beVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void M(be beVar, String str) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void N(be beVar, boolean z) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void O(be beVar, b bVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void P(be beVar, rp8 rp8Var) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void Q(be beVar, Exception exc) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void R(be beVar, int i, boolean z) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void S(gb6 gb6Var, qq4 qq4Var) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void T(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void U(be beVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void a(be beVar, boolean z) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void b(be beVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void c(be beVar, boolean z) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void d(be beVar, String str) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void e(be beVar, boolean z) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void f(be beVar, ua6 ua6Var) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void g(be beVar, String str) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void h(be beVar, jv4 jv4Var) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void i(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void j(be beVar, Object obj) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void k(be beVar, long j) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void l(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void m(be beVar, op4 op4Var) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void n(be beVar, int i, int i2) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void o(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void p(be beVar, ly lyVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void q(be beVar, o00 o00Var) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void r(be beVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void s(be beVar, w59 w59Var) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void t(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void u(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void v(be beVar, String str) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void w(be beVar, o00 o00Var) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void x(be beVar, int i, int i2, boolean z) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void y(be beVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void z(be beVar, int i) {
    }
}
