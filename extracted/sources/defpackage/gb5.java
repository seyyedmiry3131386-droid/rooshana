package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class gb5 extends eh4 implements fx3 {
    public final t56 d;
    public Object e;

    public gb5(t56 t56Var, Object obj, Object obj2) {
        super(obj, obj2, 0);
        this.d = t56Var;
        this.e = obj2;
    }

    @Override // defpackage.eh4, java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // defpackage.eh4, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        q56 q56Var = (q56) this.d.b;
        o56 o56Var = q56Var.e;
        Object obj3 = this.b;
        if (!o56Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = q56Var.c;
        if (!z) {
            o56Var.put(obj3, obj);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            qs8 qs8Var = ((qs8[]) q56Var.d)[q56Var.b];
            Object obj4 = qs8Var.b[qs8Var.d];
            o56Var.put(obj3, obj);
            q56Var.e(obj4 != null ? obj4.hashCode() : 0, o56Var.c, obj4, 0);
        }
        q56Var.h = o56Var.e;
        return obj2;
    }
}
