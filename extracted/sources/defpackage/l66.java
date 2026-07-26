package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l66 extends t2 implements wj3 {
    public final /* synthetic */ int a;
    public final h66 b;

    public /* synthetic */ l66(h66 h66Var, int i) {
        this.a = i;
        this.b = h66Var;
    }

    @Override // defpackage.o
    public final int a() {
        switch (this.a) {
        }
        return this.b.c();
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                h66 h66Var = this.b;
                js3.p(h66Var, "map");
                Object obj2 = h66Var.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && h66Var.containsKey(entry.getKey());
            default:
                return this.b.c.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new m66(this.b, 0);
            default:
                return new m66(this.b, 1);
        }
    }
}
