package defpackage;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r16 extends m91 {
    public final /* synthetic */ int n;
    public final /* synthetic */ m91 o;

    public /* synthetic */ r16(m91 m91Var, int i) {
        this.n = i;
        this.o = m91Var;
    }

    @Override // defpackage.m91
    public final void g(e57 e57Var, Object obj) {
        switch (this.n) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.o.g(e57Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.o.g(e57Var, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
