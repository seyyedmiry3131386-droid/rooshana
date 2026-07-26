package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import defpackage.bt0;
import defpackage.ft6;
import defpackage.t3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends bt0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ g f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, Context context, int i, int i2) {
        super(context, i);
        this.e = i2;
        this.f = gVar;
    }

    @Override // defpackage.bt0, defpackage.h3
    public final void d(View view, t3 t3Var) {
        int i = this.e;
        g gVar = this.f;
        switch (i) {
            case 0:
                super.d(view, t3Var);
                Resources resources = view.getResources();
                TimeModel timeModel = gVar.b;
                t3Var.p(resources.getString(timeModel.c == 1 ? ft6.material_hour_24h_suffix : ft6.material_hour_suffix, String.valueOf(timeModel.b())));
                break;
            default:
                super.d(view, t3Var);
                t3Var.p(view.getResources().getString(ft6.material_minute_suffix, String.valueOf(gVar.b.e)));
                break;
        }
    }
}
