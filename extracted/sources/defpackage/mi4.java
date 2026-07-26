package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class mi4 extends AbstractMap {
    public transient Set a;
    public transient Set b;
    public transient fc4 c;

    public abstract Set a();

    public Set b() {
        return new ki4(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setB = b();
        this.b = setB;
        return setB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        fc4 fc4Var = this.c;
        if (fc4Var != null) {
            return fc4Var;
        }
        fc4 fc4Var2 = new fc4(this);
        this.c = fc4Var2;
        return fc4Var2;
    }
}
