package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.is6;
import defpackage.qr6;
import defpackage.vt4;
import defpackage.yj5;

/* JADX INFO: loaded from: classes.dex */
public class NavigationBarSubheaderView extends FrameLayout implements yj5 {
    public final TextView a;
    public boolean b;
    public boolean c;
    public vt4 d;
    public ColorStateList e;

    public NavigationBarSubheaderView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(is6.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.a = (TextView) findViewById(qr6.navigation_menu_subheader_label);
    }

    public final void a() {
        vt4 vt4Var = this.d;
        if (vt4Var != null) {
            setVisibility((!vt4Var.isVisible() || (!this.b && this.c)) ? 8 : 0);
        }
    }

    @Override // defpackage.iu4
    public final void c(vt4 vt4Var) {
        this.d = vt4Var;
        vt4Var.setCheckable(false);
        this.a.setText(vt4Var.e);
        a();
    }

    @Override // defpackage.iu4
    public vt4 getItemData() {
        return this.d;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    @Override // defpackage.yj5
    public void setExpanded(boolean z) {
        this.b = z;
        a();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // defpackage.yj5
    public void setOnlyShowWhenExpanded(boolean z) {
        this.c = z;
        a();
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        TextView textView = this.a;
        textView.setTextAppearance(i);
        ColorStateList colorStateList = this.e;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.e = colorStateList;
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
    }
}
