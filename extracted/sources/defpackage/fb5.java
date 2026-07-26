package defpackage;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class fb5 extends eh4 implements fx3 {
    public final /* synthetic */ int d = 1;
    public final Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb5(Map map, Object obj, h84 h84Var) {
        super(obj, h84Var.a, 1);
        js3.p(map, "mutableMap");
        this.e = map;
        this.f = h84Var;
    }

    @Override // defpackage.eh4, java.util.Map.Entry
    public final Object getValue() {
        switch (this.d) {
            case 0:
                return this.f;
            default:
                return ((h84) this.f).a;
        }
    }

    @Override // defpackage.eh4, java.util.Map.Entry
    public final Object setValue(Object obj) {
        switch (this.d) {
            case 0:
                Object obj2 = this.f;
                this.f = obj;
                p56 p56Var = (p56) ((t56) this.e).b;
                n56 n56Var = p56Var.e;
                Object obj3 = this.b;
                if (n56Var.containsKey(obj3)) {
                    boolean z = p56Var.c;
                    if (!z) {
                        n56Var.put(obj3, obj);
                    } else {
                        if (!z) {
                            throw new NoSuchElementException();
                        }
                        qs8 qs8Var = ((qs8[]) p56Var.d)[p56Var.b];
                        Object obj4 = qs8Var.b[qs8Var.d];
                        n56Var.put(obj3, obj);
                        p56Var.e(obj4 != null ? obj4.hashCode() : 0, n56Var.c, obj4, 0, 0, false);
                    }
                    p56Var.h = n56Var.e;
                }
                return obj2;
            default:
                h84 h84Var = (h84) this.f;
                Object obj5 = h84Var.a;
                h84 h84Var2 = new h84(obj, h84Var.b, h84Var.c);
                this.f = h84Var2;
                ((Map) this.e).put(this.b, h84Var2);
                return obj5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb5(t56 t56Var, Object obj, Object obj2) {
        super(obj, obj2, 1);
        js3.p(t56Var, "parentIterator");
        this.e = t56Var;
        this.f = obj2;
    }
}
