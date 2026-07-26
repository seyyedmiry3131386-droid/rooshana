package kotlinx.coroutines.flow;

import defpackage.ia8;
import defpackage.su7;
import defpackage.vb7;
import defpackage.xe2;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements su7 {
    @Override // defpackage.su7
    public final xe2 a(ia8 ia8Var) {
        return new vb7(new StartedLazily$command$1(ia8Var, null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
