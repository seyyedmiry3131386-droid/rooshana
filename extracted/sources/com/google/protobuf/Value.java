package com.google.protobuf;

import defpackage.fr2;
import defpackage.h72;
import defpackage.j26;
import defpackage.l94;
import defpackage.lu0;
import defpackage.u88;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Value extends o implements b0 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile j26 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class KindCase {
        public static final KindCase a;
        public static final KindCase b;
        public static final KindCase c;
        public static final KindCase d;
        public static final KindCase e;
        public static final KindCase f;
        public static final KindCase g;
        public static final /* synthetic */ KindCase[] h;

        static {
            KindCase kindCase = new KindCase("NULL_VALUE", 0);
            a = kindCase;
            KindCase kindCase2 = new KindCase("NUMBER_VALUE", 1);
            b = kindCase2;
            KindCase kindCase3 = new KindCase("STRING_VALUE", 2);
            c = kindCase3;
            KindCase kindCase4 = new KindCase("BOOL_VALUE", 3);
            d = kindCase4;
            KindCase kindCase5 = new KindCase("STRUCT_VALUE", 4);
            e = kindCase5;
            KindCase kindCase6 = new KindCase("LIST_VALUE", 5);
            f = kindCase6;
            KindCase kindCase7 = new KindCase("KIND_NOT_SET", 6);
            g = kindCase7;
            h = new KindCase[]{kindCase, kindCase2, kindCase3, kindCase4, kindCase5, kindCase6, kindCase7};
        }

        public static KindCase valueOf(String str) {
            return (KindCase) java.lang.Enum.valueOf(KindCase.class, str);
        }

        public static KindCase[] values() {
            return (KindCase[]) h.clone();
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        o.registerDefaultInstance(Value.class, value);
    }

    private Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListValue(ListValue listValue) {
        listValue.getClass();
        if (this.kindCase_ != 6 || this.kind_ == ListValue.getDefaultInstance()) {
            this.kind_ = listValue;
        } else {
            this.kind_ = ((l94) ListValue.newBuilder((ListValue) this.kind_).mergeFrom((o) listValue)).buildPartial();
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructValue(Struct struct) {
        struct.getClass();
        if (this.kindCase_ != 5 || this.kind_ == Struct.getDefaultInstance()) {
            this.kind_ = struct;
        } else {
            this.kind_ = ((u88) Struct.newBuilder((Struct) this.kind_).mergeFrom((o) struct)).buildPartial();
        }
        this.kindCase_ = 5;
    }

    public static a0 newBuilder() {
        return (a0) DEFAULT_INSTANCE.createBuilder();
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Value) o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean z) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListValue(ListValue listValue) {
        listValue.getClass();
        this.kind_ = listValue;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(NullValue nullValue) {
        this.kind_ = Integer.valueOf(nullValue.getNumber());
        this.kindCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValueValue(int i) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberValue(double d) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.kind_ = byteString.w();
        this.kindCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructValue(Struct struct) {
        struct.getClass();
        this.kind_ = struct;
        this.kindCase_ = 5;
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
                return o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 3:
                return new Value();
            case 4:
                return new a0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (Value.class) {
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

    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    public KindCase getKindCase() {
        switch (this.kindCase_) {
            case 0:
                return KindCase.g;
            case 1:
                return KindCase.a;
            case 2:
                return KindCase.b;
            case 3:
                return KindCase.c;
            case 4:
                return KindCase.d;
            case 5:
                return KindCase.e;
            case 6:
                return KindCase.f;
            default:
                return null;
        }
    }

    public ListValue getListValue() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    public NullValue getNullValue() {
        int i = this.kindCase_;
        NullValue nullValue = NullValue.NULL_VALUE;
        if (i == 1) {
            if (((Integer) this.kind_).intValue() != 0) {
                nullValue = null;
            }
            if (nullValue == null) {
                return NullValue.UNRECOGNIZED;
            }
        }
        return nullValue;
    }

    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    public String getStringValue() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    public ByteString getStringValueBytes() {
        return ByteString.i(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    public Struct getStructValue() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public static a0 newBuilder(Value value) {
        return (a0) DEFAULT_INSTANCE.createBuilder(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Value) o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        return (Value) o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Value) o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Value parseFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        return (Value) o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Value) o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Value parseFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return (Value) o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, h72 h72Var) throws IOException {
        return (Value) o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static Value parseFrom(lu0 lu0Var) throws IOException {
        return (Value) o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static Value parseFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        return (Value) o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
