package ir.mservices.market.pika.common.model;

import defpackage.js3;
import defpackage.yd1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ByteArrayWrapper implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_SERIALISED_NAME = "a";
    public static final String WRAPPED_DATA_SERIALISED_NAME = "b";
    public static final long serialVersionUID = 6143918688124281825L;
    private final int a;
    private final byte[] b;
    private int type;
    private byte[] wrappedData;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    public ByteArrayWrapper(int i, byte[] bArr) {
        js3.p(bArr, "wrappedData");
        this.type = i;
        this.wrappedData = bArr;
        this.a = -1;
        this.b = new byte[0];
    }

    private final void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        ObjectInputStream.GetField fields = objectInputStream.readFields();
        this.type = fields.get("a", -1);
        Object obj = fields.get("b", new byte[0]);
        js3.n(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        this.wrappedData = (byte[]) obj;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        js3.o(putFieldPutFields, "putFields(...)");
        putFieldPutFields.put("a", this.type);
        putFieldPutFields.put("b", this.wrappedData);
        objectOutputStream.writeFields();
    }

    public final int getA() {
        return this.a;
    }

    public final byte[] getB() {
        return this.b;
    }

    public final int getType() {
        return this.type;
    }

    public final byte[] getWrappedData() {
        return this.wrappedData;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setWrappedData(byte[] bArr) {
        js3.p(bArr, "<set-?>");
        this.wrappedData = bArr;
    }
}
