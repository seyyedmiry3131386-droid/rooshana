package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class fs2 extends yq2 {
    public final uk7 g;

    public fs2(uk7 uk7Var) {
        this.g = uk7Var;
    }

    public final b32 z0(es2 es2Var) {
        List listA = ((vk7) this.g).a(es2Var.a);
        String str = es2Var.b;
        js3.p(listA, "<this>");
        js3.p(str, "currentEpisodePlayId");
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            a.b0(((pk7) it.next()).c, arrayList);
        }
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (js3.i(((b32) it2.next()).b, str)) {
                break;
            }
            i++;
        }
        return (b32) a.q0(i + 1, arrayList);
    }
}
