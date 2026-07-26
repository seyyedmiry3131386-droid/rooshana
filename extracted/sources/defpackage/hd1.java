package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hd1 implements eb6, ps4, tw1 {
    public final td8 a;
    public final yl8 b;
    public final am8 c;
    public final on d;
    public final SparseArray e;
    public t94 f;
    public gb6 g;
    public wd8 h;
    public boolean i;

    public hd1(td8 td8Var) {
        td8Var.getClass();
        this.a = td8Var;
        this.f = new t94(j29.x(), td8Var, new l31(13));
        yl8 yl8Var = new yl8();
        this.b = yl8Var;
        this.c = new am8();
        on onVar = new on();
        onVar.a = yl8Var;
        onVar.b = ImmutableList.q();
        onVar.c = ImmutableMap.l();
        this.d = onVar;
        this.e = new SparseArray();
    }

    @Override // defpackage.eb6
    public final void A(long j) {
        be beVarW = W();
        b0(beVarW, 16, new l31(beVarW, j, 26, (byte) 0));
    }

    @Override // defpackage.eb6
    public final void B(int i, fb6 fb6Var, fb6 fb6Var2) {
        if (i == 1) {
            this.i = false;
        }
        gb6 gb6Var = this.g;
        gb6Var.getClass();
        on onVar = this.d;
        onVar.d = on.j(gb6Var, (ImmutableList) onVar.b, (ks4) onVar.e, (yl8) onVar.a);
        be beVarW = W();
        b0(beVarW, 11, new xc1(i, beVarW, fb6Var, fb6Var2));
    }

    @Override // defpackage.eb6
    public final void C(qp4 qp4Var) {
        be beVarW = W();
        b0(beVarW, 14, new gd1(beVarW, qp4Var, 0));
    }

    @Override // defpackage.eb6
    public final void D(qp4 qp4Var) {
        be beVarW = W();
        b0(beVarW, 15, new l31(beVarW, qp4Var, 25));
    }

    @Override // defpackage.eb6
    public final void E(long j) {
        be beVarW = W();
        b0(beVarW, 17, new l31(beVarW, j, 29, (byte) 0));
    }

    @Override // defpackage.eb6
    public final void F(bm8 bm8Var, int i) {
        gb6 gb6Var = this.g;
        gb6Var.getClass();
        on onVar = this.d;
        onVar.d = on.j(gb6Var, (ImmutableList) onVar.b, (ks4) onVar.e, (yl8) onVar.a);
        onVar.y(gb6Var.S());
        be beVarW = W();
        b0(beVarW, 0, new tc1(beVarW, i, 0));
    }

    @Override // defpackage.tw1
    public final void G(int i, ks4 ks4Var) {
        be beVarZ = Z(i, ks4Var);
        b0(beVarZ, 1023, new bd1(beVarZ, 5));
    }

    @Override // defpackage.eb6
    public final void I(boolean z) {
        be beVarA0 = a0();
        b0(beVarA0, 23, new rc1(beVarA0, z, 3));
    }

    @Override // defpackage.eb6
    public final void J(List list) {
        be beVarW = W();
        b0(beVarW, 27, new l31(beVarW, list, 15));
    }

    @Override // defpackage.eb6
    public final void K(int i, boolean z) {
        be beVarW = W();
        b0(beVarW, -1, new l31(beVarW, z, i));
    }

    @Override // defpackage.tw1
    public final void L(int i, ks4 ks4Var) {
        be beVarZ = Z(i, ks4Var);
        b0(beVarZ, 1027, new bd1(beVarZ, 3));
    }

    @Override // defpackage.eb6
    public final void M(ua6 ua6Var) {
        be beVarW = W();
        b0(beVarW, 12, new j2((Object) beVarW, (Object) ua6Var, 9));
    }

    @Override // defpackage.eb6
    public final void N(cb6 cb6Var) {
        be beVarW = W();
        b0(beVarW, 13, new l31(beVarW, cb6Var, 10));
    }

    @Override // defpackage.eb6
    public final void O(PlaybackException playbackException) {
        ks4 ks4Var;
        be beVarW = (!(playbackException instanceof ExoPlaybackException) || (ks4Var = ((ExoPlaybackException) playbackException).o) == null) ? W() : X(ks4Var);
        b0(beVarW, 10, new l31(beVarW, playbackException, 14));
    }

    @Override // defpackage.eb6
    public final void P(jv4 jv4Var) {
        be beVarW = W();
        b0(beVarW, 28, new j2((Object) beVarW, (Object) jv4Var, 6));
    }

    @Override // defpackage.eb6
    public final void Q(wl1 wl1Var) {
        be beVarW = W();
        b0(beVarW, 29, new l31(beVarW, wl1Var, 22));
    }

    @Override // defpackage.eb6
    public final void R(long j) {
        be beVarW = W();
        b0(beVarW, 18, new l31(beVarW, j, 27, (byte) 0));
    }

    @Override // defpackage.eb6
    public final void S(PlaybackException playbackException) {
        ks4 ks4Var;
        be beVarW = (!(playbackException instanceof ExoPlaybackException) || (ks4Var = ((ExoPlaybackException) playbackException).o) == null) ? W() : X(ks4Var);
        b0(beVarW, 10, new j2((Object) beVarW, (Object) playbackException, 7));
    }

    @Override // defpackage.eb6
    public final void T(int i, int i2) {
        be beVarA0 = a0();
        b0(beVarA0, 24, new yc1(i, i2, beVarA0));
    }

    @Override // defpackage.ps4
    public final void U(int i, ks4 ks4Var, da4 da4Var, op4 op4Var, int i2) {
        be beVarZ = Z(i, ks4Var);
        b0(beVarZ, 1000, new l31(beVarZ, da4Var, op4Var, i2));
    }

    @Override // defpackage.eb6
    public final void V(boolean z) {
        be beVarW = W();
        b0(beVarW, 7, new rc1(beVarW, z, 1));
    }

    public final be W() {
        return X((ks4) this.d.d);
    }

    public final be X(ks4 ks4Var) {
        this.g.getClass();
        bm8 bm8Var = ks4Var == null ? null : (bm8) ((ImmutableMap) this.d.c).get(ks4Var);
        if (ks4Var != null && bm8Var != null) {
            return Y(bm8Var, bm8Var.g(ks4Var.a, this.b).c, ks4Var);
        }
        int iM = this.g.M();
        bm8 bm8VarS = this.g.S();
        if (iM >= bm8VarS.o()) {
            bm8VarS = bm8.a;
        }
        return Y(bm8VarS, iM, null);
    }

    public final be Y(bm8 bm8Var, int i, ks4 ks4Var) {
        ks4 ks4Var2 = bm8Var.p() ? null : ks4Var;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = bm8Var.equals(this.g.S()) && i == this.g.M();
        long jK0 = 0;
        if (ks4Var2 == null || !ks4Var2.b()) {
            if (z) {
                jK0 = this.g.F();
            } else if (!bm8Var.p()) {
                jK0 = j29.k0(bm8Var.m(i, this.c, 0L).l);
            }
        } else if (z && this.g.L() == ks4Var2.b && this.g.u() == ks4Var2.c) {
            jK0 = this.g.d0();
        }
        return new be(jElapsedRealtime, bm8Var, i, ks4Var2, jK0, this.g.S(), this.g.M(), (ks4) this.d.d, this.g.d0(), this.g.i());
    }

    public final be Z(int i, ks4 ks4Var) {
        this.g.getClass();
        if (ks4Var != null) {
            return ((bm8) ((ImmutableMap) this.d.c).get(ks4Var)) != null ? X(ks4Var) : Y(bm8.a, i, ks4Var);
        }
        bm8 bm8VarS = this.g.S();
        if (i >= bm8VarS.o()) {
            bm8VarS = bm8.a;
        }
        return Y(bm8VarS, i, null);
    }

    @Override // defpackage.eb6
    public final void a(w59 w59Var) {
        be beVarA0 = a0();
        b0(beVarA0, 25, new j2((Object) beVarA0, (Object) w59Var, 11));
    }

    public final be a0() {
        return X((ks4) this.d.f);
    }

    @Override // defpackage.tw1
    public final void b(int i, ks4 ks4Var, Exception exc) {
        be beVarZ = Z(i, ks4Var);
        b0(beVarZ, 1024, new j2((Object) beVarZ, (Object) exc, 10));
    }

    public final void b0(be beVar, int i, q94 q94Var) {
        this.e.put(i, beVar);
        this.f.f(i, q94Var);
    }

    @Override // defpackage.eb6
    public final void c(int i) {
        be beVarW = W();
        b0(beVarW, 6, new tc1(beVarW, i, 2));
    }

    public final void c0(e62 e62Var, Looper looper) {
        vy2.s(this.g == null || ((ImmutableList) this.d.b).isEmpty());
        e62Var.getClass();
        this.g = e62Var;
        this.h = this.a.a(looper, null);
        t94 t94Var = this.f;
        this.f = new t94(t94Var.d, looper, t94Var.a, new j2(this, e62Var, 5), t94Var.i);
    }

    @Override // defpackage.ps4
    public final void f(int i, ks4 ks4Var, op4 op4Var) {
        be beVarZ = Z(i, ks4Var);
        b0(beVarZ, 1004, new ad1(beVarZ, op4Var, 0));
    }

    @Override // defpackage.ps4
    public final void g(int i, ks4 ks4Var, op4 op4Var) {
        be beVarZ = Z(i, ks4Var);
        b0(beVarZ, 1005, new ad1(beVarZ, op4Var, 1));
    }

    @Override // defpackage.eb6
    public final void h(int i) {
        be beVarW = W();
        b0(beVarW, 8, new tc1(beVarW, i, 4));
    }

    @Override // defpackage.eb6
    public final void i(ly lyVar) {
        be beVarA0 = a0();
        b0(beVarA0, 20, new j2((Object) beVarA0, (Object) lyVar, 14));
    }

    @Override // defpackage.eb6
    public final void j(hp8 hp8Var) {
        be beVarW = W();
        b0(beVarW, 19, new gd1(beVarW, hp8Var, 1));
    }

    @Override // defpackage.tw1
    public final void k(int i, ks4 ks4Var, int i2) {
        be beVarZ = Z(i, ks4Var);
        b0(beVarZ, 1022, new tc1(beVarZ, i2, 6));
    }

    @Override // defpackage.eb6
    public final void l(boolean z) {
        be beVarW = W();
        b0(beVarW, 3, new rc1(beVarW, z, 0));
    }

    @Override // defpackage.eb6
    public final void m(final int i, final boolean z) {
        final be beVarW = W();
        b0(beVarW, 5, new q94() { // from class: vc1
            @Override // defpackage.q94
            public final void invoke(Object obj) {
                ((ce) obj).R(beVarW, i, z);
            }
        });
    }

    @Override // defpackage.eb6
    public final void n(float f) {
        be beVarA0 = a0();
        b0(beVarA0, 22, new uc1(beVarA0, f));
    }

    @Override // defpackage.eb6
    public final void o(int i, jp4 jp4Var) {
        be beVarW = W();
        b0(beVarW, 1, new tc1(beVarW, jp4Var, i));
    }

    @Override // defpackage.ps4
    public final void p(int i, ks4 ks4Var, da4 da4Var, op4 op4Var) {
        be beVarZ = Z(i, ks4Var);
        b0(beVarZ, 1002, new l31(beVarZ, da4Var, op4Var, 21, (byte) 0));
    }

    @Override // defpackage.eb6
    public final void q(int i) {
        be beVarA0 = a0();
        b0(beVarA0, 21, new tc1(beVarA0, i, 7));
    }

    @Override // defpackage.eb6
    public final void r(int i) {
        be beVarW = W();
        b0(beVarW, 4, new tc1(beVarW, i, 3));
    }

    @Override // defpackage.ps4
    public final void s(int i, ks4 ks4Var, da4 da4Var, op4 op4Var) {
        be beVarZ = Z(i, ks4Var);
        b0(beVarZ, 1001, new l31(beVarZ, da4Var, op4Var, 23, (byte) 0));
    }

    @Override // defpackage.eb6
    public final void t(boolean z) {
        be beVarW = W();
        b0(beVarW, 9, new rc1(beVarW, z, 2));
    }

    @Override // defpackage.ps4
    public final void u(int i, ks4 ks4Var, da4 da4Var, op4 op4Var, IOException iOException, boolean z) {
        be beVarZ = Z(i, ks4Var);
        b0(beVarZ, 1003, new u4(beVarZ, da4Var, op4Var, iOException, z));
    }

    @Override // defpackage.eb6
    public final void v(m81 m81Var) {
        be beVarW = W();
        b0(beVarW, 27, new l31(beVarW, m81Var, 28));
    }

    @Override // defpackage.tw1
    public final void w(int i, ks4 ks4Var) {
        be beVarZ = Z(i, ks4Var);
        b0(beVarZ, 1025, new bd1(beVarZ, 4));
    }

    @Override // defpackage.eb6
    public final void x(rp8 rp8Var) {
        be beVarW = W();
        b0(beVarW, 2, new j2((Object) beVarW, (Object) rp8Var, 13));
    }

    @Override // defpackage.eb6
    public final void z(int i, boolean z) {
        be beVarW = W();
        b0(beVarW, 30, new l31(beVarW, i, z));
    }

    @Override // defpackage.eb6
    public final void H() {
    }

    @Override // defpackage.eb6
    public final void d(boolean z) {
    }

    @Override // defpackage.eb6
    public final void e(int i) {
    }

    @Override // defpackage.eb6
    public final void y(gb6 gb6Var, db6 db6Var) {
    }
}
