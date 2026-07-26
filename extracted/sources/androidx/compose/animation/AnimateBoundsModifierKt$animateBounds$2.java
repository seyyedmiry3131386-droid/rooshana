package androidx.compose.animation;

import defpackage.h31;
import defpackage.j31;
import defpackage.qp2;
import defpackage.tn3;
import defpackage.zq3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class AnimateBoundsModifierKt$animateBounds$2 extends Lambda implements qp2 {
    static {
        new AnimateBoundsModifierKt$animateBounds$2();
    }

    public AnimateBoundsModifierKt$animateBounds$2() {
        super(2);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((zq3) obj).a;
        long j2 = ((h31) obj2).a;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (!((i2 >= 0) & (i >= 0))) {
            tn3.a("width and height must be >= 0");
        }
        return new h31(j31.h(i, i, i2, i2));
    }
}
