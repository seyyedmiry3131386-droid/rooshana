package androidx.compose.animation;

import defpackage.hx4;
import defpackage.qz0;
import defpackage.sp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class SharedTransitionScopeKt$SharedTransitionLayout$1 extends Lambda implements sp2 {
    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        l lVar = (l) obj;
        hx4 hx4Var = (hx4) obj2;
        qz0 qz0Var = (qz0) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            i = (qz0Var.f(lVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= qz0Var.f(hx4Var) ? 32 : 16;
        }
        if (qz0Var.R(i & 1, (i & 147) != 146)) {
            throw null;
        }
        qz0Var.U();
        return tx8.a;
    }
}
