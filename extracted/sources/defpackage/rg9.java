package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg9 implements m64, zp2 {
    public final /* synthetic */ d01 a;

    public rg9(d01 d01Var) {
        this.a = d01Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof m64) && (obj instanceof zp2)) {
            return getFunctionDelegate().equals(((zp2) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zp2
    public final np2 getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, d01.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
