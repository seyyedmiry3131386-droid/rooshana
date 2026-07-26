package androidx.tv.material3;

import defpackage.bn6;
import defpackage.dp2;
import defpackage.qp2;
import defpackage.s08;
import defpackage.wb5;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final wb5 a;

    static {
        new bn6(new qp2() { // from class: androidx.tv.material3.DrawerState$Companion$Saver$1
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((f) obj2).a();
            }
        }, new dp2() { // from class: androidx.tv.material3.DrawerState$Companion$Saver$2
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                return new f((DrawerValue) obj);
            }
        }, 5);
    }

    public f(DrawerValue drawerValue) {
        this.a = androidx.compose.runtime.g.h(drawerValue);
    }

    public final DrawerValue a() {
        return (DrawerValue) ((s08) this.a).getValue();
    }
}
