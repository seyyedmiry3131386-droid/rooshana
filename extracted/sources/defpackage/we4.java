package defpackage;

import androidx.compose.ui.node.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class we4 implements qj1 {
    public boolean a;
    public long b = 9223372034707292159L;
    public long c = 0;
    public final /* synthetic */ j d;

    public we4(j jVar) {
        this.d = jVar;
    }

    @Override // defpackage.qj1
    public final long F(float f) {
        return dw1.d(this, L(f));
    }

    @Override // defpackage.qj1
    public final float J(int i) {
        return i / getDensity();
    }

    @Override // defpackage.qj1
    public final float L(float f) {
        return f / getDensity();
    }

    @Override // defpackage.qj1
    public final float O() {
        return this.d.O();
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return getDensity() * f;
    }

    public final void a(sc3 sc3Var, float f) {
        j jVar = this.d;
        yb ybVar = jVar.m;
        if (ybVar == null) {
            ybVar = new yb();
            jVar.m = ybVar;
        }
        int iN0 = ew.N0((sc3[]) ybVar.b, sc3Var);
        if (iN0 >= 0) {
            float[] fArr = (float[]) ybVar.c;
            if (fArr[iN0] != f) {
                fArr[iN0] = f;
                ((byte[]) ybVar.d)[iN0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) ybVar.d;
                if (bArr[iN0] == 2) {
                    bArr[iN0] = 0;
                    return;
                }
                return;
            }
        }
        int i = ybVar.a;
        sc3[] sc3VarArr = (sc3[]) ybVar.b;
        if (i == sc3VarArr.length) {
            int i2 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(sc3VarArr, i2);
            js3.o(objArrCopyOf, "copyOf(...)");
            ybVar.b = (sc3[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf((float[]) ybVar.c, i2);
            js3.o(fArrCopyOf, "copyOf(...)");
            ybVar.c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf((byte[]) ybVar.d, i2);
            js3.o(bArrCopyOf, "copyOf(...)");
            ybVar.d = bArrCopyOf;
        }
        ((sc3[]) ybVar.b)[i] = sc3Var;
        ((byte[]) ybVar.d)[i] = 3;
        ((float[]) ybVar.c)[i] = f;
        ybVar.a++;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ int b0(float f) {
        return o40.a(this, f);
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.d.getDensity();
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long h0(long j) {
        return o40.d(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float j0(long j) {
        return o40.c(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long o(long j) {
        return o40.b(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float s(long j) {
        return dw1.b(j, this);
    }
}
