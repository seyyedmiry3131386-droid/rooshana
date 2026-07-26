package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class d39 extends d77 {
    public final /* synthetic */ int f;

    @Override // defpackage.d77
    public final int b(Method method) {
        switch (this.f) {
            case 0:
                return 0;
            default:
                if (method.isVarArgs()) {
                    return method.getParameterTypes().length - 1;
                }
                return 0;
        }
    }

    @Override // defpackage.d77
    public final boolean d(Method method) {
        switch (this.f) {
            case 0:
                return false;
            default:
                return method.isVarArgs();
        }
    }
}
