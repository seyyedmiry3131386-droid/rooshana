package defpackage;

import androidx.room.coroutines.b;
import androidx.room.coroutines.e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class p26 implements gv6, vh6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p26(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gv6
    public final mb7 c() {
        switch (this.a) {
            case 0:
                return ((b) this.b).b;
            default:
                return ((e) this.b).b;
        }
    }

    @Override // defpackage.vh6
    public final Object d(String str, dp2 dp2Var, ContinuationImpl continuationImpl) {
        switch (this.a) {
            case 0:
                return ((b) this.b).d(str, dp2Var, continuationImpl);
            default:
                return ((e) this.b).d(str, dp2Var, continuationImpl);
        }
    }
}
