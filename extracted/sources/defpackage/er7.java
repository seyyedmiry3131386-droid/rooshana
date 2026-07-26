package defpackage;

import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.setting.SettingRecyclerListFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class er7 implements ze2 {
    public final /* synthetic */ SettingRecyclerListFragment a;

    public er7(SettingRecyclerListFragment settingRecyclerListFragment) {
        this.a = settingRecyclerListFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = SettingRecyclerListFragment.k1;
        SettingRecyclerListFragment settingRecyclerListFragment = this.a;
        pk5.g(settingRecyclerListFragment.J0, new NavIntentDirections.KidsModeDeActive(new hz3(new DialogDataModel(settingRecyclerListFragment.Q1(), "DIALOG_KEY_KIDS_MODE_DEACTIVE", null, 12))), -1);
        return tx8.a;
    }
}
