package com.google.protobuf;

import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.l94;
import defpackage.lu0;
import defpackage.rr3;
import defpackage.z1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ListValue extends o implements fv4 {
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile j26 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private rr3 values_ = o.emptyProtobufList();

    static {
        ListValue listValue = new ListValue();
        DEFAULT_INSTANCE = listValue;
        o.registerDefaultInstance(ListValue.class, listValue);
    }

    private ListValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends Value> iterable) {
        ensureValuesIsMutable();
        a.addAll((Iterable) iterable, (List) this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = o.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        rr3 rr3Var = this.values_;
        if (((z1) rr3Var).a) {
            return;
        }
        this.values_ = o.mutableCopy(rr3Var);
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l94 newBuilder() {
        return (l94) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListValue) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListValue) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int i) {
        ensureValuesIsMutable();
        this.values_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(i, value);
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
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 3:
                return new ListValue();
            case 4:
                return new l94(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (ListValue.class) {
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

    public Value getValues(int i) {
        return (Value) this.values_.get(i);
    }

    public int getValuesCount() {
        return this.values_.size();
    }

    public List<Value> getValuesList() {
        return this.values_;
    }

    public b0 getValuesOrBuilder(int i) {
        return (b0) this.values_.get(i);
    }

    public List<? extends b0> getValuesOrBuilderList() {
        return this.values_;
    }

    public static l94 newBuilder(ListValue listValue) {
        return (l94) DEFAULT_INSTANCE.createBuilder(listValue);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (ListValue) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (ListValue) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static ListValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListValue) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(i, value);
    }

    public static ListValue parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (ListValue) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static ListValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListValue) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListValue parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (ListValue) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static ListValue parseFrom(InputStream inputStream) throws IOException {
        return (ListValue) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (ListValue) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static ListValue parseFrom(lu0 lu0Var) throws IOException {
        return (ListValue) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static ListValue parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (ListValue) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
