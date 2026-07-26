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
public final class MutationPayload$DrawRenderParagraphCommandPayload extends com.google.protobuf.o implements fv4 {
    private static final MutationPayload$DrawRenderParagraphCommandPayload DEFAULT_INSTANCE;
    public static final int OFFSET_FIELD_NUMBER = 2;
    private static volatile j26 PARSER = null;
    public static final int RENDERPARAGRAPH_FIELD_NUMBER = 1;
    private int bitField0_;
    private MutationPayload$Offset offset_;
    private MutationPayload$RenderText renderParagraph_;

    static {
        MutationPayload$DrawRenderParagraphCommandPayload mutationPayload$DrawRenderParagraphCommandPayload = new MutationPayload$DrawRenderParagraphCommandPayload();
        DEFAULT_INSTANCE = mutationPayload$DrawRenderParagraphCommandPayload;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DrawRenderParagraphCommandPayload.class, mutationPayload$DrawRenderParagraphCommandPayload);
    }

    private MutationPayload$DrawRenderParagraphCommandPayload() {
    }

    private void clearOffset() {
        this.offset_ = null;
        this.bitField0_ &= -3;
    }

    private void clearRenderParagraph() {
        this.renderParagraph_ = null;
        this.bitField0_ &= -2;
    }

    public static MutationPayload$DrawRenderParagraphCommandPayload getDefaultInstance() {
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

    private void mergeRenderParagraph(MutationPayload$RenderText mutationPayload$RenderText) {
        mutationPayload$RenderText.getClass();
        MutationPayload$RenderText mutationPayload$RenderText2 = this.renderParagraph_;
        if (mutationPayload$RenderText2 == null || mutationPayload$RenderText2 == MutationPayload$RenderText.getDefaultInstance()) {
            this.renderParagraph_ = mutationPayload$RenderText;
        } else {
            this.renderParagraph_ = (MutationPayload$RenderText) ((R0) MutationPayload$RenderText.newBuilder(this.renderParagraph_).mergeFrom((com.google.protobuf.o) mutationPayload$RenderText)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static S newBuilder() {
        return (S) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DrawRenderParagraphCommandPayload parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DrawRenderParagraphCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawRenderParagraphCommandPayload parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DrawRenderParagraphCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setOffset(MutationPayload$Offset mutationPayload$Offset) {
        mutationPayload$Offset.getClass();
        this.offset_ = mutationPayload$Offset;
        this.bitField0_ |= 2;
    }

    private void setRenderParagraph(MutationPayload$RenderText mutationPayload$RenderText) {
        mutationPayload$RenderText.getClass();
        this.renderParagraph_ = mutationPayload$RenderText;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DrawRenderParagraphCommandPayload();
            case 2:
                return new S();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "renderParagraph_", "offset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DrawRenderParagraphCommandPayload.class) {
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

    public MutationPayload$RenderText getRenderParagraph() {
        MutationPayload$RenderText mutationPayload$RenderText = this.renderParagraph_;
        return mutationPayload$RenderText == null ? MutationPayload$RenderText.getDefaultInstance() : mutationPayload$RenderText;
    }

    public boolean hasOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRenderParagraph() {
        return (this.bitField0_ & 1) != 0;
    }

    public static S newBuilder(MutationPayload$DrawRenderParagraphCommandPayload mutationPayload$DrawRenderParagraphCommandPayload) {
        return (S) DEFAULT_INSTANCE.createBuilder(mutationPayload$DrawRenderParagraphCommandPayload);
    }

    public static MutationPayload$DrawRenderParagraphCommandPayload parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawRenderParagraphCommandPayload) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawRenderParagraphCommandPayload parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DrawRenderParagraphCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DrawRenderParagraphCommandPayload parseFrom(ByteString byteString) {
        return (MutationPayload$DrawRenderParagraphCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MutationPayload$DrawRenderParagraphCommandPayload parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DrawRenderParagraphCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DrawRenderParagraphCommandPayload parseFrom(byte[] bArr) {
        return (MutationPayload$DrawRenderParagraphCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DrawRenderParagraphCommandPayload parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DrawRenderParagraphCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$DrawRenderParagraphCommandPayload parseFrom(InputStream inputStream) {
        return (MutationPayload$DrawRenderParagraphCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DrawRenderParagraphCommandPayload parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DrawRenderParagraphCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DrawRenderParagraphCommandPayload parseFrom(lu0 lu0Var) {
        return (MutationPayload$DrawRenderParagraphCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DrawRenderParagraphCommandPayload parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DrawRenderParagraphCommandPayload) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
