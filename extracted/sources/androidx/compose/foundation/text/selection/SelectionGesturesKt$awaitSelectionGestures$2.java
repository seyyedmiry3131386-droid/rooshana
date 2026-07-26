package androidx.compose.foundation.text.selection;

import defpackage.g51;
import defpackage.pg;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wg8;
import defpackage.wx7;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2", f = "SelectionGestures.kt", l = {111, 119, 122, 124}, m = "invokeSuspend", v = 1)
final class SelectionGesturesKt$awaitSelectionGestures$2 extends RestrictedSuspendLambda implements qp2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pg d;
    public final /* synthetic */ wx7 e;
    public final /* synthetic */ wg8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$awaitSelectionGestures$2(pg pgVar, wx7 wx7Var, wg8 wg8Var, g51 g51Var) {
        super(2, g51Var);
        this.d = pgVar;
        this.e = wx7Var;
        this.f = wg8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        SelectionGesturesKt$awaitSelectionGestures$2 selectionGesturesKt$awaitSelectionGestures$2 = new SelectionGesturesKt$awaitSelectionGestures$2(this.d, this.e, this.f, g51Var);
        selectionGesturesKt$awaitSelectionGestures$2.c = obj;
        return selectionGesturesKt$awaitSelectionGestures$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionGesturesKt$awaitSelectionGestures$2) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
    
        if (androidx.compose.foundation.text.selection.c.d(r2, r17.e, r8, r7, r17) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        if (androidx.compose.foundation.text.selection.c.e(r2, r8, r7, r17) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
    
        if (androidx.compose.foundation.text.selection.c.b(r2, r8, r7, r5, r17) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
