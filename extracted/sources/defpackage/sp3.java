package defpackage;

import android.app.usage.UsageStats;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.appUsage.recycler.InstalledAppUsageData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class sp3 extends qg5 {
    public final xf5 A;
    public final og5 w;
    public final og5 x;
    public j33 y;
    public final lw8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp3(View view, ru ruVar, ru ruVar2) {
        super(view);
        js3.p(ruVar, "onInstalledAppClickListener");
        js3.p(ruVar2, "onRemoveAppClickListener");
        this.w = ruVar;
        this.x = ruVar2;
        w91 w91Var = (w91) qg5.r();
        this.z = (lw8) w91Var.E.get();
        this.A = (xf5) w91Var.F.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        String string;
        String strE;
        InstalledAppUsageData installedAppUsageData = (InstalledAppUsageData) myketRecyclerData;
        js3.p(installedAppUsageData, "data");
        x().y.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        AppIconView appIconView = x().v;
        bu buVar = installedAppUsageData.a;
        appIconView.setImageDrawable(buVar.c);
        x().w.setText(buVar.b);
        MyketTextView myketTextView = x().x;
        View view = this.a;
        Resources resources = view.getResources();
        int i = rs6.app_usage_size_last_used;
        ws wsVar = buVar.d;
        lw8 lw8Var = this.z;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        String str = k68.e;
        Resources resources2 = view.getResources();
        js3.o(resources2, "getResources(...)");
        String strE2 = lw8.e(lw8Var, a77.e(resources2, wsVar.d));
        xf5 xf5Var = this.A;
        if (xf5Var == null) {
            js3.V("myketUIUtils");
            throw null;
        }
        UsageStats usageStats = buVar.e;
        long lastTimeUsed = usageStats != null ? usageStats.getLastTimeUsed() : 0L;
        Context context = xf5Var.a;
        if (lastTimeUsed == 0) {
            strE = context.getString(rs6.long_time_ago);
            js3.o(strE, "getString(...)");
        } else {
            long timeInMillis = Calendar.getInstance().getTimeInMillis() - lastTimeUsed;
            if (timeInMillis < TimeUnit.MINUTES.toMillis(1L)) {
                string = context.getResources().getString(rs6.just_now);
            } else if (timeInMillis < TimeUnit.HOURS.toMillis(1L)) {
                string = context.getResources().getString(rs6.minute_ago, String.valueOf(TimeUnit.MILLISECONDS.toMinutes(timeInMillis)));
            } else {
                TimeUnit timeUnit = TimeUnit.DAYS;
                string = timeInMillis < timeUnit.toMillis(1L) ? context.getResources().getString(rs6.hour_ago, String.valueOf(TimeUnit.MILLISECONDS.toHours(timeInMillis))) : timeInMillis < timeUnit.toMillis(30L) ? context.getResources().getString(rs6.day_ago, String.valueOf(TimeUnit.MILLISECONDS.toDays(timeInMillis))) : timeInMillis < timeUnit.toMillis(365L) ? context.getResources().getString(rs6.month_ago, String.valueOf(TimeUnit.MILLISECONDS.toDays(timeInMillis) / ((long) 30))) : context.getString(rs6.long_time_ago);
            }
            strE = lw8.e(xf5Var.d, string);
        }
        myketTextView.setText(resources.getString(i, strE2, strE));
        View view2 = x().l;
        js3.o(view2, "getRoot(...)");
        qg5.v(view2, this.w, this, installedAppUsageData);
        ImageView imageView = x().y;
        js3.o(imageView, "removeImageView");
        qg5.v(imageView, this.x, this, installedAppUsageData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof j33) {
            this.y = (j33) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final j33 x() {
        j33 j33Var = this.y;
        if (j33Var != null) {
            return j33Var;
        }
        js3.V("binding");
        throw null;
    }
}
