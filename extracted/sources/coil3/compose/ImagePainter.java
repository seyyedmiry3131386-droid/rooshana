package coil3.compose;

import defpackage.g16;
import defpackage.hv1;
import defpackage.nm5;
import defpackage.o40;
import defpackage.ve;
import defpackage.wh3;
import defpackage.wv8;

/* JADX INFO: loaded from: classes.dex */
public final class ImagePainter extends g16 {
    public final wh3 f;

    public ImagePainter(wh3 wh3Var) {
        this.f = wh3Var;
    }

    @Override // defpackage.g16
    public final long h() {
        wh3 wh3Var = this.f;
        int iB = wh3Var.b();
        float f = iB > 0 ? iB : Float.NaN;
        int iA = wh3Var.a();
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(iA > 0 ? iA : Float.NaN)) & 4294967295L);
    }

    @Override // defpackage.g16
    public final void i(hv1 hv1Var) {
        wh3 wh3Var = this.f;
        int iB = wh3Var.b();
        float fIntBitsToFloat = iB > 0 ? Float.intBitsToFloat((int) (hv1Var.d() >> 32)) / iB : 1.0f;
        int iA = wh3Var.a();
        float fIntBitsToFloat2 = iA > 0 ? Float.intBitsToFloat((int) (hv1Var.d() & 4294967295L)) / iA : 1.0f;
        wv8 wv8VarX = hv1Var.X();
        long jA = wv8VarX.A();
        wv8VarX.v().e();
        try {
            ((nm5) wv8VarX.b).y(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            wh3Var.e(ve.a(hv1Var.X().v()));
        } finally {
            o40.F(wv8VarX, jA);
        }
    }
}
