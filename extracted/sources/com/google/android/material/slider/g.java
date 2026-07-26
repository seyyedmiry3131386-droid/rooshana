package com.google.android.material.slider;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import defpackage.at2;
import defpackage.ft6;
import defpackage.n69;
import defpackage.o3;
import defpackage.q69;
import defpackage.t3;
import defpackage.t62;
import defpackage.xr6;
import io.sentry.android.core.t0;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g extends t62 {
    public final BaseSlider q;
    public final Rect r;

    public g(BaseSlider baseSlider) {
        super(baseSlider);
        this.r = new Rect();
        this.q = baseSlider;
    }

    @Override // defpackage.t62
    public final int n(float f, float f2) {
        int i = 0;
        while (true) {
            BaseSlider baseSlider = this.q;
            if (i >= baseSlider.getValues().size()) {
                return -1;
            }
            Rect rect = this.r;
            baseSlider.D(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.t62
    public final void o(ArrayList arrayList) {
        for (int i = 0; i < this.q.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.t62
    public final boolean s(int i, int i2, Bundle bundle) {
        BaseSlider baseSlider = this.q;
        if (!baseSlider.isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                return false;
            }
            float f = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
            int i3 = BaseSlider.r1;
            if (!baseSlider.B(i, f)) {
                return false;
            }
            baseSlider.E();
            baseSlider.postInvalidate();
            p(i);
            return true;
        }
        int i4 = BaseSlider.r1;
        float fRound = baseSlider.L0;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        if ((baseSlider.H0 - baseSlider.G0) / fRound > 20) {
            fRound *= Math.round(r1 / r4);
        }
        if (i2 == 8192) {
            fRound = -fRound;
        }
        if (baseSlider.s()) {
            fRound = -fRound;
        }
        if (!baseSlider.B(i, at2.R(baseSlider.getValues().get(i).floatValue() + fRound, baseSlider.getValueFrom(), baseSlider.getValueTo()))) {
            return false;
        }
        baseSlider.setActiveThumbIndex(i);
        d dVar = baseSlider.p1;
        baseSlider.removeCallbacks(dVar);
        baseSlider.postDelayed(dVar, baseSlider.m1);
        baseSlider.E();
        baseSlider.postInvalidate();
        p(i);
        return true;
    }

    @Override // defpackage.t62
    public final void u(int i, t3 t3Var) {
        Object tag;
        AccessibilityNodeInfo accessibilityNodeInfo = t3Var.a;
        t3Var.b(o3.t);
        BaseSlider baseSlider = this.q;
        List<Float> values = baseSlider.getValues();
        Float f = values.get(i);
        float fFloatValue = f.floatValue();
        float valueFrom = baseSlider.getValueFrom();
        float valueTo = baseSlider.getValueTo();
        if (baseSlider.isEnabled()) {
            if (fFloatValue > valueFrom) {
                t3Var.a(8192);
            }
            if (fFloatValue < valueTo) {
                t3Var.a(4096);
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        try {
            valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
            valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
            fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
        } catch (ParseException unused) {
            int i2 = BaseSlider.r1;
            t0.m("BaseSlider", "Error parsing value(" + f + "), valueFrom(" + valueFrom + "), and valueTo(" + valueTo + ") into a float.");
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
        t3Var.m(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (baseSlider.getContentDescription() != null) {
            sb.append(baseSlider.getContentDescription());
            sb.append(",");
        }
        String strL = baseSlider.l(fFloatValue);
        String string = baseSlider.getContext().getString(ft6.material_slider_value);
        if (values.size() > 1) {
            string = i == baseSlider.getValues().size() - 1 ? baseSlider.getContext().getString(ft6.material_slider_range_end) : i == 0 ? baseSlider.getContext().getString(ft6.material_slider_range_start) : "";
        }
        WeakHashMap weakHashMap = q69.a;
        int i3 = xr6.tag_state_description;
        if (Build.VERSION.SDK_INT >= 30) {
            tag = n69.b(baseSlider);
        } else {
            tag = baseSlider.getTag(i3);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (TextUtils.isEmpty(charSequence)) {
            Locale.getDefault();
            sb.append(string + ", " + strL);
        } else {
            t3Var.y(charSequence);
        }
        t3Var.p(sb.toString());
        Rect rect = this.r;
        baseSlider.D(i, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
