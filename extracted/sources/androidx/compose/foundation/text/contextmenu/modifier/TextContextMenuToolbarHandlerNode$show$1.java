package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.e71;
import defpackage.g51;
import defpackage.jg8;
import defpackage.pg8;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", f = "TextContextMenuToolbarHandlerModifier.kt", l = {205, 206, 208, 208}, m = "invokeSuspend", v = 1)
final class TextContextMenuToolbarHandlerNode$show$1 extends SuspendLambda implements qp2 {
    public Throwable a;
    public int b;
    public final /* synthetic */ pg8 c;
    public final /* synthetic */ jg8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextContextMenuToolbarHandlerNode$show$1(pg8 pg8Var, jg8 jg8Var, g51 g51Var) {
        super(2, g51Var);
        this.c = pg8Var;
        this.d = jg8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TextContextMenuToolbarHandlerNode$show$1(this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextContextMenuToolbarHandlerNode$show$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r8.invoke(r7) == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r7.b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            pg8 r6 = r7.c
            if (r1 == 0) goto L30
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L26
            if (r1 == r3) goto L22
            if (r1 == r2) goto L1c
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            java.lang.Throwable r0 = r7.a
            kotlin.b.b(r8)
            goto L6b
        L22:
            kotlin.b.b(r8)
            goto L58
        L26:
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L4b
        L2a:
            r8 = move-exception
            goto L5b
        L2c:
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L40
        L30:
            kotlin.b.b(r8)
            dp2 r8 = r6.r     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto L40
            r7.b = r5     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = r8.invoke(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 != r0) goto L40
            goto L69
        L40:
            jg8 r8 = r7.d     // Catch: java.lang.Throwable -> L2a
            r7.b = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = r8.a(r6, r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 != r0) goto L4b
            goto L69
        L4b:
            dp2 r8 = r6.s
            if (r8 == 0) goto L58
            r7.b = r3
            java.lang.Object r8 = r8.invoke(r7)
            if (r8 != r0) goto L58
            goto L69
        L58:
            tx8 r8 = defpackage.tx8.a
            return r8
        L5b:
            dp2 r1 = r6.s
            if (r1 == 0) goto L6c
            r7.a = r8
            r7.b = r2
            java.lang.Object r1 = r1.invoke(r7)
            if (r1 != r0) goto L6a
        L69:
            return r0
        L6a:
            r0 = r8
        L6b:
            r8 = r0
        L6c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
