package com.google.android.gms.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaad;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import defpackage.cq6;
import defpackage.dt6;
import defpackage.pj9;
import defpackage.rq4;
import defpackage.wq6;
import defpackage.xq2;
import defpackage.xt6;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public int a;
    public int b;
    public View c;
    public View.OnClickListener d;

    public SignInButton(Context context) {
        this(context, null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.d;
        if (onClickListener == null || view != this.c) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i) {
        setStyle(this.a, i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.d = onClickListener;
        View view = this.c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        setStyle(this.a, this.b);
    }

    public void setSize(int i) {
        setStyle(i, this.b);
    }

    public void setStyle(int i, int i2) {
        this.a = i;
        this.b = i2;
        Context context = getContext();
        View view = this.c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.c = pj9.x(context, this.a, this.b);
        } catch (RemoteCreator$RemoteCreatorException unused) {
            t0.m("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.a;
            int i4 = this.b;
            zaad zaadVar = new zaad(context, null);
            Resources resources = context.getResources();
            zaadVar.setTypeface(Typeface.DEFAULT_BOLD);
            zaadVar.setTextSize(14.0f);
            int i5 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            zaadVar.setMinHeight(i5);
            zaadVar.setMinWidth(i5);
            int i6 = wq6.common_google_signin_btn_icon_dark;
            int i7 = wq6.common_google_signin_btn_icon_light;
            int iA = zaad.a(i4, i6, i7, i7);
            int i8 = wq6.common_google_signin_btn_text_dark;
            int i9 = wq6.common_google_signin_btn_text_light;
            int iA2 = zaad.a(i4, i8, i9, i9);
            if (i3 == 0 || i3 == 1) {
                iA = iA2;
            } else if (i3 != 2) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 21);
                sb.append("Unknown button size: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
            Drawable drawable = resources.getDrawable(iA);
            drawable.setTintList(resources.getColorStateList(cq6.common_google_signin_btn_tint));
            drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
            zaadVar.setBackgroundDrawable(drawable);
            int i10 = cq6.common_google_signin_btn_text_dark;
            int i11 = cq6.common_google_signin_btn_text_light;
            ColorStateList colorStateList = resources.getColorStateList(zaad.a(i4, i10, i11, i11));
            rq4.n(colorStateList);
            zaadVar.setTextColor(colorStateList);
            if (i3 == 0) {
                zaadVar.setText(resources.getString(dt6.common_signin_button_text));
            } else if (i3 == 1) {
                zaadVar.setText(resources.getString(dt6.common_signin_button_text_long));
            } else {
                if (i3 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 21);
                    sb2.append("Unknown button size: ");
                    sb2.append(i3);
                    throw new IllegalStateException(sb2.toString());
                }
                zaadVar.setText((CharSequence) null);
            }
            zaadVar.setTransformationMethod(null);
            if (xq2.x(zaadVar.getContext())) {
                zaadVar.setGravity(19);
            }
            this.c = zaadVar;
        }
        addView(this.c);
        this.c.setEnabled(isEnabled());
        this.c.setOnClickListener(this);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, xt6.SignInButton, 0, 0);
        try {
            this.a = typedArrayObtainStyledAttributes.getInt(xt6.SignInButton_buttonSize, 0);
            this.b = typedArrayObtainStyledAttributes.getInt(xt6.SignInButton_colorScheme, 2);
            typedArrayObtainStyledAttributes.recycle();
            setStyle(this.a, this.b);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Deprecated
    public void setStyle(int i, int i2, Scope[] scopeArr) {
        setStyle(i, i2);
    }
}
