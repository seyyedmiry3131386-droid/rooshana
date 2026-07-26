package androidx.datastore.preferences.core;

import defpackage.eb1;
import defpackage.qp2;
import defpackage.xe2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class a implements eb1 {
    public final eb1 a;

    public a(eb1 eb1Var) {
        this.a = eb1Var;
    }

    @Override // defpackage.eb1
    public final Object a(qp2 qp2Var, ContinuationImpl continuationImpl) {
        return this.a.a(new PreferenceDataStore$updateData$2(qp2Var, null), continuationImpl);
    }

    @Override // defpackage.eb1
    public final xe2 b() {
        return this.a.b();
    }
}
