package defpackage;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final class mj3 extends p0 {
    public final ImmutableList c;

    public mj3(int i, ImmutableList immutableList) {
        super(immutableList.size(), i);
        this.c = immutableList;
    }

    @Override // defpackage.p0
    public final Object a(int i) {
        return this.c.get(i);
    }
}
