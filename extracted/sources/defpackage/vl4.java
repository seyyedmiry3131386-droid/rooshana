package defpackage;

import android.os.Build;
import android.os.Bundle;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class vl4 extends dm4 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ r79 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl4(String str, r79 r79Var) {
        super(str);
        this.e = r79Var;
    }

    @Override // defpackage.dm4
    public final void a() {
        switch (this.d) {
            case 0:
                this.e.w(Build.VERSION.SDK_INT >= 24 ? null : Collections.EMPTY_LIST);
                break;
            default:
                this.e.w(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl4(zl4 zl4Var, String str, r79 r79Var, Bundle bundle) {
        super(str);
        this.e = r79Var;
    }
}
