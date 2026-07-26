package defpackage;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gv3 implements s12 {
    public static final ev3 f;
    public static final ev3 g;
    public final HashMap a;
    public final HashMap b;
    public final dv3 c;
    public boolean d;
    public static final dv3 e = new dv3(0);
    public static final fv3 h = new fv3();

    /* JADX WARN: Type inference failed for: r0v1, types: [ev3] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ev3] */
    static {
        final int i = 0;
        f = new y29() { // from class: ev3
            @Override // defpackage.p12
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((z29) obj2).b((String) obj);
                        break;
                    default:
                        ((z29) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new y29() { // from class: ev3
            @Override // defpackage.p12
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((z29) obj2).b((String) obj);
                        break;
                    default:
                        ((z29) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public gv3() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final s12 a(Class cls, uq5 uq5Var) {
        this.a.put(cls, uq5Var);
        this.b.remove(cls);
        return this;
    }
}
