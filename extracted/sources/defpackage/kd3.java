package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class kd3 extends u2 {
    public final kd3 e;
    public ArrayList f;

    public kd3(String str, int i, Map map, kd3 kd3Var) {
        super(str, i, map);
        this.e = kd3Var;
    }

    @Override // defpackage.u2
    public final Map f() {
        return (Map) this.d;
    }

    @Override // defpackage.u2
    public final boolean l() {
        return true;
    }

    public final void n(int i) {
        if (m()) {
            return;
        }
        this.b = i;
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((kd3) it.next()).n(i);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockImpl{name='");
        sb.append((String) this.c);
        sb.append("', start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", attributes=");
        sb.append((Map) this.d);
        sb.append(", parent=");
        kd3 kd3Var = this.e;
        sb.append(kd3Var != null ? (String) kd3Var.c : null);
        sb.append(", children=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.u2
    public final kd3 j() {
        return this;
    }
}
