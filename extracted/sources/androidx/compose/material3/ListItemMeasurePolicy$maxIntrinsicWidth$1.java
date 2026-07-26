package androidx.compose.material3;

import defpackage.qp2;
import defpackage.yk4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class ListItemMeasurePolicy$maxIntrinsicWidth$1 extends FunctionReferenceImpl implements qp2 {
    static {
        new ListItemMeasurePolicy$maxIntrinsicWidth$1();
    }

    public ListItemMeasurePolicy$maxIntrinsicWidth$1() {
        super(2, yk4.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(((yk4) obj).n(((Number) obj2).intValue()));
    }
}
