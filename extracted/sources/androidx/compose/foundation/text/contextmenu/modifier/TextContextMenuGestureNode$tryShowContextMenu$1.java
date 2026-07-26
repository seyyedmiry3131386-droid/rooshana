package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.dg8;
import defpackage.e71;
import defpackage.eg8;
import defpackage.g51;
import defpackage.jg8;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", f = "TextContextMenuGesturesModifier.kt", l = {107, 108}, m = "invokeSuspend", v = 1)
final class TextContextMenuGestureNode$tryShowContextMenu$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ eg8 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ jg8 d;
    public final /* synthetic */ dg8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextContextMenuGestureNode$tryShowContextMenu$1(eg8 eg8Var, long j, jg8 jg8Var, dg8 dg8Var, g51 g51Var) {
        super(2, g51Var);
        this.b = eg8Var;
        this.c = j;
        this.d = jg8Var;
        this.e = dg8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TextContextMenuGestureNode$tryShowContextMenu$1(this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextContextMenuGestureNode$tryShowContextMenu$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r6.d.a(r6.e, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r6.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.b.b(r7)
            goto L42
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.b.b(r7)
            goto L35
        L1c:
            kotlin.b.b(r7)
            eg8 r7 = r6.b
            qp2 r7 = r7.q
            if (r7 == 0) goto L35
            nr5 r1 = new nr5
            long r4 = r6.c
            r1.<init>(r4)
            r6.a = r3
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L35
            goto L41
        L35:
            r6.a = r2
            jg8 r7 = r6.d
            dg8 r1 = r6.e
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L42
        L41:
            return r0
        L42:
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
