package defpackage;

import ir.mservices.market.pika.common.model.ByteArrayResult;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class gl4 {
    public final h81 a;
    public final float b;
    public float c;
    public float d;
    public final /* synthetic */ hl4 e;

    public gl4(hl4 hl4Var, h81 h81Var, float f, float f2) {
        js3.p(h81Var, "cubic");
        this.e = hl4Var;
        this.a = h81Var;
        if (f2 < f) {
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        this.b = hl4Var.a.c(h81Var);
        this.c = f;
        this.d = f2;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [xi] */
    public final Pair a(float f) {
        float fS = ok4.s(f, this.c, this.d);
        float f2 = this.d;
        float f3 = this.c;
        float f4 = (fS - f3) / (f2 - f3);
        hl4 hl4Var = this.e;
        final yi yiVar = hl4Var.a;
        final float f5 = f4 * this.b;
        yiVar.getClass();
        final h81 h81Var = this.a;
        js3.p(h81Var, ByteArrayResult.AppInfo.VERSION_CODE_SERIALISED_NAME);
        float[] fArr = h81Var.a;
        final float fA = p29.a(fArr[0] - yiVar.a, fArr[1] - yiVar.b);
        ?? r5 = new Object() { // from class: xi
            public final float a(float f6) {
                h81 h81Var2 = h81Var;
                js3.p(h81Var2, "$c");
                yi yiVar2 = yiVar;
                js3.p(yiVar2, "this$0");
                long jC = h81Var2.c(f6);
                return Math.abs(p29.d(p29.a(yq2.i0(jC) - yiVar2.a, yq2.j0(jC) - yiVar2.b) - fA, p29.c) - f5);
            }
        };
        float f6 = 0.0f;
        float f7 = 1.0f;
        while (f7 - f6 > 1.0E-5f) {
            float f8 = 2;
            float f9 = 3;
            float f10 = ((f8 * f6) + f7) / f9;
            float f11 = ((f8 * f7) + f6) / f9;
            if (r5.a(f10) < r5.a(f11)) {
                f7 = f11;
            } else {
                f6 = f10;
            }
        }
        float f12 = (f6 + f7) / 2;
        if (0.0f > f12 || f12 > 1.0f) {
            throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1");
        }
        Pair pairD = h81Var.d(f12);
        return new Pair(new gl4(hl4Var, (h81) pairD.a, this.c, fS), new gl4(hl4Var, (h81) pairD.b, fS, this.d));
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.c + " .. " + this.d + "], size=" + this.b + ", cubic=" + this.a + ')';
    }
}
