package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y56 extends t2 implements xj3 {
    public final /* synthetic */ int a;
    public final l56 b;

    public /* synthetic */ y56(l56 l56Var, int i) {
        this.a = i;
        this.b = l56Var;
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
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    l56 l56Var = this.b;
                    Object obj2 = l56Var.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && l56Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                ps8 ps8Var = this.b.a;
                qs8[] qs8VarArr = new qs8[8];
                for (int i = 0; i < 8; i++) {
                    qs8VarArr[i] = new ss8(0);
                }
                return new a66(ps8Var, qs8VarArr);
            default:
                ps8 ps8Var2 = this.b.a;
                qs8[] qs8VarArr2 = new qs8[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    qs8VarArr2[i2] = new ss8(1);
                }
                return new a66(ps8Var2, qs8VarArr2);
        }
    }
}
