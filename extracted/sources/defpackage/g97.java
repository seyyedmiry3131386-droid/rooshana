package defpackage;

import androidx.compose.ui.graphics.colorspace.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g97 implements fr1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ g97(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.fr1
    public final double d(double d) {
        switch (this.a) {
            case 0:
                return ok4.r(this.b.k.d(d), r10.e, r10.f);
            default:
                return this.b.n.d(ok4.r(d, r0.e, r0.f));
        }
    }
}
