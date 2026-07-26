package com.google.protobuf;

import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.u88;
import defpackage.v88;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Struct extends o implements fv4 {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile j26 PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.b;

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        o.registerDefaultInstance(Struct.class, struct);
    }

    private Struct() {
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Value> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    private MapFieldLite<String, Value> internalGetFields() {
        return this.fields_;
    }

    private MapFieldLite<String, Value> internalGetMutableFields() {
        MapFieldLite<String, Value> mapFieldLite = this.fields_;
        if (!mapFieldLite.a) {
            this.fields_ = mapFieldLite.c();
        }
        return this.fields_;
    }

    public static u88 newBuilder() {
        return (u88) DEFAULT_INSTANCE.createBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Struct) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Struct) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().containsKey(str);
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
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", v88.a});
            case 3:
                return new Struct();
            case 4:
                return new u88(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (Struct.class) {
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

    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    public int getFieldsCount() {
        return internalGetFields().size();
    }

    public Map<String, Value> getFieldsMap() {
        return DesugarCollections.unmodifiableMap(internalGetFields());
    }

    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        MapFieldLite<String, Value> mapFieldLiteInternalGetFields = internalGetFields();
        return mapFieldLiteInternalGetFields.containsKey(str) ? mapFieldLiteInternalGetFields.get(str) : value;
    }

    public Value getFieldsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Value> mapFieldLiteInternalGetFields = internalGetFields();
        if (mapFieldLiteInternalGetFields.containsKey(str)) {
            return mapFieldLiteInternalGetFields.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static u88 newBuilder(Struct struct) {
        return (u88) DEFAULT_INSTANCE.createBuilder(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Struct) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (Struct) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static Struct parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Struct) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Struct parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (Struct) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static Struct parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Struct) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Struct parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (Struct) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static Struct parseFrom(InputStream inputStream) throws IOException {
        return (Struct) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Struct) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Struct parseFrom(lu0 lu0Var) throws IOException {
        return (Struct) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static Struct parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (Struct) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
