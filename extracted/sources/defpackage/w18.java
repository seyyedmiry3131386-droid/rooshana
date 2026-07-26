package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.a;
import j$.util.Objects;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class w18 implements na1, ma1 {
    public final xb1 a;
    public final a b;
    public volatile int c;
    public volatile ga1 d;
    public volatile Object e;
    public volatile zw4 f;
    public volatile ha1 g;

    public w18(xb1 xb1Var, a aVar) {
        this.a = xb1Var;
        this.b = aVar;
    }

    @Override // defpackage.ma1
    public final void a(sx3 sx3Var, Object obj, la1 la1Var, DataSource dataSource, sx3 sx3Var2) {
        this.b.a(sx3Var, obj, la1Var, this.f.c.d(), sx3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    @Override // defpackage.na1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L11
            java.lang.Object r0 = r5.e
            r5.e = r1
            boolean r0 = r5.d(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L11
            goto L1d
        L11:
            ga1 r0 = r5.d
            if (r0 == 0) goto L1e
            ga1 r0 = r5.d
            boolean r0 = r0.b()
            if (r0 == 0) goto L1e
        L1d:
            return r2
        L1e:
            r5.d = r1
            r5.f = r1
            r0 = 0
        L23:
            if (r0 != 0) goto L81
            int r1 = r5.c
            xb1 r3 = r5.a
            java.util.ArrayList r3 = r3.b()
            int r3 = r3.size()
            if (r1 >= r3) goto L81
            xb1 r1 = r5.a
            java.util.ArrayList r1 = r1.b()
            int r3 = r5.c
            int r4 = r3 + 1
            r5.c = r4
            java.lang.Object r1 = r1.get(r3)
            zw4 r1 = (defpackage.zw4) r1
            r5.f = r1
            zw4 r1 = r5.f
            if (r1 == 0) goto L23
            xb1 r1 = r5.a
            zo1 r1 = r1.p
            zw4 r3 = r5.f
            la1 r3 = r3.c
            com.bumptech.glide.load.DataSource r3 = r3.d()
            boolean r1 = r1.a(r3)
            if (r1 != 0) goto L6d
            xb1 r1 = r5.a
            zw4 r3 = r5.f
            la1 r3 = r3.c
            java.lang.Class r3 = r3.getDataClass()
            ea4 r1 = r1.c(r3)
            if (r1 == 0) goto L23
        L6d:
            zw4 r0 = r5.f
            zw4 r1 = r5.f
            la1 r1 = r1.c
            xb1 r3 = r5.a
            com.bumptech.glide.Priority r3 = r3.o
            com.bumptech.glide.load.engine.e r4 = new com.bumptech.glide.load.engine.e
            r4.<init>(r5, r0)
            r1.e(r3, r4)
            r0 = r2
            goto L23
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w18.b():boolean");
    }

    @Override // defpackage.ma1
    public final void c(sx3 sx3Var, Exception exc, la1 la1Var, DataSource dataSource) {
        this.b.c(sx3Var, exc, la1Var, this.f.c.d());
    }

    @Override // defpackage.na1
    public final void cancel() {
        zw4 zw4Var = this.f;
        if (zw4Var != null) {
            zw4Var.c.cancel();
        }
    }

    public final boolean d(Object obj) throws Throwable {
        Throwable th;
        int i = md4.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            ta1 ta1VarH = this.a.c.b().h(obj);
            Object objI = ta1VarH.i();
            r12 r12VarD = this.a.d(objI);
            wv8 wv8Var = new wv8(r12VarD, objI, this.a.i, 17);
            sx3 sx3Var = this.f.a;
            xb1 xb1Var = this.a;
            ha1 ha1Var = new ha1(sx3Var, xb1Var.n);
            yo1 yo1VarA = xb1Var.h.a();
            yo1VarA.m(ha1Var, wv8Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                ha1Var.toString();
                obj.toString();
                r12VarD.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (yo1VarA.h(ha1Var) != null) {
                this.g = ha1Var;
                this.d = new ga1(Collections.singletonList(this.f.a), this.a, this);
                this.f.c.c();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.g);
                obj.toString();
            }
            try {
                this.b.a(this.f.a, ta1VarH.i(), this.f.c, this.f.c.d(), this.f.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f.c.c();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
