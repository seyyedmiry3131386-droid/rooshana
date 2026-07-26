package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uo3 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ uo3(int i, b96 b96Var, int i2) {
        this.a = 1;
        this.b = i;
        this.c = b96Var;
        this.d = i2;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((a96) obj).g((b96) this.c, this.b, this.d, 0.0f);
                break;
            case 1:
                ((a96) obj).g((b96) this.c, ok4.V((this.b - r0.a) / 2.0f), ok4.V((this.d - r0.b) / 2.0f), 0.0f);
                break;
            case 2:
                ((a96) obj).g((b96) this.c, this.b, this.d, 0.0f);
                break;
            default:
                eh ehVar = (eh) this.c;
                l16 l16Var = (l16) obj;
                yg ygVar = l16Var.a;
                int iD = l16Var.d(this.b);
                int iD2 = l16Var.d(this.d);
                CharSequence charSequence = ygVar.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbB = bl4.B(iD, iD2, "start(", ") or end(", ") is out of range [0..");
                    sbB.append(charSequence.length());
                    sbB.append("], or start > end!");
                    sn3.a(sbB.toString());
                }
                Path path = new Path();
                pi8 pi8Var = ygVar.d;
                pi8Var.f.getSelectionPath(iD, iD2, path);
                int i = pi8Var.h;
                if (i != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i);
                }
                eh ehVar2 = new eh(path);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(l16Var.f)) & 4294967295L);
                Matrix matrix = ehVar2.d;
                if (matrix == null) {
                    ehVar2.d = new Matrix();
                } else {
                    js3.m(matrix);
                    matrix.reset();
                }
                Matrix matrix2 = ehVar2.d;
                js3.m(matrix2);
                matrix2.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                Matrix matrix3 = ehVar2.d;
                js3.m(matrix3);
                ehVar2.a.transform(matrix3);
                bl4.h(ehVar, ehVar2);
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ uo3(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = i;
        this.d = i2;
    }
}
