package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes.dex */
public final class w5 {
    public Context a;

    public static w5 b(Context context) {
        w5 w5Var = new w5();
        w5Var.a = context;
        return w5Var;
    }

    public z91 a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        z91 z91Var = new z91();
        z91Var.a = er1.a(s7.c);
        i71 i71Var = new i71(1, context);
        z91Var.b = i71Var;
        z91Var.c = er1.a(new lv4(i71Var, new i71(0, i71Var), 0));
        i71 i71Var2 = z91Var.b;
        z91Var.d = new j42(i71Var2, 1);
        int i = 1;
        pn6 pn6VarA = er1.a(new lv4(z91Var.d, er1.a(new j42(i71Var2, 0)), i));
        z91Var.e = pn6VarA;
        t42 t42Var = new t42(1);
        i71 i71Var3 = z91Var.b;
        ff7 ff7Var = new ff7(i71Var3, pn6VarA, t42Var, 0);
        pn6 pn6Var = z91Var.a;
        pn6 pn6Var2 = z91Var.c;
        z91Var.f = er1.a(new ff7(new wg1(pn6Var, pn6Var2, ff7Var, pn6VarA, pn6VarA), new g09(i71Var3, pn6Var2, pn6VarA, ff7Var, pn6Var, pn6VarA, pn6VarA), new kg9(pn6Var, pn6VarA, ff7Var, pn6VarA), i));
        return z91Var;
    }

    public int c() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int d() {
        Context context = this.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, lu6.ActionBar, xp6.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(lu6.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(zp6.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(rq6.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }
}
