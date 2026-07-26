package defpackage;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class re9 extends WindowInsetsAnimation$Callback {
    public final mu0 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public re9(mu0 mu0Var) {
        super(mu0Var.a);
        this.d = new HashMap();
        this.a = mu0Var;
    }

    public final ue9 a(WindowInsetsAnimation windowInsetsAnimation) {
        ue9 ue9Var = (ue9) this.d.get(windowInsetsAnimation);
        if (ue9Var == null) {
            ue9Var = new ue9(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                ue9Var.a = new se9(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, ue9Var);
        }
        return ue9Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.g(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.h(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            ue9 ue9VarA = a(windowInsetsAnimation);
            ue9VarA.a.e(windowInsetsAnimation.getFraction());
            this.c.add(ue9VarA);
        }
        return this.a.i(lf9.h(null, windowInsets), this.b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        rn6 rn6VarJ = this.a.j(a(windowInsetsAnimation), new rn6(bounds));
        rn6VarJ.getClass();
        qe9.c();
        return qe9.a(((no3) rn6VarJ.b).e(), ((no3) rn6VarJ.c).e());
    }
}
