package androidx.tv.material3;

import defpackage.bg0;
import defpackage.ex4;
import defpackage.hx4;
import defpackage.la7;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.rq4;
import defpackage.tx8;
import defpackage.zu0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.tv.material3.ComposableSingletons$CarouselKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
final class ComposableSingletons$CarouselKt$lambda1$1 extends Lambda implements rp2 {
    static {
        new ComposableSingletons$CarouselKt$lambda1$1();
    }

    public ComposableSingletons$CarouselKt$lambda1$1() {
        super(3);
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        qz0 qz0Var = (qz0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= qz0Var.g(zBooleanValue) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && qz0Var.B()) {
            qz0Var.U();
        } else {
            long j = zu0.d;
            long jB = zu0.b(0.3f, j);
            hx4 hx4VarI = androidx.compose.foundation.layout.b.i(ex4.b, 8);
            if (!zBooleanValue) {
                j = jB;
            }
            bg0.a(rq4.f(hx4VarI, j, la7.a), qz0Var, 0);
        }
        return tx8.a;
    }
}
