package androidx.tv.material3;

import defpackage.qp2;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class NavigationDrawerItemKt$NavigationDrawerItem$4 extends Lambda implements qp2 {

    /* JADX INFO: renamed from: androidx.tv.material3.NavigationDrawerItemKt$NavigationDrawerItem$4$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements rp2 {
        @Override // defpackage.rp2
        public final Object a(Object obj, Object obj2, Object obj3) {
            ((Number) obj3).intValue();
            throw null;
        }
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        qz0 qz0Var = (qz0) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !qz0Var.B()) {
            throw null;
        }
        qz0Var.U();
        return tx8.a;
    }
}
