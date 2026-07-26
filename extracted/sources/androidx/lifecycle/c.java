package androidx.lifecycle;

import defpackage.b64;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g64;
import defpackage.om0;
import defpackage.qp2;
import defpackage.tx8;
import defpackage.wt3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b64 {
    public final /* synthetic */ Lifecycle$Event a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ e71 c;
    public final /* synthetic */ Lifecycle$Event d;
    public final /* synthetic */ om0 e;
    public final /* synthetic */ kotlinx.coroutines.sync.a f;
    public final /* synthetic */ SuspendLambda g;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Lifecycle$Event lifecycle$Event, Ref$ObjectRef ref$ObjectRef, e71 e71Var, Lifecycle$Event lifecycle$Event2, om0 om0Var, kotlinx.coroutines.sync.a aVar, qp2 qp2Var) {
        this.a = lifecycle$Event;
        this.b = ref$ObjectRef;
        this.c = e71Var;
        this.d = lifecycle$Event2;
        this.e = om0Var;
        this.f = aVar;
        this.g = (SuspendLambda) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // defpackage.b64
    public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        Lifecycle$Event lifecycle$Event2 = this.a;
        Ref$ObjectRef ref$ObjectRef = this.b;
        if (lifecycle$Event == lifecycle$Event2) {
            ref$ObjectRef.a = bt2.G(this.c, null, null, new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(this.f, this.g, null), 3);
            return;
        }
        if (lifecycle$Event == this.d) {
            wt3 wt3Var = (wt3) ref$ObjectRef.a;
            if (wt3Var != null) {
                wt3Var.g(null);
            }
            ref$ObjectRef.a = null;
        }
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            this.e.resumeWith(tx8.a);
        }
    }
}
