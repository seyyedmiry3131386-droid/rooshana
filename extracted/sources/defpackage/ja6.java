package defpackage;

import ir.mservices.market.app.suggest.detail.ui.PlayDetailFragment;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ja6 implements ze2 {
    public final /* synthetic */ PlayDetailFragment a;

    public ja6(PlayDetailFragment playDetailFragment) {
        this.a = playDetailFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        String str = (String) obj;
        int i = PlayDetailFragment.l1;
        PlayDetailFragment playDetailFragment = this.a;
        DialogDataModel dialogDataModel = new DialogDataModel(playDetailFragment.R1(), "DIALOG_KEY_SUGGEST_INFO", null, 12);
        String strL = playDetailFragment.L(rs6.install_dialog_cancel);
        js3.o(strL, "getString(...)");
        pk5.g(playDetailFragment.J0, new NavIntentDirections.AlertCenter(new od(dialogDataModel, null, str, strL, 0)), -1);
        return tx8.a;
    }
}
