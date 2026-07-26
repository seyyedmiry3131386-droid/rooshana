package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.b74;
import defpackage.e6;
import defpackage.gt6;
import defpackage.kc1;
import defpackage.lu6;
import defpackage.q69;
import defpackage.sk6;
import defpackage.xp6;

/* JADX INFO: loaded from: classes.dex */
public final class m implements kc1 {
    public final Toolbar a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public final boolean g;
    public CharSequence h;
    public final CharSequence i;
    public final CharSequence j;
    public Window.Callback k;
    public boolean l;
    public b m;
    public final int n;
    public final Drawable o;

    public m(Toolbar toolbar, boolean z) {
        int i;
        Drawable drawable;
        int i2 = gt6.abc_action_bar_up_description;
        this.n = 0;
        this.a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        sk6 sk6VarD = sk6.D(toolbar.getContext(), null, lu6.ActionBar, xp6.actionBarStyle);
        TypedArray typedArray = (TypedArray) sk6VarD.c;
        this.o = sk6VarD.v(lu6.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence text = typedArray.getText(lu6.ActionBar_title);
            if (!TextUtils.isEmpty(text)) {
                this.g = true;
                this.h = text;
                if ((this.b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.g) {
                        q69.r(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(lu6.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableV = sk6VarD.v(lu6.ActionBar_logo);
            if (drawableV != null) {
                this.e = drawableV;
                e();
            }
            Drawable drawableV2 = sk6VarD.v(lu6.ActionBar_icon);
            if (drawableV2 != null) {
                this.d = drawableV2;
                e();
            }
            if (this.f == null && (drawable = this.o) != null) {
                this.f = drawable;
                if ((this.b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            c(typedArray.getInt(lu6.ActionBar_displayOptions, 0));
            int resourceId = typedArray.getResourceId(lu6.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.c;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                c(this.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(lu6.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(lu6.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(lu6.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(lu6.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(lu6.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(lu6.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
                i = 15;
            } else {
                i = 11;
            }
            this.b = i;
        }
        sk6VarD.G();
        if (i2 != this.n) {
            this.n = i2;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i3 = this.n;
                this.j = i3 != 0 ? toolbar.getContext().getString(i3) : null;
                d();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new b74(this));
    }

    public final void a() {
        b bVar;
        ActionMenuView actionMenuView = this.a.mMenuView;
        if (actionMenuView == null || (bVar = actionMenuView.t) == null) {
            return;
        }
        bVar.b();
        e6 e6Var = bVar.u;
        if (e6Var == null || !e6Var.b()) {
            return;
        }
        e6Var.i.dismiss();
    }

    public final boolean b() {
        b bVar;
        ActionMenuView actionMenuView = this.a.mMenuView;
        return (actionMenuView == null || (bVar = actionMenuView.t) == null || !bVar.b()) ? false : true;
    }

    public final void c(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.a;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    d();
                }
                if ((this.b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                e();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void d() {
        if ((this.b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void e() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.e) == null) {
            drawable = this.d;
        }
        this.a.setLogo(drawable);
    }
}
