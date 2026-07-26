package defpackage;

import com.google.gson.Strictness;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class lv3 {
    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            uw3 uw3Var = new uw3(new q78(sb));
            uw3Var.h = Strictness.a;
            vu8.z.getClass();
            pv3.e(uw3Var, this);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
