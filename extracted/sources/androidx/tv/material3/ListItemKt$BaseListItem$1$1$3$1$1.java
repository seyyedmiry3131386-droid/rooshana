package androidx.tv.material3;

import defpackage.gj8;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class ListItemKt$BaseListItem$1$1$3$1$1 extends Lambda implements qp2 {
    public final /* synthetic */ gj8 g;
    public final /* synthetic */ qp2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$BaseListItem$1$1$3$1$1(gj8 gj8Var, qp2 qp2Var) {
        super(2);
        this.g = gj8Var;
        this.h = qp2Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && qz0Var.B()) {
            qz0Var.U();
        } else {
            m.a(this.g, this.h, qz0Var, 0);
        }
        return tx8.a;
    }
}
