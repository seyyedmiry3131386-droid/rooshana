package androidx.tv.material3;

import defpackage.qp2;
import defpackage.qz0;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class WideButtonKt$WideButton$2 extends Lambda implements qp2 {
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && qz0Var.B()) {
            qz0Var.U();
        } else {
            o.a.a(384, qz0Var);
        }
        return tx8.a;
    }
}
