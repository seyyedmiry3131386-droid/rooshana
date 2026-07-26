package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class hj4 extends o {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ hj4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.o
    public final int a() {
        switch (this.a) {
            case 0:
                return ((ij4) this.b).a.groupCount() + 1;
            case 1:
                return ((k56) this.b).c();
            case 2:
                return ((l56) this.b).c();
            default:
                return ((h66) this.b).c();
        }
    }

    public fj4 c(int i) {
        Matcher matcher = ((ij4) this.b).a;
        uq3 uq3VarZ = ok4.Z(matcher.start(i), matcher.end(i));
        if (uq3VarZ.a < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        js3.o(strGroup, "group(...)");
        return new fj4(strGroup, uq3VarZ);
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj == null ? true : obj instanceof fj4) {
                    return super.contains((fj4) obj);
                }
                return false;
            case 1:
                return ((k56) this.b).containsValue(obj);
            case 2:
                return ((l56) this.b).containsValue(obj);
            default:
                return ((h66) this.b).containsValue(obj);
        }
    }

    @Override // defpackage.o, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new uq8(new vq8(a.e0(br9.x(this)), new m22(18, this)));
            case 1:
                os8 os8Var = ((k56) this.b).a;
                js3.p(os8Var, "node");
                qs8[] qs8VarArr = new qs8[8];
                for (int i = 0; i < 8; i++) {
                    qs8VarArr[i] = new rs8(2);
                }
                return new z56(os8Var, qs8VarArr);
            case 2:
                ps8 ps8Var = ((l56) this.b).a;
                qs8[] qs8VarArr2 = new qs8[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    qs8VarArr2[i2] = new ss8(2);
                }
                return new a66(ps8Var, qs8VarArr2);
            default:
                return new m66((h66) this.b, 2);
        }
    }
}
