package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class f81 implements Iterable {
    public final /* synthetic */ int a;
    public final Serializable b;

    public /* synthetic */ f81(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new e81(this);
            default:
                return ((ArrayList) this.b).iterator();
        }
    }
}
