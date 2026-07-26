package androidx.tv.material3;

import androidx.compose.ui.focus.FocusStateImpl;
import defpackage.e71;
import defpackage.g51;
import defpackage.qg2;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug2;
import defpackage.wb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.tv.material3.NavigationDrawerKt$DrawerSheet$2$1", f = "NavigationDrawer.kt", l = {}, m = "invokeSuspend")
final class NavigationDrawerKt$DrawerSheet$2$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ f a;
    public final /* synthetic */ qg2 b;
    public final /* synthetic */ wb5 c;
    public final /* synthetic */ wb5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DrawerSheet$2$1(f fVar, qg2 qg2Var, wb5 wb5Var, wb5 wb5Var2, g51 g51Var) {
        super(2, g51Var);
        this.a = fVar;
        this.b = qg2Var;
        this.c = wb5Var;
        this.d = wb5Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new NavigationDrawerKt$DrawerSheet$2$1(this.a, this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        NavigationDrawerKt$DrawerSheet$2$1 navigationDrawerKt$DrawerSheet$2$1 = (NavigationDrawerKt$DrawerSheet$2$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        navigationDrawerKt$DrawerSheet$2$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ug2 ug2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        if (this.a.a() == DrawerValue.b && (ug2Var = (ug2) this.c.getValue()) != null && !((FocusStateImpl) ug2Var).a()) {
            this.b.a();
        }
        this.d.setValue(Boolean.TRUE);
        return tx8.a;
    }
}
