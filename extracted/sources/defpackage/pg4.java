package defpackage;

import androidx.compose.foundation.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pg4 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ pg4(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.E0();
                return tx8.a;
            case 1:
                return new nr5(this.b.w);
            default:
                v04 v04Var = (v04) ((s08) this.b.u).getValue();
                return new nr5(v04Var != null ? v04Var.K(0L) : 9205357640488583168L);
        }
    }
}
