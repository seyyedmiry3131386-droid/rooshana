package defpackage;

import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class s38 implements rt8 {
    @Override // defpackage.rt8
    public final qt8 a(vv2 vv2Var, TypeToken typeToken) {
        if (typeToken.getRawType() != Timestamp.class) {
            return null;
        }
        vv2Var.getClass();
        return new t38(vv2Var.d(TypeToken.get(Date.class)));
    }
}
