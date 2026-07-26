package ir.mservices.market.views;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import defpackage.d04;
import defpackage.js3;
import defpackage.p3;
import defpackage.pq6;
import defpackage.sj8;
import defpackage.y97;
import defpackage.yq6;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketSwitch extends Hilt_MyketSwitch {
    public d04 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.space_8);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setThumbResource(yq6.myket_switch_button);
        f();
        if (getLanguageHelper().f()) {
            setRotationY(180.0f);
        }
    }

    public final void f() {
        int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_checked}};
        int[] iArr2 = {sj8.b().n, sj8.b().c};
        int[] iArr3 = {p3.a(sj8.b().n, 80), p3.a(sj8.b().c, 80)};
        getThumbDrawable().setTintList(new ColorStateList(iArr, iArr2));
        getTrackDrawable().setTintList(new ColorStateList(iArr, iArr3));
        StateListDrawable stateListDrawable = new StateListDrawable();
        float dimensionPixelSize = getResources().getDimensionPixelSize(pq6.myket_switch_button_size) / 2;
        stateListDrawable.addState(new int[]{R.attr.state_checked}, y97.z(p3.a(sj8.b().c, 80), dimensionPixelSize));
        stateListDrawable.addState(new int[]{-16842912}, y97.z(p3.a(sj8.b().n, 80), dimensionPixelSize));
        setBackground(stateListDrawable);
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.B0;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.B0 = d04Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketSwitch(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
