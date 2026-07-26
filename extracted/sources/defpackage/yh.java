package defpackage;

import androidx.compose.foundation.text.selection.f;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yh implements qp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;

    public /* synthetic */ yh(hx4 hx4Var, bp2 bp2Var, boolean z, int i) {
        this.b = hx4Var;
        this.d = bp2Var;
        this.c = z;
        this.e = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hx4 hx4Var = (hx4) this.b;
                bp2 bp2Var = (bp2) this.d;
                ((Integer) obj2).getClass();
                tt3.h(hs9.W(this.e | 1), (qz0) obj, bp2Var, hx4Var, this.c);
                break;
            case 1:
                hx4 hx4Var2 = (hx4) this.b;
                bp2 bp2Var2 = (bp2) this.d;
                ((Integer) obj2).getClass();
                ok4.h(hs9.W(this.e | 1), (qz0) obj, bp2Var2, hx4Var2, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int iW = hs9.W(this.e | 1);
                xa7.a(this.c, (ResolvedTextDirection) this.b, (f) this.d, (qz0) obj, iW);
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ yh(hx4 hx4Var, boolean z, bp2 bp2Var, int i) {
        this.b = hx4Var;
        this.c = z;
        this.d = bp2Var;
        this.e = i;
    }

    public /* synthetic */ yh(boolean z, ResolvedTextDirection resolvedTextDirection, f fVar, int i) {
        this.c = z;
        this.b = resolvedTextDirection;
        this.d = fVar;
        this.e = i;
    }
}
