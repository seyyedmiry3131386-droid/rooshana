package defpackage;

import androidx.compose.animation.h;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l34 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l34(float f, Ref$FloatRef ref$FloatRef, j34 j34Var) {
        this.a = 0;
        this.b = f;
        this.c = ref$FloatRef;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                rk rkVar = (rk) obj;
                float f = this.b;
                if (f > 0.0f || f < 0.0f) {
                    ((Number) ((s08) rkVar.e).getValue()).floatValue();
                }
                throw null;
            case 1:
                dp2 dp2Var = (dp2) this.c;
                oj ojVar = (oj) obj;
                return new h(((h) dp2Var.invoke(ojVar)).a, ((h) dp2Var.invoke(ojVar)).b, this.b, null);
            default:
                jr8 jr8Var = (jr8) this.c;
                long jLongValue = ((Long) obj).longValue();
                boolean zH = jr8Var.h();
                p08 p08Var = jr8Var.g;
                if (!zH) {
                    if (p08Var.h() == Long.MIN_VALUE) {
                        p08Var.i(jLongValue);
                        ((s08) ((wb5) jr8Var.a.b)).setValue(Boolean.TRUE);
                    }
                    long jH = jLongValue - p08Var.h();
                    float f2 = this.b;
                    if (f2 != 0.0f) {
                        jH = ok4.W(jH / ((double) f2));
                    }
                    jr8Var.o(jH);
                    jr8Var.i(jH, f2 == 0.0f);
                }
                return tx8.a;
        }
    }

    public /* synthetic */ l34(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }
}
