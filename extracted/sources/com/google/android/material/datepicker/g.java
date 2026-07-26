package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.e29;
import defpackage.ft6;
import defpackage.g7;
import defpackage.j00;
import defpackage.oj8;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends oj8 {
    public final TextInputLayout a;
    public final String b;
    public final SimpleDateFormat c;
    public final CalendarConstraints d;
    public final String e;
    public final g7 f;
    public j00 g;
    public int h = 0;

    public g(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.b = str;
        this.c = simpleDateFormat;
        this.a = textInputLayout;
        this.d = calendarConstraints;
        this.e = textInputLayout.getContext().getString(ft6.mtrl_picker_out_of_range);
        this.f = new g7(this, str, 10);
    }

    public abstract void a();

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.b;
        if (length >= str.length() || editable.length() < this.h) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    public abstract void b(Long l);

    @Override // defpackage.oj8, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.h = charSequence.length();
    }

    @Override // defpackage.oj8, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CalendarConstraints calendarConstraints = this.d;
        TextInputLayout textInputLayout = this.a;
        g7 g7Var = this.f;
        textInputLayout.removeCallbacks(g7Var);
        textInputLayout.removeCallbacks(this.g);
        textInputLayout.setError(null);
        b(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.b.length()) {
            return;
        }
        try {
            Date date = this.c.parse(charSequence.toString());
            textInputLayout.setError(null);
            long time = date.getTime();
            if (calendarConstraints.c.H0(time)) {
                Calendar calendarD = e29.d(calendarConstraints.a.a);
                calendarD.set(5, 1);
                if (calendarD.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.b;
                    int i4 = month.e;
                    Calendar calendarD2 = e29.d(month.a);
                    calendarD2.set(5, i4);
                    if (time <= calendarD2.getTimeInMillis()) {
                        b(Long.valueOf(date.getTime()));
                        return;
                    }
                }
            }
            j00 j00Var = new j00(1, time, this);
            this.g = j00Var;
            textInputLayout.post(j00Var);
        } catch (ParseException unused) {
            textInputLayout.post(g7Var);
        }
    }
}
