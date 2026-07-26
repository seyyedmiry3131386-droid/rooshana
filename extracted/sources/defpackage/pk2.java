package defpackage;

import ir.mservices.market.common.base.BaseContentFragment;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class pk2 extends rk2 {
    public final /* synthetic */ qm5 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ s7 c;
    public final /* synthetic */ r7 d;
    public final /* synthetic */ BaseContentFragment e;

    public pk2(BaseContentFragment baseContentFragment, qm5 qm5Var, AtomicReference atomicReference, s7 s7Var, r7 r7Var) {
        this.e = baseContentFragment;
        this.a = qm5Var;
        this.b = atomicReference;
        this.c = s7Var;
        this.d = r7Var;
    }

    @Override // defpackage.rk2
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        BaseContentFragment baseContentFragment = this.e;
        sb.append(baseContentFragment.f);
        sb.append("_rq#");
        sb.append(baseContentFragment.Z.getAndIncrement());
        String string = sb.toString();
        BaseContentFragment baseContentFragment2 = (BaseContentFragment) this.a.b;
        tk2 tk2Var = baseContentFragment2.w;
        this.b.set((tk2Var != null ? tk2Var.w.i : baseContentFragment2.o0().i).d(string, baseContentFragment, this.c, this.d));
    }
}
