package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import defpackage.bt0;
import defpackage.ft6;
import defpackage.t3;

/* JADX INFO: loaded from: classes.dex */
public final class k extends bt0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Resources f;
    public final /* synthetic */ TimeModel g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Context context, int i, Resources resources, TimeModel timeModel, int i2) {
        super(context, i);
        this.e = i2;
        this.f = resources;
        this.g = timeModel;
    }

    @Override // defpackage.bt0, defpackage.h3
    public final void d(View view, t3 t3Var) {
        int i = this.e;
        TimeModel timeModel = this.g;
        Resources resources = this.f;
        switch (i) {
            case 0:
                super.d(view, t3Var);
                StringBuilder sb = new StringBuilder();
                sb.append(resources.getString(ft6.material_timepicker_hour));
                sb.append(" ");
                sb.append(view.getResources().getString(timeModel.c == 1 ? ft6.material_hour_24h_suffix : ft6.material_hour_suffix, String.valueOf(timeModel.b())));
                t3Var.p(sb.toString());
                break;
            default:
                super.d(view, t3Var);
                t3Var.p(resources.getString(ft6.material_timepicker_minute) + " " + view.getResources().getString(ft6.material_minute_suffix, String.valueOf(timeModel.e)));
                break;
        }
    }
}
