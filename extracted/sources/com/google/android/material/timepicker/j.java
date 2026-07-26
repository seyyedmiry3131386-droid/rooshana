package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import defpackage.oj8;

/* JADX INFO: loaded from: classes.dex */
public final class j extends oj8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                TimeModel timeModel = ((l) obj).b;
                try {
                    if (TextUtils.isEmpty(editable)) {
                        timeModel.e = 0;
                    } else {
                        timeModel.e = Integer.parseInt(editable.toString()) % 60;
                    }
                } catch (NumberFormatException unused) {
                    return;
                }
                break;
            case 1:
                l lVar = (l) obj;
                try {
                    if (TextUtils.isEmpty(editable)) {
                        lVar.b.c(0);
                    } else {
                        lVar.b.c(Integer.parseInt(editable.toString()));
                    }
                } catch (NumberFormatException unused2) {
                    return;
                }
                break;
            default:
                ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) obj;
                Chip chip = chipTextInputComboView.a;
                if (!TextUtils.isEmpty(editable)) {
                    int i2 = ChipTextInputComboView.f;
                    String strA = TimeModel.a(chipTextInputComboView.getResources(), editable, "%02d");
                    if (TextUtils.isEmpty(strA)) {
                        strA = TimeModel.a(chipTextInputComboView.getResources(), "00", "%02d");
                    }
                    chip.setText(strA);
                } else {
                    chip.setText(TimeModel.a(chipTextInputComboView.getResources(), "00", "%02d"));
                }
                break;
        }
    }
}
