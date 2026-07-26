package com.google.android.material.timepicker;

import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import defpackage.ft6;
import defpackage.pl8;
import defpackage.q69;
import defpackage.qr6;
import defpackage.zt0;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class g implements zt0, pl8 {
    public static final String[] f = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    public static final String[] g = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    public static final String[] h = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    public final TimePickerView a;
    public final TimeModel b;
    public float c;
    public float d;
    public boolean e = false;

    public g(TimePickerView timePickerView, TimeModel timeModel) {
        this.a = timePickerView;
        this.b = timeModel;
        if (timeModel.c == 0) {
            timePickerView.u.setVisibility(0);
        }
        timePickerView.s.j.add(this);
        timePickerView.w = this;
        timePickerView.v = this;
        timePickerView.s.r = this;
        f("%d", f);
        f("%d", g);
        f("%02d", h);
        invalidate();
    }

    @Override // defpackage.pl8
    public final void a() {
        this.a.setVisibility(0);
    }

    @Override // defpackage.zt0
    public final void b(float f2, boolean z) {
        if (this.e || z) {
            return;
        }
        TimeModel timeModel = this.b;
        int i = timeModel.d;
        int i2 = timeModel.e;
        int iRound = Math.round(f2);
        int i3 = timeModel.f;
        TimePickerView timePickerView = this.a;
        if (i3 == 12) {
            timeModel.e = ((iRound + 3) / 6) % 60;
            this.c = (float) Math.floor(r7 * 6);
        } else {
            int i4 = (iRound + 15) / 30;
            if (timeModel.c == 1) {
                i4 %= 12;
                if (timePickerView.t.t.u == 2) {
                    i4 += 12;
                }
            }
            timeModel.c(i4);
            this.d = (timeModel.b() * 30) % 360;
        }
        e();
        if (timeModel.e == i2 && timeModel.d == i) {
            return;
        }
        timePickerView.performHapticFeedback(4);
    }

    @Override // defpackage.pl8
    public final void c() {
        this.a.setVisibility(8);
    }

    public final void d(int i, boolean z) {
        boolean z2 = i == 12;
        TimePickerView timePickerView = this.a;
        ClockHandView clockHandView = timePickerView.s;
        Chip chip = timePickerView.r;
        Chip chip2 = timePickerView.q;
        ClockFaceView clockFaceView = timePickerView.t;
        clockHandView.d = z2;
        TimeModel timeModel = this.b;
        timeModel.f = i;
        int i2 = timeModel.c;
        clockFaceView.v(z2 ? h : i2 == 1 ? g : f, z2 ? ft6.material_minute_suffix : i2 == 1 ? ft6.material_hour_24h_suffix : ft6.material_hour_suffix);
        int i3 = (timeModel.f == 10 && i2 == 1 && timeModel.d >= 12) ? 2 : 1;
        ClockHandView clockHandView2 = clockFaceView.t;
        clockHandView2.u = i3;
        clockHandView2.invalidate();
        timePickerView.s.c(z2 ? this.c : this.d, z);
        boolean z3 = i == 12;
        chip2.setChecked(z3);
        chip2.setAccessibilityLiveRegion(z3 ? 2 : 0);
        boolean z4 = i == 10;
        chip.setChecked(z4);
        chip.setAccessibilityLiveRegion(z4 ? 2 : 0);
        q69.q(chip, new f(this, timePickerView.getContext(), ft6.material_hour_selection, 0));
        q69.q(chip2, new f(this, timePickerView.getContext(), ft6.material_minute_selection, 1));
    }

    public final void e() {
        TimeModel timeModel = this.b;
        int i = timeModel.g;
        int iB = timeModel.b();
        int i2 = timeModel.e;
        TimePickerView timePickerView = this.a;
        Chip chip = timePickerView.r;
        Chip chip2 = timePickerView.q;
        timePickerView.u.f(i == 1 ? qr6.material_clock_period_pm_button : qr6.material_clock_period_am_button, true);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(i2));
        String str2 = String.format(locale, "%02d", Integer.valueOf(iB));
        if (!TextUtils.equals(chip2.getText(), str)) {
            chip2.setText(str);
        }
        if (TextUtils.equals(chip.getText(), str2)) {
            return;
        }
        chip.setText(str2);
    }

    public final void f(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = TimeModel.a(this.a.getResources(), strArr[i], str);
        }
    }

    @Override // defpackage.pl8
    public final void invalidate() {
        TimeModel timeModel = this.b;
        this.d = (timeModel.b() * 30) % 360;
        this.c = timeModel.e * 6;
        d(timeModel.f, false);
        e();
    }
}
