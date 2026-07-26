package androidx.compose.ui.layout;

import defpackage.ok4;
import defpackage.qp2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements qp2 {
    public static final AlignmentLineKt$LastBaseline$1 a = new AlignmentLineKt$LastBaseline$1();

    public AlignmentLineKt$LastBaseline$1() {
        super(2, ok4.class, "max", "max(II)I", 1);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
