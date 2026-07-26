package defpackage;

import androidx.compose.runtime.g;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.bt2;
import defpackage.kh;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
public final class jr8 {
    public final tt9 a;
    public final jr8 b;
    public final String c;
    public final wb5 d;
    public final wb5 e;
    public final p08 f = g.f(0);
    public final p08 g = g.f(Long.MIN_VALUE);
    public final wb5 h;
    public final SnapshotStateList i;
    public final SnapshotStateList j;
    public final wb5 k;
    public final ck1 l;

    public jr8(tt9 tt9Var, jr8 jr8Var, String str) {
        this.a = tt9Var;
        this.b = jr8Var;
        this.c = str;
        this.d = g.h(tt9Var.j());
        this.e = g.h(new er8(tt9Var.j(), tt9Var.j()));
        Boolean bool = Boolean.FALSE;
        this.h = g.h(bool);
        this.i = new SnapshotStateList();
        this.j = new SnapshotStateList();
        this.k = g.h(bool);
        this.l = g.c(new cj5(this, 2));
        tt9Var.t(this);
    }

    public final void a(Object obj, qz0 qz0Var, int i) {
        int i2;
        qz0Var.c0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? qz0Var.f(obj) : qz0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.f(this) ? 32 : 16;
        }
        if (qz0Var.R(i2 & 1, (i2 & 19) != 18)) {
            if (h()) {
                qz0Var.a0(416369985);
            } else {
                qz0Var.a0(466062241);
                q(obj);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object objM = qz0Var.M();
                Object obj2 = jz0.a;
                if (z || objM == obj2) {
                    objM = g.c(new cj5(this, 1));
                    qz0Var.l0(objM);
                }
                if (((Boolean) ((u48) objM).getValue()).booleanValue()) {
                    qz0Var.a0(466470356);
                    Object objM2 = qz0Var.M();
                    if (objM2 == obj2) {
                        objM2 = zk8.x(EmptyCoroutineContext.a, qz0Var);
                        qz0Var.l0(objM2);
                    }
                    final e71 e71Var = (e71) objM2;
                    boolean zH = qz0Var.h(e71Var) | (i3 == 32);
                    Object objM3 = qz0Var.M();
                    if (zH || objM3 == obj2) {
                        objM3 = new dp2() { // from class: androidx.compose.animation.core.g
                            @Override // defpackage.dp2
                            public final Object invoke(Object obj3) {
                                bt2.G(e71Var, null, CoroutineStart.d, new Transition$animateTo$1$1$1(this, null), 1);
                                return new kh(3);
                            }
                        };
                        qz0Var.l0(objM3);
                    }
                    zk8.e(e71Var, this, (dp2) objM3, qz0Var);
                } else {
                    qz0Var.a0(416369985);
                }
                qz0Var.q(false);
            }
            qz0Var.q(false);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new a6(this, obj, i, 9);
        }
    }

    public final long b() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((fr8) snapshotStateList.get(i)).l.h());
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((jr8) snapshotStateList2.get(i2)).b());
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            fr8 fr8Var = (fr8) snapshotStateList.get(i);
            fr8Var.f = null;
            fr8Var.e = null;
            fr8Var.i = false;
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((jr8) snapshotStateList2.get(i2)).c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (((fr8) snapshotStateList.get(i)).e != null) {
                return true;
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((jr8) snapshotStateList2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        jr8 jr8Var = this.b;
        return jr8Var != null ? jr8Var.e() : this.f.h();
    }

    public final dr8 f() {
        return (dr8) ((s08) this.e).getValue();
    }

    public final Object g() {
        return ((s08) this.d).getValue();
    }

    public final boolean h() {
        return ((Boolean) ((s08) this.k).getValue()).booleanValue();
    }

    public final void i(long j, boolean z) {
        p08 p08Var = this.g;
        long jH = p08Var.h();
        tt9 tt9Var = this.a;
        if (jH == Long.MIN_VALUE) {
            p08Var.i(j);
            ((s08) ((wb5) tt9Var.b)).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((s08) ((wb5) tt9Var.b)).getValue()).booleanValue()) {
            ((s08) ((wb5) tt9Var.b)).setValue(Boolean.TRUE);
        }
        ((s08) this.h).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            fr8 fr8Var = (fr8) snapshotStateList.get(i);
            wb5 wb5Var = fr8Var.g;
            wb5 wb5Var2 = fr8Var.g;
            if (!((Boolean) ((s08) wb5Var).getValue()).booleanValue()) {
                long jB = z ? fr8Var.a().b() : j;
                fr8Var.f(fr8Var.a().f(jB));
                fr8Var.k = fr8Var.a().d(jB);
                xe8 xe8VarA = fr8Var.a();
                xe8VarA.getClass();
                if (t61.a(xe8VarA, jB)) {
                    ((s08) wb5Var2).setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ((s08) wb5Var2).getValue()).booleanValue()) {
                z2 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jr8 jr8Var = (jr8) snapshotStateList2.get(i2);
            wb5 wb5Var3 = jr8Var.d;
            tt9 tt9Var2 = jr8Var.a;
            if (!js3.i(((s08) wb5Var3).getValue(), tt9Var2.j())) {
                jr8Var.i(j, z);
            }
            if (!js3.i(((s08) jr8Var.d).getValue(), tt9Var2.j())) {
                z2 = false;
            }
        }
        if (z2) {
            j();
        }
    }

    public final void j() {
        this.g.i(Long.MIN_VALUE);
        tt9 tt9Var = this.a;
        if (tt9Var instanceof yb5) {
            ((yb5) tt9Var).s(((s08) this.d).getValue());
        }
        o(0L);
        ((s08) ((wb5) tt9Var.b)).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((jr8) snapshotStateList.get(i)).j();
        }
    }

    public final void k(float f) {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            fr8 fr8Var = (fr8) snapshotStateList.get(i);
            fr8Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                xe8 xe8Var = fr8Var.f;
                if (xe8Var != null) {
                    fr8Var.a().h(xe8Var.c);
                    fr8Var.e = null;
                    fr8Var.f = null;
                }
                Object obj = f == -4.0f ? fr8Var.a().d : fr8Var.a().c;
                fr8Var.a().h(obj);
                fr8Var.a().i(obj);
                fr8Var.f(obj);
                fr8Var.l.i(fr8Var.a().b());
            } else {
                fr8Var.h.i(f);
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((jr8) snapshotStateList2.get(i2)).k(f);
        }
    }

    public final void l(Object obj, Object obj2) {
        this.g.i(Long.MIN_VALUE);
        tt9 tt9Var = this.a;
        ((s08) ((wb5) tt9Var.b)).setValue(Boolean.FALSE);
        boolean zH = h();
        wb5 wb5Var = this.d;
        if (!zH || !js3.i(tt9Var.j(), obj) || !js3.i(((s08) wb5Var).getValue(), obj2)) {
            if (!js3.i(tt9Var.j(), obj) && (tt9Var instanceof yb5)) {
                ((yb5) tt9Var).s(obj);
            }
            ((s08) wb5Var).setValue(obj2);
            ((s08) this.k).setValue(Boolean.TRUE);
            ((s08) this.e).setValue(new er8(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            jr8 jr8Var = (jr8) snapshotStateList.get(i);
            js3.n(jr8Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (jr8Var.h()) {
                jr8Var.l(jr8Var.a.j(), ((s08) jr8Var.d).getValue());
            }
        }
        SnapshotStateList snapshotStateList2 = this.i;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((fr8) snapshotStateList2.get(i2)).d(0L);
        }
    }

    public final void m(long j) {
        p08 p08Var = this.g;
        if (p08Var.h() == Long.MIN_VALUE) {
            p08Var.i(j);
        }
        o(j);
        ((s08) this.h).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((fr8) snapshotStateList.get(i)).d(j);
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jr8 jr8Var = (jr8) snapshotStateList2.get(i2);
            if (!js3.i(((s08) jr8Var.d).getValue(), jr8Var.a.j())) {
                jr8Var.m(j);
            }
        }
    }

    public final void n(ql7 ql7Var) {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            fr8 fr8Var = (fr8) snapshotStateList.get(i);
            wb5 wb5Var = fr8Var.j;
            if (!js3.i(fr8Var.a().c, fr8Var.a().d)) {
                fr8Var.f = fr8Var.a();
                fr8Var.e = ql7Var;
            }
            s08 s08Var = (s08) wb5Var;
            ((s08) fr8Var.d).setValue(new xe8(fr8Var.n, fr8Var.a, s08Var.getValue(), s08Var.getValue(), fr8Var.k.c()));
            fr8Var.l.i(fr8Var.a().b());
            fr8Var.i = true;
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((jr8) snapshotStateList2.get(i2)).n(ql7Var);
        }
    }

    public final void o(long j) {
        if (this.b == null) {
            this.f.i(j);
        }
    }

    public final void p() {
        xe8 xe8Var;
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            fr8 fr8Var = (fr8) snapshotStateList.get(i);
            ql7 ql7Var = fr8Var.e;
            if (ql7Var != null && (xe8Var = fr8Var.f) != null) {
                long jW = ok4.W(ql7Var.g * ((double) ql7Var.d));
                Object objF = xe8Var.f(jW);
                if (fr8Var.i) {
                    fr8Var.a().i(objF);
                }
                fr8Var.a().h(objF);
                fr8Var.l.i(fr8Var.a().b());
                if (fr8Var.c() == -2.0f || fr8Var.i) {
                    fr8Var.f(objF);
                } else {
                    fr8Var.d(fr8Var.o.e());
                }
                if (jW >= ql7Var.g) {
                    fr8Var.e = null;
                    fr8Var.f = null;
                } else {
                    ql7Var.c = false;
                }
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((jr8) snapshotStateList2.get(i2)).p();
        }
    }

    public final void q(Object obj) {
        wb5 wb5Var = this.d;
        s08 s08Var = (s08) wb5Var;
        if (js3.i(s08Var.getValue(), obj)) {
            return;
        }
        ((s08) this.e).setValue(new er8(s08Var.getValue(), obj));
        tt9 tt9Var = this.a;
        if (!js3.i(tt9Var.j(), s08Var.getValue())) {
            tt9Var.s(s08Var.getValue());
        }
        ((s08) wb5Var).setValue(obj);
        if (this.g.h() == Long.MIN_VALUE) {
            ((s08) this.h).setValue(Boolean.TRUE);
        }
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((fr8) snapshotStateList.get(i)).h.i(-2.0f);
        }
    }

    public final String toString() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((fr8) snapshotStateList.get(i)) + ", ";
        }
        return str;
    }
}
