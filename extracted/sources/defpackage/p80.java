package defpackage;

import android.view.View;
import ir.mservices.market.reels.ui.recycler.b;
import ir.mservices.market.version2.fragments.BasePlayerVideoFragment;
import ir.mservices.market.version2.fragments.IbexFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p80 implements ld6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p80(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ld6
    public final void b(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                int i3 = BasePlayerVideoFragment.a1;
                w90 w90Var = ((IbexFragment) obj).Y0;
                js3.m(w90Var);
                w90Var.z.setVisibility(i);
                break;
            default:
                b bVar = (b) obj;
                og5 og5Var = bVar.G;
                View view = bVar.a;
                js3.o(view, "itemView");
                og5Var.m(view, bVar, Boolean.valueOf(i == 0));
                bVar.N(i == 0);
                break;
        }
    }
}
