package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import defpackage.bd8;
import defpackage.ey7;
import defpackage.ez1;
import defpackage.gu9;
import defpackage.ok4;
import defpackage.qj1;
import defpackage.r78;
import defpackage.s08;
import defpackage.th0;
import defpackage.ti1;
import defpackage.tx8;
import defpackage.uy6;
import defpackage.vg6;
import defpackage.wb5;
import defpackage.wy5;
import defpackage.zc;
import defpackage.zt2;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final qj1 a;
    public long b = 9205357640488583168L;
    public final ez1 c;
    public final wb5 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final ti1 i;

    public c(Context context, qj1 qj1Var, long j, wy5 wy5Var) {
        this.a = qj1Var;
        ez1 ez1Var = new ez1(context, gu9.E(j));
        this.c = ez1Var;
        this.d = androidx.compose.runtime.g.g(tx8.a, th0.p);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        b bVar = new b(this);
        vg6 vg6Var = bd8.a;
        androidx.compose.ui.input.pointer.f fVar = new androidx.compose.ui.input.pointer.f(null, null, bVar);
        this.i = Build.VERSION.SDK_INT >= 31 ? new r78(fVar, this, ez1Var) : new zt2(fVar, this, ez1Var, wy5Var);
    }

    public final void a() {
        boolean z;
        ez1 ez1Var = this.c;
        EdgeEffect edgeEffect = ez1Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = ez1Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = ez1Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = ez1Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r19, defpackage.qp2 r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.c.b(long, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final long c() {
        long jE = this.b;
        if ((9223372034707292159L & jE) == 9205357640488583168L) {
            jE = uy6.e(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jE & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            ((s08) this.d).setValue(tx8.a);
        }
    }

    public final float e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fP = -fIntBitsToFloat2;
        float f = 1 - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fP = zc.p(edgeEffectB, fP, f);
        } else {
            edgeEffectB.onPull(fP, f);
        }
        return (i2 >= 31 ? zc.j(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fP) : Float.intBitsToFloat(i);
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1 - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = zc.p(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? zc.j(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fP = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fP = zc.p(edgeEffectD, fP, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fP, fIntBitsToFloat);
        }
        return (i2 >= 31 ? zc.j(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fP) : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = zc.p(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? zc.j(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void i(long j) {
        boolean zB = ey7.b(this.g, 0L);
        boolean zB2 = ey7.b(j, this.g);
        this.g = j;
        if (!zB2) {
            int iV = ok4.V(Float.intBitsToFloat((int) (j >> 32)));
            long jV = (((long) ok4.V(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iV) << 32);
            ez1 ez1Var = this.c;
            ez1Var.c = jV;
            EdgeEffect edgeEffect = ez1Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jV >> 32), (int) (jV & 4294967295L));
            }
            EdgeEffect edgeEffect2 = ez1Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jV >> 32), (int) (jV & 4294967295L));
            }
            EdgeEffect edgeEffect3 = ez1Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jV & 4294967295L), (int) (jV >> 32));
            }
            EdgeEffect edgeEffect4 = ez1Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jV & 4294967295L), (int) (jV >> 32));
            }
            EdgeEffect edgeEffect5 = ez1Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jV >> 32), (int) (jV & 4294967295L));
            }
            EdgeEffect edgeEffect6 = ez1Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jV >> 32), (int) (jV & 4294967295L));
            }
            EdgeEffect edgeEffect7 = ez1Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jV & 4294967295L), (int) (jV >> 32));
            }
            EdgeEffect edgeEffect8 = ez1Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jV), (int) (jV >> 32));
            }
        }
        if (zB || zB2) {
            return;
        }
        a();
    }
}
