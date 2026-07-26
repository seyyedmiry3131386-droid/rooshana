package androidx.compose.foundation.text.selection;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rr5;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.x96;
import defpackage.zi8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", l = {567}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionManager$maybeSuggestSelection$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ x96 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ zi8 e;
    public final /* synthetic */ f f;
    public final /* synthetic */ rr5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$maybeSuggestSelection$1(x96 x96Var, String str, long j, zi8 zi8Var, f fVar, rr5 rr5Var, g51 g51Var) {
        super(2, g51Var);
        this.b = x96Var;
        this.c = str;
        this.d = j;
        this.e = zi8Var;
        this.f = fVar;
        this.g = rr5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TextFieldSelectionManager$maybeSuggestSelection$1(this.b, this.c, this.d, this.e, this.f, this.g, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$maybeSuggestSelection$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.a
            java.lang.String r7 = r8.c
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.b.b(r9)
            goto L4a
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L17:
            kotlin.b.b(r9)
            r8.a = r2
            x96 r9 = r8.b
            r6 = r9
            androidx.compose.foundation.text.selection.a r6 = (androidx.compose.foundation.text.selection.a) r6
            r6.getClass()
            int r9 = r7.length()
            r1 = 0
            if (r9 != 0) goto L2c
            goto L34
        L2c:
            long r3 = r8.d
            boolean r9 = defpackage.zi8.d(r3)
            if (r9 == 0) goto L36
        L34:
            r9 = r1
            goto L47
        L36:
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 r2 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2
            r5 = 0
            r2.<init>(r3, r5, r6, r7)
            w61 r9 = r6.a
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2 r3 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2
            r3.<init>(r6, r2, r1)
            java.lang.Object r9 = defpackage.bt2.Z(r9, r3, r8)
        L47:
            if (r9 != r0) goto L4a
            return r0
        L4a:
            zi8 r9 = (defpackage.zi8) r9
            tx8 r0 = defpackage.tx8.a
            if (r9 == 0) goto L9e
            long r1 = r9.a
            r9 = 32
            long r3 = r1 >> r9
            int r9 = (int) r3
            rr5 r3 = r8.g
            int r9 = r3.h(r9)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r4
            int r1 = (int) r1
            int r1 = r3.h(r1)
            long r1 = defpackage.uy6.b(r9, r1)
            zi8 r9 = r8.e
            boolean r9 = defpackage.zi8.b(r1, r9)
            if (r9 != 0) goto L9e
            androidx.compose.foundation.text.selection.f r9 = r8.f
            zh8 r4 = r9.q()
            ll r4 = r4.a
            java.lang.String r4 = r4.b
            boolean r4 = defpackage.js3.i(r4, r7)
            if (r4 == 0) goto L9e
            rr5 r4 = r9.b
            if (r3 != r4) goto L9e
            dp2 r3 = r9.c
            zh8 r4 = r9.q()
            ll r4 = r4.a
            zh8 r4 = androidx.compose.foundation.text.selection.f.g(r4, r1)
            r3.invoke(r4)
            zi8 r3 = new zi8
            r3.<init>(r1)
            r9.v = r3
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
