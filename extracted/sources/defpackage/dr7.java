package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.setting.SettingRecyclerListFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class dr7 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingRecyclerListFragment b;

    public /* synthetic */ dr7(SettingRecyclerListFragment settingRecyclerListFragment, int i) {
        this.a = i;
        this.b = settingRecyclerListFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                if (((x38) obj) instanceof w38) {
                    SettingRecyclerListFragment settingRecyclerListFragment = this.b;
                    hh2.H(new hh2(settingRecyclerListFragment.F(), settingRecyclerListFragment.L(rs6.clear_search_history_toast_message)));
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SettingRecyclerListFragment settingRecyclerListFragment2 = this.b;
                String strL = zBooleanValue ? settingRecyclerListFragment2.L(rs6.kids_mode_toast_active) : settingRecyclerListFragment2.L(rs6.kids_mode_toast_inactive);
                js3.m(strL);
                hh2.H(new hh2(settingRecyclerListFragment2.H(), strL));
                Context contextH = settingRecyclerListFragment2.H();
                if (contextH != null) {
                    Intent intentMakeRestartActivityTask = Intent.makeRestartActivityTask(new Intent(contextH, (Class<?>) LaunchContentActivity.class).getComponent());
                    intentMakeRestartActivityTask.setAction("android.intent.action.VIEW");
                    intentMakeRestartActivityTask.setData(Uri.parse("myket://settings"));
                    contextH.startActivity(intentMakeRestartActivityTask);
                }
                break;
        }
        return tx8.a;
    }
}
