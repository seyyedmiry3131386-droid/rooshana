package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.channels.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ep0 extends r implements cp0 {
    public final a d;

    public ep0(w61 w61Var, a aVar) {
        super(w61Var, true);
        this.d = aVar;
    }

    @Override // defpackage.wn7
    public final void a(dp2 dp2Var) {
        this.d.a(dp2Var);
    }

    @Override // defpackage.wn7
    public final Object c(g51 g51Var, Object obj) {
        return this.d.c(g51Var, obj);
    }

    @Override // defpackage.pw6
    public final o77 e() {
        return this.d.e();
    }

    @Override // kotlinx.coroutines.c, defpackage.wt3, defpackage.pw6
    public final void g(CancellationException cancellationException) {
        if (w0()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(x(), null, this);
        }
        v(cancellationException);
    }

    @Override // defpackage.pw6
    public final o77 h() {
        return this.d.h();
    }

    @Override // defpackage.pw6
    public final Object i() {
        return this.d.i();
    }

    @Override // defpackage.pw6
    public final lh0 iterator() {
        a aVar = this.d;
        aVar.getClass();
        return new lh0(aVar);
    }

    @Override // defpackage.pw6
    public final Object l(g51 g51Var) {
        return this.d.l(g51Var);
    }

    @Override // defpackage.pw6
    public final Object m(ContinuationImpl continuationImpl) {
        a aVar = this.d;
        aVar.getClass();
        Object objG = a.G(aVar, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objG;
    }

    @Override // defpackage.wn7
    public final Object o(Object obj) {
        return this.d.o(obj);
    }

    @Override // kotlinx.coroutines.c
    public final void v(CancellationException cancellationException) {
        this.d.p(cancellationException, true);
        t(cancellationException);
    }
}
