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
public final class MutationPayload$DisplayFrameV2 extends com.google.protobuf.o implements InterfaceC0147w {
    public static final int ACTIVITY_ID_FIELD_NUMBER = 12;
    public static final int ACTIVITY_NAME_FIELD_NUMBER = 11;
    public static final int COMMANDS_FIELD_NUMBER = 1;
    private static final MutationPayload$DisplayFrameV2 DEFAULT_INSTANCE;
    public static final int DENSITY_FIELD_NUMBER = 15;
    public static final int IMAGES_FIELD_NUMBER = 3;
    public static final int KEYBOARD_HEIGHT_FIELD_NUMBER = 16;
    public static final int PAINTS_FIELD_NUMBER = 6;
    private static volatile j26 PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 7;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER = 14;
    public static final int SCREEN_WIDTH_FIELD_NUMBER = 13;
    public static final int SUB_PICTURES_FIELD_NUMBER = 8;
    public static final int SYSTEM_BACKGROUND_COLOR_FIELD_NUMBER = 17;
    public static final int TEXT_BLOBS_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 10;
    public static final int TYPEFACES_FIELD_NUMBER = 2;
    public static final int VERTICES_FIELD_NUMBER = 5;
    public static final int VIEW_HIERARCHY_FIELD_NUMBER = 9;
    private int activityId_;
    private int bitField0_;
    private float density_;
    private int keyboardHeight_;
    private int screenHeight_;
    private int screenWidth_;
    private int systemBackgroundColor_;
    private double timestamp_;
    private MutationPayload$ViewHierarchy viewHierarchy_;
    private rr3 commands_ = com.google.protobuf.o.emptyProtobufList();
    private rr3 typefaces_ = com.google.protobuf.o.emptyProtobufList();
    private rr3 images_ = com.google.protobuf.o.emptyProtobufList();
    private rr3 textBlobs_ = com.google.protobuf.o.emptyProtobufList();
    private rr3 vertices_ = com.google.protobuf.o.emptyProtobufList();
    private rr3 paints_ = com.google.protobuf.o.emptyProtobufList();
    private rr3 paths_ = com.google.protobuf.o.emptyProtobufList();
    private rr3 subPictures_ = com.google.protobuf.o.emptyProtobufList();
    private String activityName_ = "";

    static {
        MutationPayload$DisplayFrameV2 mutationPayload$DisplayFrameV2 = new MutationPayload$DisplayFrameV2();
        DEFAULT_INSTANCE = mutationPayload$DisplayFrameV2;
        com.google.protobuf.o.registerDefaultInstance(MutationPayload$DisplayFrameV2.class, mutationPayload$DisplayFrameV2);
    }

