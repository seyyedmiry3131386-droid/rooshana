package defpackage;

import androidx.lifecycle.Lifecycle$State;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v79 implements x79, qd7, jx2 {
    public final /* synthetic */ qd7 a;
    public final /* synthetic */ u79 b;

    public v79(qd7 qd7Var, u79 u79Var) {
        this.b = u79Var;
        this.a = qd7Var;
        if (qd7Var.D().d != Lifecycle$State.b) {
            throw new IllegalArgumentException("The Lifecycle state is already beyond INITIALIZED. The ViewModelStoreNavEntryDecorator requires adding the SavedStateNavEntryDecorator to ensure support for SavedStateHandles.");
        }
        rq4.u(this);
    }

    @Override // defpackage.g64
    public final i64 D() {
        return this.a.D();
    }

    @Override // defpackage.jx2
    public final q79 h() {
        return new rd7();
    }

    @Override // defpackage.jx2
    public final ta5 i() {
        ta5 ta5Var = new ta5(0);
        sl3 sl3Var = rq4.b;
        LinkedHashMap linkedHashMap = ta5Var.a;
        linkedHashMap.put(sl3Var, this);
        linkedHashMap.put(rq4.c, this);
        return ta5Var;
    }

    @Override // defpackage.x79
    public final u79 m() {
        return this.b;
    }

    @Override // defpackage.qd7
    public final bn6 o() {
        return this.a.o();
    }
}
