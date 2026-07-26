package ir.mservices.market.app.update.common.modal;

import defpackage.bt2;
import defpackage.dp3;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.js3;
import defpackage.ju;
import defpackage.kf1;
import defpackage.mo7;
import defpackage.n;
import defpackage.o30;
import defpackage.ps1;
import defpackage.qp2;
import defpackage.rq7;
import defpackage.s30;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.vb7;
import defpackage.vq8;
import defpackage.wt;
import defpackage.xt;
import ir.mservices.market.app.update.common.manager.b;
import ir.mservices.market.version2.ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AppUpdateRepositoryImpl implements wt {
    public final ir.mservices.market.app.update.common.manager.a a;
    public final b b;
    public final dp3 c;
    public final l d;

    /* JADX INFO: renamed from: ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl$onEvent$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl$onEvent$1", f = "AppUpdateRepositoryImpl.kt", l = {128}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public AppUpdateRepositoryImpl a;
        public Iterator b;
        public int c;
        public int d;
        public final /* synthetic */ ju e;
        public final /* synthetic */ AppUpdateRepositoryImpl f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ju juVar, AppUpdateRepositoryImpl appUpdateRepositoryImpl, g51 g51Var) {
            super(2, g51Var);
            this.e = juVar;
            this.f = appUpdateRepositoryImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.e, this.f, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AppUpdateRepositoryImpl appUpdateRepositoryImpl;
            Iterator it;
            int i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i2 = this.d;
            if (i2 == 0) {
                kotlin.b.b(obj);
                if (this.e.a <= 1009) {
                    AppUpdateRepositoryImpl appUpdateRepositoryImpl2 = this.f;
                    ArrayList arrayListA = appUpdateRepositoryImpl2.a(true);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : arrayListA) {
                        if (!((s30) obj2).b) {
                            arrayList.add(obj2);
                        }
                    }
                    appUpdateRepositoryImpl = appUpdateRepositoryImpl2;
                    it = arrayList.iterator();
                    i = 0;
                }
                return tx8.a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.c;
            it = this.b;
            appUpdateRepositoryImpl = this.a;
            kotlin.b.b(obj);
            while (it.hasNext()) {
                s30 s30Var = (s30) it.next();
                b bVar = appUpdateRepositoryImpl.b;
                String str = s30Var.a.n;
                this.a = appUpdateRepositoryImpl;
                this.b = it;
                this.c = i;
                this.d = 1;
                if (bVar.a(str, false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return tx8.a;
        }
    }

    public AppUpdateRepositoryImpl(ir.mservices.market.app.update.common.manager.a aVar, b bVar, ps1 ps1Var, dp3 dp3Var) {
        js3.p(aVar, "appUpdateManager");
        js3.p(bVar, "inActiveAppUpdateManager");
        js3.p(ps1Var, "downloadManager");
        js3.p(dp3Var, "installManager");
        this.a = aVar;
        this.b = bVar;
        this.c = dp3Var;
        this.d = ja1.b(null);
    }

    public final ArrayList a(boolean z) {
        Map map = (Map) this.a.i.a.getValue();
        return map != null ? mo7.x(mo7.r(new vq8(kotlin.collections.a.e0(map.entrySet()), new n(10, this)), new xt(0, z))) : new ArrayList();
    }

    public final h b() {
        return new h(new vb7(new AppUpdateRepositoryImpl$getUpdateListState$$inlined$transform$1(this.a.i, null, this)), this.d, new AppUpdateRepositoryImpl$getUpdateListFlow$1(3, null));
    }

    public final rq7 c(String str) {
        rq7 rq7Var = new rq7();
        ug1 ug1Var = up1.a;
        bt2.G(js3.a(kf1.c), null, null, new AppUpdateRepositoryImpl$isApplicationActive$1(str, rq7Var, this, null), 3);
        return rq7Var;
    }

    public final boolean d(int i, String str) {
        js3.p(str, "packageName");
        Map map = (Map) this.a.i.a.getValue();
        if ((map != null ? (o30) map.get(str) : null) != null) {
            return true;
        }
        Integer numP = this.c.p(str);
        return numP != null && i > numP.intValue();
    }

    public final void onEvent(ju juVar) {
        js3.p(juVar, "event");
        if (juVar.b == ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode.b) {
            ug1 ug1Var = up1.a;
            bt2.G(js3.a(kf1.c), null, null, new AnonymousClass1(juVar, this, null), 3);
        }
    }
}