    private MutationPayload$DisplayFrameV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCommands(Iterable<? extends MutationPayload$DisplayCommandV2> iterable) {
        ensureCommandsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.commands_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImages(Iterable<? extends MutationPayload$Image> iterable) {
        ensureImagesIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.images_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaints(Iterable<? extends MutationPayload$Paint> iterable) {
        ensurePaintsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.paints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaths(Iterable<? extends MutationPayload$Path> iterable) {
        ensurePathsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubPictures(Iterable<? extends MutationPayload$DisplayFrameV2> iterable) {
        ensureSubPicturesIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.subPictures_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTextBlobs(Iterable<? extends MutationPayload$TextBlob> iterable) {
        ensureTextBlobsIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.textBlobs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTypefaces(Iterable<? extends MutationPayload$Typeface> iterable) {
        ensureTypefacesIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.typefaces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVertices(Iterable<? extends MutationPayload$Vertices> iterable) {
        ensureVerticesIsMutable();
        com.google.protobuf.a.addAll((Iterable) iterable, (List) this.vertices_);
    }

    private void addCommands(int i, MutationPayload$DisplayCommandV2 mutationPayload$DisplayCommandV2) {
        mutationPayload$DisplayCommandV2.getClass();
        ensureCommandsIsMutable();
        this.commands_.add(i, mutationPayload$DisplayCommandV2);
    }

    private void addImages(int i, MutationPayload$Image mutationPayload$Image) {
        mutationPayload$Image.getClass();
        ensureImagesIsMutable();
        this.images_.add(i, mutationPayload$Image);
    }

    private void addPaints(int i, MutationPayload$Paint mutationPayload$Paint) {
        mutationPayload$Paint.getClass();
        ensurePaintsIsMutable();
        this.paints_.add(i, mutationPayload$Paint);
    }

    private void addPaths(int i, MutationPayload$Path mutationPayload$Path) {
        mutationPayload$Path.getClass();
        ensurePathsIsMutable();
        this.paths_.add(i, mutationPayload$Path);
    }

    private void addSubPictures(int i, MutationPayload$DisplayFrameV2 mutationPayload$DisplayFrameV2) {
        mutationPayload$DisplayFrameV2.getClass();
        ensureSubPicturesIsMutable();
        this.subPictures_.add(i, mutationPayload$DisplayFrameV2);
    }

    private void addTextBlobs(int i, MutationPayload$TextBlob mutationPayload$TextBlob) {
        mutationPayload$TextBlob.getClass();
        ensureTextBlobsIsMutable();
        this.textBlobs_.add(i, mutationPayload$TextBlob);
    }

    private void addTypefaces(int i, MutationPayload$Typeface mutationPayload$Typeface) {
        mutationPayload$Typeface.getClass();
        ensureTypefacesIsMutable();
        this.typefaces_.add(i, mutationPayload$Typeface);
    }

    private void addVertices(int i, MutationPayload$Vertices mutationPayload$Vertices) {
        mutationPayload$Vertices.getClass();
        ensureVerticesIsMutable();
        this.vertices_.add(i, mutationPayload$Vertices);
    }

    private void clearActivityId() {
        this.bitField0_ &= -9;
        this.activityId_ = 0;
    }

    private void clearActivityName() {
        this.bitField0_ &= -5;
        this.activityName_ = getDefaultInstance().getActivityName();
    }

    private void clearCommands() {
        this.commands_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearDensity() {
        this.bitField0_ &= -65;
        this.density_ = 0.0f;
    }

    private void clearImages() {
        this.images_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearKeyboardHeight() {
        this.bitField0_ &= -129;
        this.keyboardHeight_ = 0;
    }

    private void clearPaints() {
        this.paints_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearPaths() {
        this.paths_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearScreenHeight() {
        this.bitField0_ &= -33;
        this.screenHeight_ = 0;
    }

    private void clearScreenWidth() {
        this.bitField0_ &= -17;
        this.screenWidth_ = 0;
    }

    private void clearSubPictures() {
        this.subPictures_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearSystemBackgroundColor() {
        this.bitField0_ &= -257;
        this.systemBackgroundColor_ = 0;
    }

    private void clearTextBlobs() {
        this.textBlobs_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearTimestamp() {
        this.bitField0_ &= -3;
        this.timestamp_ = 0.0d;
    }

    private void clearTypefaces() {
        this.typefaces_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearVertices() {
        this.vertices_ = com.google.protobuf.o.emptyProtobufList();
    }

    private void clearViewHierarchy() {
        this.viewHierarchy_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureCommandsIsMutable() {
        rr3 rr3Var = this.commands_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.commands_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    private void ensureImagesIsMutable() {
        rr3 rr3Var = this.images_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.images_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    private void ensurePaintsIsMutable() {
        rr3 rr3Var = this.paints_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.paints_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    private void ensurePathsIsMutable() {
        rr3 rr3Var = this.paths_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.paths_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    private void ensureSubPicturesIsMutable() {
        rr3 rr3Var = this.subPictures_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.subPictures_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    private void ensureTextBlobsIsMutable() {
        rr3 rr3Var = this.textBlobs_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.textBlobs_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    private void ensureTypefacesIsMutable() {
        rr3 rr3Var = this.typefaces_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.typefaces_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    private void ensureVerticesIsMutable() {
        rr3 rr3Var = this.vertices_;
        if (((defpackage.z1) rr3Var).a) {
            return;
        }
        this.vertices_ = com.google.protobuf.o.mutableCopy(rr3Var);
    }

    public static MutationPayload$DisplayFrameV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeViewHierarchy(MutationPayload$ViewHierarchy mutationPayload$ViewHierarchy) {
        mutationPayload$ViewHierarchy.getClass();
        MutationPayload$ViewHierarchy mutationPayload$ViewHierarchy2 = this.viewHierarchy_;
        if (mutationPayload$ViewHierarchy2 != null && mutationPayload$ViewHierarchy2 != MutationPayload$ViewHierarchy.getDefaultInstance()) {
            mutationPayload$ViewHierarchy = (MutationPayload$ViewHierarchy) ((w1) MutationPayload$ViewHierarchy.newBuilder(this.viewHierarchy_).mergeFrom((com.google.protobuf.o) mutationPayload$ViewHierarchy)).buildPartial();
        }
        this.viewHierarchy_ = mutationPayload$ViewHierarchy;
        this.bitField0_ |= 1;
    }

    public static C0145v newBuilder() {
        return (C0145v) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationPayload$DisplayFrameV2 parseDelimitedFrom(InputStream inputStream) {
        return (MutationPayload$DisplayFrameV2) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DisplayFrameV2 parseFrom(ByteString byteString) {
        return (MutationPayload$DisplayFrameV2) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static j26 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeCommands(int i) {
        ensureCommandsIsMutable();
        this.commands_.remove(i);
    }

    private void removeImages(int i) {
        ensureImagesIsMutable();
        this.images_.remove(i);
    }

    private void removePaints(int i) {
        ensurePaintsIsMutable();
        this.paints_.remove(i);
    }

    private void removePaths(int i) {
        ensurePathsIsMutable();
        this.paths_.remove(i);
    }

    private void removeSubPictures(int i) {
        ensureSubPicturesIsMutable();
        this.subPictures_.remove(i);
    }

    private void removeTextBlobs(int i) {
        ensureTextBlobsIsMutable();
        this.textBlobs_.remove(i);
    }

    private void removeTypefaces(int i) {
        ensureTypefacesIsMutable();
        this.typefaces_.remove(i);
    }

    private void removeVertices(int i) {
        ensureVerticesIsMutable();
        this.vertices_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityId(int i) {
        this.bitField0_ |= 8;
        this.activityId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityName(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.activityName_ = str;
    }

    private void setActivityNameBytes(ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.activityName_ = byteString.w();
        this.bitField0_ |= 4;
    }

    private void setCommands(int i, MutationPayload$DisplayCommandV2 mutationPayload$DisplayCommandV2) {
        mutationPayload$DisplayCommandV2.getClass();
        ensureCommandsIsMutable();
        this.commands_.set(i, mutationPayload$DisplayCommandV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDensity(float f) {
        this.bitField0_ |= 64;
        this.density_ = f;
    }

    private void setImages(int i, MutationPayload$Image mutationPayload$Image) {
        mutationPayload$Image.getClass();
        ensureImagesIsMutable();
        this.images_.set(i, mutationPayload$Image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyboardHeight(int i) {
        this.bitField0_ |= 128;
        this.keyboardHeight_ = i;
    }

    private void setPaints(int i, MutationPayload$Paint mutationPayload$Paint) {
        mutationPayload$Paint.getClass();
        ensurePaintsIsMutable();
        this.paints_.set(i, mutationPayload$Paint);
    }

    private void setPaths(int i, MutationPayload$Path mutationPayload$Path) {
        mutationPayload$Path.getClass();
        ensurePathsIsMutable();
        this.paths_.set(i, mutationPayload$Path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenHeight(int i) {
        this.bitField0_ |= 32;
        this.screenHeight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenWidth(int i) {
        this.bitField0_ |= 16;
        this.screenWidth_ = i;
    }

    private void setSubPictures(int i, MutationPayload$DisplayFrameV2 mutationPayload$DisplayFrameV2) {
        mutationPayload$DisplayFrameV2.getClass();
        ensureSubPicturesIsMutable();
        this.subPictures_.set(i, mutationPayload$DisplayFrameV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemBackgroundColor(int i) {
        this.bitField0_ |= 256;
        this.systemBackgroundColor_ = i;
    }

    private void setTextBlobs(int i, MutationPayload$TextBlob mutationPayload$TextBlob) {
        mutationPayload$TextBlob.getClass();
        ensureTextBlobsIsMutable();
        this.textBlobs_.set(i, mutationPayload$TextBlob);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(double d) {
        this.bitField0_ |= 2;
        this.timestamp_ = d;
    }

    private void setTypefaces(int i, MutationPayload$Typeface mutationPayload$Typeface) {
        mutationPayload$Typeface.getClass();
        ensureTypefacesIsMutable();
        this.typefaces_.set(i, mutationPayload$Typeface);
    }

    private void setVertices(int i, MutationPayload$Vertices mutationPayload$Vertices) {
        mutationPayload$Vertices.getClass();
        ensureVerticesIsMutable();
        this.vertices_.set(i, mutationPayload$Vertices);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewHierarchy(MutationPayload$ViewHierarchy mutationPayload$ViewHierarchy) {
        mutationPayload$ViewHierarchy.getClass();
        this.viewHierarchy_ = mutationPayload$ViewHierarchy;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.o
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2) {
        j26 fr2Var;
        switch (AbstractC0103a.a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new MutationPayload$DisplayFrameV2();
            case 2:
                return new C0145v();
            case 3:
                return com.google.protobuf.o.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0011\u0011\u0000\b\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\tဉ\u0000\nက\u0001\u000bለ\u0002\fင\u0003\rင\u0004\u000eင\u0005\u000fခ\u0006\u0010င\u0007\u0011င\b", new Object[]{"bitField0_", "commands_", MutationPayload$DisplayCommandV2.class, "typefaces_", MutationPayload$Typeface.class, "images_", MutationPayload$Image.class, "textBlobs_", MutationPayload$TextBlob.class, "vertices_", MutationPayload$Vertices.class, "paints_", MutationPayload$Paint.class, "paths_", MutationPayload$Path.class, "subPictures_", MutationPayload$DisplayFrameV2.class, "viewHierarchy_", "timestamp_", "activityName_", "activityId_", "screenWidth_", "screenHeight_", "density_", "keyboardHeight_", "systemBackgroundColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                j26 j26Var = PARSER;
                if (j26Var != null) {
                    return j26Var;
                }
                synchronized (MutationPayload$DisplayFrameV2.class) {
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

    public int getActivityId() {
        return this.activityId_;
    }

    public String getActivityName() {
        return this.activityName_;
    }

    public ByteString getActivityNameBytes() {
        return ByteString.i(this.activityName_);
    }

    public MutationPayload$DisplayCommandV2 getCommands(int i) {
        return (MutationPayload$DisplayCommandV2) this.commands_.get(i);
    }

    public int getCommandsCount() {
        return this.commands_.size();
    }

    public List<MutationPayload$DisplayCommandV2> getCommandsList() {
        return this.commands_;
    }

    public InterfaceC0139s getCommandsOrBuilder(int i) {
        return (InterfaceC0139s) this.commands_.get(i);
    }

    public List<? extends InterfaceC0139s> getCommandsOrBuilderList() {
        return this.commands_;
    }

    public float getDensity() {
        return this.density_;
    }

    public MutationPayload$Image getImages(int i) {
        return (MutationPayload$Image) this.images_.get(i);
    }

    public int getImagesCount() {
        return this.images_.size();
    }

    public List<MutationPayload$Image> getImagesList() {
        return this.images_;
    }

    public InterfaceC0121i0 getImagesOrBuilder(int i) {
        return (InterfaceC0121i0) this.images_.get(i);
    }

    public List<? extends InterfaceC0121i0> getImagesOrBuilderList() {
        return this.images_;
    }

    public int getKeyboardHeight() {
        return this.keyboardHeight_;
    }

    public MutationPayload$Paint getPaints(int i) {
        return (MutationPayload$Paint) this.paints_.get(i);
    }

    public int getPaintsCount() {
        return this.paints_.size();
    }

    public List<MutationPayload$Paint> getPaintsList() {
        return this.paints_;
    }

    public InterfaceC0154z0 getPaintsOrBuilder(int i) {
        return (InterfaceC0154z0) this.paints_.get(i);
    }

    public List<? extends InterfaceC0154z0> getPaintsOrBuilderList() {
        return this.paints_;
    }

    public MutationPayload$Path getPaths(int i) {
        return (MutationPayload$Path) this.paths_.get(i);
    }

    public int getPathsCount() {
        return this.paths_.size();
    }

    public List<MutationPayload$Path> getPathsList() {
        return this.paths_;
    }

    public E0 getPathsOrBuilder(int i) {
        return (E0) this.paths_.get(i);
    }

    public List<? extends E0> getPathsOrBuilderList() {
        return this.paths_;
    }

    public int getScreenHeight() {
        return this.screenHeight_;
    }

    public int getScreenWidth() {
        return this.screenWidth_;
    }

    public MutationPayload$DisplayFrameV2 getSubPictures(int i) {
        return (MutationPayload$DisplayFrameV2) this.subPictures_.get(i);
    }

    public int getSubPicturesCount() {
        return this.subPictures_.size();
    }

    public List<MutationPayload$DisplayFrameV2> getSubPicturesList() {
        return this.subPictures_;
    }

    public InterfaceC0147w getSubPicturesOrBuilder(int i) {
        return (InterfaceC0147w) this.subPictures_.get(i);
    }

    public List<? extends InterfaceC0147w> getSubPicturesOrBuilderList() {
        return this.subPictures_;
    }

    public int getSystemBackgroundColor() {
        return this.systemBackgroundColor_;
    }

    public MutationPayload$TextBlob getTextBlobs(int i) {
        return (MutationPayload$TextBlob) this.textBlobs_.get(i);
    }

    public int getTextBlobsCount() {
        return this.textBlobs_.size();
    }

    public List<MutationPayload$TextBlob> getTextBlobsList() {
        return this.textBlobs_;
    }

    public k1 getTextBlobsOrBuilder(int i) {
        return (k1) this.textBlobs_.get(i);
    }

    public List<? extends k1> getTextBlobsOrBuilderList() {
        return this.textBlobs_;
    }

    public double getTimestamp() {
        return this.timestamp_;
    }

    public MutationPayload$Typeface getTypefaces(int i) {
        return (MutationPayload$Typeface) this.typefaces_.get(i);
    }

    public int getTypefacesCount() {
        return this.typefaces_.size();
    }

    public List<MutationPayload$Typeface> getTypefacesList() {
        return this.typefaces_;
    }

    public t1 getTypefacesOrBuilder(int i) {
        return (t1) this.typefaces_.get(i);
    }

    public List<? extends t1> getTypefacesOrBuilderList() {
        return this.typefaces_;
    }

    public MutationPayload$Vertices getVertices(int i) {
        return (MutationPayload$Vertices) this.vertices_.get(i);
    }

    public int getVerticesCount() {
        return this.vertices_.size();
    }

    public List<MutationPayload$Vertices> getVerticesList() {
        return this.vertices_;
    }

    public v1 getVerticesOrBuilder(int i) {
        return (v1) this.vertices_.get(i);
    }

    public List<? extends v1> getVerticesOrBuilderList() {
        return this.vertices_;
    }

    public MutationPayload$ViewHierarchy getViewHierarchy() {
        MutationPayload$ViewHierarchy mutationPayload$ViewHierarchy = this.viewHierarchy_;
        return mutationPayload$ViewHierarchy == null ? MutationPayload$ViewHierarchy.getDefaultInstance() : mutationPayload$ViewHierarchy;
    }

    public boolean hasActivityId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasActivityName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDensity() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasKeyboardHeight() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasScreenHeight() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasScreenWidth() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSystemBackgroundColor() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasTimestamp() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasViewHierarchy() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addCommands(MutationPayload$DisplayCommandV2 mutationPayload$DisplayCommandV2) {
        mutationPayload$DisplayCommandV2.getClass();
        ensureCommandsIsMutable();
        this.commands_.add(mutationPayload$DisplayCommandV2);
    }

    private void addImages(MutationPayload$Image mutationPayload$Image) {
        mutationPayload$Image.getClass();
        ensureImagesIsMutable();
        this.images_.add(mutationPayload$Image);
    }

    private void addPaints(MutationPayload$Paint mutationPayload$Paint) {
        mutationPayload$Paint.getClass();
        ensurePaintsIsMutable();
        this.paints_.add(mutationPayload$Paint);
    }

    private void addPaths(MutationPayload$Path mutationPayload$Path) {
        mutationPayload$Path.getClass();
        ensurePathsIsMutable();
        this.paths_.add(mutationPayload$Path);
    }

    private void addSubPictures(MutationPayload$DisplayFrameV2 mutationPayload$DisplayFrameV2) {
        mutationPayload$DisplayFrameV2.getClass();
        ensureSubPicturesIsMutable();
        this.subPictures_.add(mutationPayload$DisplayFrameV2);
    }

    private void addTextBlobs(MutationPayload$TextBlob mutationPayload$TextBlob) {
        mutationPayload$TextBlob.getClass();
        ensureTextBlobsIsMutable();
        this.textBlobs_.add(mutationPayload$TextBlob);
    }

    private void addTypefaces(MutationPayload$Typeface mutationPayload$Typeface) {
        mutationPayload$Typeface.getClass();
        ensureTypefacesIsMutable();
        this.typefaces_.add(mutationPayload$Typeface);
    }

    private void addVertices(MutationPayload$Vertices mutationPayload$Vertices) {
        mutationPayload$Vertices.getClass();
        ensureVerticesIsMutable();
        this.vertices_.add(mutationPayload$Vertices);
    }

    public static C0145v newBuilder(MutationPayload$DisplayFrameV2 mutationPayload$DisplayFrameV2) {
        return (C0145v) DEFAULT_INSTANCE.createBuilder(mutationPayload$DisplayFrameV2);
    }

    public static MutationPayload$DisplayFrameV2 parseDelimitedFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DisplayFrameV2) com.google.protobuf.o.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DisplayFrameV2 parseFrom(ByteString byteString, h72 h72Var) {
        return (MutationPayload$DisplayFrameV2) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteString, h72Var);
    }

    public static MutationPayload$DisplayFrameV2 parseFrom(lu0 lu0Var) {
        return (MutationPayload$DisplayFrameV2) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var);
    }

    public static MutationPayload$DisplayFrameV2 parseFrom(lu0 lu0Var, h72 h72Var) {
        return (MutationPayload$DisplayFrameV2) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, lu0Var, h72Var);
    }

    public static MutationPayload$DisplayFrameV2 parseFrom(InputStream inputStream) {
        return (MutationPayload$DisplayFrameV2) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationPayload$DisplayFrameV2 parseFrom(InputStream inputStream, h72 h72Var) {
        return (MutationPayload$DisplayFrameV2) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, inputStream, h72Var);
    }

    public static MutationPayload$DisplayFrameV2 parseFrom(ByteBuffer byteBuffer) {
        return (MutationPayload$DisplayFrameV2) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static MutationPayload$DisplayFrameV2 parseFrom(ByteBuffer byteBuffer, h72 h72Var) {
        return (MutationPayload$DisplayFrameV2) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, byteBuffer, h72Var);
    }

    public static MutationPayload$DisplayFrameV2 parseFrom(byte[] bArr) {
        return (MutationPayload$DisplayFrameV2) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationPayload$DisplayFrameV2 parseFrom(byte[] bArr, h72 h72Var) {
        return (MutationPayload$DisplayFrameV2) com.google.protobuf.o.parseFrom(DEFAULT_INSTANCE, bArr, h72Var);
    }
}
