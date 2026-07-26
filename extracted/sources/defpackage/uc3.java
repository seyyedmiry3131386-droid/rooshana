package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class uc3 implements xr7 {
    public static final uc3 b = new uc3(0);
    public static final uc3 c = new uc3(1);
    public final /* synthetic */ int a;

    public /* synthetic */ uc3(int i) {
        this.a = i;
    }

    @Override // defpackage.xr7
    public final rq4 a(long j, LayoutDirection layoutDirection, qj1 qj1Var) {
        switch (this.a) {
            case 0:
                float fB0 = qj1Var.b0(ot0.a);
                return new ww5(new sy6(0.0f, -fB0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fB0));
            case 1:
                float fB02 = qj1Var.b0(ot0.a);
                return new ww5(new sy6(-fB02, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fB02, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new ww5(ry7.c(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
