package androidx.tv.material3;

import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.jd8;
import defpackage.lt8;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class SwitchKt$Switch$2$1 extends Lambda implements dp2 {

    /* JADX INFO: renamed from: androidx.tv.material3.SwitchKt$Switch$2$1$1, reason: invalid class name */
    @tb1(c = "androidx.tv.material3.SwitchKt$Switch$2$1$1", f = "Switch.kt", l = {127}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ androidx.compose.animation.core.a b;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(androidx.compose.animation.core.a aVar, float f, g51 g51Var) {
            super(2, g51Var);
            this.b = aVar;
            this.c = f;
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
                kotlin.b.b(obj);
                Float f = new Float(this.c);
                lt8 lt8Var = jd8.a;
                this.a = 1;
                if (androidx.compose.animation.core.a.b(this.b, f, lt8Var, null, null, this, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return tx8.a;
        }
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        throw null;
    }
}
