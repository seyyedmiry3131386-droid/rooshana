package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.b;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ki5 implements bp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ li5 b;
    public final /* synthetic */ ei5 c;

    public /* synthetic */ ki5(li5 li5Var, ei5 ei5Var) {
        this.b = li5Var;
        this.c = ei5Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                li5 li5Var = this.b;
                ei5 ei5Var = this.c;
                js3.p(ei5Var, "entry");
                l lVar = li5Var.c;
                Set set = (Set) lVar.getValue();
                js3.p(set, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet(b.L(set.size()));
                boolean z = false;
                for (Object obj : set) {
                    boolean z2 = true;
                    if (!z && js3.i(obj, ei5Var)) {
                        z = true;
                        z2 = false;
                    }
                    if (z2) {
                        linkedHashSet.add(obj);
                    }
                }
                lVar.p(null, linkedHashSet);
                break;
            default:
                li5 li5Var2 = this.b;
                ei5 ei5Var2 = this.c;
                synchronized (li5Var2.a) {
                    try {
                        l lVar2 = li5Var2.b;
                        Iterable iterable = (Iterable) lVar2.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (js3.i((ei5) obj2, ei5Var2)) {
                                lVar2.getClass();
                                lVar2.p(null, arrayList);
                            } else {
                                arrayList.add(obj2);
                            }
                            break;
                        }
                        lVar2.getClass();
                        lVar2.p(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ ki5(li5 li5Var, ei5 ei5Var, boolean z) {
        this.b = li5Var;
        this.c = ei5Var;
    }
}
