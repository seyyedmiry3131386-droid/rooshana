package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.p;
import defpackage.bt2;
import defpackage.e71;
import defpackage.eh6;
import defpackage.g51;
import defpackage.qp2;
import defpackage.t51;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wg8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend", v = 1)
final class CoreTextFieldKt$TextFieldCursorHandle$2$1$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ eh6 b;
    public final /* synthetic */ wg8 c;
    public final /* synthetic */ androidx.compose.foundation.text.selection.f d;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1114}, m = "invokeSuspend", v = 1)
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
            if (i == 0) {
                kotlin.b.b(obj);
                this.a = 1;
                if (c.e(this.b, this.c, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1117}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ eh6 b;
        public final /* synthetic */ androidx.compose.foundation.text.selection.f c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(eh6 eh6Var, androidx.compose.foundation.text.selection.f fVar, g51 g51Var) {
            super(2, g51Var);
            this.b = eh6Var;
            this.c = fVar;
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
            if (i == 0) {
                kotlin.b.b(obj);
                t51 t51Var = new t51(this.c, 1);
                this.a = 1;
                if (p.f(this.b, null, null, t51Var, this, 7) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$TextFieldCursorHandle$2$1$1(eh6 eh6Var, wg8 wg8Var, androidx.compose.foundation.text.selection.f fVar, g51 g51Var) {
        super(2, g51Var);
        this.b = eh6Var;
        this.c = wg8Var;
        this.d = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        CoreTextFieldKt$TextFieldCursorHandle$2$1$1 coreTextFieldKt$TextFieldCursorHandle$2$1$1 = new CoreTextFieldKt$TextFieldCursorHandle$2$1$1(this.b, this.c, this.d, g51Var);
        coreTextFieldKt$TextFieldCursorHandle$2$1$1.a = obj;
        return coreTextFieldKt$TextFieldCursorHandle$2$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        CoreTextFieldKt$TextFieldCursorHandle$2$1$1 coreTextFieldKt$TextFieldCursorHandle$2$1$1 = (CoreTextFieldKt$TextFieldCursorHandle$2$1$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        coreTextFieldKt$TextFieldCursorHandle$2$1$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        e71 e71Var = (e71) this.a;
        CoroutineStart coroutineStart = CoroutineStart.d;
        wg8 wg8Var = this.c;
        eh6 eh6Var = this.b;
        bt2.G(e71Var, null, coroutineStart, new AnonymousClass1(eh6Var, wg8Var, null), 1);
        bt2.G(e71Var, null, coroutineStart, new AnonymousClass2(eh6Var, this.d, null), 1);
        return tx8.a;
    }
}
