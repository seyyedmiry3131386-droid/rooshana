package androidx.tv.material3;

import defpackage.bn6;
import defpackage.dp2;
import defpackage.n08;
import defpackage.qp2;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final n08 a = androidx.compose.runtime.g.e(0);
    public final n08 b;
    public boolean c;

    static {
        new bn6(new qp2() { // from class: androidx.tv.material3.CarouselState$Companion$Saver$1
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((a) obj2).a());
            }
        }, new dp2() { // from class: androidx.tv.material3.CarouselState$Companion$Saver$2
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                return new a(((Number) obj).intValue());
            }
        }, 5);
    }

    public a(int i) {
        this.b = androidx.compose.runtime.g.e(i);
    }

    public final int a() {
        return this.b.h();
    }
}
