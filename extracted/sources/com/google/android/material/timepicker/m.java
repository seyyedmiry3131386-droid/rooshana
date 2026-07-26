package com.google.android.material.timepicker;

import android.view.View;
import defpackage.qr6;

/* JADX INFO: loaded from: classes.dex */
public final class m implements View.OnClickListener {
    public final /* synthetic */ TimePickerView a;

    public m(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g gVar = this.a.w;
        if (gVar != null) {
            gVar.d(((Integer) view.getTag(qr6.selection_type)).intValue(), true);
        }
    }
}
