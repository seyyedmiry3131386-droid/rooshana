package com.google.protobuf;

import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.rr3;
import defpackage.z1;
import defpackage.za2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FieldMask extends o implements fv4 {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private rr3 paths_ = o.emptyProtobufList();

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        o.registerDefaultInstance(FieldMask.class, fieldMask);
    }

    private FieldMask() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaths(Iterable<String> iterable) {
        ensurePathsIsMutable();
        a.addAll((Iterable) iterable, (List) this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaths(String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPathsBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        ensurePathsIsMutable();
        this.paths_.add(byteString.w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaths() {
        this.paths_ = o.emptyProtobufList();
    }

    private void ensurePathsIsMutable() {
        rr3 rr3Var = this.paths_;
        if (((z1) rr3Var).a) {
            return;
        }
        this.paths_ = o.mutableCopy(rr3Var);
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static za2 newBuilder() {
        return (za2) DEFAULT_INSTANCE.createBuilder();
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FieldMask) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FieldMask) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaths(int i, String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.set(i, str);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (generatedMessageLite$MethodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 3:
                return new FieldMask();
            case 4:
                return new za2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (FieldMask.class) {
                    try {
                        fr2Var = PARSER;
                        if (fr2Var == null) {
                            fr2Var = new fr2();
                            PARSER = fr2Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return fr2Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getPaths(int i) {
        return (String) this.paths_.get(i);
    }

    public ByteString getPathsBytes(int i) {
        return ByteString.i((String) this.paths_.get(i));
    }

    public int getPathsCount() {
        return this.paths_.size();
    }

    public List<String> getPathsList() {
        return this.paths_;
    }

    public static za2 newBuilder(FieldMask fieldMask) {
        return (za2) DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (FieldMask) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (FieldMask) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static FieldMask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FieldMask) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FieldMask parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (FieldMask) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static FieldMask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FieldMask) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FieldMask parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (FieldMask) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static FieldMask parseFrom(InputStream inputStream) throws IOException {
        return (FieldMask) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (FieldMask) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static FieldMask parseFrom(lu0 lu0Var) throws IOException {
        return (FieldMask) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static FieldMask parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (FieldMask) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
