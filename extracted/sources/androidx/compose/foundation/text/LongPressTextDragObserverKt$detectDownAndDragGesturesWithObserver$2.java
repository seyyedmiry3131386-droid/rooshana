package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.h;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.e71;
import defpackage.eh6;
import defpackage.g51;
import defpackage.g8;
import defpackage.ne4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wg8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend", v = 1)
final class LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ eh6 b;
    public final /* synthetic */ wg8 c;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {67}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ eh6 b;
        public final /* synthetic */ wg8 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(eh6 eh6Var, wg8 wg8Var, g51 g51Var) {
            super(2, g51Var);
            this.b = eh6Var;
            this.c = wg8Var;
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
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return tx8Var;
            }
            kotlin.b.b(obj);
            this.a = 1;
            Object objE = h.e(this.b, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.c, null), this);
            if (objE != coroutineSingletons) {
                objE = tx8Var;
            }
            return objE == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {68}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ eh6 b;
        public final /* synthetic */ wg8 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(eh6 eh6Var, wg8 wg8Var, g51 g51Var) {
            super(2, g51Var);
            this.b = eh6Var;
            this.c = wg8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return tx8Var;
            }
            kotlin.b.b(obj);
            this.a = 1;
            final int i2 = 0;
            final wg8 wg8Var = this.c;
            ne4 ne4Var = new ne4(wg8Var, 0);
            bp2 bp2Var = new bp2() { // from class: oe4
                @Override // defpackage.bp2
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            wg8Var.b();
                            break;
                        default:
                            wg8Var.onCancel();
                            break;
                    }
                    return tx8.a;
                }
            };
            final int i3 = 1;
            Object objE = androidx.compose.foundation.gestures.d.e(this.b, ne4Var, bp2Var, new bp2() { // from class: oe4
                @Override // defpackage.bp2
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            wg8Var.b();
                            break;
                        default:
                            wg8Var.onCancel();
                            break;
                    }
                    return tx8.a;
                }
            }, new g8(10, wg8Var), this);
            if (objE != coroutineSingletons) {
                objE = tx8Var;
            }
            return objE == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(eh6 eh6Var, wg8 wg8Var, g51 g51Var) {
        super(2, g51Var);
        this.b = eh6Var;
        this.c = wg8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(this.b, this.c, g51Var);
        longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2.a = obj;
        return longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        e71 e71Var = (e71) this.a;
        CoroutineStart coroutineStart = CoroutineStart.d;
        eh6 eh6Var = this.b;
        wg8 wg8Var = this.c;
        bt2.G(e71Var, null, coroutineStart, new AnonymousClass1(eh6Var, wg8Var, null), 1);
        return bt2.G(e71Var, null, coroutineStart, new AnonymousClass2(eh6Var, wg8Var, null), 1);
    }
}
