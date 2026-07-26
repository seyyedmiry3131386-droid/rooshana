package org.junit.internal;

import defpackage.ck4;
import defpackage.dn7;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class AssumptionViolatedException extends RuntimeException implements dn7 {
    private static final long serialVersionUID = 2;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("fAssumption", (Object) null);
        putFieldPutFields.put("fValueMatcher", false);
        putFieldPutFields.put("fMatcher", (Object) null);
        putFieldPutFields.put("fValue", (Object) null);
        objectOutputStream.writeFields();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return ck4.A(this);
    }

    @Override // defpackage.dn7
    public final void a(ck4 ck4Var) {
    }
}
