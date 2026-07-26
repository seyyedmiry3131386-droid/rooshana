package defpackage;

import android.content.Context;
import android.os.Bundle;
import ir.mservices.market.app.suggest.detail.ui.PlayDetailFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;

/* JADX INFO: loaded from: classes3.dex */
public final class ka6 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayDetailFragment b;

    public /* synthetic */ ka6(PlayDetailFragment playDetailFragment, int i) {
        this.a = i;
        this.b = playDetailFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        PlayDetailFragment playDetailFragment = this.b;
        switch (i) {
            case 0:
                Context contextH = playDetailFragment.H();
                hh2.H(new hh2(contextH, contextH != null ? contextH.getString(rs6.suggest_not_found) : null));
                pk5.a(playDetailFragment.J0);
                break;
            default:
                Bundle bundle = (Bundle) obj;
                int i2 = PlayDetailFragment.l1;
                bi5 bi5Var = playDetailFragment.j1;
                ((la6) bi5Var.getValue()).c.d = DialogResult.a;
                bundle.putParcelable("BUNDLE_KEY_DATA", ((la6) bi5Var.getValue()).c);
                playDetailFragment.J0.k(bundle, ((la6) bi5Var.getValue()).c.a);
                pk5.a(playDetailFragment.J0);
                break;
        }
        return tx8Var;
    }
}
