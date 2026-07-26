package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.app.update.BaseUpdateFragment;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.views.ExtendedSwipeRefreshLayout;
import ir.mservices.market.views.MyketRecentDownloadView;

/* JADX INFO: loaded from: classes3.dex */
public final class u90 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseUpdateFragment b;

    public /* synthetic */ u90(BaseUpdateFragment baseUpdateFragment, int i) {
        this.a = i;
        this.b = baseUpdateFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        MyketRecentDownloadView myketRecentDownloadView;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        BaseUpdateFragment baseUpdateFragment = this.b;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                xz8 xz8Var = baseUpdateFragment.j1;
                if (xz8Var != null && (myketRecentDownloadView = xz8Var.x) != null) {
                    myketRecentDownloadView.setVisibility(zBooleanValue ? 0 : 8);
                }
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    int i2 = BaseUpdateFragment.p1;
                    ExtendedSwipeRefreshLayout extendedSwipeRefreshLayoutB1 = baseUpdateFragment.B1();
                    if (extendedSwipeRefreshLayoutB1 != null) {
                        extendedSwipeRefreshLayoutB1.setBackgroundColor(sj8.b().q);
                    }
                } else {
                    int i3 = BaseUpdateFragment.p1;
                    ExtendedSwipeRefreshLayout extendedSwipeRefreshLayoutB12 = baseUpdateFragment.B1();
                    if (extendedSwipeRefreshLayoutB12 != null) {
                        extendedSwipeRefreshLayoutB12.setBackgroundColor(sj8.b().l);
                    }
                }
                baseUpdateFragment.O1();
                break;
            default:
                String string = baseUpdateFragment.K().getString(rs6.update_analytics_value);
                Bundle bundle = new Bundle();
                ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
                if (string != null && !f88.n0(string)) {
                    bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, string);
                }
                eeVar.getClass();
                eeVar.a(bundle, "empty_list");
                break;
        }
        return tx8Var;
    }
}
