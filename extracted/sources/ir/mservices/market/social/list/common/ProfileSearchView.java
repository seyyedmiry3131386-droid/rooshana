package ir.mservices.market.social.list.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.b77;
import defpackage.cd;
import defpackage.ea7;
import defpackage.f88;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.pq6;
import defpackage.q39;
import defpackage.sj8;
import defpackage.x69;
import defpackage.yq6;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.views.MyketEditText;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileSearchView extends Hilt_ProfileSearchView {
    public final x69 s;
    public View.OnClickListener t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSearchView(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = x69.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        x69 x69Var = (x69) fa1.c(layoutInflaterFrom, js6.view_custom_list_search, this, true);
        js3.o(x69Var, "inflate(...)");
        this.s = x69Var;
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(pq6.space_xl);
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        View view = x69Var.v;
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().t;
        ea7Var.h = 0;
        ea7Var.c(getResources().getDimensionPixelSize(pq6.custom_list_search_input_height) / 2);
        view.setBackground(ea7Var.a());
        ImageView imageView = x69Var.w;
        js3.o(imageView, "clear");
        MyketEditText myketEditText = x69Var.x;
        Editable text = myketEditText.getText();
        imageView.setVisibility((text == null || f88.n0(text)) ? 8 : 0);
        Drawable drawableMutate = imageView.getDrawable().mutate();
        int i2 = sj8.b().n;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i2, mode));
        imageView.setOnClickListener(new cd(26, this));
        myketEditText.setSaveEnabled(false);
        Resources resources = myketEditText.getResources();
        js3.o(resources, "getResources(...)");
        int i3 = yq6.ic_action_search;
        try {
            drawable = q39.a(resources, i3, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i3, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i3, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate2 = drawable.mutate();
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
        myketEditText.setEditTextDrawable(drawableMutate2);
        myketEditText.setCompoundDrawablePadding(myketEditText.getResources().getDimensionPixelSize(pq6.space_8));
        myketEditText.setTextDirection(myketEditText.p.c());
        myketEditText.q = true;
    }

    public final View.OnClickListener getOnClearClickListener() {
        return this.t;
    }

    public final void setOnClearClickListener(View.OnClickListener onClickListener) {
        this.t = onClickListener;
    }

    public final void setText(String str) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        this.s.x.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileSearchView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
