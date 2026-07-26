package kotlinx.coroutines.flow;

import defpackage.bt2;
import defpackage.cq2;
import defpackage.cw;
import defpackage.dp0;
import defpackage.e71;
import defpackage.el8;
import defpackage.eq1;
import defpackage.fp0;
import defpackage.fu0;
import defpackage.g51;
import defpackage.hf2;
import defpackage.hs9;
import defpackage.ja1;
import defpackage.js3;
import defpackage.jx9;
import defpackage.kf2;
import defpackage.m91;
import defpackage.nf2;
import defpackage.oo5;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rm7;
import defpackage.rp2;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.sl0;
import defpackage.sp2;
import defpackage.su7;
import defpackage.th0;
import defpackage.tt3;
import defpackage.tx8;
import defpackage.v27;
import defpackage.v48;
import defpackage.vy2;
import defpackage.w61;
import defpackage.wu8;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final rv6 A(xe2 xe2Var, e71 e71Var, su7 su7Var, Object obj) {
        jx9 jx9VarR = tt3.r(xe2Var, 1);
        l lVarB = ja1.b(obj);
        bt2.F(e71Var, (w61) jx9VarR.d, su7Var.equals(ru7.a) ? CoroutineStart.a : CoroutineStart.d, new FlowKt__ShareKt$launchSharing$1(su7Var, (xe2) jx9VarR.b, lVarB, obj, null));
        return new rv6(lVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(defpackage.xe2 r6, defpackage.e71 r7, defpackage.g51 r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1 r0 = (kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r8)
            goto L65
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.b.b(r8)
            jx9 r6 = defpackage.tt3.r(r6, r3)
            w61 r8 = r7.getCoroutineContext()
            th0 r2 = defpackage.th0.n
            u61 r8 = r8.r0(r2)
            wt3 r8 = (defpackage.wt3) r8
            hx0 r2 = new hx0
            r2.<init>(r3)
            r2.Q(r8)
            java.lang.Object r8 = r6.d
            w61 r8 = (defpackage.w61) r8
            java.lang.Object r6 = r6.b
            xe2 r6 = (defpackage.xe2) r6
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1 r4 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1
            r5 = 0
            r4.<init>(r6, r2, r5)
            r6 = 2
            defpackage.bt2.G(r7, r8, r5, r4, r6)
            r0.b = r3
            java.lang.Object r8 = r2.s(r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.a
            kotlin.b.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.B(xe2, e71, g51):java.lang.Object");
    }

    public static final kotlinx.coroutines.flow.internal.d C(xe2 xe2Var, rp2 rp2Var) {
        int i = kf2.a;
        return new kotlinx.coroutines.flow.internal.d(rp2Var, xe2Var, EmptyCoroutineContext.a, -2, BufferOverflow.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.ze2 r4, java.lang.Object r5, java.lang.Object r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r6 = r0.a
            kotlin.b.b(r7)
            goto L3f
        L31:
            kotlin.b.b(r7)
            r0.a = r6
            r0.c = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L3f
            return
        L3f:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.a(ze2, java.lang.Object, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.el8 r4, defpackage.rp2 r5, java.lang.Throwable r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.a
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.b.b(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.a(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            tx8 r4 = defpackage.tx8.a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            defpackage.wu8.f(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.b(el8, rp2, java.lang.Throwable, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__LogicKt$any$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$1 r0 = (kotlinx.coroutines.flow.FlowKt__LogicKt$any$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$1 r0 = new kotlinx.coroutines.flow.FlowKt__LogicKt$any$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            jf2 r1 = r0.b
            kotlin.jvm.internal.Ref$BooleanRef r2 = r0.a
            kotlin.b.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L59
        L2b:
            r5 = move-exception
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.b.b(r5)
            kotlin.jvm.internal.Ref$BooleanRef r5 = new kotlin.jvm.internal.Ref$BooleanRef
            r5.<init>()
            jf2 r1 = new jf2
            r1.<init>(r5, r2)
            r0.a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            r0.b = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            r0.d = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            r5 = 0
            throw r5
        L4a:
            r2 = move-exception
            r4 = r2
            r2 = r5
            r5 = r4
        L4e:
            java.lang.Object r3 = r5.a
            if (r3 != r1) goto L60
            w61 r5 = r0.getContext()
            kotlinx.coroutines.a.f(r5)
        L59:
            boolean r5 = r2.a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L60:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static xe2 d(xe2 xe2Var, int i) {
        BufferOverflow bufferOverflow = BufferOverflow.a;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(rm7.n(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1) {
            bufferOverflow = BufferOverflow.b;
            i = 0;
        }
        int i2 = i;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        return xe2Var instanceof cq2 ? m91.n((cq2) xe2Var, null, i2, bufferOverflow2, 1) : new fp0(xe2Var, null, i2, bufferOverflow2, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable e(defpackage.xe2 r5, defpackage.ze2 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.Ref$ObjectRef r5 = r0.a
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r6 = move-exception
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.b.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlinx.coroutines.flow.f r2 = new kotlinx.coroutines.flow.f     // Catch: java.lang.Throwable -> L4e
            r4 = 0
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L4e
            r0.a = r7     // Catch: java.lang.Throwable -> L4e
            r0.c = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = 0
            return r5
        L4e:
            r6 = move-exception
            r5 = r7
        L50:
            java.lang.Object r5 = r5.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5c
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto L7e
        L5c:
            w61 r7 = r0.getContext()
            th0 r0 = defpackage.th0.n
            u61 r7 = r7.r0(r0)
            wt3 r7 = (defpackage.wt3) r7
            if (r7 == 0) goto L7f
            boolean r0 = r7.w0()
            if (r0 != 0) goto L71
            goto L7f
        L71:
            java.util.concurrent.CancellationException r7 = r7.I()
            if (r7 == 0) goto L7f
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L7e
            goto L7f
        L7e:
            throw r6
        L7f:
            if (r5 != 0) goto L82
            return r6
        L82:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L8a
            defpackage.wu8.f(r5, r6)
            throw r5
        L8a:
            defpackage.wu8.f(r6, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.e(xe2, ze2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    public static final Object f(xe2 xe2Var, qp2 qp2Var, g51 g51Var) {
        Object objA = d(w(xe2Var, qp2Var), 0).a(oo5.a, g51Var);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        tx8 tx8Var = tx8.a;
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? objA : tx8Var;
    }

    public static final nf2 g(xe2 xe2Var, xe2 xe2Var2, xe2 xe2Var3, sp2 sp2Var) {
        return new nf2(new xe2[]{xe2Var, xe2Var2, xe2Var3}, sp2Var);
    }

    public static final dp0 h(kotlinx.coroutines.channels.a aVar) {
        return new dp0(aVar, true);
    }

    public static final xe2 i(xe2 xe2Var) {
        return new kotlinx.coroutines.flow.internal.k(new FlowKt__DelayKt$debounceInternal$1(new sl0(13), null, xe2Var));
    }

    public static final eq1 j(xe2 xe2Var, qp2 qp2Var) {
        v27 v27Var = hs9.d;
        js3.n(qp2Var, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        wu8.i(2, qp2Var);
        return hs9.B(xe2Var, v27Var, qp2Var);
    }

    public static final xe2 k(xe2 xe2Var) {
        return xe2Var instanceof v48 ? xe2Var : hs9.B(xe2Var, hs9.d, hs9.e);
    }

    public static final hf2 l(xe2 xe2Var, int i) {
        if (i >= 0) {
            return new hf2(xe2Var, i, 0);
        }
        throw new IllegalArgumentException(rm7.n(i, "Drop count should be non-negative, but had ").toString());
    }

    public static final Object m(ze2 ze2Var, xe2 xe2Var, SuspendLambda suspendLambda) throws Throwable {
        o(ze2Var);
        Object objA = xe2Var.a(ze2Var, suspendLambda);
        return objA == CoroutineSingletons.a ? objA : tx8.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:24:0x0054, B:28:0x0069, B:30:0x0071, B:20:0x0046, B:23:0x0050), top: B:44:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0083 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(defpackage.ze2 r6, defpackage.pw6 r7, boolean r8, defpackage.g51 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.d
            lh0 r6 = r0.c
            pw6 r7 = r0.b
            ze2 r2 = r0.a
            kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L54
        L34:
            r6 = move-exception
            goto L8f
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.d
            lh0 r6 = r0.c
            pw6 r7 = r0.b
            ze2 r2 = r0.a
            kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L34
            goto L69
        L4a:
            kotlin.b.b(r9)
            o(r6)
            lh0 r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L54:
            r0.a = r6     // Catch: java.lang.Throwable -> L34
            r0.b = r7     // Catch: java.lang.Throwable -> L34
            r0.c = r9     // Catch: java.lang.Throwable -> L34
            r0.d = r8     // Catch: java.lang.Throwable -> L34
            r0.f = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.d(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L65
            goto L85
        L65:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L69:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L86
            java.lang.Object r9 = r6.f()     // Catch: java.lang.Throwable -> L34
            r0.a = r2     // Catch: java.lang.Throwable -> L34
            r0.b = r7     // Catch: java.lang.Throwable -> L34
            r0.c = r6     // Catch: java.lang.Throwable -> L34
            r0.d = r8     // Catch: java.lang.Throwable -> L34
            r0.f = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
        L85:
            return r1
        L86:
            if (r8 == 0) goto L8c
            r6 = 0
            r7.g(r6)
        L8c:
            tx8 r6 = defpackage.tx8.a
            return r6
        L8f:
            throw r6     // Catch: java.lang.Throwable -> L90
        L90:
            r9 = move-exception
            if (r8 == 0) goto L96
            kotlinx.coroutines.channels.b.b(r7, r6)
        L96:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.n(ze2, pw6, boolean, g51):java.lang.Object");
    }

    public static final void o(ze2 ze2Var) throws Throwable {
        if (ze2Var instanceof el8) {
            throw ((el8) ze2Var).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p(defpackage.xe2 r6, defpackage.qp2 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            mu3 r0 = defpackage.vy2.f
            boolean r1 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            if (r1 == 0) goto L15
            r1 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r1.d
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            mf2 r6 = r1.b
            kotlin.jvm.internal.Ref$ObjectRef r7 = r1.a
            kotlin.b.b(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L65
        L2d:
            r8 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.b.b(r8)
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            r8.a = r0
            mf2 r3 = new mf2
            r5 = 0
            r3.<init>(r7, r8, r5)
            r1.a = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r1.b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r1.d = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            java.lang.Object r6 = r6.a(r3, r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            if (r6 != r2) goto L54
            return r2
        L54:
            r7 = r8
            goto L65
        L56:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r3
        L5a:
            java.lang.Object r2 = r8.a
            if (r2 != r6) goto L72
            w61 r6 = r1.getContext()
            kotlinx.coroutines.a.f(r6)
        L65:
            java.lang.Object r6 = r7.a
            if (r6 == r0) goto L6a
            return r6
        L6a:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element matching the predicate"
            r6.<init>(r7)
            throw r6
        L72:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.p(xe2, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q(defpackage.xe2 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            mu3 r0 = defpackage.vy2.f
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            if (r1 == 0) goto L15
            r1 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r1.d
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            lf2 r6 = r1.b
            kotlin.jvm.internal.Ref$ObjectRef r2 = r1.a
            kotlin.b.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L65
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.b.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r7.a = r0
            lf2 r3 = new lf2
            r5 = 0
            r3.<init>(r7, r5)
            r1.a = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r1.b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r1.d = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            java.lang.Object r6 = r6.a(r3, r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            if (r6 != r2) goto L54
            return r2
        L54:
            r2 = r7
            goto L65
        L56:
            r6 = move-exception
            r2 = r7
            r7 = r6
            r6 = r3
        L5a:
            java.lang.Object r3 = r7.a
            if (r3 != r6) goto L72
            w61 r6 = r1.getContext()
            kotlinx.coroutines.a.f(r6)
        L65:
            java.lang.Object r6 = r2.a
            if (r6 == r0) goto L6a
            return r6
        L6a:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.q(xe2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object r(defpackage.xe2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            lf2 r5 = r0.b
            kotlin.jvm.internal.Ref$ObjectRef r1 = r0.a
            kotlin.b.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L61
        L2b:
            r6 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.b.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            lf2 r2 = new lf2
            r4 = 1
            r2.<init>(r6, r4)
            r0.a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            if (r5 != r1) goto L50
            return r1
        L50:
            r1 = r6
            goto L61
        L52:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L56:
            java.lang.Object r2 = r6.a
            if (r2 != r5) goto L64
            w61 r5 = r0.getContext()
            kotlinx.coroutines.a.f(r5)
        L61:
            java.lang.Object r5 = r1.a
            return r5
        L64:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.r(xe2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object s(defpackage.cq2 r5, defpackage.qp2 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            mf2 r5 = r0.b
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.a
            kotlin.b.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L61
        L2b:
            r7 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.b.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            mf2 r2 = new mf2
            r4 = 1
            r2.<init>(r6, r7, r4)
            r0.a = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            if (r5 != r1) goto L50
            return r1
        L50:
            r6 = r7
            goto L61
        L52:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L56:
            java.lang.Object r1 = r7.a
            if (r1 != r5) goto L64
            w61 r5 = r0.getContext()
            kotlinx.coroutines.a.f(r5)
        L61:
            java.lang.Object r5 = r6.a
            return r5
        L64:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.s(cq2, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final xe2 t(xe2 xe2Var, w61 w61Var) {
        if (w61Var.r0(th0.n) == null) {
            return w61Var.equals(EmptyCoroutineContext.a) ? xe2Var : xe2Var instanceof cq2 ? m91.n((cq2) xe2Var, w61Var, 0, null, 6) : new fp0(xe2Var, w61Var, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + w61Var).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object u(defpackage.gf2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.Ref$ObjectRef r5 = r0.a
            kotlin.b.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.b.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            lf2 r2 = new lf2
            r4 = 2
            r2.<init>(r6, r4)
            r0.a = r6
            r0.c = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r5 = r6
        L4b:
            java.lang.Object r5 = r5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.u(gf2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void v(xe2 xe2Var, e71 e71Var) {
        bt2.G(e71Var, null, null, new FlowKt__CollectKt$launchIn$1(xe2Var, null), 3);
    }

    public static final kotlinx.coroutines.flow.internal.d w(xe2 xe2Var, qp2 qp2Var) {
        int i = kf2.a;
        return C(xe2Var, new FlowKt__MergeKt$mapLatest$1(qp2Var, null));
    }

    public static final kotlinx.coroutines.flow.internal.e x(xe2... xe2VarArr) {
        int i = kf2.a;
        return new kotlinx.coroutines.flow.internal.e(xe2VarArr.length == 0 ? EmptyList.a : new cw(0, xe2VarArr), EmptyCoroutineContext.a, -2, BufferOverflow.a);
    }

    public static final kotlinx.coroutines.flow.internal.k y(rv6 rv6Var) {
        return new kotlinx.coroutines.flow.internal.k(new FlowKt__DelayKt$sample$2(rv6Var, null));
    }

    public static final pv6 z(xe2 xe2Var, fu0 fu0Var, su7 su7Var, int i) {
        jx9 jx9VarR = tt3.r(xe2Var, i);
        i iVarD = vy2.d(i, jx9VarR.a, (BufferOverflow) jx9VarR.c);
        bt2.F(fu0Var, (w61) jx9VarR.d, su7Var.equals(ru7.a) ? CoroutineStart.a : CoroutineStart.d, new FlowKt__ShareKt$launchSharing$1(su7Var, (xe2) jx9VarR.b, iVarD, vy2.i, null));
        return new pv6(iVarD);
    }
}
