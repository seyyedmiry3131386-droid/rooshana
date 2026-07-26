package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wr8 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public wr8(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wr8)) {
            return false;
        }
        wr8 wr8Var = (wr8) obj;
        return this.b == wr8Var.b && this.a.equals(wr8Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbE = bl4.E("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbE.append(this.b);
        sbE.append("\n");
        String strI = t61.i(sbE.toString(), "    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strI = strI + "    " + str + ": " + map.get(str) + "\n";
        }
        return strI;
    }
}
