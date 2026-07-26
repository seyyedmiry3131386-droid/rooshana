package defpackage;

import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class qw3 extends kw3 {
    public String i;
    public boolean j;

    @Override // defpackage.kw3
    public final kv3 I() {
        return new cw3((LinkedHashMap) this.h);
    }

    @Override // defpackage.kw3
    public final void L(String str, kv3 kv3Var) {
        js3.p(str, "key");
        js3.p(kv3Var, "element");
        if (!this.j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
            String str2 = this.i;
            if (str2 == null) {
                js3.V("tag");
                throw null;
            }
            linkedHashMap.put(str2, kv3Var);
            this.j = true;
            return;
        }
        if (kv3Var instanceof hw3) {
            this.i = ((hw3) kv3Var).a();
            this.j = false;
        } else {
            if (kv3Var instanceof cw3) {
                throw br9.h(fw3.b);
            }
            if (!(kv3Var instanceof uu3)) {
                throw new NoWhenBranchMatchedException();
            }
            throw br9.h(xu3.b);
        }
    }
}
