package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.b31;
import defpackage.fk4;
import defpackage.h37;
import defpackage.is6;
import defpackage.qr6;
import defpackage.yr7;
import defpackage.yt6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class RadialViewGroup extends ConstraintLayout {
    public final d q;
    public int r;
    public final fk4 s;

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            d dVar = this.q;
            handler.removeCallbacks(dVar);
            handler.post(dVar);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            d dVar = this.q;
            handler.removeCallbacks(dVar);
            handler.post(dVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.s.s(ColorStateList.valueOf(i));
    }

    public void t() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != qr6.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(qr6.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.r * 0.66f) : this.r;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                int i3 = qr6.circle_center;
                b31 b31Var = dVar.k(id).e;
                b31Var.A = i3;
                b31Var.B = iRound;
                b31Var.C = size;
                size += 360.0f / list.size();
            }
        }
        dVar.b(this);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.material.timepicker.d] */
    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(is6.material_radial_view_group, this);
        fk4 fk4Var = new fk4();
        this.s = fk4Var;
        h37 h37Var = new h37(0.5f);
        yr7 yr7VarH = fk4Var.b.a.h();
        yr7VarH.e = h37Var;
        yr7VarH.f = h37Var;
        yr7VarH.g = h37Var;
        yr7VarH.h = h37Var;
        fk4Var.setShapeAppearanceModel(yr7VarH.a());
        this.s.s(ColorStateList.valueOf(-1));
        setBackground(this.s);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yt6.RadialViewGroup, i, 0);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.RadialViewGroup_materialCircleRadius, 0);
        this.q = new Runnable() { // from class: com.google.android.material.timepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                this.a.t();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
