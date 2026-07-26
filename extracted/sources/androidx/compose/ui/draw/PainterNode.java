package androidx.compose.ui.draw;

import androidx.compose.ui.node.i;
import androidx.compose.ui.node.j;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a96;
import defpackage.ae7;
import defpackage.b96;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.el4;
import defpackage.eq;
import defpackage.ey7;
import defpackage.f14;
import defpackage.g16;
import defpackage.gv1;
import defpackage.gx4;
import defpackage.h31;
import defpackage.j27;
import defpackage.j31;
import defpackage.ml9;
import defpackage.nm5;
import defpackage.tc0;
import defpackage.tx8;
import defpackage.vm0;
import defpackage.yk4;

/* JADX INFO: loaded from: classes.dex */
final class PainterNode extends gx4 implements f14, gv1 {
    public tc0 o;
    private g16 painter;

    public PainterNode(g16 g16Var, tc0 tc0Var) {
        this.painter = g16Var;
        this.o = tc0Var;
    }

    public static boolean E0(long j) {
        return !ey7.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean F0(long j) {
        return !ey7.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final g16 C0() {
        return this.painter;
    }

    public final boolean D0() {
        return this.painter.h() != 9205357640488583168L;
    }

    public final long G0(long j) {
        boolean z = false;
        boolean z2 = h31.d(j) && h31.c(j);
        if (h31.f(j) && h31.e(j)) {
            z = true;
        }
        if ((!D0() && z2) || z) {
            return h31.a(j, h31.h(j), 0, h31.g(j), 0, 10);
        }
        long jH = this.painter.h();
        int iRound = F0(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : h31.j(j);
        int iRound2 = E0(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : h31.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(j31.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(j31.g(iRound, j))) << 32);
        if (D0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!F0(this.painter.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.painter.h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!E0(this.painter.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.h() & 4294967295L)))) & 4294967295L);
            if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) {
                jFloatToRawIntBits = 0;
            } else {
                float f = ml9.f(jFloatToRawIntBits2, jFloatToRawIntBits);
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(f);
                long jFloatToRawIntBits4 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
                int i = ae7.a;
                jFloatToRawIntBits = j27.l(jFloatToRawIntBits2, jFloatToRawIntBits4 | (jFloatToRawIntBits3 << 32));
            }
        }
        return h31.a(j, j31.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, j31.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    public final void H0(g16 g16Var) {
        this.painter = g16Var;
    }

    @Override // defpackage.gv1
    public final void T(i iVar) {
        long jL;
        long jH = this.painter.h();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(F0(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (iVar.a.b.A() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(E0(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (iVar.a.b.A() & 4294967295L)))) & 4294967295L);
        vm0 vm0Var = iVar.a;
        if (Float.intBitsToFloat((int) (vm0Var.b.A() >> 32)) == 0.0f || Float.intBitsToFloat((int) (vm0Var.b.A() & 4294967295L)) == 0.0f) {
            jL = 0;
        } else {
            float f = ml9.f(jFloatToRawIntBits, vm0Var.b.A());
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
            int i = ae7.a;
            jL = j27.l(jFloatToRawIntBits, jFloatToRawIntBits2);
        }
        long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jL >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jL & 4294967295L)))) & 4294967295L);
        long jRound2 = (((long) Math.round(Float.intBitsToFloat((int) (vm0Var.b.A() & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (vm0Var.b.A() >> 32)))) << 32);
        float f2 = (((int) (jRound2 >> 32)) - ((int) (jRound >> 32))) / 2.0f;
        float f3 = (((int) (jRound2 & 4294967295L)) - ((int) (jRound & 4294967295L))) / 2.0f;
        float f4 = 1;
        float f5 = ((iVar.getLayoutDirection() == LayoutDirection.a ? 0.0f : (-1) * 0.0f) + f4) * f2;
        long jRound3 = (((long) Math.round((f4 + 0.0f) * f3)) & 4294967295L) | (((long) Math.round(f5)) << 32);
        float f6 = (int) (jRound3 >> 32);
        float f7 = (int) (jRound3 & 4294967295L);
        ((nm5) vm0Var.b.b).z(f6, f7);
        try {
            this.painter.g(iVar, jL, 1.0f, this.o);
            ((nm5) vm0Var.b.b).z(-f6, -f7);
            iVar.a();
        } catch (Throwable th) {
            ((nm5) vm0Var.b.b).z(-f6, -f7);
            throw th;
        }
    }

    @Override // defpackage.f14
    public final int a(j jVar, yk4 yk4Var, int i) {
        if (!D0()) {
            return yk4Var.l(i);
        }
        long jG0 = G0(j31.b(0, i, 7));
        return Math.max(h31.j(jG0), yk4Var.l(i));
    }

    @Override // defpackage.f14
    public final int b(j jVar, yk4 yk4Var, int i) {
        if (!D0()) {
            return yk4Var.P(i);
        }
        long jG0 = G0(j31.b(i, 0, 13));
        return Math.max(h31.i(jG0), yk4Var.P(i));
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        final b96 b96VarT = yk4Var.t(G0(j));
        return el4Var.D(b96VarT.a, b96VarT.b, kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                a96.j((a96) obj, b96VarT, 0, 0);
                return tx8.a;
            }
        });
    }

    @Override // defpackage.f14
    public final int e(j jVar, yk4 yk4Var, int i) {
        if (!D0()) {
            return yk4Var.n(i);
        }
        long jG0 = G0(j31.b(0, i, 7));
        return Math.max(h31.j(jG0), yk4Var.n(i));
    }

    @Override // defpackage.f14
    public final int f(j jVar, yk4 yk4Var, int i) {
        if (!D0()) {
            return yk4Var.a(i);
        }
        long jG0 = G0(j31.b(i, 0, 13));
        return Math.max(h31.i(jG0), yk4Var.a(i));
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + eq.g + ", alpha=1.0, colorFilter=" + this.o + ')';
    }
}
