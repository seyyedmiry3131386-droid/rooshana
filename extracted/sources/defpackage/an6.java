package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class an6 {
    public final ArrayList a = new ArrayList();
    public final sd8 b;
    public no3 c;
    public no3 d;
    public int e;
    public boolean f;

    public an6(sd8 sd8Var, ArrayList arrayList) {
        no3 no3Var = no3.e;
        this.c = no3Var;
        this.d = no3Var;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = sd8Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            no3 no3Var2 = sd8Var.c;
            no3 no3Var3 = sd8Var.d;
            this.c = no3Var2;
            this.d = no3Var3;
            c();
            b(sd8Var.e);
        }
        this.b = sd8Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jv0 jv0Var = (jv0) list.get(i);
            jv0Var.getClass();
            if (true == z) {
                an6 an6Var = jv0Var.e;
                if (an6Var != null) {
                    throw new IllegalStateException(jv0Var + " is already controlled by " + an6Var);
                }
                jv0Var.e = this;
                this.a.add(jv0Var);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            jv0 jv0Var = (jv0) arrayList.get(size);
            if (!jv0Var.g) {
                ColorDrawable colorDrawable = jv0Var.f;
                if (jv0Var.h != i) {
                    jv0Var.h = i;
                    colorDrawable.setColor(i);
                    zm6 zm6Var = jv0Var.b;
                    zm6Var.d = colorDrawable;
                    bn6 bn6Var = zm6Var.h;
                    if (bn6Var != null) {
                        ((View) bn6Var.c).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i;
        no3 no3VarC;
        ArrayList arrayList = this.a;
        no3 no3Var = no3.e;
        no3 no3VarA = no3Var;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            jv0 jv0Var = (jv0) arrayList.get(size);
            no3 no3Var2 = this.c;
            no3 no3Var3 = this.d;
            jv0Var.c = no3Var2;
            zm6 zm6Var = jv0Var.b;
            jv0Var.d = no3Var3;
            if (!zm6Var.b.equals(no3VarA)) {
                zm6Var.b = no3VarA;
                bn6 bn6Var = zm6Var.h;
                if (bn6Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bn6Var.b;
                    layoutParams.leftMargin = no3VarA.a;
                    layoutParams.topMargin = no3VarA.b;
                    layoutParams.rightMargin = no3VarA.c;
                    layoutParams.bottomMargin = no3VarA.d;
                    ((View) bn6Var.c).setLayoutParams(layoutParams);
                }
            }
            int i2 = jv0Var.a;
            if (i2 == 2) {
                i = jv0Var.c.b;
                int i3 = jv0Var.d.b;
                if (zm6Var.a != i3) {
                    zm6Var.a = i3;
                    bn6 bn6Var2 = zm6Var.h;
                    if (bn6Var2 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bn6Var2.b;
                        layoutParams2.height = i3;
                        ((View) bn6Var2.c).setLayoutParams(layoutParams2);
                    }
                }
                no3VarC = no3.c(0, i, 0, 0);
            } else if (i2 != 8) {
                no3VarC = no3Var;
                i = 0;
            } else {
                i = jv0Var.c.d;
                int i4 = jv0Var.d.d;
                if (zm6Var.a != i4) {
                    zm6Var.a = i4;
                    bn6 bn6Var3 = zm6Var.h;
                    if (bn6Var3 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) bn6Var3.b;
                        layoutParams3.height = i4;
                        ((View) bn6Var3.c).setLayoutParams(layoutParams3);
                    }
                }
                no3VarC = no3.c(0, 0, 0, i);
            }
            boolean z = i > 0;
            if (zm6Var.c != z) {
                zm6Var.c = z;
                bn6 bn6Var4 = zm6Var.h;
                if (bn6Var4 != null) {
                    ((View) bn6Var4.c).setVisibility(z ? 0 : 4);
                }
            }
            float f = 0.0f;
            jv0Var.a(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f = 1.0f;
            }
            jv0Var.b(f);
            no3VarA = no3.a(no3VarA, no3VarC);
        }
    }
}
