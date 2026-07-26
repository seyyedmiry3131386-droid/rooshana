package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import defpackage.fr2;
import defpackage.h72;
import defpackage.j26;
import defpackage.lu0;
import defpackage.rr3;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationPayload$InlineSpan extends com.google.protobuf.o implements InterfaceC0125k0 {
    public static final int ALIGNMENT_FIELD_NUMBER = 7;
    public static final int BASELINE_FIELD_NUMBER = 8;
    public static final int CHILDREN_FIELD_NUMBER = 3;
    private static final MutationPayload$InlineSpan DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 5;
    private static volatile j26 PARSER = null;
    public static final int SPELLOUT_FIELD_NUMBER = 6;
    public static final int STYLE_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int alignment_;
    private int baseline_;
    private int bitField0_;
    private MutationPayload$Locale locale_;
    private boolean spellOut_;
    private MutationPayload$TextStyle style_;
    private String type_ = "";
    private String text_ = "";
    private rr3 children_ = com.google.protobuf.o.emptyProtobufList();

    static {
        MutationPayload$InlineSpan mutationPayload$InlineSpan = new MutationPayload$InlineSpan();
        DEFAULT_INSTANCE = mutationPayload$InlineSpan;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$InlineSpan.class, mutationPayload$InlineSpan);
    }

    private MutationPayload$InlineSpan() {
    }

    private void addAllChildren(Iterable<? extends MutationPayload$InlineSpan> iterable) {
        ensureChildrenIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.children_);
    }

    private void addChildren(MutationPayload$InlineSpan mutationPayload$InlineSpan) {
        mutationPayload$InlineSpan.getClass();
        ensureChildrenIsMutable();
        this.children_.add(mutationPayload$InlineSpan);
    }

    private void clearAlignment() {
        this.bitField0_ &= -33;
        this.alignment_ = 0;
    }

    private void clearBaseline() {
        this.bitField0_ &= -65;
        this.baseline_ = 0;
    }

    private void clearChildren() {
        this.children_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearLocale() {
        this.locale_ = null;
        this.bitField0_ &= -9;
    }

    private void clearSpellOut() {
        this.bitField0_ &= -17;
        this.spellOut_ = false;
    }

    private void clearStyle() {
        this.style_ = null;
        this.bitField0_ &= -5;
    }

    private void clearText() {
        this.bitField0_ &= -3;
        this.text_ = getDefaultInstance().getText();
    }

    private void clearType() {
        this.bitField0_ &= -2;
        this.type_ = getDefaultInstance().getType();
    }

    private void ensureChildrenIsMutable() {
        rr3 rr3Var = this.children_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.children_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    public static MutationPayload$InlineSpan getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLocale(MutationPayload$Locale mutationPayload$Locale) {
        mutationPayload$Locale.getClass();
        MutationPayload$Locale mutationPayload$Locale2 = this.locale_;
        if (mutationPayload$Locale2 == null || mutationPayload$Locale2 == MutationPayload$Locale.getDefaultInstance()) {
            this.locale_ = mutationPayload$Locale;
        } else {
            this.locale_ = (MutationPayload$Locale) ((C0137q0) MutationPayload$Locale.newBuilder(this.locale_).mergeFrom((com.google.protobuf.o) mutationPayload$Locale)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeStyle(MutationPayload$TextStyle mutationPayload$TextStyle) {
        mutationPayload$TextStyle.getClass();
        MutationPayload$TextStyle mutationPayload$TextStyle2 = this.style_;
        if (mutationPayload$TextStyle2 == null || mutationPayload$TextStyle2 == MutationPayload$TextStyle.getDefaultInstance()) {
            this.style_ = mutationPayload$TextStyle;
        } else {
            this.style_ = (MutationPayload$TextStyle) ((p1) MutationPayload$TextStyle.newBuilder(this.style_).mergeFrom((com.google.protobuf.o) mutationPayload$TextStyle)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static C0123j0 newBuilder() {
        return (C0123j0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$InlineSpan parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$InlineSpan) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$InlineSpan parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$InlineSpan) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeChildren(int i) {
        ensureChildrenIsMutable();
        this.children_.remove(i);
    }

    private void setAlignment(int i) {
        this.bitField0_ |= 32;
        this.alignment_ = i;
    }

    private void setBaseline(int i) {
        this.bitField0_ |= 64;
        this.baseline_ = i;
    }

    private void setChildren(int i, MutationPayload$InlineSpan mutationPayload$InlineSpan) {
        mutationPayload$InlineSpan.getClass();
        ensureChildrenIsMutable();
        this.children_.set(i, mutationPayload$InlineSpan);
    }

    private void setLocale(MutationPayload$Locale mutationPayload$Locale) {
        mutationPayload$Locale.getClass();
        this.locale_ = mutationPayload$Locale;
        this.bitField0_ |= 8;
    }

    private void setSpellOut(boolean z) {
        this.bitField0_ |= 16;
        this.spellOut_ = z;
    }

    private void setStyle(MutationPayload$TextStyle mutationPayload$TextStyle) {
        mutationPayload$TextStyle.getClass();
        this.style_ = mutationPayload$TextStyle;
        this.bitField0_ |= 4;
    }

    private void setText(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.text_ = str;
    }

    private void setTextBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.w();
        this.bitField0_ |= 2;
    }

    private void setType(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.type_ = str;
    }

    private void setTypeBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.w();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$InlineSpan();
            case 2:
                return new C0123j0();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007င\u0005\bင\u0006", new Object[]{"bitField0_", "type_", "text_", "children_", MutationPayload$InlineSpan.class, "style_", "locale_", "spellOut_", "alignment_", "baseline_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$InlineSpan.class) {
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

    public int getAlignment() {
        return this.alignment_;
    }

    public int getBaseline() {
        return this.baseline_;
    }

    public MutationPayload$InlineSpan getChildren(int i) {
        return (MutationPayload$InlineSpan) this.children_.get(i);
    }

    public int getChildrenCount() {
        return this.children_.size();
    }

    public List<MutationPayload$InlineSpan> getChildrenList() {
        return this.children_;
    }

    public InterfaceC0125k0 getChildrenOrBuilder(int i) {
        return (InterfaceC0125k0) this.children_.get(i);
    }

    public List<? extends InterfaceC0125k0> getChildrenOrBuilderList() {
        return this.children_;
    }

    public MutationPayload$Locale getLocale() {
        MutationPayload$Locale mutationPayload$Locale = this.locale_;
        return mutationPayload$Locale == null ? MutationPayload$Locale.getDefaultInstance() : mutationPayload$Locale;
    }

    public boolean getSpellOut() {
        return this.spellOut_;
    }

    public MutationPayload$TextStyle getStyle() {
        MutationPayload$TextStyle mutationPayload$TextStyle = this.style_;
        return mutationPayload$TextStyle == null ? MutationPayload$TextStyle.getDefaultInstance() : mutationPayload$TextStyle;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.i(this.text_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.i(this.type_);
    }

    public boolean hasAlignment() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasBaseline() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSpellOut() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasStyle() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasText() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C0123j0 newBuilder(MutationPayload$InlineSpan mutationPayload$InlineSpan) {
        return (C0123j0) DEFAULT_INSTANCE.createBuilder(mutationPayload$InlineSpan);
    }

    public static MutationPayload$InlineSpan parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$InlineSpan) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$InlineSpan parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$InlineSpan) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$InlineSpan parseFrom(ByteString byteString) {
        return (MutationPayload$InlineSpan) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addChildren(int i, MutationPayload$InlineSpan mutationPayload$InlineSpan) {
        mutationPayload$InlineSpan.getClass();
        ensureChildrenIsMutable();
        this.children_.add(i, mutationPayload$InlineSpan);
    }

    public static MutationPayload$InlineSpan parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$InlineSpan) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$InlineSpan parseFrom(byte[] bArr) {
        return (MutationPayload$InlineSpan) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$InlineSpan parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$InlineSpan) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }

    public static MutationPayload$InlineSpan parseFrom(InputStream inputStream) {
        return (MutationPayload$InlineSpan) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$InlineSpan parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$InlineSpan) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$InlineSpan parseFrom(lu0 lu0Var) {
        return (MutationPayload$InlineSpan) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$InlineSpan parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$InlineSpan) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }
}
