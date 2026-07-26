package com.google.android.material.tabs;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public Drawable a;
    public CharSequence b;
    public CharSequence c;
    public int d;
    public View e;
    public TabLayout f;
    public TabLayout.TabView g;

    public final void a(Drawable drawable) {
        this.a = drawable;
        TabLayout tabLayout = this.f;
        if (tabLayout.A == 1 || tabLayout.D == 2) {
            tabLayout.r(true);
        }
        TabLayout.TabView tabView = this.g;
        if (tabView != null) {
            tabView.d();
        }
    }

    public final void b(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
            this.g.setContentDescription(charSequence);
        }
        this.b = charSequence;
        TabLayout.TabView tabView = this.g;
        if (tabView != null) {
            tabView.d();
        }
    }
}
