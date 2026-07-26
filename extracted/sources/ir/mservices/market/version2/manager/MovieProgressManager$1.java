package ir.mservices.market.version2.manager;

import defpackage.g51;
import defpackage.ob1;
import defpackage.pb1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.manager.MovieProgressManager$1", f = "MovieProgressManager.kt", l = {}, m = "invokeSuspend", v = 1)
final class MovieProgressManager$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieProgressManager$1(d dVar, g51 g51Var) {
        super(2, g51Var);
        this.b = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MovieProgressManager$1 movieProgressManager$1 = new MovieProgressManager$1(this.b, g51Var);
        movieProgressManager$1.a = obj;
        return movieProgressManager$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        MovieProgressManager$1 movieProgressManager$1 = (MovieProgressManager$1) create((pb1) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        movieProgressManager$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar = this.b;
        ArrayList arrayList = dVar.e;
        pb1 pb1Var = (pb1) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        if (pb1Var instanceof ob1) {
            arrayList.clear();
            Object obj2 = ((ob1) pb1Var).a;
            arrayList.addAll((Collection) obj2);
            dVar.f.o(obj2);
        }
        return tx8.a;
    }
}
