package defpackage;

import com.google.gson.reflect.TypeToken;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class be1 implements rt8 {
    @Override // defpackage.rt8
    public final qt8 a(vv2 vv2Var, TypeToken typeToken) {
        if (typeToken.getRawType() == Date.class) {
            return new ce1();
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
