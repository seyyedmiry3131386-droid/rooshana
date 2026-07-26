package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class x56 extends t2 implements wj3 {
    public final /* synthetic */ int a;
    public final k56 b;

    public /* synthetic */ x56(k56 k56Var, int i) {
        this.a = i;
        this.b = k56Var;
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
                k56 k56Var = this.b;
                js3.p(k56Var, "map");
                Object obj2 = k56Var.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && k56Var.containsKey(entry.getKey());
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                os8 os8Var = this.b.a;
                js3.p(os8Var, "node");
                qs8[] qs8VarArr = new qs8[8];
                for (int i = 0; i < 8; i++) {
                    qs8VarArr[i] = new rs8(0);
                }
                return new z56(os8Var, qs8VarArr);
            default:
                os8 os8Var2 = this.b.a;
                js3.p(os8Var2, "node");
                qs8[] qs8VarArr2 = new qs8[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    qs8VarArr2[i2] = new rs8(1);
                }
                return new z56(os8Var2, qs8VarArr2);
        }
    }
}
