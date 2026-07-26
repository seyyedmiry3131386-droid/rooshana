package androidx.compose.animation;

import defpackage.qp2;
import defpackage.qz0;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class CrossfadeKt$Crossfade$5$1 extends Lambda implements qp2 {
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            throw null;
        }
        qz0Var.U();
        return tx8.a;
    }
}
