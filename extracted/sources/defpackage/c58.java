package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c58 implements Map.Entry, fx3 {
    public final Object a;
    public Object b;
    public final /* synthetic */ d58 c;

    public c58(d58 d58Var) {
        this.c = d58Var;
        Map.Entry entry = d58Var.d;
        js3.m(entry);
        this.a = entry.getKey();
        Map.Entry entry2 = d58Var.d;
        js3.m(entry2);
        this.b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        d58 d58Var = this.c;
        if (d58Var.a.f().d != d58Var.c) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.b;
        d58Var.a.put(this.a, obj);
        this.b = obj;
        return obj2;
    }
}
