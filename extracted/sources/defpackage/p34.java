package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p34 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q34 b;

    public /* synthetic */ p34(q34 q34Var, int i) {
        this.a = i;
        this.b = q34Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                b bVar = this.b.p.b;
                return Float.valueOf((bVar.e.q() * 500) + bVar.e.r());
            case 1:
                b bVar2 = this.b.p.b;
                int iQ = bVar2.e.q();
                int iR = bVar2.e.r();
                return Float.valueOf(bVar2.d() ? (iQ * 500) + iR + 100 : (iQ * 500) + iR);
            default:
                q34 q34Var = this.b;
                b bVar3 = q34Var.p.b;
                int iG = (int) (bVar3.g().o == Orientation.a ? bVar3.g().g() & 4294967295L : bVar3.g().g() >> 32);
                b bVar4 = q34Var.p.b;
                return Float.valueOf(iG - ((-bVar4.g().l) + bVar4.g().p));
        }
    }
}
