package androidx.room;

import defpackage.g51;
import defpackage.p26;
import defpackage.qp2;
import defpackage.rm7;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xa7;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", l = {531}, m = "invokeSuspend")
final class RoomDatabase$performClear$1 extends SuspendLambda implements qp2 {

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1, reason: invalid class name */
    @tb1(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", l = {532, 533, 535, 541, 542, 543}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements qp2 {

        /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", l = {537, 539}, m = "invokeSuspend")
        final class C00141 extends SuspendLambda implements qp2 {
            public String[] a;
            public int b;
            public int c;
            public int d;
            public /* synthetic */ Object e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                throw null;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00141) create((p26) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String strM;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.d;
                if (i == 0) {
                    kotlin.b.b(obj);
                    throw null;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    throw null;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i2 = this.c;
                int i3 = this.b;
                String[] strArr = this.a;
                p26 p26Var = (p26) this.e;
                kotlin.b.b(obj);
                do {
                    i3++;
                    if (i3 >= i2) {
                        return tx8.a;
                    }
                    strM = rm7.m('`', "DELETE FROM `", strArr[i3]);
                    this.e = p26Var;
                    this.a = strArr;
                    this.b = i3;
                    this.c = i2;
                    this.d = 2;
                } while (xa7.b(p26Var, strM, this) != coroutineSingletons);
                return coroutineSingletons;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            throw null;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            throw null;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        throw null;
    }
}
