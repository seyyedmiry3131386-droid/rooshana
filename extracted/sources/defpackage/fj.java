package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fj implements jj {
    public final cj a;
    public final cj b;

    public fj(cj cjVar, cj cjVar2) {
        this.a = cjVar;
        this.b = cjVar2;
    }

    @Override // defpackage.jj
    public final s70 a() {
        return new k38(this.a.a(), this.b.a());
    }

    @Override // defpackage.jj
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.jj
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
