package defpackage;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rd8 extends mu0 {
    public final HashMap c;
    public final /* synthetic */ sd8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd8(sd8 sd8Var) {
        super(0);
        this.d = sd8Var;
        this.c = new HashMap();
    }

    @Override // defpackage.mu0
    public final void g(ue9 ue9Var) {
        ArrayList arrayList = this.d.b;
        if ((ue9Var.a.d() & 519) != 0) {
            this.c.remove(ue9Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                an6 an6Var = (an6) arrayList.get(size);
                int i = an6Var.e;
                boolean z = i > 0;
                int i2 = i - 1;
                an6Var.e = i2;
                if (z && i2 == 0) {
                    an6Var.c();
                }
            }
        }
    }

    @Override // defpackage.mu0
    public final void h(ue9 ue9Var) {
        ArrayList arrayList = this.d.b;
        if ((ue9Var.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((an6) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.mu0
    public final lf9 i(lf9 lf9Var, List list) {
        ArrayList arrayList = this.d.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            ue9 ue9Var = (ue9) list.get(size);
            Integer num = (Integer) this.c.get(ue9Var);
            if (num != null) {
                int iIntValue = num.intValue();
                float fA = ue9Var.a.a();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fA;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fA;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fA;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fA;
                }
                i |= iIntValue;
            }
        }
        no3 no3VarB = no3.b(lf9Var.a.g(519), lf9Var.a.g(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            an6 an6Var = (an6) arrayList.get(size2);
            no3 no3Var = an6Var.d;
            ArrayList arrayList2 = an6Var.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                jv0 jv0Var = (jv0) arrayList2.get(size3);
                int i2 = jv0Var.a;
                if ((i2 & i) != 0) {
                    zm6 zm6Var = jv0Var.b;
                    if (!zm6Var.c) {
                        zm6Var.c = true;
                        bn6 bn6Var = zm6Var.h;
                        if (bn6Var != null) {
                            ((View) bn6Var.c).setVisibility(0);
                        }
                    }
                    if (i2 == 2) {
                        int i3 = no3Var.b;
                        if (i3 > 0) {
                            jv0Var.b(no3VarB.b / i3);
                        }
                        jv0Var.a(rectF.top);
                    } else if (i2 == 8) {
                        int i4 = no3Var.d;
                        if (i4 > 0) {
                            jv0Var.b(no3VarB.d / i4);
                        }
                        jv0Var.a(rectF.bottom);
                    }
                }
            }
        }
        return lf9Var;
    }

    @Override // defpackage.mu0
    public final rn6 j(ue9 ue9Var, rn6 rn6Var) {
        if ((ue9Var.a.d() & 519) != 0) {
            no3 no3Var = (no3) rn6Var.c;
            no3 no3Var2 = (no3) rn6Var.b;
            int i = no3Var.a != no3Var2.a ? 1 : 0;
            if (no3Var.b != no3Var2.b) {
                i |= 2;
            }
            if (no3Var.c != no3Var2.c) {
                i |= 4;
            }
            if (no3Var.d != no3Var2.d) {
                i |= 8;
            }
            this.c.put(ue9Var, Integer.valueOf(i));
        }
        return rn6Var;
    }
}
