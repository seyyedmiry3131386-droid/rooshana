package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class dn2 {
    public static final in2 a = new in2();
    public static final kn2 b;

    static {
        kn2 kn2Var = null;
        try {
            kn2Var = (kn2) pn2.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = kn2Var;
    }

    public static final void a(int i, ArrayList arrayList) {
        js3.p(arrayList, "views");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
