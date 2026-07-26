package androidx.compose.foundation.text.selection;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", f = "TextFieldSelectionManager.kt", l = {241, 243}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionManager$contextMenuAreaModifier$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$2(f fVar, g51 g51Var) {
        super(1, g51Var);
        this.b = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new TextFieldSelectionManager$contextMenuAreaModifier$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r9 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.a
            tx8 r2 = defpackage.tx8.a
            r3 = 2
            r4 = 1
            androidx.compose.foundation.text.selection.f r5 = r8.b
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.b.b(r9)
            goto L4f
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            kotlin.b.b(r9)
            goto L2c
        L20:
            kotlin.b.b(r9)
            r8.a = r4
            java.lang.Object r9 = r5.v(r8)
            if (r9 != r0) goto L2c
            goto L4e
        L2c:
            kotlin.Pair r9 = androidx.compose.foundation.text.selection.f.a(r5)
            if (r9 == 0) goto L4f
            java.lang.Object r1 = r9.a
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r9 = r9.b
            zi8 r9 = (defpackage.zi8) r9
            long r6 = r9.a
            x96 r9 = r5.i
            if (r9 == 0) goto L4f
            r8.a = r3
            androidx.compose.foundation.text.selection.a r9 = (androidx.compose.foundation.text.selection.a) r9
            java.lang.Object r9 = r9.d(r1, r6, r8)
            if (r9 != r0) goto L4b
            goto L4c
        L4b:
            r9 = r2
        L4c:
            if (r9 != r0) goto L4f
        L4e:
            return r0
        L4f:
            r5.A = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
