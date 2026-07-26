package androidx.tv.material3;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.focus.FocusStateImpl;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.mj;
import defpackage.qg2;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug2;
import defpackage.wb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.tv.material3.CarouselKt$Carousel$5$2$1$1", f = "Carousel.kt", l = {183}, m = "invokeSuspend")
final class CarouselKt$Carousel$5$2$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AccessibilityManager b;
    public final /* synthetic */ qg2 c;
    public final /* synthetic */ mj d;
    public final /* synthetic */ wb5 e;
    public final /* synthetic */ wb5 f;

    /* JADX INFO: renamed from: androidx.tv.material3.CarouselKt$Carousel$5$2$1$1$1, reason: invalid class name */
    @tb1(c = "androidx.tv.material3.CarouselKt$Carousel$5$2$1$1$1", f = "Carousel.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements dp2 {
        public final /* synthetic */ qg2 a;
        public final /* synthetic */ wb5 b;
        public final /* synthetic */ wb5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(qg2 qg2Var, wb5 wb5Var, wb5 wb5Var2, g51 g51Var) {
            super(1, g51Var);
            this.a = qg2Var;
            this.b = wb5Var;
            this.c = wb5Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(g51 g51Var) {
            return new AnonymousClass1(this.a, this.b, this.c, g51Var);
        }

        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((g51) obj);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ug2 ug2Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            if (!((Boolean) this.b.getValue()).booleanValue() && (ug2Var = (ug2) this.c.getValue()) != null && ((FocusStateImpl) ug2Var).b()) {
                this.a.a();
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselKt$Carousel$5$2$1$1(AccessibilityManager accessibilityManager, qg2 qg2Var, mj mjVar, wb5 wb5Var, wb5 wb5Var2, g51 g51Var) {
        super(2, g51Var);
        this.b = accessibilityManager;
        this.c = qg2Var;
        this.d = mjVar;
        this.e = wb5Var;
        this.f = wb5Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CarouselKt$Carousel$5$2$1$1(this.b, this.c, this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CarouselKt$Carousel$5$2$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
        boolean zIsEnabled = this.b.isEnabled();
        qg2 qg2Var = this.c;
        if (zIsEnabled) {
            qg2Var.a();
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(qg2Var, this.e, this.f, null);
        this.a = 1;
        anonymousClass1.invoke(this);
        return tx8Var == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
