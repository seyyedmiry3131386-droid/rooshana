package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.j;
import defpackage.ab5;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.gr3;
import defpackage.nr5;
import defpackage.qj6;
import defpackage.qp2;
import defpackage.rj6;
import defpackage.rp2;
import defpackage.sj6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend", v = 1)
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ j b;
    public /* synthetic */ long c;
    public final /* synthetic */ e71 d;
    public final /* synthetic */ wb5 e;
    public final /* synthetic */ ab5 f;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, 64}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public Object a;
        public int b;
        public final /* synthetic */ wb5 c;
        public final /* synthetic */ long d;
        public final /* synthetic */ ab5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(wb5 wb5Var, long j, ab5 ab5Var, g51 g51Var) {
            super(2, g51Var);
            this.c = wb5Var;
            this.d = j;
            this.e = ab5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.c, this.d, this.e, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        
            if (r2.a(r1, r8) == r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r8.b
                ab5 r2 = r8.e
                r3 = 2
                r4 = 1
                wb5 r5 = r8.c
                if (r1 == 0) goto L28
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                java.lang.Object r0 = r8.a
                rj6 r0 = (defpackage.rj6) r0
                kotlin.b.b(r9)
                goto L5f
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r1 = r8.a
                wb5 r1 = (defpackage.wb5) r1
                kotlin.b.b(r9)
                goto L46
            L28:
                kotlin.b.b(r9)
                java.lang.Object r9 = r5.getValue()
                rj6 r9 = (defpackage.rj6) r9
                if (r9 == 0) goto L4a
                qj6 r1 = new qj6
                r1.<init>(r9)
                if (r2 == 0) goto L45
                r8.a = r5
                r8.b = r4
                java.lang.Object r9 = r2.a(r1, r8)
                if (r9 != r0) goto L45
                goto L5d
            L45:
                r1 = r5
            L46:
                r9 = 0
                r1.setValue(r9)
            L4a:
                rj6 r9 = new rj6
                long r6 = r8.d
                r9.<init>(r6)
                if (r2 == 0) goto L60
                r8.a = r9
                r8.b = r3
                java.lang.Object r1 = r2.a(r9, r8)
                if (r1 != r0) goto L5e
            L5d:
                return r0
            L5e:
                r0 = r9
            L5f:
                r9 = r0
            L60:
                r5.setValue(r9)
                tx8 r9 = defpackage.tx8.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public wb5 a;
        public int b;
        public final /* synthetic */ wb5 c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ ab5 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(wb5 wb5Var, boolean z, ab5 ab5Var, g51 g51Var) {
            super(2, g51Var);
            this.c = wb5Var;
            this.d = z;
            this.e = ab5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.c, this.d, this.e, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            wb5 wb5Var;
            wb5 wb5Var2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.b;
            if (i == 0) {
                kotlin.b.b(obj);
                wb5Var = this.c;
                rj6 rj6Var = (rj6) wb5Var.getValue();
                if (rj6Var != null) {
                    gr3 sj6Var = this.d ? new sj6(rj6Var) : new qj6(rj6Var);
                    ab5 ab5Var = this.e;
                    if (ab5Var != null) {
                        this.a = wb5Var;
                        this.b = 1;
                        if (ab5Var.a(sj6Var, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        wb5Var2 = wb5Var;
                    }
                    wb5Var.setValue(null);
                }
                return tx8.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wb5Var2 = this.a;
            kotlin.b.b(obj);
            wb5Var = wb5Var2;
            wb5Var.setValue(null);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(e71 e71Var, wb5 wb5Var, ab5 ab5Var, g51 g51Var) {
        super(3, g51Var);
        this.d = e71Var;
        this.e = wb5Var;
        this.f = ab5Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        long j = ((nr5) obj2).a;
        wb5 wb5Var = this.e;
        ab5 ab5Var = this.f;
        TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.d, wb5Var, ab5Var, (g51) obj3);
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.b = (j) obj;
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.c = j;
        return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        e71 e71Var = this.d;
        if (i == 0) {
            kotlin.b.b(obj);
            j jVar = this.b;
            bt2.G(e71Var, null, null, new AnonymousClass1(this.e, this.c, this.f, null), 3);
            this.a = 1;
            obj = jVar.e(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        bt2.G(e71Var, null, null, new AnonymousClass2(this.e, ((Boolean) obj).booleanValue(), this.f, null), 3);
        return tx8.a;
    }
}
