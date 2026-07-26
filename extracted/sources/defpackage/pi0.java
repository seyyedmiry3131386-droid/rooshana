package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class pi0 {
    public final HashMap a = new HashMap();

    public pi0(t32 t32Var) {
        t32Var.l(this, false);
    }

    public final oi0 a(int i, String str) {
        return (oi0) this.a.get(new ni0(str, String.valueOf(i), null));
    }

    public final Boolean b(int i, String str) {
        oi0 oi0Var = (oi0) this.a.get(new ni0(str, String.valueOf(i), null));
        if (oi0Var != null) {
            return oi0Var.a;
        }
        return null;
    }

    public final Boolean c(String str, String str2, String str3) {
        oi0 oi0Var = (oi0) this.a.get(new ni0(str, str2, str3));
        if (oi0Var != null) {
            return oi0Var.a;
        }
        return null;
    }

    public final void d(String str, int i, Boolean bool, int i2, int i3) {
        HashMap map = this.a;
        if (map.size() > 100) {
            map.clear();
        }
        Boolean boolB = b(i, str);
        if (bool != null) {
            if (boolB != null) {
                if (boolB.booleanValue()) {
                    i2--;
                } else {
                    i3--;
                }
            }
            if (bool.booleanValue()) {
                i2++;
            } else {
                i3++;
            }
        }
        map.put(new ni0(str, String.valueOf(i), null), new oi0(bool, i2, i3));
    }

    public final void e(String str, String str2, String str3, Boolean bool) {
        HashMap map = this.a;
        if (map.size() > 100) {
            map.clear();
        }
        map.put(new ni0(str, str2, str3), new oi0(bool, 0, 0));
    }

    public void onEvent(w4 w4Var) {
        this.a.clear();
    }
}
