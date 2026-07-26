package androidx.tv.material3;

import defpackage.c60;
import defpackage.ex4;
import defpackage.gj8;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.tx8;
import defpackage.yv8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class ButtonKt$ButtonImpl$2 extends Lambda implements rp2 {

    /* JADX INFO: renamed from: androidx.tv.material3.ButtonKt$ButtonImpl$2$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            qz0 qz0Var = (qz0) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && qz0Var.B()) {
                qz0Var.U();
                return tx8.a;
            }
            androidx.compose.foundation.layout.b.a(ex4.b, c60.a, c60.b);
            throw null;
        }
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        qz0 qz0Var = (qz0) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && qz0Var.B()) {
            qz0Var.U();
            return tx8.a;
        }
        gj8 gj8Var = ((yv8) qz0Var.j(n.a)).m;
        throw null;
    }
}
