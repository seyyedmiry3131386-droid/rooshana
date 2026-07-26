package defpackage;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public class st8 extends qt8 {
    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        mw3Var.c1();
        while (mw3Var.hasNext()) {
            try {
                arrayList.add(Integer.valueOf(mw3Var.nextInt()));
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }
        mw3Var.W0();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        uw3Var.c1();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            uw3Var.P(r6.get(i));
        }
        uw3Var.W0();
    }
}
