package ir.myket.network.server;

import defpackage.ap7;
import defpackage.cp7;
import defpackage.e71;
import defpackage.g51;
import defpackage.gf2;
import defpackage.lw;
import defpackage.ps;
import defpackage.qp2;
import defpackage.rp7;
import defpackage.tb1;
import defpackage.tx8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.network.server.ServerMonitor$registerAppServersCollector$1", f = "ServerMonitor.kt", l = {118}, m = "invokeSuspend", v = 1)
final class ServerMonitor$registerAppServersCollector$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ c b;

    /* JADX INFO: renamed from: ir.myket.network.server.ServerMonitor$registerAppServersCollector$1$1, reason: invalid class name */
    @tb1(c = "ir.myket.network.server.ServerMonitor$registerAppServersCollector$1$1", f = "ServerMonitor.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, g51 g51Var) {
            super(2, g51Var);
            this.b = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ps) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ps psVar = (ps) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            c cVar = this.b;
            cVar.d.clear();
            l lVar = cVar.e;
            HashMap map = new HashMap();
            lVar.getClass();
            lVar.p(null, map);
            List<rp7> list = psVar.b;
            if (list != null) {
                for (rp7 rp7Var : list) {
                    List list2 = rp7Var.a;
                    lw.d(null, null, list2);
                    lw.b(null, null, list2.isEmpty());
                    cp7 cp7VarA = cVar.a(rp7Var.b, "ServiceServers(" + list2.get(0) + ")");
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        lw.e((cp7) ((HashMap) lVar.getValue()).put((String) it.next(), cp7VarA));
                    }
                }
            }
            Map map2 = (Map) lVar.getValue();
            ap7 ap7Var = psVar.a;
            map2.put("default", ap7Var != null ? cVar.a(ap7Var, "DefaultServers") : null);
            psVar.toString();
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerMonitor$registerAppServersCollector$1(c cVar, g51 g51Var) {
        super(2, g51Var);
        this.b = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ServerMonitor$registerAppServersCollector$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ServerMonitor$registerAppServersCollector$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.b;
            gf2 gf2Var = cVar.b.d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, null);
            this.a = 1;
            if (d.f(gf2Var, anonymousClass1, this) == coroutineSingletons) {
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
