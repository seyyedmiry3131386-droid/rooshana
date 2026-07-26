package ir.mservices.market.social.mynet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a19;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.lw8;
import defpackage.pq6;
import defpackage.tx2;
import defpackage.u91;
import defpackage.uy6;

/* JADX INFO: loaded from: classes3.dex */
public final class HeaderInfoItemView extends Hilt_HeaderInfoItemView {
    public final a19 c;
    public lw8 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderInfoItemView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    public final lw8 getUiUtils() {
        lw8 lw8Var = this.d;
        if (lw8Var != null) {
            return lw8Var;
        }
        js3.V("uiUtils");
        throw null;
    }

    public final void setData(String str, int i) {
        a19 a19Var = this.c;
        a19Var.w.setText(getResources().getString(i));
        a19Var.v.setText(lw8.e(getUiUtils(), str));
    }

    public final void setUiUtils(lw8 lw8Var) {
        js3.p(lw8Var, "<set-?>");
        this.d = lw8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderInfoItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.d = (lw8) ((u91) ((tx2) e())).a.E.get();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = a19.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        a19 a19Var = (a19) fa1.c(layoutInflaterFrom, js6.user_header_info_item_view, this, true);
        js3.o(a19Var, "inflate(...)");
        this.c = a19Var;
        setGravity(1);
        setLayoutDirection(3);
        setOrientation(1);
        setPaddingRelative(getPaddingStart(), getResources().getDimensionPixelSize(pq6.space_8), getPaddingEnd(), getResources().getDimensionPixelSize(pq6.space_8));
        uy6.q(this, 0, null, 3);
    }
}
