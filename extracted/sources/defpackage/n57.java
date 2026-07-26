package defpackage;

import ir.mservices.market.social.requests.RequestListFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class n57 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RequestListFragment b;

    public /* synthetic */ n57(RequestListFragment requestListFragment, int i) {
        this.a = i;
        this.b = requestListFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        RequestListFragment requestListFragment = this.b;
        switch (i) {
            case 0:
                hh2.H(new hh2(requestListFragment.H(), (String) obj));
                break;
            default:
                DialogDataModel dialogDataModel = ((o57) requestListFragment.g1.getValue()).a;
                dialogDataModel.d = DialogResult.a;
                requestListFragment.J0.k(is3.g(new Pair("BUNDLE_KEY_DATA", dialogDataModel)), dialogDataModel.a);
                break;
        }
        return tx8Var;
    }
}
