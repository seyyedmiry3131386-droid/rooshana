package defpackage;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class tu8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) {
        try {
            return new AtomicInteger(mw3Var.nextInt());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        uw3Var.P(((AtomicInteger) obj).get());
    }
}
