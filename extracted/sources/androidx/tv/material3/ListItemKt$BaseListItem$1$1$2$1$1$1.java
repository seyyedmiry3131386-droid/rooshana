package androidx.tv.material3;

import defpackage.qp2;
import defpackage.qz0;
import defpackage.tx8;
import defpackage.yv8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class ListItemKt$BaseListItem$1$1$2$1$1$1 extends Lambda implements qp2 {
    public final /* synthetic */ qp2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$BaseListItem$1$1$2$1$1$1(qp2 qp2Var) {
        super(2);
        this.g = qp2Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && qz0Var.B()) {
            qz0Var.U();
        } else {
            m.a(((yv8) qz0Var.j(n.a)).o, this.g, qz0Var, 0);
        }
        return tx8.a;
    }
}
