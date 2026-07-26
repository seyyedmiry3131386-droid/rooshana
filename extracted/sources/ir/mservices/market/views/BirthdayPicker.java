package ir.mservices.market.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bc0;
import defpackage.bq5;
import defpackage.br9;
import defpackage.bu6;
import defpackage.cc0;
import defpackage.dp2;
import defpackage.f88;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.lw8;
import defpackage.rm7;
import defpackage.sj8;
import defpackage.u91;
import defpackage.vl8;
import defpackage.w04;
import defpackage.w91;
import defpackage.wu0;
import ir.mservices.market.theme.ThemeData;
import ir.myket.core.utils.PersianCalendar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BirthdayPicker extends Hilt_BirthdayPicker implements bq5 {
    public vl8 c;
    public lw8 d;
    public boolean e;
    public final w04 f;
    public dp2 g;
    public final PersianCalendar h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BirthdayPicker(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public final void a(PersianCalendar persianCalendar, int i, int i2) {
        if (this.e && i2 != 0) {
            i2--;
        }
        int iA = persianCalendar.a(i2);
        String[] strArr = new String[iA];
        int i3 = 0;
        while (i3 < iA) {
            int i4 = i3 + 1;
            strArr[i3] = lw8.e(getUiUtils(), String.valueOf(i4));
            i3 = i4;
        }
        NumberPickerView numberPickerView = this.f.v;
        numberPickerView.setMinValue(0);
        if (this.e) {
            ArrayList arrayListE = br9.E("-");
            kotlin.collections.a.c0(arrayListE, strArr);
            strArr = (String[]) arrayListE.toArray(new String[0]);
        }
        int minValue = numberPickerView.getMinValue();
        int maxValue = (numberPickerView.getMaxValue() - minValue) + 1;
        int length = strArr.length - 1;
        if ((length - minValue) + 1 > maxValue) {
            numberPickerView.setDisplayedValues(strArr);
            numberPickerView.setMaxValue(length);
        } else {
            numberPickerView.setMaxValue(length);
            numberPickerView.setDisplayedValues(strArr);
        }
        if (i > numberPickerView.getMaxValue()) {
            i = numberPickerView.getMaxValue();
        }
        numberPickerView.setValue(i);
    }

    public final void b(PersianCalendar persianCalendar, int i) {
        String[] strArr = new String[12];
        for (int i2 = 0; i2 < 12; i2++) {
            strArr[i2] = getTimeUtils().b(i2);
        }
        NumberPickerView numberPickerView = this.f.w;
        if (this.e) {
            ArrayList arrayListE = br9.E("-");
            kotlin.collections.a.c0(arrayListE, strArr);
            strArr = (String[]) arrayListE.toArray(new String[0]);
        }
        numberPickerView.setDisplayedValues(strArr);
        numberPickerView.setMinValue(0);
        numberPickerView.setMaxValue(this.e ? 12 : 11);
        numberPickerView.setValue(i);
        numberPickerView.setOnScrollListener(new bc0(persianCalendar, this, 0));
    }

    public final void c(PersianCalendar persianCalendar, int i, int i2) {
        int i3 = i - 1300;
        String[] strArr = new String[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            strArr[i4] = lw8.e(getUiUtils(), String.valueOf(1300 + i4));
        }
        NumberPickerView numberPickerView = this.f.x;
        numberPickerView.setDisplayedValues(strArr);
        numberPickerView.setMinValue(1300);
        numberPickerView.setMaxValue(i - 1);
        if (this.e) {
            i2--;
        }
        numberPickerView.setValue(i2);
        numberPickerView.setOnScrollListener(new bc0(persianCalendar, this, 1));
    }

    public final String getDate() {
        boolean z = this.e;
        w04 w04Var = this.f;
        if (z && (w04Var.w.getValue() == 0 || w04Var.v.getValue() == 0)) {
            return null;
        }
        int value = w04Var.w.getValue() + (!this.e ? 1 : 0);
        String strValueOf = String.valueOf(value);
        if (value < 10) {
            strValueOf = rm7.n(value, "0");
        }
        int value2 = w04Var.v.getValue() + (!this.e ? 1 : 0);
        String strValueOf2 = String.valueOf(value2);
        if (value2 < 10) {
            strValueOf2 = rm7.n(value2, "0");
        }
        return w04Var.x.getValue() + "/" + strValueOf + "/" + strValueOf2;
    }

    public final dp2 getOnDateChangeListener() {
        return this.g;
    }

    public final vl8 getTimeUtils() {
        vl8 vl8Var = this.c;
        if (vl8Var != null) {
            return vl8Var;
        }
        js3.V("timeUtils");
        throw null;
    }

    public final lw8 getUiUtils() {
        lw8 lw8Var = this.d;
        if (lw8Var != null) {
            return lw8Var;
        }
        js3.V("uiUtils");
        throw null;
    }

    public final void setDate(String str) {
        PersianCalendar persianCalendar = this.h;
        int i = persianCalendar.get(1);
        if (str == null || f88.n0(str)) {
            this.e = true;
            c(persianCalendar, i, i);
            b(persianCalendar, 0);
            a(persianCalendar, 0, 0);
            return;
        }
        List listY0 = f88.y0(str, new String[]{"/"}, 6);
        ArrayList arrayList = new ArrayList(wu0.V(listY0, 10));
        Iterator it = listY0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        int iIntValue = ((Number) arrayList.get(0)).intValue();
        int iIntValue2 = ((Number) arrayList.get(1)).intValue();
        int iIntValue3 = ((Number) arrayList.get(2)).intValue();
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(iIntValue2 - 1);
        Integer numValueOf3 = Integer.valueOf(iIntValue3 - 1);
        int iIntValue4 = numValueOf.intValue();
        int iIntValue5 = numValueOf2.intValue();
        int iIntValue6 = numValueOf3.intValue();
        c(persianCalendar, i, iIntValue4);
        b(persianCalendar, iIntValue5);
        a(persianCalendar, iIntValue6, iIntValue5);
    }

    public final void setOnDateChangeListener(dp2 dp2Var) {
        this.g = dp2Var;
    }

    public final void setTimeUtils(vl8 vl8Var) {
        js3.p(vl8Var, "<set-?>");
        this.c = vl8Var;
    }

    public final void setUiUtils(lw8 lw8Var) {
        js3.p(lw8Var, "<set-?>");
        this.d = lw8Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BirthdayPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    public /* synthetic */ BirthdayPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            w91 w91Var = ((u91) ((cc0) e())).a;
            this.c = (vl8) w91Var.o0.get();
            this.d = (lw8) w91Var.E.get();
        }
        this.h = new PersianCalendar();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = w04.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        w04 w04Var = (w04) fa1.c(layoutInflaterFrom, js6.layout_date_picker, this, true);
        js3.o(w04Var, "inflate(...)");
        NumberPickerView numberPickerView = w04Var.v;
        NumberPickerView numberPickerView2 = w04Var.w;
        NumberPickerView numberPickerView3 = w04Var.x;
        this.f = w04Var;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, bu6.StepView, i, 0);
        try {
            ThemeData themeDataB = sj8.b();
            int i3 = themeDataB.v;
            int i4 = themeDataB.m;
            int i5 = themeDataB.n;
            js3.o(numberPickerView3, "yearPicker");
            numberPickerView3.setNormalTextColor(i5);
            numberPickerView3.setSelectedTextColor(i4);
            numberPickerView3.setDividerColor(i3);
            js3.o(numberPickerView2, "monthPicker");
            numberPickerView2.setNormalTextColor(i5);
            numberPickerView2.setSelectedTextColor(i4);
            numberPickerView2.setDividerColor(i3);
            js3.o(numberPickerView, "dayPicker");
            numberPickerView.setNormalTextColor(i5);
            numberPickerView.setSelectedTextColor(i4);
            numberPickerView.setDividerColor(i3);
            numberPickerView3.setOnValueChangedListener(this);
            numberPickerView2.setOnValueChangedListener(this);
            numberPickerView.setOnValueChangedListener(this);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
