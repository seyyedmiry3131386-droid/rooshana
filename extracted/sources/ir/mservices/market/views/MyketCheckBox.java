package ir.mservices.market.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.google.android.material.checkbox.MaterialCheckBox;
import defpackage.js3;
import defpackage.kh2;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketCheckBox extends MaterialCheckBox {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketCheckBox(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        if (!isInEditMode()) {
            setTypeface((Typeface) kh2.b.a.b);
        }
        setUseMaterialThemeColors(false);
        setMinHeight(0);
        setMinWidth(0);
    }
}
