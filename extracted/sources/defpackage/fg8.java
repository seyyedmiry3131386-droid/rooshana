package defpackage;

import android.app.RemoteAction;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg8 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fg8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                return u96.f((RemoteAction) this.b, (qz0) obj);
            case 1:
                return new rq3((((long) ((ab0) this.b).a(0, (int) (((zq3) obj).a >> 32), (LayoutDirection) obj2)) << 32) | (((long) 0) & 4294967295L));
            case 2:
                return new rq3((((long) ((bb0) this.b).a(0, (int) (((zq3) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            default:
                return new rq3(((qd) this.b).a(0L, ((zq3) obj).a, (LayoutDirection) obj2));
        }
    }
}
