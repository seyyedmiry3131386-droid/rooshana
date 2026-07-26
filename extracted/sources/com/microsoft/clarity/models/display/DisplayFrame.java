package com.microsoft.clarity.models.display;

import com.google.protobuf.o;
import com.microsoft.clarity.m.C0102a;
import com.microsoft.clarity.models.IProtoPageEventModel;
import com.microsoft.clarity.models.display.blobs.TextBlob;
import com.microsoft.clarity.models.display.commands.DisplayCommand;
import com.microsoft.clarity.models.display.common.Vertices;
import com.microsoft.clarity.models.display.images.Image;
import com.microsoft.clarity.models.display.paints.Paint;
import com.microsoft.clarity.models.display.paths.Path;
import com.microsoft.clarity.models.display.typefaces.Typeface;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import com.microsoft.clarity.models.viewhierarchy.ViewHierarchy;
import com.microsoft.clarity.protomodels.mutationpayload.C0145v;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayFrameV2;
import defpackage.dp2;
import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class DisplayFrame implements IProtoPageEventModel<MutationPayload$DisplayFrameV2>, IDisplayFrame {
    private List<? extends DisplayCommand> commands;
    private final float density;
    private final dp2 forceStartNewSessionCallback;
    private List<Image> images;
    private final boolean isForceStartNewSessionFirstFrame;
    private final boolean isKeyFrame;
    private final boolean isNewPageFirstFrame;
    private final int keyboardHeight;
    private List<Paint> paints;
    private final List<Path> paths;
    private final int screenHeight;
    private final ScreenMetadata screenMetadata;
    private final int screenWidth;
    private final List<SubDisplayFrame> subDisplayFrames;
    private final int systemBackgroundColor;
    private List<TextBlob> textBlobs;
    private final long timestamp;
    private List<Typeface> typefaces;
    private final List<Vertices> vertices;
    private final ViewHierarchy viewHierarchy;

    public DisplayFrame(long j, boolean z, ViewHierarchy viewHierarchy, ScreenMetadata screenMetadata, int i, int i2, int i3, int i4, float f, boolean z2, dp2 dp2Var, boolean z3, C0102a c0102a) {
        js3.p(viewHierarchy, "viewHierarchy");
        js3.p(screenMetadata, "screenMetadata");
        js3.p(c0102a, "parseResult");
        List list = c0102a.a;
        List list2 = c0102a.b;
        List list3 = c0102a.c;
        List list4 = c0102a.d;
        List list5 = c0102a.e;
        ArrayList arrayList = c0102a.f;
        List list6 = c0102a.g;
        ArrayList arrayList2 = c0102a.h;
        ArrayList arrayList3 = new ArrayList(wu0.V(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new SubDisplayFrame((C0102a) it.next()));
        }
        this(j, z, viewHierarchy, screenMetadata, i, i2, i3, i4, f, z2, dp2Var, z3, list, list2, list3, list4, list5, arrayList, list6, a.Q0(arrayList3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayFrame copy$default(DisplayFrame displayFrame, long j, boolean z, ViewHierarchy viewHierarchy, ScreenMetadata screenMetadata, int i, int i2, int i3, int i4, float f, boolean z2, dp2 dp2Var, boolean z3, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i5, Object obj) {
        List list9;
        List list10;
        long timestamp = (i5 & 1) != 0 ? displayFrame.getTimestamp() : j;
        boolean z4 = (i5 & 2) != 0 ? displayFrame.isKeyFrame : z;
        ViewHierarchy viewHierarchy2 = (i5 & 4) != 0 ? displayFrame.viewHierarchy : viewHierarchy;
        ScreenMetadata screenMetadata2 = (i5 & 8) != 0 ? displayFrame.getScreenMetadata() : screenMetadata;
        int i6 = (i5 & 16) != 0 ? displayFrame.screenWidth : i;
        int i7 = (i5 & 32) != 0 ? displayFrame.screenHeight : i2;
        int i8 = (i5 & 64) != 0 ? displayFrame.keyboardHeight : i3;
        int i9 = (i5 & 128) != 0 ? displayFrame.systemBackgroundColor : i4;
        float f2 = (i5 & 256) != 0 ? displayFrame.density : f;
        boolean z5 = (i5 & 512) != 0 ? displayFrame.isForceStartNewSessionFirstFrame : z2;
        dp2 dp2Var2 = (i5 & 1024) != 0 ? displayFrame.forceStartNewSessionCallback : dp2Var;
        boolean z6 = (i5 & 2048) != 0 ? displayFrame.isNewPageFirstFrame : z3;
        List list11 = (i5 & 4096) != 0 ? displayFrame.commands : list;
        long j2 = timestamp;
        List list12 = (i5 & 8192) != 0 ? displayFrame.typefaces : list2;
        List list13 = (i5 & 16384) != 0 ? displayFrame.images : list3;
        List list14 = (i5 & 32768) != 0 ? displayFrame.textBlobs : list4;
        List list15 = (i5 & 65536) != 0 ? displayFrame.vertices : list5;
        List list16 = (i5 & 131072) != 0 ? displayFrame.paints : list6;
        List list17 = (i5 & 262144) != 0 ? displayFrame.paths : list7;
        if ((i5 & 524288) != 0) {
            list10 = list17;
            list9 = displayFrame.subDisplayFrames;
        } else {
            list9 = list8;
            list10 = list17;
        }
        return displayFrame.copy(j2, z4, viewHierarchy2, screenMetadata2, i6, i7, i8, i9, f2, z5, dp2Var2, z6, list11, list12, list13, list14, list15, list16, list10, list9);
    }

    public final long component1() {
        return getTimestamp();
    }

    public final boolean component10() {
        return this.isForceStartNewSessionFirstFrame;
    }

    public final dp2 component11() {
        return this.forceStartNewSessionCallback;
    }

    public final boolean component12() {
        return this.isNewPageFirstFrame;
    }

    public final List<DisplayCommand> component13() {
        return this.commands;
    }

    public final List<Typeface> component14() {
        return this.typefaces;
    }

    public final List<Image> component15() {
        return this.images;
    }

    public final List<TextBlob> component16() {
        return this.textBlobs;
    }

    public final List<Vertices> component17() {
        return this.vertices;
    }

    public final List<Paint> component18() {
        return this.paints;
    }

    public final List<Path> component19() {
        return this.paths;
    }

    public final boolean component2() {
        return this.isKeyFrame;
    }

    public final List<SubDisplayFrame> component20() {
        return this.subDisplayFrames;
    }

    public final ViewHierarchy component3() {
        return this.viewHierarchy;
    }

    public final ScreenMetadata component4() {
        return getScreenMetadata();
    }

    public final int component5() {
        return this.screenWidth;
    }

    public final int component6() {
        return this.screenHeight;
    }

    public final int component7() {
        return this.keyboardHeight;
    }

    public final int component8() {
        return this.systemBackgroundColor;
    }

    public final float component9() {
        return this.density;
    }

    public final DisplayFrame copy(long j, boolean z, ViewHierarchy viewHierarchy, ScreenMetadata screenMetadata, int i, int i2, int i3, int i4, float f, boolean z2, dp2 dp2Var, boolean z3, List<? extends DisplayCommand> list, List<Typeface> list2, List<Image> list3, List<TextBlob> list4, List<Vertices> list5, List<Paint> list6, List<Path> list7, List<SubDisplayFrame> list8) {
        js3.p(viewHierarchy, "viewHierarchy");
        js3.p(screenMetadata, "screenMetadata");
        js3.p(list, "commands");
        js3.p(list2, "typefaces");
        js3.p(list3, "images");
        js3.p(list4, "textBlobs");
        js3.p(list5, "vertices");
        js3.p(list6, "paints");
        js3.p(list7, "paths");
        js3.p(list8, "subDisplayFrames");
        return new DisplayFrame(j, z, viewHierarchy, screenMetadata, i, i2, i3, i4, f, z2, dp2Var, z3, list, list2, list3, list4, list5, list6, list7, list8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayFrame)) {
            return false;
        }
        DisplayFrame displayFrame = (DisplayFrame) obj;
        return getTimestamp() == displayFrame.getTimestamp() && this.isKeyFrame == displayFrame.isKeyFrame && js3.i(this.viewHierarchy, displayFrame.viewHierarchy) && js3.i(getScreenMetadata(), displayFrame.getScreenMetadata()) && this.screenWidth == displayFrame.screenWidth && this.screenHeight == displayFrame.screenHeight && this.keyboardHeight == displayFrame.keyboardHeight && this.systemBackgroundColor == displayFrame.systemBackgroundColor && Float.compare(this.density, displayFrame.density) == 0 && this.isForceStartNewSessionFirstFrame == displayFrame.isForceStartNewSessionFirstFrame && js3.i(this.forceStartNewSessionCallback, displayFrame.forceStartNewSessionCallback) && this.isNewPageFirstFrame == displayFrame.isNewPageFirstFrame && js3.i(this.commands, displayFrame.commands) && js3.i(this.typefaces, displayFrame.typefaces) && js3.i(this.images, displayFrame.images) && js3.i(this.textBlobs, displayFrame.textBlobs) && js3.i(this.vertices, displayFrame.vertices) && js3.i(this.paints, displayFrame.paints) && js3.i(this.paths, displayFrame.paths) && js3.i(this.subDisplayFrames, displayFrame.subDisplayFrames);
    }

    public final List<DisplayCommand> getCommands() {
        return this.commands;
    }

    public final float getDensity() {
        return this.density;
    }

    public final dp2 getForceStartNewSessionCallback() {
        return this.forceStartNewSessionCallback;
    }

    public final List<Image> getImages() {
        return this.images;
    }

    public final int getKeyboardHeight() {
        return this.keyboardHeight;
    }

    public final List<Paint> getPaints() {
        return this.paints;
    }

    public final List<Path> getPaths() {
        return this.paths;
    }

    public final int getScreenHeight() {
        return this.screenHeight;
    }

    @Override // com.microsoft.clarity.models.display.IDisplayFrame
    public ScreenMetadata getScreenMetadata() {
        return this.screenMetadata;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public final List<SubDisplayFrame> getSubDisplayFrames() {
        return this.subDisplayFrames;
    }

    public final int getSystemBackgroundColor() {
        return this.systemBackgroundColor;
    }

    public final List<TextBlob> getTextBlobs() {
        return this.textBlobs;
    }

    @Override // com.microsoft.clarity.models.display.IDisplayFrame
    public long getTimestamp() {
        return this.timestamp;
    }

    public final List<Typeface> getTypefaces() {
        return this.typefaces;
    }

    public final List<Vertices> getVertices() {
        return this.vertices;
    }

    public final ViewHierarchy getViewHierarchy() {
        return this.viewHierarchy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        long timestamp = getTimestamp();
        int i = ((int) (timestamp ^ (timestamp >>> 32))) * 31;
        boolean z = this.isKeyFrame;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iA = com.microsoft.clarity.j.a.a(this.density, (this.systemBackgroundColor + ((this.keyboardHeight + ((this.screenHeight + ((this.screenWidth + ((getScreenMetadata().hashCode() + ((this.viewHierarchy.hashCode() + ((i + r2) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
        boolean z2 = this.isForceStartNewSessionFirstFrame;
        ?? r22 = z2;
        if (z2) {
            r22 = 1;
        }
        int i2 = (iA + r22) * 31;
        dp2 dp2Var = this.forceStartNewSessionCallback;
        int iHashCode = (i2 + (dp2Var == null ? 0 : dp2Var.hashCode())) * 31;
        boolean z3 = this.isNewPageFirstFrame;
        return this.subDisplayFrames.hashCode() + rm7.i(rm7.i(rm7.i(rm7.i(rm7.i(rm7.i(rm7.i((iHashCode + (z3 ? 1 : z3)) * 31, 31, this.commands), 31, this.typefaces), 31, this.images), 31, this.textBlobs), 31, this.vertices), 31, this.paints), 31, this.paths);
    }

    public final boolean isForceStartNewSessionFirstFrame() {
        return this.isForceStartNewSessionFirstFrame;
    }

    public final boolean isKeyFrame() {
        return this.isKeyFrame;
    }

    public final boolean isNewPageFirstFrame() {
        return this.isNewPageFirstFrame;
    }

    public final void setCommands(List<? extends DisplayCommand> list) {
        js3.p(list, "<set-?>");
        this.commands = list;
    }

    public final void setImages(List<Image> list) {
        js3.p(list, "<set-?>");
        this.images = list;
    }

    public final void setPaints(List<Paint> list) {
        js3.p(list, "<set-?>");
        this.paints = list;
    }

    public final void setTextBlobs(List<TextBlob> list) {
        js3.p(list, "<set-?>");
        this.textBlobs = list;
    }

    public final void setTypefaces(List<Typeface> list) {
        js3.p(list, "<set-?>");
        this.typefaces = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DisplayFrame(timestamp=");
        sb.append(getTimestamp());
        sb.append(", isKeyFrame=");
        sb.append(this.isKeyFrame);
        sb.append(", viewHierarchy=");
        sb.append(this.viewHierarchy);
        sb.append(", screenMetadata=");
        sb.append(getScreenMetadata());
        sb.append(", screenWidth=");
        sb.append(this.screenWidth);
        sb.append(", screenHeight=");
        sb.append(this.screenHeight);
        sb.append(", keyboardHeight=");
        sb.append(this.keyboardHeight);
        sb.append(", systemBackgroundColor=");
        sb.append(this.systemBackgroundColor);
        sb.append(", density=");
        sb.append(this.density);
        sb.append(", isForceStartNewSessionFirstFrame=");
        sb.append(this.isForceStartNewSessionFirstFrame);
        sb.append(", forceStartNewSessionCallback=");
        sb.append(this.forceStartNewSessionCallback);
        sb.append(", isNewPageFirstFrame=");
        sb.append(this.isNewPageFirstFrame);
        sb.append(", commands=");
        sb.append(this.commands);
        sb.append(", typefaces=");
        sb.append(this.typefaces);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", textBlobs=");
        sb.append(this.textBlobs);
        sb.append(", vertices=");
        sb.append(this.vertices);
        sb.append(", paints=");
        sb.append(this.paints);
        sb.append(", paths=");
        sb.append(this.paths);
        sb.append(", subDisplayFrames=");
        return dw1.t(sb, this.subDisplayFrames, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoPageEventModel
    public MutationPayload$DisplayFrameV2 toProtobufInstance(long j) {
        C0145v c0145vA = MutationPayload$DisplayFrameV2.newBuilder().a(getTimestamp() - j).a(this.viewHierarchy.toProtobufInstance()).a(getScreenMetadata().getName()).a(getScreenMetadata().getActivityHashCode()).c(this.screenHeight).d(this.screenWidth).b(this.keyboardHeight).e(this.systemBackgroundColor).a(this.density);
        List<? extends DisplayCommand> list = this.commands;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DisplayCommand) it.next()).toProtobufInstance());
        }
        C0145v c0145vA2 = c0145vA.a(arrayList);
        List<Typeface> list2 = this.typefaces;
        ArrayList arrayList2 = new ArrayList(wu0.V(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Typeface) it2.next()).toProtobufInstance());
        }
        C0145v c0145vB = c0145vA2.b(arrayList2);
        List<Image> list3 = this.images;
        ArrayList arrayList3 = new ArrayList(wu0.V(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Image) it3.next()).toProtobufInstance());
        }
        C0145v c0145vA3 = c0145vB.a((List) arrayList3);
        List<TextBlob> list4 = this.textBlobs;
        ArrayList arrayList4 = new ArrayList(wu0.V(list4, 10));
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((TextBlob) it4.next()).toProtobufInstance());
        }
        C0145v c0145vE = c0145vA3.e(arrayList4);
        List<Vertices> list5 = this.vertices;
        ArrayList arrayList5 = new ArrayList(wu0.V(list5, 10));
        Iterator<T> it5 = list5.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((Vertices) it5.next()).toProtobufInstance());
        }
        C0145v c0145vF = c0145vE.f(arrayList5);
        List<Paint> list6 = this.paints;
        ArrayList arrayList6 = new ArrayList(wu0.V(list6, 10));
        Iterator<T> it6 = list6.iterator();
        while (it6.hasNext()) {
            arrayList6.add(((Paint) it6.next()).toProtobufInstance());
        }
        C0145v c0145vB2 = c0145vF.b((List) arrayList6);
        List<Path> list7 = this.paths;
        ArrayList arrayList7 = new ArrayList(wu0.V(list7, 10));
        Iterator<T> it7 = list7.iterator();
        while (it7.hasNext()) {
            arrayList7.add(((Path) it7.next()).toProtobufInstance());
        }
        C0145v c0145vC = c0145vB2.c(arrayList7);
        List<SubDisplayFrame> list8 = this.subDisplayFrames;
        ArrayList arrayList8 = new ArrayList(wu0.V(list8, 10));
        Iterator<T> it8 = list8.iterator();
        while (it8.hasNext()) {
            arrayList8.add(((SubDisplayFrame) it8.next()).toProtobufInstance());
        }
        o oVarBuild = c0145vC.d(arrayList8).build();
        js3.o(oVarBuild, "newBuilder()\n           …) })\n            .build()");
        return (MutationPayload$DisplayFrameV2) oVarBuild;
    }

    public DisplayFrame(long j, boolean z, ViewHierarchy viewHierarchy, ScreenMetadata screenMetadata, int i, int i2, int i3, int i4, float f, boolean z2, dp2 dp2Var, boolean z3, List<? extends DisplayCommand> list, List<Typeface> list2, List<Image> list3, List<TextBlob> list4, List<Vertices> list5, List<Paint> list6, List<Path> list7, List<SubDisplayFrame> list8) {
        js3.p(viewHierarchy, "viewHierarchy");
        js3.p(screenMetadata, "screenMetadata");
        js3.p(list, "commands");
        js3.p(list2, "typefaces");
        js3.p(list3, "images");
        js3.p(list4, "textBlobs");
        js3.p(list5, "vertices");
        js3.p(list6, "paints");
        js3.p(list7, "paths");
        js3.p(list8, "subDisplayFrames");
        this.timestamp = j;
        this.isKeyFrame = z;
        this.viewHierarchy = viewHierarchy;
        this.screenMetadata = screenMetadata;
        this.screenWidth = i;
        this.screenHeight = i2;
        this.keyboardHeight = i3;
        this.systemBackgroundColor = i4;
        this.density = f;
        this.isForceStartNewSessionFirstFrame = z2;
        this.forceStartNewSessionCallback = dp2Var;
        this.isNewPageFirstFrame = z3;
        this.commands = list;
        this.typefaces = list2;
        this.images = list3;
        this.textBlobs = list4;
        this.vertices = list5;
        this.paints = list6;
        this.paths = list7;
        this.subDisplayFrames = list8;
    }
}
