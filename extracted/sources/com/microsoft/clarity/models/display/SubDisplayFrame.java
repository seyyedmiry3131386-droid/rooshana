package com.microsoft.clarity.models.display;

import com.google.protobuf.o;
import com.microsoft.clarity.m.C0102a;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.display.blobs.TextBlob;
import com.microsoft.clarity.models.display.commands.DisplayCommand;
import com.microsoft.clarity.models.display.common.Vertices;
import com.microsoft.clarity.models.display.images.Image;
import com.microsoft.clarity.models.display.paints.Paint;
import com.microsoft.clarity.models.display.paths.Path;
import com.microsoft.clarity.models.display.typefaces.Typeface;
import com.microsoft.clarity.protomodels.mutationpayload.C0145v;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayFrameV2;
import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class SubDisplayFrame implements IProtoModel<MutationPayload$DisplayFrameV2> {
    private List<? extends DisplayCommand> commands;
    private List<Image> images;
    private final List<Paint> paints;
    private final List<Path> paths;
    private final List<SubDisplayFrame> subDisplayFrames;
    private List<TextBlob> textBlobs;
    private List<Typeface> typefaces;
    private final List<Vertices> vertices;

    public SubDisplayFrame(C0102a c0102a) {
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
        this(list, list2, list3, list4, list5, arrayList, list6, a.Q0(arrayList3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubDisplayFrame copy$default(SubDisplayFrame subDisplayFrame, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i, Object obj) {
        if ((i & 1) != 0) {
            list = subDisplayFrame.commands;
        }
        if ((i & 2) != 0) {
            list2 = subDisplayFrame.typefaces;
        }
        if ((i & 4) != 0) {
            list3 = subDisplayFrame.images;
        }
        if ((i & 8) != 0) {
            list4 = subDisplayFrame.textBlobs;
        }
        if ((i & 16) != 0) {
            list5 = subDisplayFrame.vertices;
        }
        if ((i & 32) != 0) {
            list6 = subDisplayFrame.paints;
        }
        if ((i & 64) != 0) {
            list7 = subDisplayFrame.paths;
        }
        if ((i & 128) != 0) {
            list8 = subDisplayFrame.subDisplayFrames;
        }
        List list9 = list7;
        List list10 = list8;
        List list11 = list5;
        List list12 = list6;
        return subDisplayFrame.copy(list, list2, list3, list4, list11, list12, list9, list10);
    }

    public final List<DisplayCommand> component1() {
        return this.commands;
    }

    public final List<Typeface> component2() {
        return this.typefaces;
    }

    public final List<Image> component3() {
        return this.images;
    }

    public final List<TextBlob> component4() {
        return this.textBlobs;
    }

    public final List<Vertices> component5() {
        return this.vertices;
    }

    public final List<Paint> component6() {
        return this.paints;
    }

    public final List<Path> component7() {
        return this.paths;
    }

    public final List<SubDisplayFrame> component8() {
        return this.subDisplayFrames;
    }

    public final SubDisplayFrame copy(List<? extends DisplayCommand> list, List<Typeface> list2, List<Image> list3, List<TextBlob> list4, List<Vertices> list5, List<Paint> list6, List<Path> list7, List<SubDisplayFrame> list8) {
        js3.p(list, "commands");
        js3.p(list2, "typefaces");
        js3.p(list3, "images");
        js3.p(list4, "textBlobs");
        js3.p(list5, "vertices");
        js3.p(list6, "paints");
        js3.p(list7, "paths");
        js3.p(list8, "subDisplayFrames");
        return new SubDisplayFrame(list, list2, list3, list4, list5, list6, list7, list8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubDisplayFrame)) {
            return false;
        }
        SubDisplayFrame subDisplayFrame = (SubDisplayFrame) obj;
        return js3.i(this.commands, subDisplayFrame.commands) && js3.i(this.typefaces, subDisplayFrame.typefaces) && js3.i(this.images, subDisplayFrame.images) && js3.i(this.textBlobs, subDisplayFrame.textBlobs) && js3.i(this.vertices, subDisplayFrame.vertices) && js3.i(this.paints, subDisplayFrame.paints) && js3.i(this.paths, subDisplayFrame.paths) && js3.i(this.subDisplayFrames, subDisplayFrame.subDisplayFrames);
    }

    public final List<DisplayCommand> getCommands() {
        return this.commands;
    }

    public final List<Image> getImages() {
        return this.images;
    }

    public final List<Paint> getPaints() {
        return this.paints;
    }

    public final List<Path> getPaths() {
        return this.paths;
    }

    public final List<SubDisplayFrame> getSubDisplayFrames() {
        return this.subDisplayFrames;
    }

    public final List<TextBlob> getTextBlobs() {
        return this.textBlobs;
    }

    public final List<Typeface> getTypefaces() {
        return this.typefaces;
    }

    public final List<Vertices> getVertices() {
        return this.vertices;
    }

    public int hashCode() {
        return this.subDisplayFrames.hashCode() + rm7.i(rm7.i(rm7.i(rm7.i(rm7.i(rm7.i(this.commands.hashCode() * 31, 31, this.typefaces), 31, this.images), 31, this.textBlobs), 31, this.vertices), 31, this.paints), 31, this.paths);
    }

    public final void setCommands(List<? extends DisplayCommand> list) {
        js3.p(list, "<set-?>");
        this.commands = list;
    }

    public final void setImages(List<Image> list) {
        js3.p(list, "<set-?>");
        this.images = list;
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
        StringBuilder sb = new StringBuilder("SubDisplayFrame(commands=");
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
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayFrameV2 toProtobufInstance() {
        C0145v c0145vNewBuilder = MutationPayload$DisplayFrameV2.newBuilder();
        List<? extends DisplayCommand> list = this.commands;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DisplayCommand) it.next()).toProtobufInstance());
        }
        C0145v c0145vA = c0145vNewBuilder.a(arrayList);
        List<Typeface> list2 = this.typefaces;
        ArrayList arrayList2 = new ArrayList(wu0.V(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Typeface) it2.next()).toProtobufInstance());
        }
        C0145v c0145vB = c0145vA.b(arrayList2);
        List<Image> list3 = this.images;
        ArrayList arrayList3 = new ArrayList(wu0.V(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Image) it3.next()).toProtobufInstance());
        }
        C0145v c0145vA2 = c0145vB.a(a.P0(arrayList3));
        List<TextBlob> list4 = this.textBlobs;
        ArrayList arrayList4 = new ArrayList(wu0.V(list4, 10));
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((TextBlob) it4.next()).toProtobufInstance());
        }
        C0145v c0145vE = c0145vA2.e(a.P0(arrayList4));
        List<Vertices> list5 = this.vertices;
        ArrayList arrayList5 = new ArrayList(wu0.V(list5, 10));
        Iterator<T> it5 = list5.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((Vertices) it5.next()).toProtobufInstance());
        }
        C0145v c0145vF = c0145vE.f(a.P0(arrayList5));
        List<Paint> list6 = this.paints;
        ArrayList arrayList6 = new ArrayList(wu0.V(list6, 10));
        Iterator<T> it6 = list6.iterator();
        while (it6.hasNext()) {
            arrayList6.add(((Paint) it6.next()).toProtobufInstance());
        }
        C0145v c0145vB2 = c0145vF.b(a.P0(arrayList6));
        List<Path> list7 = this.paths;
        ArrayList arrayList7 = new ArrayList(wu0.V(list7, 10));
        Iterator<T> it7 = list7.iterator();
        while (it7.hasNext()) {
            arrayList7.add(((Path) it7.next()).toProtobufInstance());
        }
        C0145v c0145vC = c0145vB2.c(a.P0(arrayList7));
        List<SubDisplayFrame> list8 = this.subDisplayFrames;
        ArrayList arrayList8 = new ArrayList(wu0.V(list8, 10));
        Iterator<T> it8 = list8.iterator();
        while (it8.hasNext()) {
            arrayList8.add(((SubDisplayFrame) it8.next()).toProtobufInstance());
        }
        o oVarBuild = c0145vC.d(a.P0(arrayList8)).build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$DisplayFrameV2) oVarBuild;
    }

    public SubDisplayFrame(List<? extends DisplayCommand> list, List<Typeface> list2, List<Image> list3, List<TextBlob> list4, List<Vertices> list5, List<Paint> list6, List<Path> list7, List<SubDisplayFrame> list8) {
        js3.p(list, "commands");
        js3.p(list2, "typefaces");
        js3.p(list3, "images");
        js3.p(list4, "textBlobs");
        js3.p(list5, "vertices");
        js3.p(list6, "paints");
        js3.p(list7, "paths");
        js3.p(list8, "subDisplayFrames");
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
