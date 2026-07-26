package defpackage;

import android.os.Bundle;
import ir.mservices.market.app.schedule.ui.ScheduleUpdateRecyclerListFragment;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.permission.PermissionReason;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ye7 implements ze2 {
    public final /* synthetic */ ScheduleUpdateRecyclerListFragment a;

    public ye7(ScheduleUpdateRecyclerListFragment scheduleUpdateRecyclerListFragment) {
        this.a = scheduleUpdateRecyclerListFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        ((Boolean) obj).getClass();
        int i = yq6.app_icon_gradient;
        ScheduleUpdateRecyclerListFragment scheduleUpdateRecyclerListFragment = this.a;
        pk5.g(scheduleUpdateRecyclerListFragment.J0, new NavIntentDirections.PermissionReason(new e56(new DialogDataModel(scheduleUpdateRecyclerListFragment.Q1(), "DIALOG_KEY_NEED_ALARM", new Bundle(), 8), false, new PermissionReason(i, scheduleUpdateRecyclerListFragment.K().getString(rs6.alarm_title_previelage), scheduleUpdateRecyclerListFragment.K().getString(rs6.permission_description_alarm)))), -1);
        return tx8.a;
    }
}
