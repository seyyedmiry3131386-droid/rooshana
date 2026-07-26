package androidx.tv.material3;

import defpackage.qp2;
import defpackage.qz0;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.tv.material3.ComposableSingletons$CardContainerKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
final class ComposableSingletons$CardContainerKt$lambda3$1 extends Lambda implements qp2 {
    static {
        new ComposableSingletons$CardContainerKt$lambda3$1();
    }

    public ComposableSingletons$CardContainerKt$lambda3$1() {
        super(2);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && qz0Var.B()) {
            qz0Var.U();
        }
        return tx8.a;
    }
}
