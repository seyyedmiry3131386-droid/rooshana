package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle$State;
import androidx.media3.common.b;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ql3 implements h32, v57, mm4, RequestDTO, x72, pz2, v61, cl6, t57, k71, ab8 {
    public static volatile ql3 a;
    public static ql3 b;

    public static final boolean e(String str) {
        return js3.i(str, "inapp") || js3.i(str, "subs");
    }

    public static final int g(int i, long j) {
        int i2 = ro8.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static ei5 i(jc0 jc0Var, wi5 wi5Var, Bundle bundle, Lifecycle$State lifecycle$State, oi5 oi5Var) {
        String string = UUID.randomUUID().toString();
        js3.o(string, "toString(...)");
        js3.p(wi5Var, "destination");
        js3.p(lifecycle$State, "hostLifecycleState");
        return new ei5(jc0Var, wi5Var, bundle, lifecycle$State, oi5Var, string, null);
    }

    public static c08 k() {
        return (c08) g08.b.s();
    }

    public static c08 m(c08 c08Var) {
        if (c08Var instanceof yr8) {
            yr8 yr8Var = (yr8) c08Var;
            if (yr8Var.t == o37.c()) {
                yr8Var.r = null;
                return c08Var;
            }
        }
        if (c08Var instanceof zr8) {
            zr8 zr8Var = (zr8) c08Var;
            if (zr8Var.i == o37.c()) {
                zr8Var.h = null;
                return c08Var;
            }
        }
        c08 c08VarG = g08.g(c08Var, null, false);
        c08VarG.j();
        return c08VarG;
    }

    public static Object n(ak1 ak1Var, bp2 bp2Var) {
        c08 yr8Var;
        c08 c08Var = (c08) g08.b.s();
        if (c08Var instanceof yr8) {
            yr8 yr8Var2 = (yr8) c08Var;
            if (yr8Var2.t == o37.c()) {
                dp2 dp2Var = yr8Var2.r;
                dp2 dp2Var2 = yr8Var2.s;
                try {
                    ((yr8) c08Var).r = g08.k(ak1Var, dp2Var, true);
                    ((yr8) c08Var).s = dp2Var2;
                    return bp2Var.invoke();
                } finally {
                    yr8Var2.r = dp2Var;
                    yr8Var2.s = dp2Var2;
                }
            }
        }
        if (c08Var == null || (c08Var instanceof vb5)) {
            yr8Var = new yr8(c08Var instanceof vb5 ? (vb5) c08Var : null, ak1Var, null, true, false);
        } else {
            yr8Var = c08Var.u(ak1Var);
        }
        try {
            c08 c08VarJ = yr8Var.j();
            try {
                Object objInvoke = bp2Var.invoke();
                c08.q(c08VarJ);
                yr8Var.c();
                return objInvoke;
            } catch (Throwable th) {
                c08.q(c08VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            yr8Var.c();
            throw th2;
        }
    }

    public static long q(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static ts5 s(g8 g8Var) {
        g08.e(g08.a);
        synchronized (g08.c) {
            g08.h = a.A0(g8Var, g08.h);
        }
        return new ts5(19, g8Var);
    }

    public static void u(c08 c08Var, c08 c08Var2, dp2 dp2Var) {
        if (c08Var != c08Var2) {
            c08Var2.getClass();
            c08.q(c08Var);
            c08Var2.c();
        } else if (c08Var instanceof yr8) {
            ((yr8) c08Var).r = dp2Var;
        } else if (c08Var instanceof zr8) {
            ((zr8) c08Var).h = dp2Var;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + c08Var).toString());
        }
    }

    public static void v() {
        boolean z;
        synchronized (g08.c) {
            sb5 sb5Var = g08.j.h;
            z = false;
            if (sb5Var != null) {
                if (sb5Var.c()) {
                    z = true;
                }
            }
        }
        if (z) {
            g08.a();
        }
    }

    @Override // defpackage.t57
    public s57 a(com.bumptech.glide.a aVar, t54 t54Var, v57 v57Var, Context context) {
        return new s57(aVar, t54Var, v57Var, context);
    }

    @Override // defpackage.mm4
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.mm4
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.ab8
    public int h(b bVar) {
        return 1;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        int i = ul3.e;
    }

    @Override // defpackage.mm4
    public boolean next() {
        return false;
    }

    @Override // defpackage.x72
    public cp8 o(int i, int i2) {
        return new uo1();
    }

    @Override // defpackage.ab8
    public cb8 p(b bVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.ab8
    public boolean r(b bVar) {
        return false;
    }

    @Override // defpackage.x72
    public void l() {
    }

    @Override // defpackage.pz2
    public void d(ja9 ja9Var) {
    }

    @Override // defpackage.x72
    public void t(kl7 kl7Var) {
    }

    @Override // defpackage.cl6
    public void f(int i, Object obj) {
    }
}
