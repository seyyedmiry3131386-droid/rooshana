package com.google.android.material.timepicker;

import defpackage.qr6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(int i, boolean z) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                l lVar = (l) obj;
                if (z) {
                    lVar.b.d(i == qr6.material_clock_period_pm_button ? 1 : 0);
                    break;
                }
                break;
            default:
                TimePickerView timePickerView = (TimePickerView) obj;
                if (!z) {
                    int i3 = TimePickerView.y;
                } else {
                    g gVar = timePickerView.v;
                    if (gVar != null) {
                        gVar.b.d(i == qr6.material_clock_period_pm_button ? 1 : 0);
                    }
                }
                break;
        }
    }
}
