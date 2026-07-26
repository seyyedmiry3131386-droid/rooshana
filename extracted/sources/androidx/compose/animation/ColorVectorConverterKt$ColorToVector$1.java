package androidx.compose.animation;

import defpackage.cl;
import defpackage.dp2;
import defpackage.gu9;
import defpackage.mt8;
import defpackage.nv0;
import defpackage.pv0;
import defpackage.zu0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements dp2 {
    public static final ColorVectorConverterKt$ColorToVector$1 g = new ColorVectorConverterKt$ColorToVector$1();

    public ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        final nv0 nv0Var = (nv0) obj;
        return new mt8(new dp2() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
            @Override // defpackage.dp2
            public final Object invoke(Object obj2) {
                long jA = zu0.a(((zu0) obj2).a, pv0.x);
                return new cl(zu0.d(jA), zu0.h(jA), zu0.g(jA), zu0.e(jA));
            }
        }, new dp2() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj2) {
                cl clVar = (cl) obj2;
                float f = clVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = clVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = clVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = clVar.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new zu0(zu0.a(gu9.c(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, pv0.x), nv0Var));
            }
        });
    }
}
