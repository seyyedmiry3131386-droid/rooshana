package defpackage;

import androidx.compose.ui.graphics.colorspace.a;

/* JADX INFO: loaded from: classes.dex */
public final class m21 extends n21 {
    public final a e;
    public final a f;
    public final float[] g;

    public m21(a aVar, a aVar2) {
        float[] fArrE;
        super(aVar2, aVar, aVar2, null);
        this.e = aVar;
        this.f = aVar2;
        float[] fArr = (float[]) ca7.e.b;
        yd9 yd9Var = aVar.d;
        float[] fArr2 = aVar.i;
        yd9 yd9Var2 = aVar2.d;
        float[] fArr3 = aVar2.j;
        if (rf0.o(yd9Var, yd9Var2)) {
            fArrE = rf0.E(fArr3, fArr2);
        } else {
            float[] fArrA = yd9Var.a();
            float[] fArrA2 = yd9Var2.a();
            yd9 yd9Var3 = ja1.i;
            fArrE = rf0.E(rf0.o(yd9Var2, yd9Var3) ? fArr3 : rf0.A(rf0.E(rf0.n(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), aVar2.i)), rf0.o(yd9Var, yd9Var3) ? fArr2 : rf0.E(rf0.n(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrE;
    }

    @Override // defpackage.n21
    public final long a(long j) {
        float fH = zu0.h(j);
        float fG = zu0.g(j);
        float fE = zu0.e(j);
        float fD = zu0.d(j);
        g97 g97Var = this.e.p;
        float fD2 = (float) g97Var.d(fH);
        float fD3 = (float) g97Var.d(fG);
        float fD4 = (float) g97Var.d(fE);
        float[] fArr = this.g;
        float f = (fArr[6] * fD4) + (fArr[3] * fD3) + (fArr[0] * fD2);
        float f2 = (fArr[7] * fD4) + (fArr[4] * fD3) + (fArr[1] * fD2);
        float f3 = (fArr[8] * fD4) + (fArr[5] * fD3) + (fArr[2] * fD2);
        a aVar = this.f;
        float fD5 = (float) aVar.m.d(f);
        g97 g97Var2 = aVar.m;
        return gu9.c(fD5, (float) g97Var2.d(f2), (float) g97Var2.d(f3), fD, aVar);
    }
}
