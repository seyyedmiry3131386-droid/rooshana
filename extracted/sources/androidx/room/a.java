package androidx.room;

import androidx.room.a;
import defpackage.b71;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.e51;
import defpackage.js3;
import defpackage.qq1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.ws3;
import defpackage.xe2;
import ir.myket.persistent.db.MyketDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final MyketDatabase_Impl a;
    public final h b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final ws3 e;
    public final qq1 f;
    public final Object g;

    /* JADX WARN: Type inference failed for: r1v4, types: [ws3] */
    public a(MyketDatabase_Impl myketDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = myketDatabase_Impl;
        h hVar = new h(myketDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, myketDatabase_Impl.j, new InvalidationTracker$implementation$1(1, this, a.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0));
        this.b = hVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        final int i = 0;
        this.e = new bp2(this) { // from class: ws3
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i) {
                    case 0:
                        this.b.getClass();
                        return tx8.a;
                    default:
                        MyketDatabase_Impl myketDatabase_Impl2 = this.b.a;
                        return Boolean.valueOf(!myketDatabase_Impl2.g() || myketDatabase_Impl2.i());
                }
            }
        };
        this.f = new qq1(this);
        js3.o(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.g = new Object();
        final int i2 = 1;
        hVar.k = new bp2(this) { // from class: ws3
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        this.b.getClass();
                        return tx8.a;
                    default:
                        MyketDatabase_Impl myketDatabase_Impl2 = this.b.a;
                        return Boolean.valueOf(!myketDatabase_Impl2.g() || myketDatabase_Impl2.i());
                }
            }
        };
    }

    public final xe2 a(String[] strArr) {
        js3.p(strArr, "tables");
        h hVar = this.b;
        Pair pairF = hVar.f(strArr);
        String[] strArr2 = (String[]) pairF.a;
        int[] iArr = (int[]) pairF.b;
        js3.p(strArr2, "resolvedTableNames");
        js3.p(iArr, "tableIds");
        return new vb7(new TriggerBasedInvalidationTracker$createFlow$1(hVar, iArr, strArr2, null));
    }

    public final void b() {
        h hVar = this.b;
        hVar.getClass();
        ws3 ws3Var = this.e;
        js3.p(ws3Var, "onRefreshScheduled");
        qq1 qq1Var = this.f;
        js3.p(qq1Var, "onRefreshCompleted");
        if (hVar.j.compareAndSet(false, true)) {
            ws3Var.invoke();
            e51 e51Var = hVar.a.a;
            if (e51Var != null) {
                bt2.G(e51Var, new b71(), null, new TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(hVar, qq1Var, null), 2);
            } else {
                js3.V("coroutineScope");
                throw null;
            }
        }
    }

    public final Object c(SuspendLambda suspendLambda) {
        Object objE = this.b.e(suspendLambda);
        return objE == CoroutineSingletons.a ? objE : tx8.a;
    }
}
