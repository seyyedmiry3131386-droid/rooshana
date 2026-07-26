package androidx.compose.foundation.lazy.layout;

import defpackage.xk;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class ItemFoundInScroll extends CancellationException {
    public final int a;
    public final xk b;

    public ItemFoundInScroll(int i, xk xkVar) {
        this.a = i;
        this.b = xkVar;
    }
}
