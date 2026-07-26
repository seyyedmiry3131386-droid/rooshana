package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.ui.draw.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zf implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ zf(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        om0 om0Var;
        Object objA;
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.a.d() >> 32)) / 2.0f;
                return bVar.b(new ag(fIntBitsToFloat, tt3.s(bVar, fIntBitsToFloat), new tc0(5, this.b)));
            case 1:
                long j = this.b;
                zg0 zg0Var = (zg0) obj;
                dp2 dp2Var = zg0Var.b;
                if (dp2Var != null && (om0Var = zg0Var.a) != null) {
                    try {
                        objA = dp2Var.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        objA = kotlin.b.a(th);
                    }
                    om0Var.resumeWith(objA);
                    break;
                }
                return tx8.a;
            case 2:
                ((nn7) obj).a(an7.c, new zm7(Handle.a, this.b, SelectionHandleAnchor.b, true));
                return tx8.a;
            default:
                ((pb5) obj).e(ky2.b, Long.valueOf(this.b));
                return null;
        }
    }
}
