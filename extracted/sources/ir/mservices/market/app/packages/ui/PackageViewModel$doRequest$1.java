package ir.mservices.market.app.packages.ui;

import androidx.paging.e;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.hl5;
import defpackage.oy5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import defpackage.z45;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.packages.ui.PackageViewModel$doRequest$1", f = "PackageViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class PackageViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ PackageViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageViewModel$doRequest$1(PackageViewModel packageViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = packageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PackageViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PackageViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        PackageViewModel packageViewModel = this.a;
        hl5 hl5Var = packageViewModel.t;
        oy5 oy5Var = packageViewModel.w;
        return new bz6(e.b(gu9.x(hl5Var.h(null, oy5Var.b, oy5Var.d, packageViewModel, false), new z45(14, packageViewModel)), y97.G(packageViewModel)), null, null, null, 14);
    }
}
