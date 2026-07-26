package defpackage;

import androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.e;
import androidx.compose.foundation.gestures.f;
import java.util.ArrayList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class fn3 {
    public final e a;
    public an3 b;
    public dn3 c;
    public cn3 d;
    public bn3 e;
    public yh0 f;
    public hl5 g;
    public long h = 9205357640488583168L;
    public nq0 i;
    public final gn3 j;
    public final gn3 k;
    public long l;

    public fn3(e eVar) {
        this.a = eVar;
        gn3 gn3Var = new gn3();
        gn3Var.b = new ArrayList();
        this.j = gn3Var;
        gn3 gn3Var2 = new gn3();
        gn3Var2.b = new ArrayList();
        this.k = gn3Var2;
        this.l = 0L;
    }

    public static void c(fn3 fn3Var, zm3 zm3Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        e eVar = fn3Var.a;
        cn3 cn3Var = fn3Var.d;
        if (cn3Var == null) {
            cn3Var = new cn3();
            cn3Var.u = null;
            cn3Var.v = Long.MAX_VALUE;
            cn3Var.w = false;
            fn3Var.d = cn3Var;
        }
        cn3Var.u = zm3Var;
        cn3Var.v = j;
        nq0 nq0Var = fn3Var.i;
        if (nq0Var == null) {
            fn3Var.i = new nq0(eVar.q, 2);
        } else {
            nq0Var.c = eVar.q;
            nq0Var.b = j2;
        }
        cn3Var.w = false;
        fn3Var.f = cn3Var;
    }

    public final void a() {
        an3 an3Var = this.b;
        if (an3Var == null) {
            IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop = IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop.c;
            an3Var = new an3();
            an3Var.u = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;
            an3Var.v = false;
            this.b = an3Var;
        }
        an3Var.u = IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop.c;
        an3Var.v = false;
        this.f = an3Var;
    }

    public final void b(zm3 zm3Var, long j, nq0 nq0Var) {
        bn3 bn3Var = this.e;
        if (bn3Var == null) {
            bn3Var = new bn3();
            bn3Var.u = null;
            bn3Var.v = Long.MAX_VALUE;
            this.e = bn3Var;
        }
        bn3Var.u = zm3Var;
        bn3Var.v = j;
        nq0Var.b = 0L;
        this.f = bn3Var;
    }

    public final hl5 d() {
        hl5 hl5Var = this.g;
        if (hl5Var != null) {
            return hl5Var;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public final void e(zm3 zm3Var, ym3 ym3Var, long j) {
        e eVar = this.a;
        long jQ = y40.G(eVar).q(0L);
        if (!nr5.c(this.h, 9205357640488583168L) && !nr5.c(jQ, this.h)) {
            this.l = nr5.g(this.l, nr5.f(jQ, this.h));
        }
        this.h = jQ;
        Orientation orientation = eVar.q;
        js3.m(orientation);
        rp2 rp2Var = f.a;
        if (Math.abs(Float.intBitsToFloat((int) (orientation == Orientation.a ? j & 4294967295L : j >> 32))) > 2.0f) {
            m91.d(d(), zm3Var, eVar.q, ym3Var, this.j, this.l);
            gn3 gn3Var = this.k;
            ArrayList arrayList = gn3Var.b;
            if (arrayList.size() == 3) {
                int i = gn3Var.a;
                gn3Var.a = i + 1;
                arrayList.set(i, new nr5(j));
            } else {
                arrayList.add(new nr5(j));
            }
            if (gn3Var.a == 3) {
                gn3Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((nr5) arrayList.get(i2)).a >> 32))));
            }
            float fF0 = (float) a.f0(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((nr5) arrayList.get(i3)).a & 4294967295L))));
            }
            eVar.N0(new pu1((((long) Float.floatToRawIntBits((float) a.f0(arrayList3))) & 4294967295L) | (((long) Float.floatToRawIntBits(fF0)) << 32), true));
        }
    }

    public final void f(zm3 zm3Var, zm3 zm3Var2, ym3 ym3Var, long j) {
        if (this.g == null) {
            this.g = new hl5(17);
        }
        this.l = 0L;
        hl5 hl5VarD = d();
        e eVar = this.a;
        m91.d(hl5VarD, zm3Var, eVar.q, ym3Var, this.j, this.l);
        long jF = nr5.f(m91.B(zm3Var2, eVar.q, ym3Var), j);
        if (((Boolean) eVar.r.invoke(new hh6(1))).booleanValue()) {
            this.h = y40.G(eVar).q(0L);
            eVar.N0(new qu1(jF));
        }
        gn3 gn3Var = this.k;
        gn3Var.a = 0;
        gn3Var.b.clear();
    }
}
