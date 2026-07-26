package androidx.compose.animation;

import defpackage.a96;
import defpackage.b96;
import defpackage.dp2;
import defpackage.el4;
import defpackage.h31;
import defpackage.rp2;
import defpackage.tx8;
import defpackage.yk4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1 extends Lambda implements rp2 {
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        el4 el4Var = (el4) obj;
        final b96 b96VarT = ((yk4) obj2).t(((h31) obj3).a);
        if (el4Var.Q()) {
            throw null;
        }
        return el4Var.D(b96VarT.a, b96VarT.b, kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj4) {
                ((a96) obj4).g(b96VarT, 0, 0, 0.0f);
                return tx8.a;
            }
        });
    }
}
