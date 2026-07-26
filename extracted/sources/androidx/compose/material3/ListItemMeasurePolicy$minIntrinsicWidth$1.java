package androidx.compose.material3;

import defpackage.qp2;
import defpackage.yk4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class ListItemMeasurePolicy$minIntrinsicWidth$1 extends FunctionReferenceImpl implements qp2 {
    static {
        new ListItemMeasurePolicy$minIntrinsicWidth$1();
    }

    public ListItemMeasurePolicy$minIntrinsicWidth$1() {
        super(2, yk4.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(((yk4) obj).l(((Number) obj2).intValue()));
    }
}
