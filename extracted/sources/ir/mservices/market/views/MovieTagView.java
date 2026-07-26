package ir.mservices.market.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.ea7;
import defpackage.f57;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.js8;
import defpackage.lw8;
import defpackage.pq6;
import defpackage.sj8;
import defpackage.t75;
import defpackage.u75;
import defpackage.u91;
import defpackage.ve8;
import defpackage.w75;
import defpackage.zk8;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieTagView extends Hilt_MovieTagView {
    public final u75 c;
    public lw8 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MovieTagView(Context context) {
        this(context, null, 6, 0);
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

    public final void setBgColor(int i) {
        LinearLayout linearLayout = this.c.v;
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = i;
        ea7Var.h = 0;
        ea7Var.c(getResources().getDimensionPixelSize(pq6.space_24));
        ea7Var.j = true;
        linearLayout.setBackground(ea7Var.a());
    }

    public final void setIcon(String str) {
        js3.p(str, "iconUrl");
        ve8 t75Var = new t75(this);
        Context context = getContext();
        js3.o(context, "getContext(...)");
        f57 f57VarO = zk8.O(context, str);
        f57VarO.Q(t75Var, f57VarO);
    }

    public final void setIconBackgroundColor(String str) {
        FrameLayout frameLayout = this.c.y;
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        Object obj = lw8.b;
        ea7Var.b = js8.w(str);
        ea7Var.h = 0;
        ea7Var.c(getResources().getDimensionPixelSize(pq6.space_24));
        ea7Var.p = sj8.b().N;
        ea7Var.j = true;
        frameLayout.setBackground(ea7Var.a());
    }

    public final void setIconTint(String str) {
        ImageView imageView = this.c.w;
        Object obj = lw8.b;
        imageView.setColorFilter(new PorterDuffColorFilter(js8.w(str), PorterDuff.Mode.MULTIPLY));
    }

    public final void setTitleText(String str) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        this.c.x.setText(lw8.e(getUiUtils(), str));
    }

    public final void setTitleTextColor(int i) {
        this.c.x.setTextColor(i);
    }

    public final void setUiUtils(lw8 lw8Var) {
        js3.p(lw8Var, "<set-?>");
        this.d = lw8Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MovieTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    public /* synthetic */ MovieTagView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieTagView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.d = (lw8) ((u91) ((w75) e())).a.E.get();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = u75.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        u75 u75Var = (u75) fa1.c(layoutInflaterFrom, js6.movie_tag_view, this, true);
        js3.o(u75Var, "inflate(...)");
        this.c = u75Var;
        setBgColor(sj8.b().r);
        setTitleTextColor(sj8.b().s);
    }
}
