package ir.mservices.market.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.pq6;
import defpackage.sj8;
import defpackage.vy2;
import defpackage.xf5;

/* JADX INFO: loaded from: classes3.dex */
public class MyketInputLayout extends TextInputLayout {
    public MyketInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setCornerRadius(getResources().getDimensionPixelSize(pq6.margin_default_v2));
        setHintTextColor(xf5.c());
        setHelperTextColor(xf5.c());
        setErrorTextColor(ColorStateList.valueOf(sj8.b().A));
        setDefaultHintTextColor(xf5.c());
        setPlaceholderTextColor(vy2.B());
        setCounterTextColor(vy2.B());
        setCounterOverflowTextColor(vy2.B());
        setPrefixTextColor(vy2.B());
        setSuffixTextColor(vy2.B());
        setBoxStrokeColorStateList(xf5.c());
        setBoxStrokeErrorColor(ColorStateList.valueOf(sj8.b().A));
    }

    public void setCornerRadius(int i) {
        float f = i;
        setBoxCornerRadii(f, f, f, f);
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setErrorEnabled(boolean z) {
        if (z) {
            setBoxStrokeColor(sj8.b().A);
            setHintTextColor(ColorStateList.valueOf(sj8.b().A));
        } else {
            setBoxStrokeColorStateList(xf5.c());
            setHintTextColor(getDefaultHintTextColor());
        }
    }
}
