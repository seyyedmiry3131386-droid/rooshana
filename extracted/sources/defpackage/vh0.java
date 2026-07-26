package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class vh0 extends gv {
    @Override // defpackage.gv
    public final List p(Executor executor) {
        return Arrays.asList(new kx0(), new wd1(executor));
    }

    @Override // defpackage.gv
    public final List q() {
        return Collections.singletonList(new uh0(1));
    }
}
