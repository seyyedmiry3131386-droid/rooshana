package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class t38 extends qt8 {
    public static final s38 b = new s38();
    public final qt8 a;

    public t38(qt8 qt8Var) {
        this.a = qt8Var;
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) {
        Date date = (Date) this.a.b(mw3Var);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) {
        this.a.c(uw3Var, (Timestamp) obj);
    }
}
