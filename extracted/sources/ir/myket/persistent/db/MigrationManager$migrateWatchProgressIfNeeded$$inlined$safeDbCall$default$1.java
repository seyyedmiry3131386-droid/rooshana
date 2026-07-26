package ir.myket.persistent.db;

import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.k85;
import defpackage.l85;
import defpackage.mb1;
import defpackage.ob1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v25;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.persistent.db.MigrationManager$migrateWatchProgressIfNeeded$$inlined$safeDbCall$default$1", f = "MigrationManager.kt", l = {57}, m = "invokeSuspend", v = 1)
public final class MigrationManager$migrateWatchProgressIfNeeded$$inlined$safeDbCall$default$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ List c;
    public final /* synthetic */ dp2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationManager$migrateWatchProgressIfNeeded$$inlined$safeDbCall$default$1(g51 g51Var, a aVar, List list, dp2 dp2Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = list;
        this.d = dp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MigrationManager$migrateWatchProgressIfNeeded$$inlined$safeDbCall$default$1(g51Var, this.b, this.c, this.d);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MigrationManager$migrateWatchProgressIfNeeded$$inlined$safeDbCall$default$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        try {
            if (i == 0) {
                b.b(obj);
                k85 k85Var = this.b.a;
                List list = this.c;
                ArrayList arrayList = new ArrayList(wu0.V(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((l85) this.d.invoke(it.next()));
                }
                this.a = 1;
                Object objB = androidx.room.util.a.b(this, new v25(k85Var, arrayList, 3), k85Var.a, false, true);
                if (objB != CoroutineSingletons.a) {
                    objB = tx8Var;
                }
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return new ob1(tx8Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            return new mb1(th);
        }
    }
}
