package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.fv4;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$DrawRenderEditableCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$DrawRenderEditableCommandPayload DEFAULT_INSTANCE;
    public static final int OFFSET_FIELD_NUMBER = 2;
    private static volatile j26 PARSER = null;
    public static final int RENDEREDITABLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private MutationPayload$Offset offset_;
    private MutationPayload$RenderText renderEditable_;

    static {
        MutationPayload$DrawRenderEditableCommandPayload mutationPayload$DrawRenderEditableCommandPayload = new MutationPayload$DrawRenderEditableCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawRenderEditableCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawRenderEditableCommandPayload.class, mutationPayload$DrawRenderEditableCommandPayload);
    }

    private MutationPayload$DrawRenderEditableCommandPayload() {
    }

    private void clearOffset() {
        this.offset_ = null;
        this.bitField0_ &= -3;
    }

    private void clearRenderEditable() {
        this.renderEditable_ = null;
        this.bitField0_ &= -2;
    }

    public static MutationPayload$DrawRenderEditableCommandPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOffset(MutationPayload$Offset mutationPayload$Offset) {
        mutationPayload$Offset.getClass();
        MutationPayload$Offset mutationPayload$Offset2 = this.offset_;
        if (mutationPayload$Offset2 == null || mutationPayload$Offset2 == MutationPayload$Offset.getDefaultInstance()) {
            this.offset_ = mutationPayload$Offset;
        } else {
            this.offset_ = (MutationPayload$Offset) ((C0150x0) MutationPayload$Offset.newBuilder(this.offset_).mergeFrom((com.google.protobuf.o) mutationPayload$Offset)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeRenderEditable(MutationPayload$RenderText mutationPayload$RenderText) {
        mutationPayload$RenderText.getClass();
        MutationPayload$RenderText mutationPayload$RenderText2 = this.renderEditable_;
        if (mutationPayload$RenderText2 == null || mutationPayload$RenderText2 == MutationPayload$RenderText.getDefaultInstance()) {
            this.renderEditable_ = mutationPayload$RenderText;
        } else {
            this.renderEditable_ = (MutationPayload$RenderText) ((R0) MutationPayload$RenderText.newBuilder(this.renderEditable_).mergeFrom((com.google.protobuf.o) mutationPayload$RenderText)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Q newBuilder() {
        return (Q) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawRenderEditableCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawRenderEditableCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawRenderEditableCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawRenderEditableCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setOffset(MutationPayload$Offset mutationPayload$Offset) {
        mutationPayload$Offset.getClass();
        this.offset_ = mutationPayload$Offset;
        this.bitField0_ |= 2;
    }

    private void setRenderEditable(MutationPayload$RenderText mutationPayload$RenderText) {
        mutationPayload$RenderText.getClass();
        this.renderEditable_ = mutationPayload$RenderText;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawRenderEditableCommandPayload();
            case 2:
                return new Q();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "renderEditable_", "offset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawRenderEditableCommandPayload.class) {
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

    public MutationPayload$Offset getOffset() {
        MutationPayload$Offset mutationPayload$Offset = this.offset_;
        return mutationPayload$Offset == null ? MutationPayload$Offset.getDefaultInstance() : mutationPayload$Offset;
    }

    public MutationPayload$RenderText getRenderEditable() {
        MutationPayload$RenderText mutationPayload$RenderText = this.renderEditable_;
        return mutationPayload$RenderText == null ? MutationPayload$RenderText.getDefaultInstance() : mutationPayload$RenderText;
    }

    public boolean hasOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRenderEditable() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Q newBuilder(MutationPayload$DrawRenderEditableCommandPayload mutationPayload$DrawRenderEditableCommandPayload) {
        return (Q) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawRenderEditableCommandPayload);
    }

    public static MutationPayload$DrawRenderEditableCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawRenderEditableCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawRenderEditableCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawRenderEditableCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawRenderEditableCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawRenderEditableCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawRenderEditableCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawRenderEditableCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawRenderEditableCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawRenderEditableCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawRenderEditableCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawRenderEditableCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawRenderEditableCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawRenderEditableCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawRenderEditableCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawRenderEditableCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawRenderEditableCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawRenderEditableCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawRenderEditableCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawRenderEditableCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
