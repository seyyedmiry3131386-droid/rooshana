package com.microsoft.clarity.models.viewhierarchy;

import com.google.protobuf.o;
import com.microsoft.clarity.g.J;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$ViewHierarchy;
import defpackage.js3;
import defpackage.yd1;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewHierarchy implements IProtoModel<MutationPayload$ViewHierarchy> {
    private final transient EditTextInfo focusedEditTextInfo;
    private final transient J maskingDirectives;
    private final transient ViewNode root;
    private final transient ScreenMetadata screenMetadata;
    private final long timestamp;
    private final Set<String> visibleFragments;
    private final transient List<WebViewData> webViewsData;

    public ViewHierarchy(long j, ViewNode viewNode, Set<String> set, ScreenMetadata screenMetadata, List<WebViewData> list, J j2, EditTextInfo editTextInfo) {
        js3.p(viewNode, "root");
        js3.p(set, "visibleFragments");
        js3.p(list, "webViewsData");
        js3.p(j2, "maskingDirectives");
        this.timestamp = j;
        this.root = viewNode;
        this.visibleFragments = set;
        this.screenMetadata = screenMetadata;
        this.webViewsData = list;
        this.maskingDirectives = j2;
        this.focusedEditTextInfo = editTextInfo;
    }

    public final EditTextInfo getFocusedEditTextInfo() {
        return this.focusedEditTextInfo;
    }

    public final J getMaskingDirectives() {
        return this.maskingDirectives;
    }

    public final ViewNode getRoot() {
        return this.root;
    }

    public final ScreenMetadata getScreenMetadata() {
        return this.screenMetadata;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final Set<String> getVisibleFragments() {
        return this.visibleFragments;
    }

    public final List<WebViewData> getWebViewsData() {
        return this.webViewsData;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$ViewHierarchy toProtobufInstance() {
        o oVarBuild = MutationPayload$ViewHierarchy.newBuilder().a(this.root.toProtobufInstance()).a(this.timestamp).a(this.visibleFragments).build();
        js3.o(oVarBuild, "newBuilder()\n           …nts)\n            .build()");
        return (MutationPayload$ViewHierarchy) oVarBuild;
    }

    public ViewHierarchy(long j, ViewNode viewNode, Set set, ScreenMetadata screenMetadata, List list, J j2, EditTextInfo editTextInfo, int i, yd1 yd1Var) {
        this(j, viewNode, set, (i & 8) != 0 ? null : screenMetadata, (i & 16) != 0 ? EmptyList.a : list, j2, editTextInfo);
    }
}
