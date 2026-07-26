package ir.mservices.market.core.ext;

import androidx.lifecycle.Lifecycle$State;
import defpackage.e71;
import defpackage.g51;
import defpackage.m22;
import defpackage.qp2;
import defpackage.r4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import ir.mservices.market.activity.LaunchContentActivity;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.core.ext.ActivityExtKt$repeatOnLifecycleState$1", f = "ActivityExt.kt", l = {75}, m = "invokeSuspend", v = 1)
final class ActivityExtKt$repeatOnLifecycleState$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ LaunchContentActivity b;
    public final /* synthetic */ xe2 c;
    public final /* synthetic */ m22 d;

    /* JADX INFO: renamed from: ir.mservices.market.core.ext.ActivityExtKt$repeatOnLifecycleState$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.core.ext.ActivityExtKt$repeatOnLifecycleState$1$1", f = "ActivityExt.kt", l = {76}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ xe2 b;
        public final /* synthetic */ m22 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(xe2 xe2Var, m22 m22Var, g51 g51Var) {
            super(2, g51Var);
            this.b = xe2Var;
            this.c = m22Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                r4 r4Var = new r4(1, this.c);
                this.a = 1;
                if (this.b.a(r4Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityExtKt$repeatOnLifecycleState$1(LaunchContentActivity launchContentActivity, xe2 xe2Var, m22 m22Var, g51 g51Var) {
        super(2, g51Var);
        Lifecycle$State lifecycle$State = Lifecycle$State.a;
        this.b = launchContentActivity;
        this.c = xe2Var;
        this.d = m22Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        Lifecycle$State lifecycle$State = Lifecycle$State.a;
        return new ActivityExtKt$repeatOnLifecycleState$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ActivityExtKt$repeatOnLifecycleState$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            Lifecycle$State lifecycle$State = Lifecycle$State.e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, null);
            this.a = 1;
            if (androidx.lifecycle.b.b(this.b, lifecycle$State, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
