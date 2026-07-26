package defpackage;

import androidx.fragment.app.d;
import androidx.fragment.app.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class yl2 extends k79 {
    public static final xl2 h = new xl2(0);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public yl2(boolean z) {
        this.e = z;
    }

    @Override // defpackage.k79
    public final void d() {
        if (g.N(3)) {
            toString();
        }
        this.f = true;
    }

    public final void e(d dVar) {
        if (this.g) {
            return;
        }
        String str = dVar.f;
        HashMap map = this.b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(dVar.f, dVar);
        if (g.N(2)) {
            dVar.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yl2.class == obj.getClass()) {
            yl2 yl2Var = (yl2) obj;
            if (this.b.equals(yl2Var.b) && this.c.equals(yl2Var.c) && this.d.equals(yl2Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str, boolean z) {
        HashMap map = this.c;
        yl2 yl2Var = (yl2) map.get(str);
        if (yl2Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(yl2Var.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    yl2Var.f((String) it.next(), true);
                }
            }
            yl2Var.d();
            map.remove(str);
        }
        HashMap map2 = this.d;
        u79 u79Var = (u79) map2.get(str);
        if (u79Var != null) {
            u79Var.a();
            map2.remove(str);
        }
    }

    public final void g(d dVar) {
        if (this.g || this.b.remove(dVar.f) == null || !g.N(2)) {
            return;
        }
        dVar.toString();
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
