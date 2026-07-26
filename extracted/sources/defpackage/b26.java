package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import org.koin.core.error.NoParameterFoundException;

/* JADX INFO: loaded from: classes3.dex */
public class b26 {
    public final List a;
    public int b;

    public b26(int i, ArrayList arrayList) {
        this.a = (i & 1) != 0 ? new ArrayList() : arrayList;
    }

    public Object a(int i, ps0 ps0Var) throws NoParameterFoundException {
        List list = this.a;
        if (i < list.size()) {
            return list.get(i);
        }
        String str = "Can't get injected parameter #" + i + " from " + this + " for type '" + ax3.a(ps0Var) + '\'';
        js3.p(str, "msg");
        throw new NoParameterFoundException(str);
    }

    public Object b(ps0 ps0Var) {
        Object next;
        List list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        int i = this.b;
        List list2 = this.a;
        Object obj = list2.get(i);
        if (!ps0Var.e(obj)) {
            obj = null;
        }
        Object obj2 = obj != null ? obj : null;
        if (obj2 != null && this.b < br9.y(list2)) {
            this.b++;
        }
        if (obj2 != null) {
            return obj2;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (ps0Var.e(next)) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        return next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b26) {
            return js3.i(this.a, ((b26) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + a.P0(this.a);
    }
}
