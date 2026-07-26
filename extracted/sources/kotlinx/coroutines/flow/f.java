package kotlinx.coroutines.flow;

import defpackage.ze2;
import java.io.Serializable;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze2 b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ f(ze2 ze2Var, Serializable serializable, int i) {
        this.a = i;
        this.b = ze2Var;
        this.c = serializable;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(int r6, defpackage.g51 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            tx8 r3 = defpackage.tx8.a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.b.b(r7)
            return r3
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.b.b(r7)
            if (r6 <= 0) goto L4d
            java.io.Serializable r6 = r5.c
            kotlin.jvm.internal.Ref$BooleanRef r6 = (kotlin.jvm.internal.Ref$BooleanRef) r6
            boolean r7 = r6.a
            if (r7 != 0) goto L4d
            r6.a = r4
            kotlinx.coroutines.flow.SharingCommand r6 = kotlinx.coroutines.flow.SharingCommand.a
            r0.c = r4
            ze2 r7 = r5.b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.f.a(int, g51):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    @Override // defpackage.ze2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r7, defpackage.g51 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L69;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r7 = r6.a(r7, r8)
            return r7
        L10:
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            if (r0 == 0) goto L23
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L23
            int r1 = r1 - r2
            r0.c = r1
            goto L28
        L23:
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            r0.<init>(r6, r8)
        L28:
            java.lang.Object r8 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            kotlin.b.b(r8)
            goto L5e
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.b.b(r8)
            pm3 r8 = new pm3
            java.io.Serializable r2 = r6.c
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref$IntRef) r2
            int r4 = r2.a
            int r5 = r4 + 1
            r2.a = r5
            if (r4 < 0) goto L61
            r8.<init>(r4, r7)
            r0.c = r3
            ze2 r7 = r6.b
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L5e
            goto L60
        L5e:
            tx8 r1 = defpackage.tx8.a
        L60:
            return r1
        L61:
            java.lang.ArithmeticException r7 = new java.lang.ArithmeticException
            java.lang.String r8 = "Index overflow has happened"
            r7.<init>(r8)
            throw r7
        L69:
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            if (r0 == 0) goto L7c
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L7c
            int r1 = r1 - r2
            r0.d = r1
            goto L81
        L7c:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            r0.<init>(r6, r8)
        L81:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L9c
            if (r2 != r3) goto L94
            kotlinx.coroutines.flow.f r7 = r0.a
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L92
            goto Lac
        L92:
            r8 = move-exception
            goto Lb1
        L94:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L9c:
            kotlin.b.b(r8)
            ze2 r8 = r6.b     // Catch: java.lang.Throwable -> Laf
            r0.a = r6     // Catch: java.lang.Throwable -> Laf
            r0.d = r3     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r7 = r8.emit(r7, r0)     // Catch: java.lang.Throwable -> Laf
            if (r7 != r1) goto Lac
            goto Lae
        Lac:
            tx8 r1 = defpackage.tx8.a
        Lae:
            return r1
        Laf:
            r8 = move-exception
            r7 = r6
        Lb1:
            java.io.Serializable r7 = r7.c
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            r7.a = r8
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.f.emit(java.lang.Object, g51):java.lang.Object");
    }

    public f(Ref$BooleanRef ref$BooleanRef, ze2 ze2Var) {
        this.a = 2;
        this.c = ref$BooleanRef;
        this.b = ze2Var;
    }
}
