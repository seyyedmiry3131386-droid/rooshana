package ir.mservices.market.views;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.ea7;
import defpackage.f88;
import defpackage.js3;
import defpackage.lw8;
import defpackage.pq6;
import defpackage.sj8;
import ir.mservices.market.app.detail.data.AdInfoDto;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketAdInfoView extends MyketTextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketAdInfoView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    private final void setTextStyle(String str) {
        Object obj = lw8.b;
        int color = sj8.b().n;
        try {
            color = Color.parseColor(str);
        } catch (Exception unused) {
        }
        setTextColor(color);
    }

    public final void setData(AdInfoDto adInfoDto) {
        boolean z;
        if (adInfoDto != null) {
            String bgColor = adInfoDto.getBgColor();
            String strokeColor = adInfoDto.getStrokeColor();
            Context context = getContext();
            js3.o(context, "getContext(...)");
            ea7 ea7Var = new ea7(context);
            Object obj = lw8.b;
            int color = sj8.b().N;
            try {
                color = Color.parseColor(bgColor);
            } catch (Exception unused) {
            }
            ea7Var.b = color;
            Object obj2 = lw8.b;
            int color2 = sj8.b().N;
            try {
                color2 = Color.parseColor(strokeColor);
            } catch (Exception unused2) {
            }
            ea7Var.i = color2;
            ea7Var.c(getResources().getDimensionPixelSize(pq6.ad_info_curve));
            ea7Var.p = sj8.b().N;
            ea7Var.h = 1;
            setBackground(ea7Var.a());
            setTextStyle(adInfoDto.getTextColor());
            setText(adInfoDto.getText());
            String text = adInfoDto.getText();
            z = !(text == null || f88.n0(text));
        } else {
            z = false;
        }
        setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketAdInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        setTextSize(0, getResources().getDimensionPixelSize(pq6.font_size_very_small));
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(pq6.space_4);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }
}
