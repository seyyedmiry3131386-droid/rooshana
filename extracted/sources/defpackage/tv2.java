package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class tv2 extends qt8 {
    public static final fq5 c = new fq5(0, new tv2(2, ToNumberPolicy.b));
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ tv2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        switch (this.a) {
            case 0:
                return new AtomicLong(((Number) ((qt8) this.b).b(mw3Var)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                mw3Var.c1();
                while (mw3Var.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) ((qt8) this.b).b(mw3Var)).longValue()));
                }
                mw3Var.W0();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            default:
                JsonToken jsonTokenR = mw3Var.R();
                int iOrdinal = jsonTokenR.ordinal();
                if (iOrdinal == 5 || iOrdinal == 6) {
                    return ((om8) this.b).a(mw3Var);
                }
                if (iOrdinal == 8) {
                    mw3Var.J();
                    return null;
                }
                throw new JsonSyntaxException("Expecting number, got: " + jsonTokenR + "; at path " + mw3Var.k(false));
        }
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                ((qt8) this.b).c(uw3Var, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                uw3Var.c1();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    ((qt8) this.b).c(uw3Var, Long.valueOf(atomicLongArray.get(i)));
                }
                uw3Var.W0();
                break;
            default:
                uw3Var.R((Number) obj);
                break;
        }
    }
}
