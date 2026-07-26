package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.rr3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$Looper extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$Looper DEFAULT_INSTANCE;
    public static final int LAYERS_FIELD_NUMBER = 2;
    private static volatile j26 PARSER = null;
    public static final int TYPEENUM_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private Object typeOneOf_;
    private int typeOneOfCase_ = 0;
    private rr3 layers_ = com.google.protobuf.o.emptyProtobufList();

    static {
        MutationPayload$Looper mutationPayload$Looper = new MutationPayload$Looper();
        DEFAULT_INSTANCE = mutationPayload$Looper;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$Looper.class, mutationPayload$Looper);
    }

    private MutationPayload$Looper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLayers(Iterable<? extends MutationPayload$Layer> iterable) {
        ensureLayersIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.layers_);
    }

    private void addLayers(MutationPayload$Layer mutationPayload$Layer) {
        mutationPayload$Layer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(mutationPayload$Layer);
    }

    private void clearLayers() {
        this.layers_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearType() {
        if (this.typeOneOfCase_ == 1) {
            this.typeOneOfCase_ = 0;
            this.typeOneOf_ = null;
        }
    }

    private void clearTypeEnum() {
        if (this.typeOneOfCase_ == 3) {
            this.typeOneOfCase_ = 0;
            this.typeOneOf_ = null;
        }
    }

    private void clearTypeOneOf() {
        this.typeOneOfCase_ = 0;
        this.typeOneOf_ = null;
    }

    private void ensureLayersIsMutable() {
        rr3 rr3Var = this.layers_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.layers_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    public static MutationPayload$Looper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0138r0 newBuilder() {
        return (C0138r0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$Looper parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$Looper) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Looper parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$Looper) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeLayers(int i) {
        ensureLayersIsMutable();
        this.layers_.remove(i);
    }

    private void setLayers(int i, MutationPayload$Layer mutationPayload$Layer) {
        mutationPayload$Layer.getClass();
        ensureLayersIsMutable();
        this.layers_.set(i, mutationPayload$Layer);
    }

    private void setType(String str) {
        str.getClass();
        this.typeOneOfCase_ = 1;
        this.typeOneOf_ = str;
    }

    private void setTypeBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.typeOneOf_ = byteString.w();
        this.typeOneOfCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeEnum(EnumC0142t0 enumC0142t0) {
        this.typeOneOf_ = Integer.valueOf(enumC0142t0.getNumber());
        this.typeOneOfCase_ = 3;
    }

    private void setTypeEnumValue(int i) {
        this.typeOneOfCase_ = 3;
        this.typeOneOf_ = Integer.valueOf(i);
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$Looper();
            case 2:
                return new C0138r0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȼ\u0000\u0002\u001b\u0003?\u0000", new Object[]{"typeOneOf_", "typeOneOfCase_", "layers_", MutationPayload$Layer.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$Looper.class) {
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
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public MutationPayload$Layer getLayers(int i) {
        return (MutationPayload$Layer) this.layers_.get(i);
    }

    public int getLayersCount() {
        return this.layers_.size();
    }

    public List<MutationPayload$Layer> getLayersList() {
        return this.layers_;
    }

    public InterfaceC0135p0 getLayersOrBuilder(int i) {
        return (InterfaceC0135p0) this.layers_.get(i);
    }

    public List<? extends InterfaceC0135p0> getLayersOrBuilderList() {
        return this.layers_;
    }

    @Deprecated
    public String getType() {
        return this.typeOneOfCase_ == 1 ? (String) this.typeOneOf_ : "";
    }

    @Deprecated
    public ByteString getTypeBytes() {
        return ByteString.i(this.typeOneOfCase_ == 1 ? (String) this.typeOneOf_ : "");
    }

    public EnumC0142t0 getTypeEnum() {
        if (this.typeOneOfCase_ != 3) {
            return EnumC0142t0.LayerDrawLooper;
        }
        EnumC0142t0 enumC0142t0 = ((Integer) this.typeOneOf_).intValue() != 0 ? null : EnumC0142t0.LayerDrawLooper;
        return enumC0142t0 == null ? EnumC0142t0.UNRECOGNIZED : enumC0142t0;
    }

    public int getTypeEnumValue() {
        if (this.typeOneOfCase_ == 3) {
            return ((Integer) this.typeOneOf_).intValue();
        }
        return 0;
    }

    public EnumC0140s0 getTypeOneOfCase() {
        int i = this.typeOneOfCase_;
        if (i == 0) {
            return EnumC0140s0.TYPEONEOF_NOT_SET;
        }
        if (i == 1) {
            return EnumC0140s0.TYPE;
        }
        if (i != 3) {
            return null;
        }
        return EnumC0140s0.TYPEENUM;
    }

    @Deprecated
    public boolean hasType() {
        return this.typeOneOfCase_ == 1;
    }

    public boolean hasTypeEnum() {
        return this.typeOneOfCase_ == 3;
    }

    public static C0138r0 newBuilder(MutationPayload$Looper mutationPayload$Looper) {
        return (C0138r0) DEFAULT_INSTANCE.createBuilder(mutationPayload$Looper);
    }

    public static MutationPayload$Looper parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Looper) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Looper parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$Looper) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$Looper parseFrom(ByteString byteString) {
        return (MutationPayload$Looper) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addLayers(int i, MutationPayload$Layer mutationPayload$Layer) {
        mutationPayload$Layer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(i, mutationPayload$Layer);
    }

    public static MutationPayload$Looper parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$Looper) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$Looper parseFrom(byte[] bArr) {
        return (MutationPayload$Looper) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$Looper parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$Looper) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$Looper parseFrom(InputStream inputStream) {
        return (MutationPayload$Looper) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$Looper parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$Looper) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$Looper parseFrom(lu0 lu0Var) {
        return (MutationPayload$Looper) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$Looper parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$Looper) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
