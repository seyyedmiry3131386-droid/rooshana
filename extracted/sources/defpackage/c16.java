package defpackage;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c16 extends b16 {
    public final /* synthetic */ int b;

    public /* synthetic */ c16(int i) {
        this.b = i;
    }

    @Override // defpackage.b16
    public final Object a(e16 e16Var) {
        switch (this.b) {
        }
        return null;
    }

    @Override // defpackage.b16
    public final Object b(x06 x06Var, ContinuationImpl continuationImpl) {
        switch (this.b) {
            case 0:
                return new z06(e(), null);
            default:
                return new z06(br9.B(d()), null);
        }
    }

    public abstract Object d();

    public abstract List e();
}
