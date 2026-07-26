package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rq4;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", l = {127}, m = "invokeSuspend", v = 1)
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", l = {89}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(rq4 rq4Var, g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(null, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw t61.q(obj);
            }
            kotlin.b.b(obj);
            this.a = 1;
            throw null;
        }
    }

    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(rq4 rq4Var, g51 g51Var) {
        super(2, g51Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(null, g51Var);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$3.b = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$3;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw t61.q(obj);
        }
        kotlin.b.b(obj);
        bt2.G((e71) this.b, null, CoroutineStart.d, new AnonymousClass1(null, null), 1);
        new CursorAnchorInfo.Builder();
        new Matrix();
        this.a = 1;
        throw null;
    }
}
