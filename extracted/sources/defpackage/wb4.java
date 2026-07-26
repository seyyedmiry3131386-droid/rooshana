package defpackage;

import com.google.common.cache.b;
import java.util.AbstractQueue;

/* JADX INFO: loaded from: classes.dex */
public final class wb4 extends i2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractQueue c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb4(AbstractQueue abstractQueue, c27 c27Var, int i) {
        super(c27Var);
        this.b = i;
        this.c = abstractQueue;
    }

    @Override // defpackage.i2
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                c27 c27VarO = ((c27) obj).o();
                if (c27VarO == ((vb4) ((b) this.c).b)) {
                    return null;
                }
                return c27VarO;
            default:
                c27 c27VarL = ((c27) obj).l();
                if (c27VarL == ((vb4) ((b) this.c).b)) {
                    return null;
                }
                return c27VarL;
        }
    }
}
