package com.microsoft.clarity.protomodels.mutationpayload;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0145v extends com.google.protobuf.m implements InterfaceC0147w {
    public C0145v() {
        super(MutationPayload$DisplayFrameV2.DEFAULT_INSTANCE);
    }

    public final C0145v a(ArrayList arrayList) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).addAllCommands(arrayList);
        return this;
    }

    public final C0145v b(List list) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).addAllPaints(list);
        return this;
    }

    public final C0145v c(List list) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).addAllPaths(list);
        return this;
    }

    public final C0145v d(List list) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).addAllSubPictures(list);
        return this;
    }

    public final C0145v e(List list) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).addAllTextBlobs(list);
        return this;
    }

    public final C0145v f(List list) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).addAllVertices(list);
        return this;
    }

    public final C0145v a(List list) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).addAllImages(list);
        return this;
    }

    public final C0145v b(ArrayList arrayList) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).addAllTypefaces(arrayList);
        return this;
    }

    public final C0145v c(int i) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).setScreenHeight(i);
        return this;
    }

    public final C0145v d(int i) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).setScreenWidth(i);
        return this;
    }

    public final C0145v e(int i) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).setSystemBackgroundColor(i);
        return this;
    }

    public final C0145v a(int i) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).setActivityId(i);
        return this;
    }

    public final C0145v b(int i) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).setKeyboardHeight(i);
        return this;
    }

    public final C0145v a(String str) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).setActivityName(str);
        return this;
    }

    public final C0145v a(float f) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).setDensity(f);
        return this;
    }

    public final C0145v a(double d) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).setTimestamp(d);
        return this;
    }

    public final C0145v a(MutationPayload$ViewHierarchy mutationPayload$ViewHierarchy) {
        copyOnWrite();
        ((MutationPayload$DisplayFrameV2) this.instance).setViewHierarchy(mutationPayload$ViewHierarchy);
        return this;
    }
}
