package androidx.compose.ui.window;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {376}, m = "invokeSuspend", v = 1)
final class AndroidPopup_androidKt$Popup$5$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ PopupLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5$1(PopupLayout popupLayout, g51 g51Var) {
        super(2, g51Var);
        this.c = popupLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AndroidPopup_androidKt$Popup$5$1 androidPopup_androidKt$Popup$5$1 = new AndroidPopup_androidKt$Popup$5$1(this.c, g51Var);
        androidPopup_androidKt$Popup$5$1.b = obj;
        return androidPopup_androidKt$Popup$5$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidPopup_androidKt$Popup$5$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:16:0x0048). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r8.b
            e71 r1 = (defpackage.e71) r1
            kotlin.b.b(r9)
            goto L48
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            kotlin.b.b(r9)
            java.lang.Object r9 = r8.b
            e71 r9 = (defpackage.e71) r9
            r1 = r9
        L21:
            boolean r9 = defpackage.js3.C(r1)
            if (r9 == 0) goto L6f
            r8.b = r1
            r8.a = r2
            w61 r9 = r8.getContext()
            hy2 r3 = defpackage.hy2.m
            u61 r9 = r9.r0(r3)
            if (r9 != 0) goto L69
            w61 r9 = r8.getContext()
            qx4 r9 = defpackage.ml9.s(r9)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1 r3 = new defpackage.dp2() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.1
                static {
                    /*
                        androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1) androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.1.g androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.AnonymousClass1.<init>():void");
                }

                @Override // defpackage.dp2
                public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        java.lang.Number r1 = (java.lang.Number) r1
                        r1.longValue()
                        tx8 r1 = defpackage.tx8.a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            java.lang.Object r9 = r9.k0(r8, r3)
            if (r9 != r0) goto L48
            return r0
        L48:
            androidx.compose.ui.window.PopupLayout r9 = r8.c
            int[] r3 = r9.B
            boolean r4 = r9.isAttachedToWindow()
            if (r4 != 0) goto L53
            goto L21
        L53:
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.l
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L65
            r3 = r3[r2]
            if (r6 == r3) goto L21
        L65:
            r9.k()
            goto L21
        L69:
            java.lang.ClassCastException r9 = new java.lang.ClassCastException
            r9.<init>()
            throw r9
        L6f:
            tx8 r9 = defpackage.tx8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
