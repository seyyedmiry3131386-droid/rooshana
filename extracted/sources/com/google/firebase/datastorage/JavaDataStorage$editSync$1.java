package com.google.firebase.datastorage;

import defpackage.dp2;
import defpackage.e71;
import defpackage.eb1;
import defpackage.g51;
import defpackage.js3;
import defpackage.pb5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {220}, m = "invokeSuspend")
final class JavaDataStorage$editSync$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ dp2 c;

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1$1, reason: invalid class name */
    @tb1(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ dp2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, dp2 dp2Var) {
            super(2, g51Var);
            this.b = dp2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.b);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((pb5) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            this.b.invoke((pb5) this.a);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDataStorage$editSync$1(a aVar, dp2 dp2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = dp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new JavaDataStorage$editSync$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((JavaDataStorage$editSync$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar = this.b;
        ThreadLocal threadLocal = aVar.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        try {
            if (i == 0) {
                b.b(obj);
                Object obj2 = threadLocal.get();
                Boolean bool = Boolean.TRUE;
                if (js3.i(obj2, bool)) {
                    throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                }
                threadLocal.set(bool);
                eb1 eb1Var = aVar.c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.c);
                this.a = 1;
                obj = androidx.datastore.preferences.core.b.a(eb1Var, anonymousClass1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return (pb5) obj;
        } finally {
            threadLocal.set(Boolean.FALSE);
        }
    }
}
