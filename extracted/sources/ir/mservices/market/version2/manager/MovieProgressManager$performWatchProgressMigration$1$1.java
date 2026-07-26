package ir.mservices.market.version2.manager;

import defpackage.e71;
import defpackage.g51;
import defpackage.h85;
import defpackage.i25;
import defpackage.j85;
import defpackage.js3;
import defpackage.lw;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.w;
import defpackage.wu0;
import defpackage.y45;
import ir.mservices.market.version2.model.MovieWatchProgressModel;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.manager.MovieProgressManager$performWatchProgressMigration$1$1", f = "MovieProgressManager.kt", l = {76}, m = "invokeSuspend", v = 1)
final class MovieProgressManager$performWatchProgressMigration$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieProgressManager$performWatchProgressMigration$1$1(d dVar, ArrayList arrayList, g51 g51Var) {
        super(2, g51Var);
        this.b = dVar;
        this.c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieProgressManager$performWatchProgressMigration$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieProgressManager$performWatchProgressMigration$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [c24, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        ArrayList<MovieWatchProgressModel> arrayList = this.c;
        d dVar = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            ir.myket.persistent.db.a aVar = (ir.myket.persistent.db.a) dVar.c.getValue();
            i25 i25Var = new i25(3);
            this.a = 1;
            obj = aVar.a(arrayList, i25Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            j85 j85Var = dVar.a;
            y45 y45Var = new y45(0);
            y45 y45Var2 = new y45(1);
            ArrayList arrayList2 = (ArrayList) j85Var.b;
            w wVar = new w(j85Var, y45Var, y45Var2, dVar);
            wVar.b(new Void[0]);
            arrayList2.add(wVar);
        } else {
            lw.g(null, "Cannot migrate MovieProgressModels to new database.", null);
            ArrayList arrayList3 = dVar.e;
            ArrayList arrayList4 = new ArrayList(wu0.V(arrayList, 10));
            for (MovieWatchProgressModel movieWatchProgressModel : arrayList) {
                js3.p(movieWatchProgressModel, "<this>");
                String strC = movieWatchProgressModel.c();
                String str = strC == null ? "" : strC;
                String strB = movieWatchProgressModel.b();
                arrayList4.add(new h85(movieWatchProgressModel.e(), movieWatchProgressModel.a(), movieWatchProgressModel.f(), str, strB == null ? "" : strB));
            }
            arrayList3.addAll(arrayList4);
        }
        return tx8.a;
    }
}
