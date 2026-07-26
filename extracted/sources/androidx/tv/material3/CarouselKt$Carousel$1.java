package androidx.tv.material3;

import defpackage.mg0;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class CarouselKt$Carousel$1 extends Lambda implements rp2 {
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        mg0 mg0Var = (mg0) obj;
        qz0 qz0Var = (qz0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= qz0Var.f(mg0Var) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18 || !qz0Var.B()) {
            throw null;
        }
        qz0Var.U();
        return tx8.a;
    }
}
