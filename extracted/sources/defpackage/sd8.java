package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sd8 {
    public final qd8 a;
    public final ArrayList b = new ArrayList();
    public no3 c;
    public no3 d;
    public int e;

    public sd8(ViewGroup viewGroup) {
        no3 no3Var = no3.e;
        this.c = no3Var;
        this.d = no3Var;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        qd8 qd8Var = new qd8(this, viewGroup.getContext(), viewGroup);
        this.a = qd8Var;
        qd8Var.setWillNotDraw(true);
        ts5 ts5Var = new ts5(24, this);
        WeakHashMap weakHashMap = q69.a;
        h69.m(qd8Var, ts5Var);
        q69.t(qd8Var, new rd8(this));
        viewGroup.addView(qd8Var, 0);
    }
}
