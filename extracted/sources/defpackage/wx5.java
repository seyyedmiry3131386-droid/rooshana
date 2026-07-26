package defpackage;

import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.social.profile.own.OwnProfileHeaderFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class wx5 implements ze2 {
    public final /* synthetic */ OwnProfileHeaderFragment a;

    public wx5(OwnProfileHeaderFragment ownProfileHeaderFragment) {
        this.a = ownProfileHeaderFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int iIntValue = ((Number) obj).intValue();
        int i = OwnProfileHeaderFragment.Z0;
        OwnProfileHeaderFragment ownProfileHeaderFragment = this.a;
        pk5.g(ownProfileHeaderFragment.J0, new NavIntentDirections.ForceUpdate(new mj2(new DialogDataModel(ownProfileHeaderFragment.U0(), "DIALOG_KEY_FORCE_UPDATE", null, 12), iIntValue)), -1);
        return tx8.a;
    }
}
