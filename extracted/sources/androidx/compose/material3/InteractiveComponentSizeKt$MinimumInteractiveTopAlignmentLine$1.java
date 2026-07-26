package androidx.compose.material3;

import defpackage.ok4;
import defpackage.qp2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1 extends FunctionReferenceImpl implements qp2 {
    public static final InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1 a = new InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1();

    public InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1() {
        super(2, ok4.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
