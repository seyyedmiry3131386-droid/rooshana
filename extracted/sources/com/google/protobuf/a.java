package com.google.protobuf;

import com.google.protobuf.ByteString;
import defpackage.ev4;
import defpackage.gf7;
import defpackage.k1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements ev4 {
    protected int memoizedHashCode;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        k1.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (!byteString.n()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract int getSerializedSize(gf7 gf7Var);

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = j.j;
            h hVar = new h(bArr, serializedSize);
            writeTo(hVar);
            if (hVar.D0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(a("byte array"), e);
        }
    }

    public ByteString toByteString() {
        try {
            int serializedSize = getSerializedSize();
            ByteString byteString = ByteString.b;
            byte[] bArr = new byte[serializedSize];
            Logger logger = j.j;
            h hVar = new h(bArr, serializedSize);
            writeTo(hVar);
            if (hVar.D0() == 0) {
                return new ByteString.LiteralByteString(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(a("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iE0 = j.e0(serializedSize) + serializedSize;
        if (iE0 > 4096) {
            iE0 = 4096;
        }
        i iVar = new i(outputStream, iE0);
        iVar.A0(serializedSize);
        writeTo(iVar);
        if (iVar.n > 0) {
            iVar.I0();
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = j.j;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        i iVar = new i(outputStream, serializedSize);
        writeTo(iVar);
        if (iVar.n > 0) {
            iVar.I0();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        k1.addAll((Iterable) iterable, (List) list);
    }
}
