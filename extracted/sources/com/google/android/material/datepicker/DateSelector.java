package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.zj4;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface DateSelector<S> extends Parcelable {
    String C0(Context context);

    ArrayList D();

    int F0(Context context);

    boolean L0();

    ArrayList N0();

    View P(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, zj4 zj4Var);

    Object U0();

    void e1(long j);

    String y(Context context);
}
