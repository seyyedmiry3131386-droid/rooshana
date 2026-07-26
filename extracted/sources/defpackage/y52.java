package defpackage;

import android.text.TextUtils;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y52 implements q94, co4, gr4, n31, nd8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y52(int i, fb6 fb6Var, fb6 fb6Var2) {
        this.a = i;
        this.b = fb6Var;
        this.c = fb6Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // defpackage.n31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void accept(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            xq4 r0 = (defpackage.xq4) r0
            java.lang.Object r1 = r4.c
            hq4 r1 = (defpackage.hq4) r1
            n94 r5 = (defpackage.n94) r5
            java.lang.String r2 = "MediaSessionStub"
            java.lang.Object r5 = r5.get()     // Catch: java.lang.InterruptedException -> L18 java.util.concurrent.ExecutionException -> L1a java.util.concurrent.CancellationException -> L1c
            bq7 r5 = (defpackage.bq7) r5     // Catch: java.lang.InterruptedException -> L18 java.util.concurrent.ExecutionException -> L1a java.util.concurrent.CancellationException -> L1c
            java.lang.String r3 = "SessionResult must not be null"
            defpackage.vy2.o(r5, r3)     // Catch: java.lang.InterruptedException -> L18 java.util.concurrent.ExecutionException -> L1a java.util.concurrent.CancellationException -> L1c
            goto L40
        L18:
            r5 = move-exception
            goto L1e
        L1a:
            r5 = move-exception
            goto L1e
        L1c:
            r5 = move-exception
            goto L35
        L1e:
            java.lang.String r3 = "Session operation failed"
            defpackage.wn5.l0(r2, r3, r5)
            bq7 r2 = new bq7
            java.lang.Throwable r5 = r5.getCause()
            boolean r5 = r5 instanceof java.lang.UnsupportedOperationException
            if (r5 == 0) goto L2f
            r5 = -6
            goto L30
        L2f:
            r5 = -1
        L30:
            r2.<init>(r5)
            r5 = r2
            goto L40
        L35:
            java.lang.String r3 = "Session operation cancelled"
            defpackage.wn5.l0(r2, r3, r5)
            bq7 r5 = new bq7
            r2 = 1
            r5.<init>(r2)
        L40:
            int r2 = r4.a
            defpackage.is4.s0(r0, r1, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y52.accept(java.lang.Object):void");
    }

    @Override // defpackage.gr4
    public void b(hq4 hq4Var) {
        hr4 hr4Var = (hr4) this.b;
        MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) this.c;
        if (TextUtils.isEmpty(mediaDescriptionCompat.a)) {
            wn5.k0("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        n94 n94VarL = hr4Var.g.l(hq4Var, ImmutableList.s(r44.h(mediaDescriptionCompat)));
        pg pgVar = new pg(hr4Var, hq4Var, this.a);
        n94VarL.e(new g6(14, n94VarL, pgVar, false), e.a());
    }

    @Override // defpackage.co4
    public void c(xf3 xf3Var, int i) {
        go4 go4Var = (go4) this.b;
        jp4 jp4Var = (jp4) this.c;
        so4 so4Var = go4Var.c;
        eq7 eq7Var = go4Var.m;
        eq7Var.getClass();
        int iE = eq7Var.a.e();
        int i2 = this.a;
        if (iE >= 2) {
            xf3Var.i0(so4Var, i, i2, jp4Var.c(true));
        } else {
            xf3Var.x(so4Var, i, i2 + 1, jp4Var.c(true));
            xf3Var.D(so4Var, i, i2);
        }
    }

    @Override // defpackage.nd8
    public Object execute() {
        v24 v24Var = (v24) this.b;
        ((pa2) v24Var.d).y((d30) this.c, this.a + 1, false);
        return null;
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        fb6 fb6Var = (fb6) this.b;
        fb6 fb6Var2 = (fb6) this.c;
        eb6 eb6Var = (eb6) obj;
        int i = this.a;
        eb6Var.e(i);
        eb6Var.B(i, fb6Var, fb6Var2);
    }

    public /* synthetic */ y52(Object obj, int i, Object obj2) {
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    public /* synthetic */ y52(Object obj, Object obj2, int i) {
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }
}
